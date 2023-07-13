/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.DanhMuc1;
import Responsitories.DanhMuc1Repository;
import Services.DanhMuc1Service;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class DanhMuc1ServiceImpl implements DanhMuc1Service{
    private DanhMuc1Repository dmr=new DanhMuc1Repository();

    @Override
    public ArrayList<DanhMuc1> getAllDanhMuc() {
        return dmr.getAllDanhMuc();
    }

    @Override
    public ArrayList<DanhMuc1> getTimKiem(String maDM) {
        return dmr.getTimKiem(maDM);
    }

    @Override
    public boolean add(DanhMuc1 dm) {
        return dmr.add(dm);
    }

    @Override
    public boolean update(DanhMuc1 dm, String maDM) {
        return dmr.update(dm, maDM);
    }

    @Override
    public boolean delete(String maDM) {
        return dmr.delete(maDM);
    }
    
}
