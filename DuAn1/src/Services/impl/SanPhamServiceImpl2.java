/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.SanPhamModel;
import Responsitories.SanPhamRepository2;
import Responsitories.impl.SanPhamRepositoryimpl2;
import Services.SanPhamService2;
import ViewModels.SanPhamViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public class SanPhamServiceImpl2 implements SanPhamService2{
    SanPhamRepository2 sp = new SanPhamRepositoryimpl2();
    @Override
    public List<SanPhamViewModel> getall() {
        return this.sp.getallsp();
    }

    @Override
    public SanPhamViewModel getspbyma(String ma) {
        return this.sp.getspbyma(ma);
    }

    @Override
    public int add(SanPhamModel sp) {
        boolean check = this.sp.add(sp);
        if(check){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int update(SanPhamModel sp) {
        return this.sp.update(sp);
    }

    @Override
    public int delete(String ma) {
        return this.sp.delete(ma);
    }

    @Override
    public List<SanPhamViewModel> timkiem(String tensp) {
        return this.sp.timkiem(tensp);
    }
    
}
