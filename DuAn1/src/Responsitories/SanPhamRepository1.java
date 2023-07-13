package Responsitories;

import DomainModels.SanPham;
import ViewModels.SanPhamResponse;
import ViewModels.SanPhamResponse1;
import java.util.List;

public interface SanPhamRepository1 {
    
    List<SanPhamResponse1> getALL();
    
    List<SanPhamResponse1> getSPByTenSize(String TenSize);
    
    List<SanPhamResponse1> getSPByTenDM(String TenDM);
    
    SanPham getOne(String ma);
    SanPhamResponse1 getspbydm(String tendm);
    SanPhamResponse1 getone1(String ma);
    boolean add(SanPham sp);
    int update(SanPham sp);
    int delete(String masp);
    List<SanPhamResponse1> selectByTimKiem(String key);
    
}
