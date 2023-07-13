/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Services.ThongKeService;
import Services.impl.ThongKeServiceImpl;
import ViewModels.ThongKeViewModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TGDD
 */
public class ThongKeView extends javax.swing.JInternalFrame {

    private ThongKeService thongKeService = new ThongKeServiceImpl();
    private DefaultTableModel defaultTableModel;

    public ThongKeView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        loadTableTK(thongKeService.getAllTK());
        doanhThu();
        soHoaDon();
        soNhanVien();
        cbbTheoThang.addItem("");
        for (int i = 1; i < 13; i++) {
            cbbTheoThang.addItem("Tháng " + i);
        }

    }

    public void loadTableTK(ArrayList<ThongKeViewModel> list) {
        defaultTableModel = (DefaultTableModel) tblThongKe.getModel();
        defaultTableModel.setRowCount(0);
        for (ThongKeViewModel thongKeViewModel : list) {
            defaultTableModel.addRow(new Object[]{
                thongKeViewModel.getMaNV(),thongKeViewModel.getMaHD(), thongKeViewModel.getNgayTao(), 
                thongKeViewModel.getHinhThuc(),thongKeViewModel.getKhachHang(), thongKeViewModel.getTongTien() +" VNĐ",
                thongKeViewModel.getThanhToan()+" VNĐ",thongKeViewModel.getTienThuaTraKhach()+" VNĐ",thongKeViewModel.getTrangThai()
            });
        }

    }
   

    public void thongKeTheoThang() {
        if (cbbTheoThang.getSelectedItem().equals("")) {
            doanhThu();
            soHoaDon();
            soNhanVien();
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 1")) {
            ArrayList<Integer> list = thongKeService.doanhThuT1();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT1();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT1();
//            for (Integer integer : list) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 2")) {
            ArrayList<Integer> list = thongKeService.doanhThuT2();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT2();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT2();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }

        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 3")) {
            ArrayList<Integer> list = thongKeService.doanhThuT3();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT3();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT3();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 4")) {
            ArrayList<Integer> list = thongKeService.doanhThuT4();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT4();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT4();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 5")) {
            ArrayList<Integer> list = thongKeService.doanhThuT5();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT5();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT5();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 6")) {
            ArrayList<Integer> list = thongKeService.doanhThuT6();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT6();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT6();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 7")) {
            ArrayList<Integer> list = thongKeService.doanhThuT7();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT7();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT7();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 8")) {
            ArrayList<Integer> list = thongKeService.doanhThuT8();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT8();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT8();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 9")) {
            ArrayList<Integer> list = thongKeService.doanhThuT9();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT9();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT9();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 10")) {
            ArrayList<Integer> list = thongKeService.doanhThuT10();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT10();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT10();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else if (cbbTheoThang.getSelectedItem().equals("Tháng 11")) {
            ArrayList<Integer> list = thongKeService.doanhThuT11();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT11();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT11();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        } else {
            ArrayList<Integer> list = thongKeService.doanhThuT12();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonT12();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
//            ArrayList<Integer> listKH = thongKeService.soNhanVienT12();
//            for (Integer integer : listKH) {
//                lblNhanVien.setText(integer + "");
//            }
        }
    }

    private void doanhThu() {
        ArrayList<Integer> list = thongKeService.doanhThu();
        for (Integer integer : list) {
            lblDoanhThu.setText(integer + " VNĐ");
        }
    }

    private void soHoaDon() {
        ArrayList<Integer> list = thongKeService.soHoaDon();
        for (Integer integer : list) {
            lblHoaDon.setText(integer + "");
        }
    }

    private void soNhanVien() {
        ArrayList<Integer> list = thongKeService.soNhanVien();
        for (Integer integer : list) {
            lblNhanVien.setText(integer + "");
        }
    }
    private void rdoALL(){
        
        if(rdoAll.isSelected()){
             ArrayList<Integer> list = thongKeService.doanhThuALL();
            for (Integer integer : list) {
                lblDoanhThu.setText(integer + " VNĐ");
            }
            ArrayList<Integer> listHD = thongKeService.soHoaDonALL();
            for (Integer integer : listHD) {
                lblHoaDon.setText(integer + "");
            }
            ArrayList<Integer> listKH = thongKeService.soNhanVienALL();
            for (Integer integer : listKH) {
                lblNhanVien.setText(integer + "");
            }
        }
        else{
            doanhThu();
            soHoaDon();
            soNhanVien();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        cbbTheoThang = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        txtTien1 = new javax.swing.JTextField();
        btnSearchHD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTien2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSearchNgay = new javax.swing.JButton();
        txtDate1 = new com.toedter.calendar.JDateChooser();
        txtDate2 = new com.toedter.calendar.JDateChooser();
        rdoAll = new javax.swing.JRadioButton();

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống Kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 153, 51));
        jPanel6.setPreferredSize(new java.awt.Dimension(263, 164));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Tổng Số Hóa Đơn");

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setText("jLabel7");
        lblHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(lblHoaDon)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(263, 164));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Tổng Số Nhân Viên");

        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("jLabel8");
        lblNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblNhanVien)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(lblNhanVien)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 153, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Doanh Thu");

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoanhThu.setText("jLabel6");
        lblDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblDoanhThu))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(lblDoanhThu)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        cbbTheoThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTheoThangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Theo Năm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Theo Tháng");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Mã hóa đơn", "Ngày tạo", "Hình thức thanh toán", "Khách hàng", "Tổng tiền", "Thanh toán", "Tiền thừa trả khách", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblThongKe);

        btnSearchHD.setText("Search");
        btnSearchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tổng tiền theo khoảng từ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("đến");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Thông tin theo thời gian từ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("đến");

        btnSearchNgay.setText("Search");
        btnSearchNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNgayActionPerformed(evt);
            }
        });

        txtDate1.setDateFormatString("yyyy-MM-dd");

        txtDate2.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTien1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTien2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchHD)
                            .addComponent(btnSearchNgay))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHD)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSearchNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        rdoAll.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rdoAll.setText("All");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdoAll)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbTheoThang, 0, 123, Short.MAX_VALUE)
                    .addComponent(txtNam))
                .addGap(41, 41, 41)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(101, 101, 101)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(rdoAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(675, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTheoThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTheoThangActionPerformed
        thongKeTheoThang();
    }//GEN-LAST:event_cbbTheoThangActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtNam.getText().trim().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập năm");
            return;
        }
        int year = Integer.parseInt(txtNam.getText());

        ArrayList<Integer> list = thongKeService.doanhThuNam(year);
        for (Integer integer : list) {
            lblDoanhThu.setText(integer + " VNĐ");
        }

        ArrayList<Integer> listHD = thongKeService.soHoaDonNam(year);
        for (Integer integer : listHD) {
            lblHoaDon.setText(integer + "");
        }

//        ArrayList<Integer> listKH = thongKeService.soNhanVienNam(year);
//        for (Integer integer : listKH) {
//            lblNhanVien.setText(integer + "");
//        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDActionPerformed
        if(txtTien1.getText().trim().length()==0||txtTien2.getText().trim().length()==0){
            JOptionPane.showMessageDialog(rootPane, "ko được bỏ trống");
            return;
        }
        float tien1=Float.parseFloat(txtTien1.getText());
        float tien2=Float.parseFloat(txtTien2.getText());
 
        loadTableTK(thongKeService.getAllTKKhoang(tien1, tien2));
    }//GEN-LAST:event_btnSearchHDActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        
        rdoALL();
    }//GEN-LAST:event_rdoAllActionPerformed

    private void btnSearchNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNgayActionPerformed

        Date date1=txtDate1.getDate();
        Date date2=txtDate2.getDate();
        if(date1.toString().isEmpty()||date2.toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ko được bỏ trống");
            return;
        }
        
        loadTableTK(thongKeService.getAllTKNgay(date1, date2));
    }//GEN-LAST:event_btnSearchNgayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchHD;
    private javax.swing.JButton btnSearchNgay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbTheoThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JTable tblThongKe;
    private com.toedter.calendar.JDateChooser txtDate1;
    private com.toedter.calendar.JDateChooser txtDate2;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtTien1;
    private javax.swing.JTextField txtTien2;
    // End of variables declaration//GEN-END:variables
}
