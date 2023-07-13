package Responsitories;

import DomainModels.HoaDonChiTiet;
import ViewModels.HoaDonChiTietViewModel;
import java.util.List;

public interface HoaDonCTRepository {
    
    int insert (HoaDonChiTiet hdct);
    
    int delete (String IDHD);
    
     List<HoaDonChiTiet> selectByID(String idHoaDon);
     List<HoaDonChiTiet> getspbyidsp(String idsanpham);
     List<HoaDonChiTietViewModel> getall();
}
