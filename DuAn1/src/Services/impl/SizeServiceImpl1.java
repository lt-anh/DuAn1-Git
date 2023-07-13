/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.Size1;
import Responsitories.SizeRepository1;
import Services.SizeService1;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class SizeServiceImpl1 implements SizeService1{
    private SizeRepository1 sre=new SizeRepository1();
    
    @Override
    public ArrayList<Size1> getAllSize() {
        return sre.getAllSize();
    }

    @Override
    public ArrayList<Size1> getTimKiem(String maSize) {
        return sre.getTimKiem(maSize);
    }

    @Override
    public boolean add(Size1 s) {
        return sre.add(s);
    }

    @Override
    public boolean update(Size1 s, String maSize) {
        return sre.update(s, maSize);
    }

    @Override
    public boolean delete(String maSize) {
        return sre.delete(maSize);
    }
    
}
