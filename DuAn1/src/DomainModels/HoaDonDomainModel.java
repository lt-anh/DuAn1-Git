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
public class HoaDonDomainModel {
    private String id;
    private String mahd;
    private String idnv;
    private String idkh;
    private String ngaytao;
    private double tienthuatrakhach;
    private double thanhtoan;
    private String idhttt;
    private int trangthai;

    public HoaDonDomainModel() {
    }

    public HoaDonDomainModel(String id, String mahd, String idnv, String idkh, String ngaytao, double tienthuatrakhach, double thanhtoan, String idhttt, int trangthai) {
        this.id = id;
        this.mahd = mahd;
        this.idnv = idnv;
        this.idkh = idkh;
        this.ngaytao = ngaytao;
        this.tienthuatrakhach = tienthuatrakhach;
        this.thanhtoan = thanhtoan;
        this.idhttt = idhttt;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
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

    public double getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(double thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public String getIdhttt() {
        return idhttt;
    }

    public void setIdhttt(String idhttt) {
        this.idhttt = idhttt;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
