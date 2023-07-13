/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Responsitories.ThongKeRepository;
import Services.ThongKeService;
import ViewModels.ThongKeViewModel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TGDD
 */
public class ThongKeServiceImpl implements ThongKeService{
    
   private ThongKeRepository tkr=new ThongKeRepository();

    @Override
    public ArrayList<ThongKeViewModel> getAllTK() {
        return tkr.getAllTK();
    }

    @Override
    public ArrayList<Integer> doanhThu() {
        return tkr.doanhThu();
    }

    @Override
    public ArrayList<Integer> soHoaDon() {
        return tkr.soHoaDon();
    }

    @Override
    public ArrayList<Integer> soNhanVien() {
        return tkr.soNhanVien();
    }

    @Override
    public ArrayList<Integer> doanhThuT1() {
        return tkr.doanhThuT1();
    }

    @Override
    public ArrayList<Integer> doanhThuT2() {
        return tkr.doanhThuT2();
    }

    @Override
    public ArrayList<Integer> doanhThuT3() {
        return tkr.doanhThuT3();
    }

    @Override
    public ArrayList<Integer> doanhThuT4() {
        return tkr.doanhThuT4();
    }

    @Override
    public ArrayList<Integer> doanhThuT5() {
        return tkr.doanhThuT5();
    }

    @Override
    public ArrayList<Integer> doanhThuT6() {
        return tkr.doanhThuT6();
    }

    @Override
    public ArrayList<Integer> doanhThuT7() {
        return tkr.doanhThuT7();
    }

    @Override
    public ArrayList<Integer> doanhThuT8() {
        return tkr.doanhThuT8();
    }

    @Override
    public ArrayList<Integer> doanhThuT9() {
        return tkr.doanhThuT9();
    }

    @Override
    public ArrayList<Integer> doanhThuT10() {
        return tkr.doanhThuT10();
    }

    @Override
    public ArrayList<Integer> doanhThuT11() {
        return tkr.doanhThuT11();
    }

    @Override
    public ArrayList<Integer> doanhThuT12() {
        return tkr.doanhThuT12();
    }

    @Override
    public ArrayList<Integer> soHoaDonT1() {
        return tkr.soHoaDonT1();
    }

    @Override
    public ArrayList<Integer> soHoaDonT2() {
        return tkr.soHoaDonT2();
    }

    @Override
    public ArrayList<Integer> soHoaDonT3() {
        return tkr.soHoaDonT3();
    }

    @Override
    public ArrayList<Integer> soHoaDonT4() {
        return tkr.soHoaDonT4();
    }

    @Override
    public ArrayList<Integer> soHoaDonT5() {
        return tkr.soHoaDonT5();
    }

    @Override
    public ArrayList<Integer> soHoaDonT6() {
        return tkr.soHoaDonT6();
    }

    @Override
    public ArrayList<Integer> soHoaDonT7() {
        return tkr.soHoaDonT7();
    }

    @Override
    public ArrayList<Integer> soHoaDonT8() {
        return tkr.soHoaDonT8();
    }

    @Override
    public ArrayList<Integer> soHoaDonT9() {
        return tkr.soHoaDonT9();
    }

    @Override
    public ArrayList<Integer> soHoaDonT10() {
        return tkr.soHoaDonT10();
    }

    @Override
    public ArrayList<Integer> soHoaDonT11() {
        return tkr.soHoaDonT11();
    }

    @Override
    public ArrayList<Integer> soHoaDonT12() {
        return tkr.soHoaDonT12();
    }

    @Override
    public ArrayList<Integer> soNhanVienT1() {
        return tkr.soNhanVienT1();
    }

    @Override
    public ArrayList<Integer> soNhanVienT2() {
        return tkr.soNhanVienT2();
    }

    @Override
    public ArrayList<Integer> soNhanVienT3() {
        return tkr.soNhanVienT3();
    }

    @Override
    public ArrayList<Integer> soNhanVienT4() {
        return tkr.soNhanVienT4();
    }

    @Override
    public ArrayList<Integer> soNhanVienT5() {
        return tkr.soNhanVienT5();
    }

    @Override
    public ArrayList<Integer> soNhanVienT6() {
        return tkr.soNhanVienT6();
    }

    @Override
    public ArrayList<Integer> soNhanVienT7() {
        return tkr.soNhanVienT7();
    }

    @Override
    public ArrayList<Integer> soNhanVienT8() {
        return tkr.soNhanVienT8();
    }

    @Override
    public ArrayList<Integer> soNhanVienT9() {
        return tkr.soNhanVienT9();
    }

    @Override
    public ArrayList<Integer> soNhanVienT10() {
        return tkr.soNhanVienT10();
    }

    @Override
    public ArrayList<Integer> soNhanVienT11() {
        return tkr.soNhanVienT11();
    }

    @Override
    public ArrayList<Integer> soNhanVienT12() {
        return tkr.soNhanVienT12();
    }

    @Override
    public ArrayList<Integer> doanhThuNam(int year) {
        return tkr.doanhThuNam(year);
    }

    @Override
    public ArrayList<Integer> soHoaDonNam(int year) {
        return tkr.soHoaDonNam(year);
    }

    @Override
    public ArrayList<Integer> soNhanVienNam(int year) {
        return tkr.soNhanVienNam(year);
    }

    @Override
    public ArrayList<ThongKeViewModel> getAllTKKhoang(float tien1, float tien2) {
        return tkr.getAllTKKhoang(tien1, tien2);
    }

    @Override
    public ArrayList<Integer> doanhThuALL() {
        return tkr.doanhThuALL();
    }

    @Override
    public ArrayList<Integer> soHoaDonALL() {
        return tkr.soHoaDonALL();
    }

    @Override
    public ArrayList<Integer> soNhanVienALL() {
        return tkr.soNhanVienALL();
    }

    @Override
    public ArrayList<ThongKeViewModel> getAllTKNgay(Date ngay1, Date ngay2) {
        return tkr.getAllTKNgay(ngay1, ngay2);
    }
 
}
