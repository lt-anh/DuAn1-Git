/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.KhachHangModel;
import ViewModels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author TUF
 */
public interface KhachHangService1 {

    public List<KhachHangViewModel> getAll();

    public KhachHangModel getkhbyid(String id);

    public KhachHangModel getkhbyten(String ten);

    public int add(KhachHangModel n);

    public int update(KhachHangModel n);

    public int delete(String id);

    public KhachHangViewModel getkhbyma1(String ma);

}
