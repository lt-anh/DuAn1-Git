/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.Size1;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public interface SizeService1 {

    public ArrayList<Size1> getAllSize();

    public ArrayList<Size1> getTimKiem(String maSize);

    public boolean add(Size1 s);

    public boolean update(Size1 s, String maSize);

    public boolean delete(String maSize);

}
