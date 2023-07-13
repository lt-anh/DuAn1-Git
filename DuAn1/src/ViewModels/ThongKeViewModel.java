/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;


public class ThongKeViewModel {
    private String maNV;
    private String maHD;
    private Date ngayTao;
    private String hinhThuc;
    private String khachHang;
    private float tongTien;
    private float thanhToan;
    private float tienThuaTraKhach;
    private String trangThai;

    public ThongKeViewModel() {
    }

    public ThongKeViewModel(String maNV, String maHD, Date ngayTao, String hinhThuc, String khachHang, float tongTien, float thanhToan, float tienThuaTraKhach, String trangThai) {
        this.maNV = maNV;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.hinhThuc = hinhThuc;
        this.khachHang = khachHang;
        this.tongTien = tongTien;
        this.thanhToan = thanhToan;
        this.tienThuaTraKhach = tienThuaTraKhach;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(float thanhToan) {
        this.thanhToan = thanhToan;
    }

    public float getTienThuaTraKhach() {
        return tienThuaTraKhach;
    }

    public void setTienThuaTraKhach(float tienThuaTraKhach) {
        this.tienThuaTraKhach = tienThuaTraKhach;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
}
