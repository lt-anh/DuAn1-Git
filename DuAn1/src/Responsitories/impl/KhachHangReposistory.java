/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories.impl;

import DomainModels.KhachHangModel;
import Utilities.JDBC_Helper;
import Utilities.jdbcHelper;
import ViewModels.KhachHangViewModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF
 */
public class KhachHangReposistory {

    public static List<KhachHangViewModel> getAllKH() {
        List<KhachHangViewModel> n = new ArrayList<>();
        ResultSet rs = null;
        String sql = "select id,maKH,hoTen,gioiTinh,SDT,diaChi from khachHang";

        rs = JDBC_Helper.selectTongQuat(sql);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                String maKH = rs.getString(2);
                String hoTen = rs.getString(3);
                String gioiTinh = rs.getString(4);
                String sdt = rs.getString(5);
                String diaChi = rs.getString(6);

                KhachHangViewModel ct = new KhachHangViewModel(id, maKH, hoTen, gioiTinh, sdt, diaChi);
                n.add(ct);
            }
            return n;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static KhachHangModel getCTByMa(String maID) {
        KhachHangModel n = null;
        ResultSet rs = null;
        String sql = "select id,maKH,hoTen,gioiTinh,SDT,diaChi from khachHang where maKH = ?";
        rs = JDBC_Helper.selectTongQuat(sql, maID);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                String maKH = rs.getString(2);
                String hoTen = rs.getString(3);
                String gioiTinh = rs.getString(4);
                String sdt = rs.getString(5);
                String diaChi = rs.getString(6);
                n = new KhachHangModel(id, maKH, hoTen, gioiTinh, sdt, diaChi);
            }
            return n;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static KhachHangModel gettenkh(String ten){
        KhachHangModel n = null;
        ResultSet rs = null;
        String sql = "select id,maKH,hoTen,gioiTinh,SDT,diaChi from khachHang where hoTen = ?";
        rs = JDBC_Helper.selectTongQuat(sql, ten);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                String maKH = rs.getString(2);
                String hoTen = rs.getString(3);
                String gioiTinh = rs.getString(4);
                String sdt = rs.getString(5);
                String diaChi = rs.getString(6);
                n = new KhachHangModel(id, maKH, hoTen, gioiTinh, sdt, diaChi);
            }
            return n;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KhachHangViewModel getkhbyma1(String ma) {
        KhachHangViewModel n = null;
        ResultSet rs = null;
        String sql = "select id,maKH,hoTen,gioiTinh,SDT,diaChi from khachHang where maKH = ?";
        rs = JDBC_Helper.selectTongQuat(sql, ma);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                String maKH = rs.getString(2);
                String hoTen = rs.getString(3);
                String gioiTinh = rs.getString(4);
                String sdt = rs.getString(5);
                String diaChi = rs.getString(6);
                n = new KhachHangViewModel(id, maKH, hoTen, gioiTinh, sdt, diaChi);
            }
            return n;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean checktrungma(String makh) {
        if (getCTByMa(makh) == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean add(KhachHangModel n) {
        String sql = "insert into khachHang (maKH, hoTen, gioiTinh, SDT, diaChi) values (?,?,?,?,?)";
        if (checktrungma(n.getMaKH())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã kh");
            return false;
        } else {
            JDBC_Helper.updateTongQuat(sql, n.getMaKH(), n.getHoTen(), n.getGioiTinh(), n.getSdt(), n.getDiachi());
            return true;
        }
    }

    public static int update(KhachHangModel n) {
        String sql = "update khachHang set  maKH = ? , hoTen = ? , gioiTinh = ? ,SDT = ?,diaChi =? where Id =?";
        return JDBC_Helper.updateTongQuat(sql, n.getMaKH(), n.getHoTen(), n.getGioiTinh(), n.getSdt(), n.getDiachi(), n.getId());
    }

    public static int delete(String maID) {
        String sql = "delete from khachHang where id = ?";
        return JDBC_Helper.updateTongQuat(sql, maID);
    }
}
