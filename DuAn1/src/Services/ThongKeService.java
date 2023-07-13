/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.ThongKeViewModel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TGDD
 */
public interface ThongKeService {

    public ArrayList<ThongKeViewModel> getAllTK();

    public ArrayList<Integer> doanhThuALL();

    public ArrayList<Integer> soHoaDonALL();

    public ArrayList<Integer> soNhanVienALL();

    public ArrayList<Integer> doanhThu();

    public ArrayList<Integer> soHoaDon();

    public ArrayList<Integer> soNhanVien();

    public ArrayList<ThongKeViewModel> getAllTKKhoang(float tien1, float tien2);
    
    public ArrayList<ThongKeViewModel> getAllTKNgay(Date ngay1, Date ngay2);

    public ArrayList<Integer> doanhThuNam(int year);

    public ArrayList<Integer> soHoaDonNam(int year);

    public ArrayList<Integer> soNhanVienNam(int year);

    public ArrayList<Integer> doanhThuT1();

    public ArrayList<Integer> doanhThuT2();

    public ArrayList<Integer> doanhThuT3();

    public ArrayList<Integer> doanhThuT4();

    public ArrayList<Integer> doanhThuT5();

    public ArrayList<Integer> doanhThuT6();

    public ArrayList<Integer> doanhThuT7();

    public ArrayList<Integer> doanhThuT8();

    public ArrayList<Integer> doanhThuT9();

    public ArrayList<Integer> doanhThuT10();

    public ArrayList<Integer> doanhThuT11();

    public ArrayList<Integer> doanhThuT12();

    public ArrayList<Integer> soHoaDonT1();

    public ArrayList<Integer> soHoaDonT2();

    public ArrayList<Integer> soHoaDonT3();

    public ArrayList<Integer> soHoaDonT4();

    public ArrayList<Integer> soHoaDonT5();

    public ArrayList<Integer> soHoaDonT6();

    public ArrayList<Integer> soHoaDonT7();

    public ArrayList<Integer> soHoaDonT8();

    public ArrayList<Integer> soHoaDonT9();

    public ArrayList<Integer> soHoaDonT10();

    public ArrayList<Integer> soHoaDonT11();

    public ArrayList<Integer> soHoaDonT12();

    public ArrayList<Integer> soNhanVienT1();

    public ArrayList<Integer> soNhanVienT2();

    public ArrayList<Integer> soNhanVienT3();

    public ArrayList<Integer> soNhanVienT4();

    public ArrayList<Integer> soNhanVienT5();

    public ArrayList<Integer> soNhanVienT6();

    public ArrayList<Integer> soNhanVienT7();

    public ArrayList<Integer> soNhanVienT8();

    public ArrayList<Integer> soNhanVienT9();

    public ArrayList<Integer> soNhanVienT10();

    public ArrayList<Integer> soNhanVienT11();

    public ArrayList<Integer> soNhanVienT12();
}
