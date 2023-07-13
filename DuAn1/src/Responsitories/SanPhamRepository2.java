/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.SanPhamModel;
import ViewModels.SanPhamViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public interface SanPhamRepository2 {
    public List<SanPhamViewModel> getallsp();
    public SanPhamViewModel getspbyma(String ma);
    public boolean add(SanPhamModel sp);
    public int update(SanPhamModel sp);
    public int delete(String ma);
    public List<SanPhamViewModel> timkiem(String ten);
}
