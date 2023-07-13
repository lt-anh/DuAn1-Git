/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.SanPhamModel;
import ViewModels.SanPhamViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public interface SanPhamService2 {
    public List<SanPhamViewModel> getall();
    public SanPhamViewModel getspbyma(String ma);
    public int add(SanPhamModel sp);
    public int update(SanPhamModel sp);
    public int delete(String ma);
    public List<SanPhamViewModel> timkiem(String tensp);
}
