/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModels.Size1;
import Utilities.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SizeRepository1 {

    public ArrayList<Size1> getAllSize() {
        ArrayList<Size1> list = new ArrayList<>();
        String sql = "select maSize,tensize,gia,trangthai from Size";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Size1 s = new Size1();

                s.setMaSize(rs.getString("MaSize"));
                s.setTenSize(rs.getString("TenSize"));
                s.setGiaSize(rs.getFloat("Gia"));
                s.setTrangThai(rs.getInt("TrangThai"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Size1> getTimKiem(String tenSize) {
        ArrayList<Size1> list = new ArrayList<>();
        String sql = "select maSize,tensize,gia,trangthai from Size where TenSize=?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tenSize);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Size1 s = new Size1();

                s.setMaSize(rs.getString("MaSize"));
                s.setTenSize(rs.getString("TenSize"));
                s.setGiaSize(rs.getFloat("Gia"));
                s.setTrangThai(rs.getInt("TrangThai"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public boolean add(Size1 s) {
        String sql = "insert into Size(MaSize,TenSize, "
                + "Gia,trangThai) values(?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, s.getMaSize());
            ps.setObject(2, s.getTenSize());
            ps.setObject(3, s.getGiaSize());
            ps.setObject(4, s.getTrangThai());
           

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Size1 s, String maSize) {
        String sql = "update Size set TenSize=?,Gia=?,TrangThai=? where MaSize=? ";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

             
            ps.setObject(1, s.getTenSize());
            ps.setObject(2, s.getGiaSize());
            ps.setObject(3, s.getTrangThai());
            ps.setObject(4, maSize);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String maSize) {
        String sql = "delete from Size where MaSize=? ";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, maSize);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
