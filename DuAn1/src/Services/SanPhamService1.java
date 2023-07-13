package Services;

import DomainModels.SanPham;
import ViewModels.SanPhamResponse1;
import java.util.List;

public interface SanPhamService1 {
    List<SanPhamResponse1> getALL();
    
    List<SanPhamResponse1> getSPByTenSize(String TenSize);
    
    List<SanPhamResponse1> getSPByTenDM(String TenDM);
    
    SanPham getOne(String ma);
    SanPhamResponse1 getone1(String ma);
    int add(SanPham sp);
    int update(SanPham sp);
    int delete(String ma);
    List<SanPhamResponse1> selectByTimKiem(String key);
}
