/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import Utilities.DBConnection;
import ViewModels.ThongKeViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TGDD
 */
public class ThongKeRepository {

    public ArrayList<ThongKeViewModel> getAllTK() {
        ArrayList<ThongKeViewModel> list = new ArrayList<>();
        String sql = "select MaNV,MaHD,NgayTao,HinhThucThanhToan.Ten,KhachHang.hoTen,tongTien,ThanhToan,tienThuaTraKhach,HoaDon.TrangThai "
                + "from NhanVien join HoaDon on HoaDon.IDNV=NhanVien.ID "
                + "left join KhachHang on KhachHang.id=HoaDon.IDKH "
                + "join HinhThucThanhToan on HoaDon.IDHTTT=HinhThucThanhToan.id ";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeViewModel tkvm = new ThongKeViewModel();

                tkvm.setMaNV(rs.getString("MANV"));
                tkvm.setMaHD(rs.getString("MaHD"));
                tkvm.setNgayTao(rs.getDate("NgayTao"));
                tkvm.setHinhThuc(rs.getString("Ten"));
                tkvm.setKhachHang(rs.getString("hoTen"));
                tkvm.setThanhToan(rs.getFloat("ThanhToan"));
                tkvm.setTienThuaTraKhach(rs.getFloat("tienThuaTraKhach"));
                tkvm.setTongTien(rs.getFloat("TongTien"));
                tkvm.setTrangThai(rs.getString("TrangThai"));

                list.add(tkvm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ThongKeViewModel> getAllTKKhoang(float tien1, float tien2) {
        ArrayList<ThongKeViewModel> list = new ArrayList<>();
        String sql = "select MaNV,MaHD,NgayTao,HinhThucThanhToan.Ten,KhachHang.hoTen,tongTien,ThanhToan,tienThuaTraKhach,HoaDon.TrangThai "
                + "from NhanVien join HoaDon on HoaDon.IDNV=NhanVien.ID "
                + " left join KhachHang on KhachHang.id=HoaDon.IDKH "
                + "join HinhThucThanhToan on HoaDon.IDHTTT=HinhThucThanhToan.id where HoaDon.TongTien between ? and ?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tien1);
            ps.setObject(2, tien2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeViewModel tkvm = new ThongKeViewModel();

                tkvm.setMaNV(rs.getString("MANV"));
                tkvm.setMaHD(rs.getString("MaHD"));
                tkvm.setNgayTao(rs.getDate("NgayTao"));
                tkvm.setHinhThuc(rs.getString("Ten"));
                tkvm.setKhachHang(rs.getString("hoTen"));
                tkvm.setThanhToan(rs.getFloat("ThanhToan"));
                tkvm.setTienThuaTraKhach(rs.getFloat("tienThuaTraKhach"));
                tkvm.setTongTien(rs.getFloat("TongTien"));
                tkvm.setTrangThai(rs.getString("TrangThai"));

                list.add(tkvm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<ThongKeViewModel> getAllTKNgay(Date ngay1, Date ngay2) {
        ArrayList<ThongKeViewModel> list = new ArrayList<>();
        String sql = "select MaNV,MaHD,NgayTao,HinhThucThanhToan.Ten,KhachHang.hoTen,tongTien,ThanhToan,tienThuaTraKhach,HoaDon.TrangThai "
                + "from NhanVien join HoaDon on HoaDon.IDNV=NhanVien.ID "
                + "left join KhachHang on KhachHang.id=HoaDon.IDKH "
                + "join HinhThucThanhToan on HoaDon.IDHTTT=HinhThucThanhToan.id where HoaDon.NgayTao between ? and ?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ngay1);
            ps.setObject(2, ngay2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeViewModel tkvm = new ThongKeViewModel();

                tkvm.setMaNV(rs.getString("MANV"));
                tkvm.setMaHD(rs.getString("MaHD"));
                tkvm.setNgayTao(rs.getDate("NgayTao"));
                tkvm.setHinhThuc(rs.getString("Ten"));
                tkvm.setKhachHang(rs.getString("hoTen"));
                tkvm.setThanhToan(rs.getFloat("ThanhToan"));
                tkvm.setTienThuaTraKhach(rs.getFloat("tienThuaTraKhach"));
                tkvm.setTongTien(rs.getFloat("TongTien"));
                tkvm.setTrangThai(rs.getString("TrangThai"));

                list.add(tkvm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThu() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.TongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and day(HoaDon.NgayTao)=day(getdate()) "
                + "and month(HoaDon.NgayTao)=month(getdate()) and year(HoaDon.NgayTao)=year(getdate())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuALL() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' ";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonALL() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon ";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienALL() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(NhanVien.ID) from NhanVien ";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuNam(int year) {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon  where HoaDon.TrangThai Like N'đ%' and YEAR(HoaDon.NgayTao)=?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, year);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonNam(int year) {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where YEAR(HoaDon.NgayTao)=?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, year);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienNam(int year) {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where YEAR(HoaDon.NgayTao)=?";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, year);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT1() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=1 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT2() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=2 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT3() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=3 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT4() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=4 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT5() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=5 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT6() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=6 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT7() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=7 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT8() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=8 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT9() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=9 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT10() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=10 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT11() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=11 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> doanhThuT12() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select SUM(HoaDon.tongTien) from HoaDon where HoaDon.TrangThai Like N'đ%' and Month(HoaDon.NgayTao)=12 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDon() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where day(HoaDon.NgayTao)=day(getdate()) "
                + "and month(HoaDon.NgayTao)=month(getdate()) and year(HoaDon.NgayTao)=year(getdate())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT1() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=1 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT2() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=2 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT3() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=3 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT4() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=4 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT5() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=5 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT6() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=6 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT7() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=7 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT8() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=8 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT9() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=9 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT10() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=10 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT11() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=11 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soHoaDonT12() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(ID) from HoaDon where Month(HoaDon.NgayTao)=12 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVien() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(NhanVien.ID) from NhanVien ";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT1() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=1 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT2() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=2 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT3() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=3 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT4() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=4 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT5() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=5 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT6() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=6 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT7() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=7 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT8() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=8 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT9() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=9 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT10() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=10 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT11() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=11 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Integer> soNhanVienT12() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "select COUNT(DISTINCT(NhanVien.ID)) from NhanVien join HoaDon on NhanVien.id=HoaDon.IDKH where Month(HoaDon.NgayTao)=12 and YEAR(HoaDon.NgayTao)=Year(GETDATE())";

        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
