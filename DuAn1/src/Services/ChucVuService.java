/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import DomainModels.ChucVuModel;
import java.util.List;
import ViewModels.ChucVuViewModel;

/**
 *
 * @author tuyen
 */
public interface ChucVuService {

    public List<ChucVuViewModel> getallcv();

    public ChucVuViewModel getcvbyma(String ma);

    public int add(ChucVuModel cv);

    public int update(String id, ChucVuModel cv);

    public int delete(String id);
}
