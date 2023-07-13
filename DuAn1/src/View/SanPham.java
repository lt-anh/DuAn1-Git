/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import DomainModels.DanhMucSP;
import DomainModels.SanPhamModel;
import DomainModels.Size;
import Services.DanhMucSPService;
import Services.HoaDonCTService;
import Services.SanPhamService2;
import Services.SizeService;
import Services.impl.DanhMucSPServiceImpl;
import Services.impl.HoaDonCTServiceImpl;
import Services.impl.SanPhamServiceImpl2;
import Services.impl.SizeServiceImpl;
import View.Swing.ScrollBarCustom;
import ViewModels.HoaDonChiTietViewModel;
import ViewModels.SanPhamViewModel;
import java.awt.Image;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thuon
 */
public class SanPham extends javax.swing.JInternalFrame {

    DefaultTableModel tbm;
    List<SanPhamViewModel> sp;
    SanPhamService2 spimpl = new SanPhamServiceImpl2();
    DecimalFormat df = new DecimalFormat("#.##");
    String strHA;
    List<DanhMucSP> dm = new ArrayList<>();
    DanhMucSPService dmimpl = new DanhMucSPServiceImpl();
    DefaultComboBoxModel<String> comboboxdanhmuc;
    DefaultComboBoxModel<String> comboboxsize;
    List<Size> size;
    SizeService sizeimpl = new SizeServiceImpl();
    List<HoaDonChiTietViewModel> hdct;
    HoaDonCTService hdctimpl = new HoaDonCTServiceImpl();

    /**
     * Creates new form DanhMucSP
     */
    public SanPham() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        jScrollPanelMoTa.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPanelMoTa.setHorizontalScrollBar(sp);
        cbbTrangThai.removeAllItems();
        cbbTrangThai.addItem("Còn hàng");
        cbbTrangThai.addItem("Hết hàng");
        cbbdanhmuc();
        cbbloaidanhmuc();
        cbblocsize();
        cbbsize();
        filltable();
    }

    public boolean validate2() {
        if (txtMasp.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Mã sp không được bỏ trống");
            txtMasp.requestFocus();
            return false;
        }
        if (txtTenSp.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tên sp không được bỏ trống");
            txtTenSp.requestFocus();
            return false;
        }
        if (txtGia.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "giá sp không được bỏ trống");
            txtGia.requestFocus();
            return false;
        }
        try {
            double gia = Double.parseDouble(txtGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gía phải là số");
            return false;
        }
        return true;
    }

    public void filltable() {
        sp = spimpl.getall();
        tbm = (DefaultTableModel) this.tblSanPham.getModel();
        tbm.setRowCount(0);
        for (SanPhamViewModel x : sp) {
            tbm.addRow(new Object[]{
                x.getMasp(), x.getTensp(), x.getTenloaisp(), x.getTensize(), df.format(x.getDongia() + x.getGiasize()), x.getTrangthai() == 1 ? "Còn hàng" : "Hết hàng"
            });
        }
    }

    public void cbbdanhmuc() {
        dm = dmimpl.getALL();
        comboboxdanhmuc = (DefaultComboBoxModel<String>) this.cbbDanhMuc.getModel();
        comboboxdanhmuc.removeAllElements();
        for (DanhMucSP x : dm) {
            comboboxdanhmuc.addElement(x.getTenDM());
        }
    }

    public void cbbloaidanhmuc() {
        dm = dmimpl.getALL();
        comboboxdanhmuc = (DefaultComboBoxModel<String>) this.cbbLoaiSanPham.getModel();
        comboboxdanhmuc.removeAllElements();
        comboboxdanhmuc.addElement("");
        for (DanhMucSP x : dm) {
            comboboxdanhmuc.addElement(x.getTenDM());
        }
    }

    public void cbbsize() {
        size = sizeimpl.getALL();
        comboboxsize = (DefaultComboBoxModel<String>) this.cbbSize.getModel();
        comboboxsize.removeAllElements();
        for (Size x : size) {
            comboboxsize.addElement(x.getTenSize());
        }
    }

    public void cbblocsize() {
        size = sizeimpl.getALL();
        comboboxsize = (DefaultComboBoxModel<String>) this.cbblocsize.getModel();
        comboboxsize.removeAllElements();
        comboboxsize.addElement("");
        for (Size x : size) {
            comboboxsize.addElement(x.getTenSize());
        }
    }

    public static void main(String[] args) {
        new SanPham().setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPanelMoTa = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cbbTrangThai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbbSize = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbbDanhMuc = new javax.swing.JComboBox<>();
        btnAddsize = new javax.swing.JButton();
        btnAddDanhMuc = new javax.swing.JButton();
        btnThêm = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtResearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbbLoaiSanPham = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbblocsize = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Giá:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mô tả:");

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPanelMoTa.setViewportView(txtMota);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Trạng thái:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Size:");

        cbbSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbSizeMouseClicked(evt);
            }
        });
        cbbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSizeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Danh mục:");

        cbbDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbDanhMucMouseClicked(evt);
            }
        });
        cbbDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDanhMucActionPerformed(evt);
            }
        });

        btnAddsize.setText("+");
        btnAddsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddsizeActionPerformed(evt);
            }
        });

        btnAddDanhMuc.setText("+");
        btnAddDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDanhMucActionPerformed(evt);
            }
        });

        btnThêm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThêm.setText("Thêm");
        btnThêm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThêmActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThêm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGia)
                                .addComponent(jScrollPanelMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(cbbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAddsize, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPanelMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddsize))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddDanhMuc))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa)
                    .addComponent(btnThêm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tên sản phẩm");

        txtResearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResearchKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Loại Sản Phẩm");

        cbbLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbLoaiSanPham.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLoaiSanPhamItemStateChanged(evt);
            }
        });
        cbbLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbLoaiSanPhamMouseClicked(evt);
            }
        });
        cbbLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiSanPhamActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaSP", "TenSP", "LoaiSP", "Tên size", "Đơn giá", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setResizable(false);
            tblSanPham.getColumnModel().getColumn(1).setResizable(false);
            tblSanPham.getColumnModel().getColumn(2).setResizable(false);
            tblSanPham.getColumnModel().getColumn(3).setResizable(false);
            tblSanPham.getColumnModel().getColumn(4).setResizable(false);
            tblSanPham.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Size");

        cbblocsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbblocsize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbblocsizeItemStateChanged(evt);
            }
        });
        cbblocsize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbblocsizeMouseClicked(evt);
            }
        });
        cbblocsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbblocsizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResearch, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbblocsize, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbblocsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int rows = tblSanPham.getSelectedRow();
        String masp = tblSanPham.getValueAt(rows, 0).toString();
        SanPhamViewModel sp2 = spimpl.getspbyma(masp);
        txtGia.setText(df.format(sp2.getDongia()));
        txtMasp.setText(sp2.getMasp());
        txtTenSp.setText(sp2.getTensp());
        cbbSize.setSelectedItem(sp2.getTensize());
        cbbTrangThai.setSelectedItem(sp2.getTrangthai() == 1 ? "Còn hàng" : "Hết hàng");
        cbbDanhMuc.setSelectedItem(sp2.getTenloaisp());
        if (sp2.getHinhanh().equalsIgnoreCase("")) {
            lblHinhAnh.setText("NO AVATAR");
            lblHinhAnh.setIcon(null);
        } else {
//       
            Image img = new ImageIcon(sp2.getHinhanh()).getImage();
            lblHinhAnh.setIcon(new ImageIcon(img));
//        lbTenSP.setText(data.getTenSP());
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        try {
            JFileChooser jfc = new JFileChooser("E:\\duan1_14_12_2022\\Nootea3000 (1)\\Nootea3000\\src\\Image");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            Image img = ImageIO.read(file);
            strHA = "./src/Image/" + file.getName();
            lblHinhAnh.setText("");
            int width = lblHinhAnh.getWidth();
            int height = lblHinhAnh.getHeight();
            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (Exception ex) {
            System.out.println("Error:" + ex.toString());
        }
    }//GEN-LAST:event_lblHinhAnhMouseClicked
    public SanPhamModel getspbyform() {
        int index = cbbSize.getSelectedIndex();
        size = sizeimpl.getALL();
        Size s1 = size.get(index);
        int index1 = cbbDanhMuc.getSelectedIndex();
        dm = dmimpl.getALL();
        DanhMucSP dm1 = dm.get(index1);
        return new SanPhamModel(null, txtMasp.getText(), txtTenSp.getText(), Double.parseDouble(txtGia.getText()), "", strHA, cbbTrangThai.getSelectedItem().equals("Còn hàng") ? 1 : 0, s1.getID(), dm1.getID());
    }
    private void btnThêmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThêmActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            if (validate2()) {
                if (strHA == null) {
                    JOptionPane.showMessageDialog(this, "Chưa chọn hình");
                    return;
                }
                if (spimpl.add(getspbyform()) != 1) {
                    JOptionPane.showMessageDialog(this, "Đã thêm");
                    filltable();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {

        }
    }//GEN-LAST:event_btnThêmActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int rows = tblSanPham.getSelectedRow();
        if (rows >= 0) {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa ko", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                spimpl.update(getspbyform());
                JOptionPane.showMessageDialog(this, "Đã sửa");
                filltable();
            } else {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm cần sửa");
            return;
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int rows = tblSanPham.getSelectedRow();
        if (rows >= 0) {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa ko", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                String ma = tblSanPham.getValueAt(rows, 0).toString();
                hdct = hdctimpl.getall();
                for (HoaDonChiTietViewModel x : hdct) {
                    if(x.getMasp().equals(ma)){
                        JOptionPane.showMessageDialog(this, "Đã có sản phẩm đó trong hóa đơn chi tiết, không thể xóa");
                        return;
                    }
                }
                 spimpl.delete(ma);
                    JOptionPane.showMessageDialog(this, "Đã xóa");
                    filltable();
            } else {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm cần xóa");
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbbLoaiSanPhamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLoaiSanPhamItemStateChanged
        if (cbbDanhMuc.getItemCount() > 0) {
            String tendm = (String) cbbLoaiSanPham.getSelectedItem();
            sp = spimpl.getall();
            tbm = (DefaultTableModel) this.tblSanPham.getModel();
            tbm.setRowCount(0);
            for (SanPhamViewModel x : sp) {
                if (x.getTenloaisp().equals(tendm)) {
                    tbm.addRow(new Object[]{
                        x.getMasp(), x.getTensp(), x.getTenloaisp(), x.getTensize(), df.format(x.getDongia() + x.getGiasize()), x.getTrangthai() == 1 ? "Còn hàng" : "Hết hàng"
                    });
                }
            }
        }
    }//GEN-LAST:event_cbbLoaiSanPhamItemStateChanged

    private void cbblocsizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbblocsizeItemStateChanged
        if (cbblocsize.getItemCount() > 0) {
            String tensize = cbblocsize.getSelectedItem().toString();
            sp = spimpl.getall();
            tbm = (DefaultTableModel) this.tblSanPham.getModel();
            tbm.setRowCount(0);
            for (SanPhamViewModel x : sp) {
                if (x.getTensize().equals(tensize)) {
                    tbm.addRow(new Object[]{
                        x.getMasp(), x.getTensp(), x.getTenloaisp(), x.getTensize(), df.format(x.getDongia() + x.getGiasize()), x.getTrangthai() == 1 ? "Còn hàng" : "Hết hàng"
                    });
                }
            }
        }
    }//GEN-LAST:event_cbblocsizeItemStateChanged

    private void txtResearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResearchKeyReleased
        if (txtResearch.getText().trim().equalsIgnoreCase("")) {
            filltable();
            return;
        }
        sp = spimpl.timkiem(txtResearch.getText());
        tbm = (DefaultTableModel) this.tblSanPham.getModel();
        tbm.setRowCount(0);
        for (SanPhamViewModel x : sp) {
            tbm.addRow(new Object[]{
                x.getMasp(), x.getTensp(), x.getTenloaisp(), x.getTensize(), df.format(x.getDongia() + x.getGiasize()), x.getTrangthai() == 1 ? "Còn hàng" : "Hết hàng"
            });
        }
    }//GEN-LAST:event_txtResearchKeyReleased

    private void btnAddsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddsizeActionPerformed
        SizeView s = new SizeView();
        s.setVisible(true);
    }//GEN-LAST:event_btnAddsizeActionPerformed

    private void btnAddDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDanhMucActionPerformed
        DanhMuc1View dm = new DanhMuc1View();
        dm.setVisible(true);
    }//GEN-LAST:event_btnAddDanhMucActionPerformed

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed

    }//GEN-LAST:event_cbbSizeActionPerformed

    private void cbbDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDanhMucActionPerformed

    }//GEN-LAST:event_cbbDanhMucActionPerformed

    private void cbbLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiSanPhamActionPerformed

    }//GEN-LAST:event_cbbLoaiSanPhamActionPerformed

    private void cbblocsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbblocsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbblocsizeActionPerformed

    private void cbbSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSizeMouseClicked
        cbbsize();
    }//GEN-LAST:event_cbbSizeMouseClicked

    private void cbbDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbDanhMucMouseClicked
        cbbdanhmuc();
    }//GEN-LAST:event_cbbDanhMucMouseClicked

    private void cbblocsizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbblocsizeMouseClicked
        cbblocsize();
    }//GEN-LAST:event_cbblocsizeMouseClicked

    private void cbbLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbLoaiSanPhamMouseClicked
        cbbloaidanhmuc();
    }//GEN-LAST:event_cbbLoaiSanPhamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDanhMuc;
    private javax.swing.JButton btnAddsize;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThêm;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbDanhMuc;
    private javax.swing.JComboBox<String> cbbLoaiSanPham;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JComboBox<String> cbblocsize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanelMoTa;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtResearch;
    private javax.swing.JTextField txtTenSp;
    // End of variables declaration//GEN-END:variables
}
