/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories.impl;

import Responsitories.HoaDonRepository1;
import Utilities.JDBC_Helper;
import ViewModels.HoaDonViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tuyen
 */
public class HoaDonRepositoryImpl1 implements HoaDonRepository1{

    @Override
    public List<HoaDonViewModel> getall() {
        List<HoaDonViewModel> hd = new ArrayList<>();
        String sql = "select hd.MaHD, nv.HoTen,hd.NgayTao, hd.tienThuaTraKhach, hd.TongTien, hd.ThanhToan,hd.TrangThai from NhanVien nv join HoaDon hd on nv.ID = hd.IDNV ";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {                
                String mahd = rs.getString(1);
                String hotennv = rs.getString(2);
                String ngaytao = rs.getString(3);
                double tienthuatrakhach = rs.getDouble(4);
                double tongtien = rs.getDouble(5);
                double thanhtoan = rs.getDouble(6);
                String trangthai = rs.getString(7);
                HoaDonViewModel hd2 = new HoaDonViewModel(mahd, hotennv, ngaytao, tienthuatrakhach, tongtien, thanhtoan, trangthai);
                hd.add(hd2);
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
