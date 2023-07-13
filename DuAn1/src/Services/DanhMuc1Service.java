/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.DanhMuc1;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public interface DanhMuc1Service {

    public ArrayList<DanhMuc1> getAllDanhMuc();

    public ArrayList<DanhMuc1> getTimKiem(String maDM);

    public boolean add(DanhMuc1 dm);

    public boolean update(DanhMuc1 dm, String maDM);

    public boolean delete(String maDM);
}
