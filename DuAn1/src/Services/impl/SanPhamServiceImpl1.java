package Services.impl;

import DomainModels.SanPham;
import Responsitories.SanPhamRepository1;
import Responsitories.impl.SanPhamRepositoryImpl1;
import Services.SanPhamService1;
import ViewModels.SanPhamResponse1;
import java.util.List;

public class SanPhamServiceImpl1 implements SanPhamService1{
    private SanPhamRepository1 sanPhamRep = new SanPhamRepositoryImpl1();
    @Override
    public List<SanPhamResponse1> getALL() {
        return sanPhamRep.getALL();
    }

    @Override
    public List<SanPhamResponse1> getSPByTenSize(String TenSize) {
        return sanPhamRep.getSPByTenSize(TenSize);
    }

    @Override
    public List<SanPhamResponse1> getSPByTenDM(String TenDM) {
        return sanPhamRep.getSPByTenDM(TenDM);
    }

    @Override
    public SanPham getOne(String ma) {
        return sanPhamRep.getOne(ma);
    }

    @Override
    public SanPhamResponse1 getone1(String ma) {
        return sanPhamRep.getone1(ma);
    }

    @Override
    public int add(SanPham sp) {
        boolean check = sanPhamRep.add(sp);
        if(check){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int update(SanPham sp) {
        return sanPhamRep.update(sp);
    }

    @Override
    public int delete(String ma) {
        return sanPhamRep.delete(ma);
    }

    @Override
    public List<SanPhamResponse1> selectByTimKiem(String key) {
        return sanPhamRep.selectByTimKiem(key);
    }
    
    
}
