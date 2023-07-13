/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.KhachHangModel;
import Responsitories.NhanVienReposirory;
import Responsitories.impl.KhachHangReposistory;
import Services.KhachHangService1;
import ViewModels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author TUF
 */
public class KhachHangServiceImpl1 implements KhachHangService1 {

    @Override
    public List<KhachHangViewModel> getAll() {
        return KhachHangReposistory.getAllKH();
    }

    @Override
    public KhachHangModel getkhbyid(String id) {
        return KhachHangReposistory.getCTByMa(id);
    }

    @Override
    public int add(KhachHangModel n) {
        boolean check = KhachHangReposistory.add(n);
        if (check) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int update(KhachHangModel n) {
        return KhachHangReposistory.update(n);
    }

    @Override
    public int delete(String id) {
        return KhachHangReposistory.delete(id);
    }

    @Override
    public KhachHangViewModel getkhbyma1(String ma) {
        return KhachHangReposistory.getkhbyma1(ma);
    }

    @Override
    public KhachHangModel getkhbyten(String ten) {
        return KhachHangReposistory.gettenkh(ten);
    }

}
