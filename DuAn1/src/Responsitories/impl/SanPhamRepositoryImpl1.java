package Responsitories.impl;

import DomainModels.DanhMucSP;
import DomainModels.SanPham;
import DomainModels.Size;
import Responsitories.SanPhamRepository1;
import Utilities.JDBC_Helper;
import ViewModels.SanPhamResponse;
import ViewModels.SanPhamResponse1;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SanPhamRepositoryImpl1 implements SanPhamRepository1 {

    @Override
    public List<SanPhamResponse1> getALL() {
        List<SanPhamResponse1> listSanPham = new ArrayList<>();
        String query = "Select SanPham.ID, MaSP, TenSP, HinhAnh, TenDM, SanPham.Gia, TenSize, Size.Gia 'GiaSize' from SanPham \n"
                + "join DanhMucSP on SanPham.IDDanhMuc = DanhMucSP.ID\n"
                + "join Size on SanPham.IDSize = Size.ID";
        ResultSet rs = JDBC_Helper.selectTongQuat(query);
        try {
            while (rs.next()) {
                SanPhamResponse1 sanPham = new SanPhamResponse1();
                sanPham.setID(rs.getString("ID"));
                sanPham.setMaSP(rs.getString("MaSP"));
                sanPham.setTenSP(rs.getString("TenSP"));
                sanPham.setDuongDanAnh(rs.getString("HinhAnh"));
                sanPham.setTenDM(rs.getString("TenDM"));
                sanPham.setGia(rs.getDouble("Gia"));
                sanPham.setTenSize(rs.getString("TenSize"));
                sanPham.setGiaSize(rs.getDouble("GiaSize"));
                listSanPham.add(sanPham);
            }
            return listSanPham;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<SanPhamResponse1> getSPByTenSize(String TenSize) {
        List<SanPhamResponse1> listSanPham = new ArrayList<>();
        String query = "Select SanPham.ID, MaSP, TenSP, HinhAnh, TenDM, SanPham.Gia, TenSize, Size.Gia 'GiaSize' from SanPham\n"
                + "join DanhMucSP on SanPham.IDDanhMuc = DanhMucSP.ID\n"
                + "join Size on SanPham.IDSize = Size.ID WHERE TenSize = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(query, TenSize);
        try {
            while (rs.next()) {
                SanPhamResponse1 sanPham = new SanPhamResponse1();
                sanPham.setID(rs.getString("ID"));
                sanPham.setMaSP(rs.getString("MaSP"));
                sanPham.setTenSP(rs.getString("TenSP"));
                sanPham.setDuongDanAnh(rs.getString("HinhAnh"));
                sanPham.setTenDM(rs.getString("TenDM"));
                sanPham.setGia(rs.getDouble("Gia"));
                sanPham.setTenSize(rs.getString("TenSize"));
                sanPham.setGiaSize(rs.getDouble("GiaSize"));
                listSanPham.add(sanPham);
            }
            return listSanPham;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<SanPhamResponse1> getSPByTenDM(String TenDM) {
        List<SanPhamResponse1> listSanPham = new ArrayList<>();
        String query = "Select SanPham.ID, MaSP, TenSP, HinhAnh, TenDM, SanPham.Gia, TenSize, Size.Gia 'GiaSize' from SanPham\n"
                + "join DanhMucSP on SanPham.IDDanhMuc = DanhMucSP.ID\n"
                + "join Size on SanPham.IDSize = Size.ID\n"
                + " WHERE TenDM = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(query, TenDM);
        try {
            while (rs.next()) {
                SanPhamResponse1 sanPham = new SanPhamResponse1();
                sanPham.setID(rs.getString("ID"));
                sanPham.setMaSP(rs.getString("MaSP"));
                sanPham.setTenSP(rs.getString("TenSP"));
                sanPham.setDuongDanAnh(rs.getString("HinhAnh"));
                sanPham.setTenDM(rs.getString("TenDM"));
                sanPham.setGia(rs.getDouble("Gia"));
                sanPham.setTenSize(rs.getString("TenSize"));
                sanPham.setGiaSize(rs.getDouble("GiaSize"));
                listSanPham.add(sanPham);
            }
            return listSanPham;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public SanPham getOne(String ma) {
        String query = "SELECT * FROM SanPham Where MaSP = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(query, ma);
        try {
            while (rs.next()) {
                SanPham sp = new SanPham();
                DanhMucSP dm = new DanhMucSP();
                Size sz = new Size();
                sp.setID(rs.getString("ID"));
                sp.setMaSP(rs.getString("MaSP"));
                sp.setMaSP("MaSP");
                sp.setTenSP(rs.getString("TenSp"));
                sp.setGia(rs.getDouble("Gia"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setTrangThai(rs.getInt("TrangThai"));
                dm.setID(rs.getString("IDDanhMuc"));
                sz.setID(rs.getString("IDSize"));
                sp.setSize(sz);
                sp.setDanhMuc(dm);
                return sp;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean checktrungma(String ma) {
        if (getOne(ma) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean add(SanPham sp) {
        if (checktrungma(sp.getMaSP())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã sp");
            return false;
        } else {
            String sql = "insert into SanPham (MaSP, TenSP,Gia, HinhAnh, TrangThai, IDSize, IDDanhMuc )\n"
                    + "					   values (?,?,?,?,?,?,?)";
            JDBC_Helper.updateTongQuat(sql, sp.getMaSP(), sp.getTenSP(),sp.getGia(), sp.getHinhAnh(), sp.getTrangThai(), sp.getSize().getID(), sp.getDanhMuc().getID());
        return true;
        }

        
    }

    @Override
    public int update(SanPham sp) {
        String sql = "update SanPham SET TenSP = ?, Gia = ?, HinhAnh = ?, TrangThai = ? WHERE MaSP = ?";
        return JDBC_Helper.updateTongQuat(sql,sp.getTenSP(),sp.getGia(),sp.getHinhAnh(),sp.getTrangThai(),sp.getMaSP());
    }

    @Override
    public int delete(String masp) {
        String sql = "delete from SanPham where MaSP = ?";
        return JDBC_Helper.updateTongQuat(sql, masp);
    }

    @Override
    public SanPhamResponse1 getone1(String ma) {
        String query = "select sp.Id, sp.MaSP, sp.TenSP,sp.HinhAnh, dm.TenDM ,s.Gia, sp.Gia,s.TenSize,sp.TrangThai from SanPham sp join Size s on sp.IDSize = s.ID join DanhMucSP dm on sp.IDDanhMuc = dm.ID where MaSP = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(query, ma);
        try {
            while (rs.next()) {
                SanPhamResponse1 sp = new SanPhamResponse1();

                sp.setID(rs.getString(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                sp.setDuongDanAnh(rs.getString(4));
                sp.setTenDM(rs.getString(5));
                sp.setGiaSize(rs.getDouble(6));
                sp.setGia(rs.getDouble(7));
                sp.setTenSize(rs.getString(8));
                sp.setTrangthai(rs.getInt(9));
                return sp;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public SanPhamResponse1 getspbydm(String tendm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamResponse1> selectByTimKiem(String key) {
         List<SanPhamResponse1> listSanPham = new ArrayList<>();
         String query = "Select SanPham.ID, MaSP, TenSP, HinhAnh, TenDM, SanPham.Gia, TenSize, Size.Gia 'GiaSize' from SanPham \n" +
                       "join DanhMucSP on SanPham.IDDanhMuc = DanhMucSP.ID\n" +
                       "join Size on SanPham.IDSize = Size.ID WHERE (MaSP Like ? OR TenSP Like ?) AND SanPham.TrangThai = 1";
        ResultSet rs = JDBC_Helper.selectTongQuat(query, "%" + key + "%", "%" + key + "%");
        try {
            while (rs.next()) {
                SanPhamResponse1 sanPham = new SanPhamResponse1();
                sanPham.setID(rs.getString("ID")); sanPham.setMaSP(rs.getString("MaSP")); sanPham.setTenSP(rs.getString("TenSP")); sanPham.setDuongDanAnh(rs.getString("HinhAnh"));
                sanPham.setTenDM(rs.getString("TenDM")); sanPham.setGia(rs.getDouble("Gia")); sanPham.setTenSize(rs.getString("TenSize"));
                sanPham.setGiaSize(rs.getDouble("GiaSize"));
                listSanPham.add(sanPham);
            }
            return listSanPham;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
