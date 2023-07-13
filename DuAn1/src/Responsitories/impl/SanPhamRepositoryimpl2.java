/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories.impl;

import DomainModels.SanPhamModel;
import Responsitories.SanPhamRepository2;
import Utilities.JDBC_Helper;
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tuyen
 */
public class SanPhamRepositoryimpl2 implements SanPhamRepository2 {

    @Override
    public List<SanPhamViewModel> getallsp() {
        List<SanPhamViewModel> sp = new ArrayList<>();
        String sql = "select sp.ID,sp.MaSP, sp.TenSP, dm.TenDM, s.TenSize,s.Gia, sp.Gia,sp.TrangThai, sp.HinhAnh   from SanPham sp join Size s on sp.IDSize = s.ID join DanhMucSP dm on sp.IDDanhMuc = dm.ID";
        ResultSet rs = null;
        try {
            rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                String tendm = rs.getString(4);
                String tensize = rs.getString(5);
                double giasize = rs.getDouble(6);
                double gia = rs.getDouble(7);
                int trangthai = rs.getInt(8);
                String hinhanh = rs.getString(9);
                SanPhamViewModel sp2 = new SanPhamViewModel(idsp,masp, tensp, tendm, tensize, giasize, gia, trangthai, hinhanh);
                sp.add(sp2);
            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SanPhamViewModel getspbyma(String ma) {
        SanPhamViewModel sp = null;
        String sql = "select sp.ID,sp.MaSP, sp.TenSP, dm.TenDM, s.TenSize,s.Gia, sp.Gia,sp.TrangThai, sp.HinhAnh   from SanPham sp join Size s on sp.IDSize = s.ID join DanhMucSP dm on sp.IDDanhMuc = dm.ID where sp.MaSP = ?";
        ResultSet rs = null;
        try {
            rs = JDBC_Helper.selectTongQuat(sql, ma);
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                String tendm = rs.getString(4);
                String tensize = rs.getString(5);
                double giasize = rs.getDouble(6);
                double gia = rs.getDouble(7);
                int trangthai = rs.getInt(8);
                String hinhanh = rs.getString(9);

                sp = new SanPhamViewModel(idsp,masp, tensp, tendm, tensize, giasize, gia, trangthai, hinhanh);

            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checktrungma(String ma) {
        if (getspbyma(ma) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean add(SanPhamModel sp) {
        String sql = "insert into SanPham (MaSP, TenSP, Gia, HinhAnh, TrangThai, IDSize, IDDanhMuc)\n"
                + "values(?,?,?,?,?,?,?)";
        if (checktrungma(sp.getMasp())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã sp");
            return false;
        } else {
            JDBC_Helper.updateTongQuat(sql, sp.getMasp(), sp.getTensp(), sp.getGia(), sp.getHinhanh(), sp.getTrangthai(), sp.getIdsize(), sp.getIddanhmuc());
            return true;
        }
    }

    @Override
    public int update(SanPhamModel sp) {
        String sql = "update SanPham set TenSP = ?, Gia = ?, HinhAnh = ?, TrangThai = ?, IDSize= ?, IDDanhMuc = ? where MaSP = ?";
        return JDBC_Helper.updateTongQuat(sql, sp.getTensp(), sp.getGia(), sp.getHinhanh(), sp.getTrangthai(), sp.getIdsize(), sp.getIddanhmuc(), sp.getMasp());
    }

    @Override
    public int delete(String ma) {
        String sql = "delete from SanPham where MaSP = ?";
        return JDBC_Helper.updateTongQuat(sql, ma);
    }

    @Override
    public List<SanPhamViewModel> timkiem(String ten) {
        List<SanPhamViewModel> sp = new ArrayList<>();
        String sql = "select sp.ID,sp.MaSP, sp.TenSP, dm.TenDM, s.TenSize,s.Gia, sp.Gia,sp.TrangThai, sp.HinhAnh   from SanPham sp join Size s on sp.IDSize = s.ID join DanhMucSP dm on sp.IDDanhMuc = dm.ID where sp.TenSP like N'%"+ten+"%' or sp.TenSP like N'"+ten+"%' or sp.TenSP like N'%"+ten+"'";
        ResultSet rs = null;
        try {
            rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                String tendm = rs.getString(4);
                String tensize = rs.getString(5);
                double giasize = rs.getDouble(6);
                double gia = rs.getDouble(7);
                int trangthai = rs.getInt(8);
                String hinhanh = rs.getString(9);

                SanPhamViewModel sp2 = new SanPhamViewModel(idsp,masp, tensp, tendm, tensize, giasize, gia, trangthai, hinhanh);
                sp.add(sp2);
            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
