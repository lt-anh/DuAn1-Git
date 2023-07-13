package Services.impl;

import DomainModels.HoaDonChiTiet;
import Responsitories.HoaDonCTRepository;
import Responsitories.impl.HoaDonCTRepositoryImpl;
import Services.HoaDonCTService;
import ViewModels.HoaDonChiTietViewModel;
import java.util.List;

public class HoaDonCTServiceImpl implements HoaDonCTService{
    private HoaDonCTRepository hdctRep = new HoaDonCTRepositoryImpl();
    
    @Override
    public int insert(HoaDonChiTiet hdct) {
        return hdctRep.insert(hdct);
    }

    @Override
    public int delete(String IDHD) {
        return hdctRep.delete(IDHD);
    }

    @Override
    public List<HoaDonChiTiet> selectByID(String idHoaDon) {
        return hdctRep.selectByID(idHoaDon);
    }

    @Override
    public List<HoaDonChiTiet> getspbyidsp(String idsanpham) {
        return hdctRep.getspbyidsp(idsanpham);
    }

    @Override
    public List<HoaDonChiTietViewModel> getall() {
        return hdctRep.getall();
    }
    
}
