/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import Responsitories.HoaDonRepository1;
import Responsitories.impl.HoaDonRepositoryImpl1;
import Services.HoaDonService1;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public class HoaDonServiceimpl1 implements HoaDonService1{
    HoaDonRepository1 hdimpl = new HoaDonRepositoryImpl1();
    @Override
    public List<HoaDonViewModel> getall() {
        return hdimpl.getall();
    }
    
}
