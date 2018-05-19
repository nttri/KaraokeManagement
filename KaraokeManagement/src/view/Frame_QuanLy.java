/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import common.NVColor;
import common.QLColor;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Tu
 */
public class Frame_QuanLy extends javax.swing.JFrame {

    boolean bQuanLyNhanVien = false;
    boolean bQuanLyPhongHat = false;
    boolean bQuanLyDichVu = false;
    boolean bQuanLyDoanhThu = false;
    /**
     * Creates new form Frame_QuanLy
     */
    public Frame_QuanLy() {
        initComponents();
        customInit();
    }

    void customInit(){
        setFalseAllButton();
        bQuanLyNhanVien = true;
        
        setColorAllButton(QLColor.btn_Default);
        btn_QuanLyNhanVien.setBackground(QLColor.btn_When_Clicked);
        
        setAllPanelDisappear();
        jpn_QuanLyNhanVien.setVisible(true);
        
    }
    
    void setAllPanelDisappear(){
        jpn_QuanLyNhanVien.setVisible(false);
        jpn_QuanLyPhongHat.setVisible(false);
        jpn_QuanLyDichVu.setVisible(false);
        jpn_QuanLyDoanhThu.setVisible(false);
    }
    
    void setColorAllButton(Color color){
        btn_QuanLyNhanVien.setBackground(color);
        btn_QuanLyPhongHat.setBackground(color);
        btn_QuanLyDichVu.setBackground(color);
        btn_QuanLyDoanhThu.setBackground(color);
        btn_Thoat.setBackground(color);
    }
    
    void setFalseAllButton(){
        bQuanLyNhanVien = false;
        bQuanLyPhongHat = false;
        bQuanLyDichVu = false;
        bQuanLyDoanhThu = false;
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
        jLabel1 = new javax.swing.JLabel();
        jlb_brand = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_QuanLyNhanVien = new javax.swing.JButton();
        btn_QuanLyPhongHat = new javax.swing.JButton();
        btn_QuanLyDichVu = new javax.swing.JButton();
        btn_QuanLyDoanhThu = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jpn_QuanLyNhanVien = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnTaoMoi_pnQuanLyNhanVien = new javax.swing.JButton();
        btnChinhSua_pnQuanLyNhanVien = new javax.swing.JButton();
        btnXoa_pnQuanLyNhanVien = new javax.swing.JButton();
        jpn_QuanLyPhongHat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnTaoMoi_pnPhongHat = new javax.swing.JButton();
        btnChinhSua_pnPhongHat = new javax.swing.JButton();
        spPhongHat_pnPhongHat = new javax.swing.JScrollPane();
        tbPhongHat_pnPhongHat = new javax.swing.JTable();
        btnXoaPhong_pnPhongHat = new javax.swing.JButton();
        btnThemLoaiPhongHat = new javax.swing.JButton();
        jpn_QuanLyDichVu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spDichVu_pnDichVu = new javax.swing.JScrollPane();
        tbDichVu_pnDichVu = new javax.swing.JTable();
        btnTaoMoi_pnDichVu = new javax.swing.JButton();
        btnChinhSua_pnDichVu = new javax.swing.JButton();
        btnXoa_pnDichVu = new javax.swing.JButton();
        btnThemLoaiDichVu = new javax.swing.JButton();
        jpn_QuanLyDoanhThu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 708));
        setPreferredSize(new java.awt.Dimension(1280, 708));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 708));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setMinimumSize(new java.awt.Dimension(210, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 100));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tên APP");
        jLabel1.setMaximumSize(new java.awt.Dimension(210, 70));
        jLabel1.setMinimumSize(new java.awt.Dimension(210, 70));
        jLabel1.setPreferredSize(new java.awt.Dimension(210, 70));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 210, 70);
        jLabel1.getAccessibleContext().setAccessibleName("Tên app");

        jlb_brand.setForeground(new java.awt.Color(255, 255, 255));
        jlb_brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_brand.setText("Chào Tú");
        jlb_brand.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel1.add(jlb_brand);
        jlb_brand.setBounds(0, 70, 210, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 210, 100);

        jPanel2.setBackground(new java.awt.Color(32, 78, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 580));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 580));
        jPanel2.setLayout(null);

        btn_QuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_QLNV.png"))); // NOI18N
        btn_QuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuanLyNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyNhanVienMouseExited(evt);
            }
        });
        btn_QuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyNhanVienActionPerformed(evt);
            }
        });
        jPanel2.add(btn_QuanLyNhanVien);
        btn_QuanLyNhanVien.setBounds(0, 0, 210, 70);

        btn_QuanLyPhongHat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuanLyPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_PhongHat.png"))); // NOI18N
        btn_QuanLyPhongHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuanLyPhongHatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyPhongHatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyPhongHatMouseExited(evt);
            }
        });
        btn_QuanLyPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyPhongHatActionPerformed(evt);
            }
        });
        jPanel2.add(btn_QuanLyPhongHat);
        btn_QuanLyPhongHat.setBounds(0, 70, 210, 70);

        btn_QuanLyDichVu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuanLyDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_DichVu.png"))); // NOI18N
        btn_QuanLyDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuanLyDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyDichVuMouseExited(evt);
            }
        });
        btn_QuanLyDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyDichVuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_QuanLyDichVu);
        btn_QuanLyDichVu.setBounds(0, 140, 210, 70);

        btn_QuanLyDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuanLyDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_DoanhThu.png"))); // NOI18N
        btn_QuanLyDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuanLyDoanhThuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyDoanhThuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyDoanhThuMouseExited(evt);
            }
        });
        btn_QuanLyDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyDoanhThuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_QuanLyDoanhThu);
        btn_QuanLyDoanhThu.setBounds(0, 210, 210, 70);

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_Thoat.png"))); // NOI18N
        btn_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseExited(evt);
            }
        });
        jPanel2.add(btn_Thoat);
        btn_Thoat.setBounds(0, 510, 210, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 210, 580);

        jpn_QuanLyNhanVien.setBackground(new java.awt.Color(0, 68, 80));
        jpn_QuanLyNhanVien.setMinimumSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyNhanVien.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        jpn_QuanLyNhanVien.add(jLabel2);
        jLabel2.setBounds(40, 30, 535, 70);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Ngày sinh", "CMND", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jpn_QuanLyNhanVien.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 990, 430);

        btnTaoMoi_pnQuanLyNhanVien.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnQuanLyNhanVien.setText("TẠO MỚI");
        btnTaoMoi_pnQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTaoMoi_pnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnQuanLyNhanVienActionPerformed(evt);
            }
        });
        jpn_QuanLyNhanVien.add(btnTaoMoi_pnQuanLyNhanVien);
        btnTaoMoi_pnQuanLyNhanVien.setBounds(42, 585, 200, 48);

        btnChinhSua_pnQuanLyNhanVien.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChinhSua_pnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnQuanLyNhanVien.setText("CHỈNH SỬA");
        btnChinhSua_pnQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnQuanLyNhanVienActionPerformed(evt);
            }
        });
        jpn_QuanLyNhanVien.add(btnChinhSua_pnQuanLyNhanVien);
        btnChinhSua_pnQuanLyNhanVien.setBounds(440, 585, 200, 48);

        btnXoa_pnQuanLyNhanVien.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa_pnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_pnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoa_pnQuanLyNhanVien.setText("XÓA");
        btnXoa_pnQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoa_pnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_pnQuanLyNhanVienActionPerformed(evt);
            }
        });
        jpn_QuanLyNhanVien.add(btnXoa_pnQuanLyNhanVien);
        btnXoa_pnQuanLyNhanVien.setBounds(828, 585, 200, 48);

        getContentPane().add(jpn_QuanLyNhanVien);
        jpn_QuanLyNhanVien.setBounds(210, 0, 1070, 680);

        jpn_QuanLyPhongHat.setBackground(new java.awt.Color(0, 68, 80));
        jpn_QuanLyPhongHat.setMinimumSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyPhongHat.setPreferredSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyPhongHat.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUẢN LÝ PHÒNG HÁT");
        jpn_QuanLyPhongHat.add(jLabel3);
        jLabel3.setBounds(40, 30, 550, 70);

        btnTaoMoi_pnPhongHat.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnPhongHat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnPhongHat.setText("TẠO MỚI");
        btnTaoMoi_pnPhongHat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTaoMoi_pnPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnPhongHatActionPerformed(evt);
            }
        });
        jpn_QuanLyPhongHat.add(btnTaoMoi_pnPhongHat);
        btnTaoMoi_pnPhongHat.setBounds(42, 585, 200, 48);

        btnChinhSua_pnPhongHat.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnPhongHat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChinhSua_pnPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnPhongHat.setText("CHỈNH SỬA");
        btnChinhSua_pnPhongHat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnPhongHatActionPerformed(evt);
            }
        });
        jpn_QuanLyPhongHat.add(btnChinhSua_pnPhongHat);
        btnChinhSua_pnPhongHat.setBounds(440, 585, 200, 48);

        tbPhongHat_pnPhongHat.setBackground(new java.awt.Color(240, 240, 240));
        tbPhongHat_pnPhongHat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Trạng thái", "Sức chứa", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spPhongHat_pnPhongHat.setViewportView(tbPhongHat_pnPhongHat);

        jpn_QuanLyPhongHat.add(spPhongHat_pnPhongHat);
        spPhongHat_pnPhongHat.setBounds(40, 110, 990, 430);

        btnXoaPhong_pnPhongHat.setBackground(new java.awt.Color(204, 0, 0));
        btnXoaPhong_pnPhongHat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaPhong_pnPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPhong_pnPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoaPhong_pnPhongHat.setText("XÓA PHÒNG");
        btnXoaPhong_pnPhongHat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaPhong_pnPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhong_pnPhongHatActionPerformed(evt);
            }
        });
        jpn_QuanLyPhongHat.add(btnXoaPhong_pnPhongHat);
        btnXoaPhong_pnPhongHat.setBounds(828, 585, 200, 48);

        btnThemLoaiPhongHat.setBackground(new java.awt.Color(51, 51, 51));
        btnThemLoaiPhongHat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemLoaiPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLoaiPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnThemLoaiPhongHat.setText("THÊM LOẠI PHÒNG HÁT");
        btnThemLoaiPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiPhongHatActionPerformed(evt);
            }
        });
        jpn_QuanLyPhongHat.add(btnThemLoaiPhongHat);
        btnThemLoaiPhongHat.setBounds(730, 40, 300, 48);

        getContentPane().add(jpn_QuanLyPhongHat);
        jpn_QuanLyPhongHat.setBounds(210, 0, 1070, 680);

        jpn_QuanLyDichVu.setBackground(new java.awt.Color(0, 68, 80));
        jpn_QuanLyDichVu.setMinimumSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyDichVu.setPreferredSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyDichVu.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ DỊCH VỤ");
        jpn_QuanLyDichVu.add(jLabel4);
        jLabel4.setBounds(40, 30, 480, 70);

        tbDichVu_pnDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spDichVu_pnDichVu.setViewportView(tbDichVu_pnDichVu);

        jpn_QuanLyDichVu.add(spDichVu_pnDichVu);
        spDichVu_pnDichVu.setBounds(40, 110, 990, 430);

        btnTaoMoi_pnDichVu.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnDichVu.setText("TẠO MỚI");
        btnTaoMoi_pnDichVu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTaoMoi_pnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnDichVuActionPerformed(evt);
            }
        });
        jpn_QuanLyDichVu.add(btnTaoMoi_pnDichVu);
        btnTaoMoi_pnDichVu.setBounds(42, 585, 200, 48);

        btnChinhSua_pnDichVu.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChinhSua_pnDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnDichVu.setText("CHỈNH SỬA");
        btnChinhSua_pnDichVu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnDichVuActionPerformed(evt);
            }
        });
        jpn_QuanLyDichVu.add(btnChinhSua_pnDichVu);
        btnChinhSua_pnDichVu.setBounds(440, 585, 200, 48);

        btnXoa_pnDichVu.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa_pnDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa_pnDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_pnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoa_pnDichVu.setText("XÓA");
        btnXoa_pnDichVu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoa_pnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_pnDichVuActionPerformed(evt);
            }
        });
        jpn_QuanLyDichVu.add(btnXoa_pnDichVu);
        btnXoa_pnDichVu.setBounds(828, 585, 200, 48);

        btnThemLoaiDichVu.setBackground(new java.awt.Color(51, 51, 51));
        btnThemLoaiDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemLoaiDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLoaiDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnThemLoaiDichVu.setText("THÊM LOẠI DỊCH VỤ");
        btnThemLoaiDichVu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemLoaiDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiDichVuActionPerformed(evt);
            }
        });
        jpn_QuanLyDichVu.add(btnThemLoaiDichVu);
        btnThemLoaiDichVu.setBounds(728, 40, 300, 48);

        getContentPane().add(jpn_QuanLyDichVu);
        jpn_QuanLyDichVu.setBounds(210, 0, 1070, 680);

        jpn_QuanLyDoanhThu.setBackground(new java.awt.Color(0, 68, 80));
        jpn_QuanLyDoanhThu.setMinimumSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyDoanhThu.setPreferredSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyDoanhThu.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ DOANH THU");
        jpn_QuanLyDoanhThu.add(jLabel5);
        jLabel5.setBounds(40, 30, 560, 70);

        getContentPane().add(jpn_QuanLyDoanhThu);
        jpn_QuanLyDoanhThu.setBounds(210, 0, 1070, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_QuanLyNhanVienActionPerformed

    private void btn_QuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseClicked
        // TODO add your handling code here:
        setFalseAllButton();
        setColorAllButton(QLColor.btn_Default);
        setAllPanelDisappear();
        bQuanLyNhanVien = true;
        btn_QuanLyNhanVien.setBackground(QLColor.btn_When_Clicked);
        jpn_QuanLyNhanVien.setVisible(true);
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseClicked

    private void btn_QuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseEntered
        // TODO add your handling code here:
        if (bQuanLyNhanVien == false)
            btn_QuanLyNhanVien.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
            
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseEntered

    private void btn_QuanLyNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseExited
        // TODO add your handling code here:
        if (bQuanLyNhanVien == false)
            btn_QuanLyNhanVien.setBackground(QLColor.btn_Default);
        btn_QuanLyNhanVien.setText("");
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseExited

    private void btn_QuanLyPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyPhongHatActionPerformed

    private void btn_QuanLyPhongHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatMouseClicked
        // TODO add your handling code here:
        setFalseAllButton();
        setColorAllButton(QLColor.btn_Default);
        setAllPanelDisappear();
        bQuanLyPhongHat = true;
        btn_QuanLyPhongHat.setBackground(QLColor.btn_When_Clicked);
        jpn_QuanLyPhongHat.setVisible(true);
    }//GEN-LAST:event_btn_QuanLyPhongHatMouseClicked

    private void btn_QuanLyPhongHatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatMouseEntered
        // TODO add your handling code here:
        if (bQuanLyPhongHat == false)
            btn_QuanLyPhongHat.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyPhongHat.setText("QUẢN LÝ PHÒNG HÁT");
    }//GEN-LAST:event_btn_QuanLyPhongHatMouseEntered

    private void btn_QuanLyPhongHatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatMouseExited
        // TODO add your handling code here:
        if (bQuanLyPhongHat == false)
            btn_QuanLyPhongHat.setBackground(QLColor.btn_Default);
        btn_QuanLyPhongHat.setText("");
    }//GEN-LAST:event_btn_QuanLyPhongHatMouseExited

    private void btn_QuanLyDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyDichVuActionPerformed

    private void btn_QuanLyDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuMouseClicked
        // TODO add your handling code here:
        setFalseAllButton();
        setColorAllButton(QLColor.btn_Default);
        setAllPanelDisappear();
        bQuanLyDichVu = true;
        btn_QuanLyDichVu.setBackground(QLColor.btn_When_Clicked);
        jpn_QuanLyDichVu.setVisible(true);
    }//GEN-LAST:event_btn_QuanLyDichVuMouseClicked

    private void btn_QuanLyDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuMouseEntered
        // TODO add your handling code here:
        if (bQuanLyDichVu == false)
            btn_QuanLyDichVu.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyDichVu.setText("QUẢN LÝ DỊCH VỤ");
    }//GEN-LAST:event_btn_QuanLyDichVuMouseEntered

    private void btn_QuanLyDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuMouseExited
        // TODO add your handling code here:
        if (bQuanLyDichVu == false)
            btn_QuanLyDichVu.setBackground(QLColor.btn_Default);
        btn_QuanLyDichVu.setText("");
    }//GEN-LAST:event_btn_QuanLyDichVuMouseExited

    private void btn_QuanLyDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyDoanhThuActionPerformed

    private void btn_QuanLyDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDoanhThuMouseClicked
        // TODO add your handling code here:
        setFalseAllButton();
        setColorAllButton(QLColor.btn_Default);
        setAllPanelDisappear();
        bQuanLyDoanhThu = true;
        btn_QuanLyDoanhThu.setBackground(QLColor.btn_When_Clicked);
        jpn_QuanLyDoanhThu.setVisible(true);
    }//GEN-LAST:event_btn_QuanLyDoanhThuMouseClicked

    private void btn_QuanLyDoanhThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDoanhThuMouseEntered
        // TODO add your handling code here:
        if (bQuanLyDoanhThu == false)
            btn_QuanLyDoanhThu.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyDoanhThu.setText("QUẢN LÝ DOANH THU");
    }//GEN-LAST:event_btn_QuanLyDoanhThuMouseEntered

    private void btn_QuanLyDoanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDoanhThuMouseExited
        // TODO add your handling code here:
        if (bQuanLyDoanhThu == false)
            btn_QuanLyDoanhThu.setBackground(QLColor.btn_Default);
        btn_QuanLyDoanhThu.setText("");
    }//GEN-LAST:event_btn_QuanLyDoanhThuMouseExited

    private void btn_ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseClicked
        // TODO add your handling code here:
        Frame_DangNhap fDangNhap = new Frame_DangNhap();
        this.setVisible(false);
        fDangNhap.setVisible(true);
    }//GEN-LAST:event_btn_ThoatMouseClicked

    private void btn_ThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseEntered
        // TODO add your handling code here:
        btn_Thoat.setBackground(QLColor.btn_When_Entered);
        btn_Thoat.setText("THOÁT");
    }//GEN-LAST:event_btn_ThoatMouseEntered

    private void btn_ThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseExited
        // TODO add your handling code here:
        btn_Thoat.setBackground(QLColor.btn_Default);
        btn_Thoat.setText("");
    }//GEN-LAST:event_btn_ThoatMouseExited

    private void btnTaoMoi_pnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnQuanLyNhanVienActionPerformed
        Dialog_ThemNhanVien dThemNhanVien = new Dialog_ThemNhanVien(this, rootPaneCheckingEnabled);
        dThemNhanVien.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnQuanLyNhanVienActionPerformed

    private void btnChinhSua_pnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnQuanLyNhanVienActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnChinhSua_pnQuanLyNhanVienActionPerformed

    private void btnXoa_pnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnQuanLyNhanVienActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnXoa_pnQuanLyNhanVienActionPerformed

    private void btnTaoMoi_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnPhongHatActionPerformed
        Dialog_ThemPhongHat dThemPhongHat = new Dialog_ThemPhongHat(this, rootPaneCheckingEnabled);
        dThemPhongHat.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnPhongHatActionPerformed

    private void btnChinhSua_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnPhongHatActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnChinhSua_pnPhongHatActionPerformed

    private void btnXoaPhong_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhong_pnPhongHatActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnXoaPhong_pnPhongHatActionPerformed

    private void btnThemLoaiPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiPhongHatActionPerformed
        Dialog_ThemLoaiPhongHat dThemLoaiPhongHat = new Dialog_ThemLoaiPhongHat(this, rootPaneCheckingEnabled);
        dThemLoaiPhongHat.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiPhongHatActionPerformed

    private void btnTaoMoi_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDichVuActionPerformed
        Dialog_ThemDichVu dThemDichVu = new Dialog_ThemDichVu(this, rootPaneCheckingEnabled);
        dThemDichVu.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDichVuActionPerformed

    private void btnChinhSua_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnDichVuActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnChinhSua_pnDichVuActionPerformed

    private void btnXoa_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnDichVuActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện chưa có dữ liệu để thực hiện thao tác này");
    }//GEN-LAST:event_btnXoa_pnDichVuActionPerformed

    private void btnThemLoaiDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiDichVuActionPerformed
        Dialog_ThemLoaiDichVu dThemLoaiDichVu = new Dialog_ThemLoaiDichVu(this, rootPaneCheckingEnabled);
        dThemLoaiDichVu.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiDichVuActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Frame_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua_pnDichVu;
    private javax.swing.JButton btnChinhSua_pnPhongHat;
    private javax.swing.JButton btnChinhSua_pnQuanLyNhanVien;
    private javax.swing.JButton btnTaoMoi_pnDichVu;
    private javax.swing.JButton btnTaoMoi_pnPhongHat;
    private javax.swing.JButton btnTaoMoi_pnQuanLyNhanVien;
    private javax.swing.JButton btnThemLoaiDichVu;
    private javax.swing.JButton btnThemLoaiPhongHat;
    private javax.swing.JButton btnXoaPhong_pnPhongHat;
    private javax.swing.JButton btnXoa_pnDichVu;
    private javax.swing.JButton btnXoa_pnQuanLyNhanVien;
    private javax.swing.JButton btn_QuanLyDichVu;
    private javax.swing.JButton btn_QuanLyDoanhThu;
    private javax.swing.JButton btn_QuanLyNhanVien;
    private javax.swing.JButton btn_QuanLyPhongHat;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlb_brand;
    private javax.swing.JPanel jpn_QuanLyDichVu;
    private javax.swing.JPanel jpn_QuanLyDoanhThu;
    private javax.swing.JPanel jpn_QuanLyNhanVien;
    private javax.swing.JPanel jpn_QuanLyPhongHat;
    private javax.swing.JScrollPane spDichVu_pnDichVu;
    private javax.swing.JScrollPane spPhongHat_pnPhongHat;
    private javax.swing.JTable tbDichVu_pnDichVu;
    private javax.swing.JTable tbPhongHat_pnPhongHat;
    // End of variables declaration//GEN-END:variables
}
