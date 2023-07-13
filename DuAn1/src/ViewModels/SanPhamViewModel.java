/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

/**
 *
 * @author tuyen
 */
public class SanPhamViewModel {

    private String id;
    private String masp;
    private String tensp;

    private String tenloaisp;
    private String tensize;
    private double giasize;
    private double dongia;
    private int trangthai;
    private String hinhanh;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String id, String masp, String tensp, String tenloaisp, String tensize, double giasize, double dongia, int trangthai, String hinhanh) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.tenloaisp = tenloaisp;
        this.tensize = tensize;
        this.giasize = giasize;
        this.dongia = dongia;
        this.trangthai = trangthai;
        this.hinhanh = hinhanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public double getGiasize() {
        return giasize;
    }

    public void setGiasize(double giasize) {
        this.giasize = giasize;
    }

    public String getTensize() {
        return tensize;
    }

    public void setTensize(String tensize) {
        this.tensize = tensize;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getTenloaisp() {
        return tenloaisp;
    }

    public void setTenloaisp(String tenloaisp) {
        this.tenloaisp = tenloaisp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

}
