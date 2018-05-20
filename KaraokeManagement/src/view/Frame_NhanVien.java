package view;

import Business.*;
import common.*;
import model.*;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author thanhtri
 */
public class Frame_NhanVien extends javax.swing.JFrame {

    static NhanVien NV;
    
    boolean bDonDatPhong = false;
    boolean bDichVu = false;
    boolean bKhachHangThanhVien = false;
    boolean bPhongHat = false;
    boolean bThanhToan = false;
    
    public Frame_NhanVien() {
        initComponents();
        customInit();
    }
    
    public Frame_NhanVien(NhanVien nv){
        this();
        NV = nv;
        jLB_Brand.setText(MyStrings.AppTitle);
        jLB_Name.setText("Chào " + NV.getHoten());
    }
    void customInit(){
        setFalseAllButton();
        bDonDatPhong = true;
        
        setColorAllButton(NVColor.btn_Default);
        btnDonDatPhong.setBackground(NVColor.btn_When_Clicked);
        
        setAllPanelDisappear();
        pnDonDatPhong.setVisible(true);
        
    }
    
    void setAllPanelDisappear(){
        pnDonDatPhong.setVisible(false);
        pnDichVu.setVisible(false);
        pnKhachHangThanhVien.setVisible(false);
        pnPhongHat.setVisible(false);
        pnThanhToan.setVisible(false);
    }
    
    void setColorAllButton(Color color ){
        btnDonDatPhong.setBackground(color);
        btnDichVu.setBackground(color);
        btnKhachHangThanhVien.setBackground(color);
        btnPhongHat.setBackground(color);
        btnThanhToan.setBackground(color);
        btnThoat.setBackground(color);
    }

    void setFalseAllButton(){
        bDonDatPhong = false;
        bDichVu = false;
        bKhachHangThanhVien = false;
        bPhongHat = false;
        bThanhToan = false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLB_Brand = new javax.swing.JLabel();
        jLB_Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDonDatPhong = new javax.swing.JButton();
        btnDichVu = new javax.swing.JButton();
        btnKhachHangThanhVien = new javax.swing.JButton();
        btnPhongHat = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        pnDonDatPhong = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spDonDatPhong_pnDonDatPhong = new javax.swing.JScrollPane();
        tbDonDatPhong_pnDonDatPhong = new javax.swing.JTable();
        btnTaoMoi_pnDonDatPhong = new javax.swing.JButton();
        btnChinhSua_pnDonDatPhong = new javax.swing.JButton();
        btnXoaDon_pnDonDatPhong = new javax.swing.JButton();
        pnDichVu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spDichVu_pnDichVu = new javax.swing.JScrollPane();
        tbDichVu_pnDichVu = new javax.swing.JTable();
        btnTaoMoi_pnDichVu = new javax.swing.JButton();
        btnChinhSua_pnDichVu = new javax.swing.JButton();
        btnXoa_pnDichVu = new javax.swing.JButton();
        btnThemLoaiDichVu = new javax.swing.JButton();
        pnKhachHangThanhVien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spKhachHangThanhVien = new javax.swing.JScrollPane();
        tbKhachHangThanhVien = new javax.swing.JTable();
        btnTaoMoi_pnKhachHangThanhVien = new javax.swing.JButton();
        btnChinhSua_pnKhachHangThanhVien = new javax.swing.JButton();
        btnXoa_pnKhachHangThanhVien = new javax.swing.JButton();
        pnPhongHat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        spPhongHat_pnPhongHat = new javax.swing.JScrollPane();
        tbPhongHat_pnPhongHat = new javax.swing.JTable();
        btnTaoMoi_pnPhongHat = new javax.swing.JButton();
        btnChinhSua_pnPhongHat = new javax.swing.JButton();
        btnXoaPhong_pnPhongHat = new javax.swing.JButton();
        btnThemLoaiPhongHat = new javax.swing.JButton();
        pnThanhToan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfTim_pnThanhToan = new javax.swing.JTextField();
        btnTim_pnThanhToan = new javax.swing.JButton();
        spThanhToan_pnThanhToan = new javax.swing.JScrollPane();
        tbThanhToan_pnThanhToan = new javax.swing.JTable();
        btnThanhToan_pnThanhToan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 125, 39));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLB_Brand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLB_Brand.setForeground(new java.awt.Color(255, 255, 255));
        jLB_Brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLB_Brand.setText("My Karaoke");
        jPanel1.add(jLB_Brand);
        jLB_Brand.setBounds(0, 0, 210, 75);

        jLB_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLB_Name.setForeground(new java.awt.Color(0, 204, 51));
        jLB_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLB_Name.setText("Chào");
        jLB_Name.setToolTipText("");
        jPanel1.add(jLB_Name);
        jLB_Name.setBounds(0, 75, 210, 25);

        jPanel2.setBackground(new java.awt.Color(0, 100, 0));
        jPanel2.setLayout(null);

        btnDonDatPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDonDatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnDonDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_DonDatPhong.png"))); // NOI18N
        btnDonDatPhong.setBorder(null);
        btnDonDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDonDatPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDonDatPhongMouseExited(evt);
            }
        });
        btnDonDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonDatPhongActionPerformed(evt);
            }
        });
        jPanel2.add(btnDonDatPhong);
        btnDonDatPhong.setBounds(0, 0, 210, 70);

        btnDichVu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_DichVu.png"))); // NOI18N
        btnDichVu.setBorder(null);
        btnDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDichVuMouseExited(evt);
            }
        });
        btnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVuActionPerformed(evt);
            }
        });
        jPanel2.add(btnDichVu);
        btnDichVu.setBounds(0, 70, 210, 70);

        btnKhachHangThanhVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhachHangThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnKhachHangThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_KhachHangThanhVien.png"))); // NOI18N
        btnKhachHangThanhVien.setBorder(null);
        btnKhachHangThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhachHangThanhVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKhachHangThanhVienMouseExited(evt);
            }
        });
        btnKhachHangThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangThanhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btnKhachHangThanhVien);
        btnKhachHangThanhVien.setBounds(0, 140, 210, 70);

        btnPhongHat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_PhongHat.png"))); // NOI18N
        btnPhongHat.setBorder(null);
        btnPhongHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPhongHatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPhongHatMouseExited(evt);
            }
        });
        btnPhongHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongHatActionPerformed(evt);
            }
        });
        jPanel2.add(btnPhongHat);
        btnPhongHat.setBounds(0, 210, 210, 70);

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_ThanhToan.png"))); // NOI18N
        btnThanhToan.setBorder(null);
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseExited(evt);
            }
        });
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });
        jPanel2.add(btnThanhToan);
        btnThanhToan.setBounds(0, 280, 210, 70);

        btnThoat.setBackground(new java.awt.Color(145, 0, 0));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_Thoat.png"))); // NOI18N
        btnThoat.setBorder(null);
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel2.add(btnThoat);
        btnThoat.setBounds(0, 510, 210, 70);

        pnDonDatPhong.setBackground(new java.awt.Color(10, 125, 39));
        pnDonDatPhong.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnDonDatPhong.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ ĐƠN ĐẶT PHÒNG");
        pnDonDatPhong.add(jLabel2);
        jLabel2.setBounds(40, 13, 598, 54);

        tbDonDatPhong_pnDonDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn", "Mã phòng", "Ngày đặt", "Giờ bắt đầu", "Giờ kết thúc"
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
        spDonDatPhong_pnDonDatPhong.setViewportView(tbDonDatPhong_pnDonDatPhong);
        if (tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumnCount() > 0) {
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(1).setPreferredWidth(250);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(3).setPreferredWidth(350);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(4).setPreferredWidth(220);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(4).setHeaderValue("Giờ kết thúc");
        }

        pnDonDatPhong.add(spDonDatPhong_pnDonDatPhong);
        spDonDatPhong_pnDonDatPhong.setBounds(40, 110, 990, 430);

        btnTaoMoi_pnDonDatPhong.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnDonDatPhong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnDonDatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnDonDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnDonDatPhong.setText("TẠO MỚI");
        btnTaoMoi_pnDonDatPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTaoMoi_pnDonDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnDonDatPhongActionPerformed(evt);
            }
        });
        pnDonDatPhong.add(btnTaoMoi_pnDonDatPhong);
        btnTaoMoi_pnDonDatPhong.setBounds(42, 585, 200, 48);

        btnChinhSua_pnDonDatPhong.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnDonDatPhong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChinhSua_pnDonDatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnDonDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnDonDatPhong.setText("CHỈNH SỬA");
        btnChinhSua_pnDonDatPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnDonDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnDonDatPhongActionPerformed(evt);
            }
        });
        pnDonDatPhong.add(btnChinhSua_pnDonDatPhong);
        btnChinhSua_pnDonDatPhong.setBounds(440, 585, 200, 48);

        btnXoaDon_pnDonDatPhong.setBackground(new java.awt.Color(204, 0, 0));
        btnXoaDon_pnDonDatPhong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaDon_pnDonDatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaDon_pnDonDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoaDon_pnDonDatPhong.setText("XÓA ĐƠN");
        btnXoaDon_pnDonDatPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaDon_pnDonDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDon_pnDonDatPhongActionPerformed(evt);
            }
        });
        pnDonDatPhong.add(btnXoaDon_pnDonDatPhong);
        btnXoaDon_pnDonDatPhong.setBounds(828, 585, 200, 48);

        pnDichVu.setBackground(new java.awt.Color(10, 125, 39));
        pnDichVu.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnDichVu.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUẢN LÝ DỊCH VỤ");
        pnDichVu.add(jLabel3);
        jLabel3.setBounds(40, 13, 405, 54);

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

        pnDichVu.add(spDichVu_pnDichVu);
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
        pnDichVu.add(btnTaoMoi_pnDichVu);
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
        pnDichVu.add(btnChinhSua_pnDichVu);
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
        pnDichVu.add(btnXoa_pnDichVu);
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
        pnDichVu.add(btnThemLoaiDichVu);
        btnThemLoaiDichVu.setBounds(728, 20, 300, 48);

        pnKhachHangThanhVien.setBackground(new java.awt.Color(10, 125, 39));
        pnKhachHangThanhVien.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnKhachHangThanhVien.setName(""); // NOI18N
        pnKhachHangThanhVien.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ KHÁCH HÀNG THÀNH VIÊN");
        pnKhachHangThanhVien.add(jLabel4);
        jLabel4.setBounds(40, 13, 811, 54);

        tbKhachHangThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Số CMND", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spKhachHangThanhVien.setViewportView(tbKhachHangThanhVien);
        if (tbKhachHangThanhVien.getColumnModel().getColumnCount() > 0) {
            tbKhachHangThanhVien.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbKhachHangThanhVien.getColumnModel().getColumn(1).setPreferredWidth(250);
            tbKhachHangThanhVien.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbKhachHangThanhVien.getColumnModel().getColumn(3).setPreferredWidth(350);
        }

        pnKhachHangThanhVien.add(spKhachHangThanhVien);
        spKhachHangThanhVien.setBounds(40, 110, 990, 430);

        btnTaoMoi_pnKhachHangThanhVien.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnKhachHangThanhVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnKhachHangThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnKhachHangThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnKhachHangThanhVien.setText("TẠO MỚI");
        btnTaoMoi_pnKhachHangThanhVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTaoMoi_pnKhachHangThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnKhachHangThanhVienActionPerformed(evt);
            }
        });
        pnKhachHangThanhVien.add(btnTaoMoi_pnKhachHangThanhVien);
        btnTaoMoi_pnKhachHangThanhVien.setBounds(42, 585, 200, 48);

        btnChinhSua_pnKhachHangThanhVien.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnKhachHangThanhVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChinhSua_pnKhachHangThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnKhachHangThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnKhachHangThanhVien.setText("CHỈNH SỬA");
        btnChinhSua_pnKhachHangThanhVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnKhachHangThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnKhachHangThanhVienActionPerformed(evt);
            }
        });
        pnKhachHangThanhVien.add(btnChinhSua_pnKhachHangThanhVien);
        btnChinhSua_pnKhachHangThanhVien.setBounds(440, 585, 200, 48);

        btnXoa_pnKhachHangThanhVien.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa_pnKhachHangThanhVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa_pnKhachHangThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_pnKhachHangThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoa_pnKhachHangThanhVien.setText("XÓA");
        btnXoa_pnKhachHangThanhVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoa_pnKhachHangThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_pnKhachHangThanhVienActionPerformed(evt);
            }
        });
        pnKhachHangThanhVien.add(btnXoa_pnKhachHangThanhVien);
        btnXoa_pnKhachHangThanhVien.setBounds(828, 585, 200, 48);

        pnPhongHat.setBackground(new java.awt.Color(10, 125, 39));
        pnPhongHat.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnPhongHat.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ PHÒNG HÁT");
        pnPhongHat.add(jLabel5);
        jLabel5.setBounds(40, 13, 480, 54);

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
        if (tbPhongHat_pnPhongHat.getColumnModel().getColumnCount() > 0) {
            tbPhongHat_pnPhongHat.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbPhongHat_pnPhongHat.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbPhongHat_pnPhongHat.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbPhongHat_pnPhongHat.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        pnPhongHat.add(spPhongHat_pnPhongHat);
        spPhongHat_pnPhongHat.setBounds(40, 110, 990, 430);

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
        pnPhongHat.add(btnTaoMoi_pnPhongHat);
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
        pnPhongHat.add(btnChinhSua_pnPhongHat);
        btnChinhSua_pnPhongHat.setBounds(440, 585, 200, 48);

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
        pnPhongHat.add(btnXoaPhong_pnPhongHat);
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
        pnPhongHat.add(btnThemLoaiPhongHat);
        btnThemLoaiPhongHat.setBounds(728, 20, 300, 48);

        pnThanhToan.setBackground(new java.awt.Color(10, 125, 39));
        pnThanhToan.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnThanhToan.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("THANH TOÁN");
        pnThanhToan.add(jLabel6);
        jLabel6.setBounds(40, 13, 297, 54);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tìm kiếm theo mã phòng hát");
        pnThanhToan.add(jLabel7);
        jLabel7.setBounds(800, 70, 231, 22);

        tfTim_pnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTim_pnThanhToan.setForeground(new java.awt.Color(10, 125, 39));
        pnThanhToan.add(tfTim_pnThanhToan);
        tfTim_pnThanhToan.setBounds(800, 100, 150, 35);

        btnTim_pnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTim_pnThanhToan.setForeground(new java.awt.Color(10, 125, 39));
        btnTim_pnThanhToan.setText("Tìm");
        btnTim_pnThanhToan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTim_pnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim_pnThanhToanActionPerformed(evt);
            }
        });
        pnThanhToan.add(btnTim_pnThanhToan);
        btnTim_pnThanhToan.setBounds(958, 100, 70, 35);

        tbThanhToan_pnThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Thời gian đã dùng", "Mã chi tiết dịch vụ", "Tổng cộng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spThanhToan_pnThanhToan.setViewportView(tbThanhToan_pnThanhToan);
        if (tbThanhToan_pnThanhToan.getColumnModel().getColumnCount() > 0) {
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        pnThanhToan.add(spThanhToan_pnThanhToan);
        spThanhToan_pnThanhToan.setBounds(40, 160, 990, 400);

        btnThanhToan_pnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThanhToan_pnThanhToan.setForeground(new java.awt.Color(10, 125, 39));
        btnThanhToan_pnThanhToan.setText("THANH TOÁN");
        btnThanhToan_pnThanhToan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThanhToan_pnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToan_pnThanhToanActionPerformed(evt);
            }
        });
        pnThanhToan.add(btnThanhToan_pnThanhToan);
        btnThanhToan_pnThanhToan.setBounds(858, 600, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDonDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPhongHat, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnKhachHangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnDonDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnPhongHat, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnKhachHangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonDatPhongActionPerformed
        setFalseAllButton();
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bDonDatPhong = true;
        btnDonDatPhong.setBackground(NVColor.btn_When_Clicked);
        pnDonDatPhong.setVisible(true);
        
    }//GEN-LAST:event_btnDonDatPhongActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        setFalseAllButton();
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bDichVu = true;            
        btnDichVu.setBackground(NVColor.btn_When_Clicked);
        pnDichVu.setVisible(true);
        
    }//GEN-LAST:event_btnDichVuActionPerformed

    private void btnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienActionPerformed
        setFalseAllButton();        
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bKhachHangThanhVien = true;
        btnKhachHangThanhVien.setBackground(NVColor.btn_When_Clicked);
        pnKhachHangThanhVien.setVisible(true);
                
    }//GEN-LAST:event_btnKhachHangThanhVienActionPerformed

    private void btnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongHatActionPerformed
        setFalseAllButton();        
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bPhongHat = true;
        btnPhongHat.setBackground(NVColor.btn_When_Clicked);
        pnPhongHat.setVisible(true);
        
    }//GEN-LAST:event_btnPhongHatActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        setFalseAllButton();
        setAllPanelDisappear();        
        setColorAllButton(NVColor.btn_Default);
        bThanhToan = true;
        btnThanhToan.setBackground(NVColor.btn_When_Clicked);
        pnThanhToan.setVisible(true);
        
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        
        Frame_DangNhap fDangNhap = new Frame_DangNhap();
        this.setVisible(false);
        fDangNhap.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThanhToan_pnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToan_pnThanhToanActionPerformed
        
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
        
    }//GEN-LAST:event_btnThanhToan_pnThanhToanActionPerformed

    private void btnTim_pnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim_pnThanhToanActionPerformed
        
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
        
    }//GEN-LAST:event_btnTim_pnThanhToanActionPerformed

    private void btnChinhSua_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnPhongHatActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnChinhSua_pnPhongHatActionPerformed

    private void btnXoaPhong_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhong_pnPhongHatActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnXoaPhong_pnPhongHatActionPerformed

    private void btnTaoMoi_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnPhongHatActionPerformed
        Dialog_ThemPhongHat dThemPhongHat = new Dialog_ThemPhongHat(this, rootPaneCheckingEnabled);
        dThemPhongHat.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnPhongHatActionPerformed

    private void btnChinhSua_pnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnDonDatPhongActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnChinhSua_pnDonDatPhongActionPerformed

    private void btnXoaDon_pnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDon_pnDonDatPhongActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnXoaDon_pnDonDatPhongActionPerformed

    private void btnTaoMoi_pnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDonDatPhongActionPerformed
        Dialog_ThemDonDatPhong dThemDonDatPhong = new Dialog_ThemDonDatPhong(this, rootPaneCheckingEnabled);
        dThemDonDatPhong.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDonDatPhongActionPerformed

    private void btnChinhSua_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnDichVuActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnChinhSua_pnDichVuActionPerformed

    private void btnXoa_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnDichVuActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnXoa_pnDichVuActionPerformed

    private void btnTaoMoi_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDichVuActionPerformed
        Dialog_ThemDichVu dThemDichVu = new Dialog_ThemDichVu(this, rootPaneCheckingEnabled);
        dThemDichVu.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDichVuActionPerformed

    private void btnTaoMoi_pnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnKhachHangThanhVienActionPerformed
        Dialog_ThemKhachHangThanhVien dThemThanhVienKhachHang = new Dialog_ThemKhachHangThanhVien(this, rootPaneCheckingEnabled);
        dThemThanhVienKhachHang.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnKhachHangThanhVienActionPerformed

    private void btnChinhSua_pnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnKhachHangThanhVienActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnChinhSua_pnKhachHangThanhVienActionPerformed

    private void btnXoa_pnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnKhachHangThanhVienActionPerformed
        JOptionPane.showMessageDialog(rootPane, MyStrings.No_Features);
    }//GEN-LAST:event_btnXoa_pnKhachHangThanhVienActionPerformed

    private void btnThemLoaiDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiDichVuActionPerformed
        Dialog_ThemLoaiDichVu dThemLoaiDichVu = new Dialog_ThemLoaiDichVu(this, rootPaneCheckingEnabled);
        dThemLoaiDichVu.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiDichVuActionPerformed

    private void btnThemLoaiPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiPhongHatActionPerformed
        Dialog_ThemLoaiPhongHat dThemLoaiPhongHat = new Dialog_ThemLoaiPhongHat(this, rootPaneCheckingEnabled);
        dThemLoaiPhongHat.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiPhongHatActionPerformed

    private void btnDonDatPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonDatPhongMouseEntered
        // TODO add your handling code here:
        if (bDonDatPhong == false)
            btnDonDatPhong.setBackground(NVColor.btn_When_Entered);
        btnDonDatPhong.setText(MyStrings.Booking_Bills);
    }//GEN-LAST:event_btnDonDatPhongMouseEntered

    private void btnDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseEntered
        // TODO add your handling code here:
        if (bDichVu == false)
            btnDichVu.setBackground(NVColor.btn_When_Entered);
        btnDichVu.setText(MyStrings.Services);
    }//GEN-LAST:event_btnDichVuMouseEntered

    private void btnKhachHangThanhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienMouseEntered
        // TODO add your handling code here:
        if (bKhachHangThanhVien == false)
            btnKhachHangThanhVien.setBackground(NVColor.btn_When_Entered);
        btnKhachHangThanhVien.setText(MyStrings.Customers);
    }//GEN-LAST:event_btnKhachHangThanhVienMouseEntered

    private void btnPhongHatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhongHatMouseEntered
        // TODO add your handling code here:
        if (bPhongHat == false)
            btnPhongHat.setBackground(NVColor.btn_When_Entered);
        btnPhongHat.setText(MyStrings.Singing_Rooms);
    }//GEN-LAST:event_btnPhongHatMouseEntered

    private void btnThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseEntered
        // TODO add your handling code here:
        if (bThanhToan == false)
            btnThanhToan.setBackground(NVColor.btn_When_Entered);
        btnThanhToan.setText(MyStrings.Charged);
    }//GEN-LAST:event_btnThanhToanMouseEntered

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        // TODO add your handling code here:
        btnThoat.setBackground(NVColor.btn_When_Entered);
        btnThoat.setText(MyStrings.Exit);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnDonDatPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonDatPhongMouseExited
        // TODO add your handling code here:
        if (bDonDatPhong == false)
            btnDonDatPhong.setBackground(NVColor.btn_Default);
        btnDonDatPhong.setText("");
    }//GEN-LAST:event_btnDonDatPhongMouseExited

    private void btnDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseExited
        // TODO add your handling code here:
        if (bDichVu == false)
            btnDichVu.setBackground(NVColor.btn_Default);
        btnDichVu.setText("");
    }//GEN-LAST:event_btnDichVuMouseExited

    private void btnKhachHangThanhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienMouseExited
        // TODO add your handling code here:
        if (bKhachHangThanhVien == false)
            btnKhachHangThanhVien.setBackground(NVColor.btn_Default);
        btnKhachHangThanhVien.setText("");
    }//GEN-LAST:event_btnKhachHangThanhVienMouseExited

    private void btnPhongHatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhongHatMouseExited
        // TODO add your handling code here:
        if (bPhongHat == false)
            btnPhongHat.setBackground(NVColor.btn_Default);
        btnPhongHat.setText("");
    }//GEN-LAST:event_btnPhongHatMouseExited

    private void btnThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseExited
        // TODO add your handling code here:
        if (bThanhToan == false)
            btnThanhToan.setBackground(NVColor.btn_Default);
        btnThanhToan.setText("");
    }//GEN-LAST:event_btnThanhToanMouseExited

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        // TODO add your handling code here:
        btnThoat.setBackground(NVColor.btn_Default);
        btnThoat.setText("");
    }//GEN-LAST:event_btnThoatMouseExited

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
            java.util.logging.Logger.getLogger(Frame_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua_pnDichVu;
    private javax.swing.JButton btnChinhSua_pnDonDatPhong;
    private javax.swing.JButton btnChinhSua_pnKhachHangThanhVien;
    private javax.swing.JButton btnChinhSua_pnPhongHat;
    private javax.swing.JButton btnDichVu;
    private javax.swing.JButton btnDonDatPhong;
    private javax.swing.JButton btnKhachHangThanhVien;
    private javax.swing.JButton btnPhongHat;
    private javax.swing.JButton btnTaoMoi_pnDichVu;
    private javax.swing.JButton btnTaoMoi_pnDonDatPhong;
    private javax.swing.JButton btnTaoMoi_pnKhachHangThanhVien;
    private javax.swing.JButton btnTaoMoi_pnPhongHat;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThanhToan_pnThanhToan;
    private javax.swing.JButton btnThemLoaiDichVu;
    private javax.swing.JButton btnThemLoaiPhongHat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim_pnThanhToan;
    private javax.swing.JButton btnXoaDon_pnDonDatPhong;
    private javax.swing.JButton btnXoaPhong_pnPhongHat;
    private javax.swing.JButton btnXoa_pnDichVu;
    private javax.swing.JButton btnXoa_pnKhachHangThanhVien;
    private javax.swing.JLabel jLB_Brand;
    private javax.swing.JLabel jLB_Name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnDichVu;
    private javax.swing.JPanel pnDonDatPhong;
    private javax.swing.JPanel pnKhachHangThanhVien;
    private javax.swing.JPanel pnPhongHat;
    private javax.swing.JPanel pnThanhToan;
    private javax.swing.JScrollPane spDichVu_pnDichVu;
    private javax.swing.JScrollPane spDonDatPhong_pnDonDatPhong;
    private javax.swing.JScrollPane spKhachHangThanhVien;
    private javax.swing.JScrollPane spPhongHat_pnPhongHat;
    private javax.swing.JScrollPane spThanhToan_pnThanhToan;
    private javax.swing.JTable tbDichVu_pnDichVu;
    private javax.swing.JTable tbDonDatPhong_pnDonDatPhong;
    private javax.swing.JTable tbKhachHangThanhVien;
    private javax.swing.JTable tbPhongHat_pnPhongHat;
    private javax.swing.JTable tbThanhToan_pnThanhToan;
    private javax.swing.JTextField tfTim_pnThanhToan;
    // End of variables declaration//GEN-END:variables
}
