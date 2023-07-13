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
public class ChucVuModel {

    private String id;
    private String macv;
    private String tenchucvu;

    public ChucVuModel() {
    }

    public ChucVuModel(String id, String macv, String tenchucvu) {
        this.id = id;
        this.macv = macv;
        this.tenchucvu = tenchucvu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

}
