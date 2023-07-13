/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author TGDD
 */
public class Size1 {
    private String id;
    private String maSize;
    private String tenSize;
    private float giaSize;
    private int TrangThai;

    public Size1() {
    }

    public Size1(String id, String maSize, String tenSize, float giaSize, int TrangThai) {
        this.id = id;
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.giaSize = giaSize;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    public float getGiaSize() {
        return giaSize;
    }

    public void setGiaSize(float giaSize) {
        this.giaSize = giaSize;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
