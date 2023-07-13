/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

/**
 *
 * @author tuyen
 */
public class SanPhamModel {
    private String id;
    private String masp;
    private String tensp;
    private double gia;
    private String mota;
    private String hinhanh;
    private int trangthai;
    private String idsize;
    private String iddanhmuc;

    public SanPhamModel() {
    }

    public SanPhamModel(String id, String masp, String tensp, double gia, String mota, String hinhanh, int trangthai, String idsize, String iddanhmuc) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.gia = gia;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.trangthai = trangthai;
        this.idsize = idsize;
        this.iddanhmuc = iddanhmuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getIdsize() {
        return idsize;
    }

    public void setIdsize(String idsize) {
        this.idsize = idsize;
    }

    public String getIddanhmuc() {
        return iddanhmuc;
    }

    public void setIddanhmuc(String iddanhmuc) {
        this.iddanhmuc = iddanhmuc;
    }
    
}
