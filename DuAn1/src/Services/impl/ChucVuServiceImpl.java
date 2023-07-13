/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.ChucVuModel;
import Responsitories.ChucVuRespository;
import Services.ChucVuService;

import java.util.List;
import ViewModels.ChucVuViewModel;

/**
 *
 * @author tuyen
 */
public class ChucVuServiceImpl implements ChucVuService {

    ChucVuRespository cv = new ChucVuRespository();

    @Override
    public List<ChucVuViewModel> getallcv() {
        return cv.getallcv();
    }

    @Override
    public ChucVuViewModel getcvbyma(String ma) {
        return cv.getcvbyma(ma);
    }

    @Override
    public int add(ChucVuModel cv) {
        return this.cv.add(cv);
    }

    @Override
    public int update(String id, ChucVuModel cv) {
        return this.cv.update(id, cv);
    }

    @Override
    public int delete(String id) {
        return this.cv.delete(id);
    }
    
}
