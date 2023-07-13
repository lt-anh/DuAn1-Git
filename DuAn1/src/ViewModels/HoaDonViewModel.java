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
public class HoaDonViewModel {

    private String mahd;
    private String tennv;
    private String ngaytao;
    private double tienthuatrakhach;
    private double tongtien;
    private double thanhtoan;

    private String trangthai;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String mahd, String tennv, String ngaytao, double tienthuatrakhach, double tongtien, double thanhtoan, String trangthai) {
        this.mahd = mahd;
        this.tennv = tennv;
        this.ngaytao = ngaytao;
        this.tienthuatrakhach = tienthuatrakhach;
        this.tongtien = tongtien;
        this.thanhtoan = thanhtoan;
        this.trangthai = trangthai;
    }

    

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public double getTienthuatrakhach() {
        return tienthuatrakhach;
    }

    public void setTienthuatrakhach(double tienthuatrakhach) {
        this.tienthuatrakhach = tienthuatrakhach;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public double getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(double thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    

}
