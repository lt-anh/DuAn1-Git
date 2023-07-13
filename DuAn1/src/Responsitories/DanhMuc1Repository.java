/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModels.DanhMuc1;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author TGDD
 */
public class DanhMuc1Repository {
    public ArrayList<DanhMuc1> getAllDanhMuc() {
        ArrayList<DanhMuc1> list = new ArrayList<>();
        String sql = "select MaDM,tendm,trangthai from DanhMucSP";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DanhMuc1 dm = new DanhMuc1();

                dm.setMaDM(rs.getString("MaDM"));
                dm.setTenDM(rs.getString("TenDM"));  
                dm.setTrangThai(rs.getInt("TrangThai"));

                list.add(dm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<DanhMuc1> getTimKiem(String maDM) {
        ArrayList<DanhMuc1> list = new ArrayList<>();
        String sql = "select MaDM,tendm,trangthai from DanhMucSP where MaDM=?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maDM);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DanhMuc1 dm = new DanhMuc1();

                dm.setMaDM(rs.getString("MaDM"));
                dm.setTenDM(rs.getString("TenDM"));        
                dm.setTrangThai(rs.getInt("TrangThai"));

                list.add(dm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public boolean add(DanhMuc1 dm) {
        String sql = "insert into DanhMucSP(MaDM,TenDM, "
                + "trangThai) values(?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, dm.getMaDM());
            ps.setObject(2, dm.getTenDM()); 
            ps.setObject(3, dm.getTrangThai());
           

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(DanhMuc1 dm, String maDM) {
        String sql = "update DanhMucSP set TenDM=?,TrangThai=? where MaDM=? ";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

             
            ps.setObject(1, dm.getTenDM());
            ps.setObject(2, dm.getTrangThai());
            ps.setObject(3, maDM);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String maDM) {
        String sql = "delete from DanhMucSP where MaDM=? ";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, maDM);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
