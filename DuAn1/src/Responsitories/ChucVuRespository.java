/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.ChucVuModel;
import Utilities.Dbcontext;
import Utilities.JDBC_Helper;
import Utilities.jdbcHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import ViewModels.ChucVuViewModel;

/**
 *
 * @author tuyen
 */
public class ChucVuRespository {

    public List<ChucVuViewModel> getallcv() {
        List<ChucVuViewModel> cv = new ArrayList<>();
        String sql = "select Id, MACV, Ten from ChucVu";
        try {

            ResultSet rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String macv = rs.getString(2);
                String tencv = rs.getString(3);
                ChucVuViewModel cv2 = new ChucVuViewModel(id, macv, tencv);
                cv.add(cv2);
            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ChucVuViewModel getcvbyma(String ma) {
        ChucVuViewModel cv = null;
        String sql = "select Id, MACV, Ten from ChucVu where MACV = ? ";
        try {

            ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
            while (rs.next()) {
                String id = rs.getString(1);
                String macv = rs.getString(2);
                String tencv = rs.getString(3);
                cv = new ChucVuViewModel(id, macv, tencv);

            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public ChucVuModel getcvbyma1(String ma) {
        ChucVuModel cv = null;
        String sql = "select Id, MACV, Ten from ChucVu where MACV = ? ";
        try {

            ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
            while (rs.next()) {
                String id = rs.getString(1);
                String macv = rs.getString(2);
                String tencv = rs.getString(3);
                cv = new ChucVuModel(id, macv, tencv);

            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean checktrungma(String ma) {
        if (getcvbyma1(ma) == null) {
            return false;
        } else {
            return true;
        }
    }

    public int add(ChucVuModel cv) {
        String sql = "insert into ChucVu(MACV, Ten) values (?,?)";
        if (checktrungma(cv.getMacv())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã cv đó");
            return 0;
        } else {
            return JDBC_Helper.updateTongQuat(sql, cv.getMacv(), cv.getTenchucvu());
        }
    }

    public int update(String id, ChucVuModel cv) {
        String sql = "update ChucVu set MACV = ?, Ten = ? where Id = ?";
        return JDBC_Helper.updateTongQuat(sql, cv.getMacv(), cv.getTenchucvu(), id);

    }

    public int delete(String id) {
        String sql = "delete from ChucVu where Id = ?";
        return JDBC_Helper.updateTongQuat(sql, id);
    }
}

//    public static void main(String[] args) {
//        List<ChucVuViewModel> cv = getallcv();
//        for (ChucVuViewModel x : cv) {
//            System.out.println(x.toString());
//        }
//
//    }

