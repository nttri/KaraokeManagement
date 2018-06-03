package view;

import Business.*;
import common.*;
import model.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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

    DefaultTableModel mTable_DonDatPhong, mTable_KhachHang, mTable_PhongHat, mTable_DichVu, mTable_ThanhToan;

    public Frame_NhanVien() {
        initComponents();

        mTable_DonDatPhong = (DefaultTableModel) tbDonDatPhong_pnDonDatPhong.getModel();
        mTable_PhongHat = (DefaultTableModel) tbPhongHat_pnPhongHat.getModel();
        mTable_DichVu = (DefaultTableModel) tbDichVu_pnDichVu.getModel();
        mTable_KhachHang = (DefaultTableModel) tbKhachHangThanhVien.getModel();
        mTable_ThanhToan = (DefaultTableModel) tbThanhToan_pnThanhToan.getModel();

        customInit();
    }

    public Frame_NhanVien(NhanVien nv) {
        this();
        NV = nv;
        jLB_Brand.setText(MyStrings.AppTitle);
        jLB_Name.setText("Chào " + NV.getHoten());
    }

    void customInit() {
        setFalseAllButton();
        bDonDatPhong = true;

        setColorAllButton(NVColor.btn_Default);
        btnDonDatPhong.setBackground(NVColor.btn_When_Clicked);

        setAllPanelDisappear();
        pnDonDatPhong.setVisible(true);

        tbDonDatPhong_pnDonDatPhong.setRowHeight(30);
        tbDichVu_pnDichVu.setRowHeight(30);
        tbKhachHangThanhVien.setRowHeight(30);
        tbPhongHat_pnPhongHat.setRowHeight(30);
        tbThanhToan_pnThanhToan.setRowHeight(30);

        BDonThanhToan bDonDatPhong = new BDonThanhToan();
        ArrayList<DonThanhToan> arrDon = null;

        BKhachHang bKhachHang = new BKhachHang();

        try {
            arrDon = bDonDatPhong.layTatCaDonThanhToan();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrDon.size(); i++) {
            if (arrDon.get(i).getTinhTrang().equals("Đang sử dụng")) {
                KhachHang kh = new KhachHang();
                try {
                    kh = bKhachHang.layKhachHangTheoMa(arrDon.get(i).getMaKhachHang());
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                mTable_DonDatPhong.addRow(new Object[]{
                    arrDon.get(i).getMaDon(),
                    arrDon.get(i).getMaPhong(),
                    arrDon.get(i).getMaKhachHang(),
                    kh.getHoTen(),
                    arrDon.get(i).getThoiGianBatDau()
                });
            }
        }
    }

    void clearAllDataTable(DefaultTableModel dtm) {
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    void setAllPanelDisappear() {
        pnThongTinCaNhan.setVisible(false);
        pnDonDatPhong.setVisible(false);
        pnDichVu.setVisible(false);
        pnKhachHangThanhVien.setVisible(false);
        pnPhongHat.setVisible(false);
        pnThanhToan.setVisible(false);
    }

    void setColorAllButton(Color color) {
        btnDonDatPhong.setBackground(color);
        btnDichVu.setBackground(color);
        btnKhachHangThanhVien.setBackground(color);
        btnPhongHat.setBackground(color);
        btnThanhToan.setBackground(color);
        btnThoat.setBackground(color);
    }

    void setFalseAllButton() {
        bDonDatPhong = false;
        bDichVu = false;
        bKhachHangThanhVien = false;
        bPhongHat = false;
        bThanhToan = false;
    }

    public void refreshPanelDonDatPhong() {
        btnDonDatPhong.doClick();
    }

    public void refreshPanelDichVu() {
        btnDichVu.doClick();
    }

    public void refreshPanelKhachHangThanhVien() {
        btnKhachHangThanhVien.doClick();
    }

    public void refreshPanelPhongHat() {
        btnPhongHat.doClick();
    }

    public void refreshPanelThanhToan() {
        btnThanhToan.doClick();
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
        pnThongTinCaNhan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        tfCMND = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        tfLuong = new javax.swing.JTextField();
        btnChinhSua_pnThongTinCaNhan = new javax.swing.JButton();
        btnLuu_pnThongTinCaNhan = new javax.swing.JButton();
        pnDonDatPhong = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spDonDatPhong_pnDonDatPhong = new javax.swing.JScrollPane();
        tbDonDatPhong_pnDonDatPhong = new javax.swing.JTable();
        btnTaoMoi_pnDonDatPhong = new javax.swing.JButton();
        btnXoaDon_pnDonDatPhong = new javax.swing.JButton();
        pnDichVu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spDichVu_pnDichVu = new javax.swing.JScrollPane();
        tbDichVu_pnDichVu = new javax.swing.JTable();
        btnTaoMoi_pnDichVu = new javax.swing.JButton();
        btnXoa_pnDichVu = new javax.swing.JButton();
        btnThemLoaiDichVu = new javax.swing.JButton();
        pnKhachHangThanhVien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spKhachHangThanhVien = new javax.swing.JScrollPane();
        tbKhachHangThanhVien = new javax.swing.JTable();
        btnTaoMoi_pnKhachHangThanhVien = new javax.swing.JButton();
        pnPhongHat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        spPhongHat_pnPhongHat = new javax.swing.JScrollPane();
        tbPhongHat_pnPhongHat = new javax.swing.JTable();
        btnTaoMoi_pnPhongHat = new javax.swing.JButton();
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
        jLB_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLB_NameMouseClicked(evt);
            }
        });
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

        pnThongTinCaNhan.setBackground(new java.awt.Color(10, 125, 39));
        pnThongTinCaNhan.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1070, 680));
        pnThongTinCaNhan.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("THÔNG TIN CÁ NHÂN");
        pnThongTinCaNhan.add(jLabel8);
        jLabel8.setBounds(40, 13, 490, 54);

        lblMaNV.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(204, 204, 204));
        lblMaNV.setText("Mã nhân viên:");
        pnThongTinCaNhan.add(lblMaNV);
        lblMaNV.setBounds(750, 25, 300, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Họ tên nhân viên");
        pnThongTinCaNhan.add(jLabel1);
        jLabel1.setBounds(40, 140, 121, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Giới tính");
        pnThongTinCaNhan.add(jLabel9);
        jLabel9.setBounds(40, 200, 60, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ngày sinh");
        pnThongTinCaNhan.add(jLabel10);
        jLabel10.setBounds(40, 260, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Số CMND");
        pnThongTinCaNhan.add(jLabel11);
        jLabel11.setBounds(40, 320, 67, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Số điện thoại");
        pnThongTinCaNhan.add(jLabel12);
        jLabel12.setBounds(40, 380, 93, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Địa chỉ");
        pnThongTinCaNhan.add(jLabel13);
        jLabel13.setBounds(40, 440, 48, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Lương");
        pnThongTinCaNhan.add(jLabel14);
        jLabel14.setBounds(40, 500, 45, 20);

        tfHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnThongTinCaNhan.add(tfHoTen);
        tfHoTen.setBounds(200, 133, 310, 34);

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        pnThongTinCaNhan.add(cbbGioiTinh);
        cbbGioiTinh.setBounds(200, 192, 150, 34);

        tfNgaySinh.setDateFormatString("yyyy-MM-dd");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnThongTinCaNhan.add(tfNgaySinh);
        tfNgaySinh.setBounds(200, 252, 150, 34);

        tfCMND.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnThongTinCaNhan.add(tfCMND);
        tfCMND.setBounds(200, 312, 150, 34);

        tfSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnThongTinCaNhan.add(tfSDT);
        tfSDT.setBounds(200, 372, 150, 34);

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnThongTinCaNhan.add(tfDiaChi);
        tfDiaChi.setBounds(200, 432, 590, 34);

        tfLuong.setEditable(false);
        tfLuong.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tfLuong.setForeground(new java.awt.Color(0, 204, 0));
        pnThongTinCaNhan.add(tfLuong);
        tfLuong.setBounds(200, 492, 150, 34);

        btnChinhSua_pnThongTinCaNhan.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnThongTinCaNhan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnChinhSua_pnThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnThongTinCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnThongTinCaNhan.setText("Chỉnh sửa");
        btnChinhSua_pnThongTinCaNhan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnThongTinCaNhan.add(btnChinhSua_pnThongTinCaNhan);
        btnChinhSua_pnThongTinCaNhan.setBounds(185, 585, 180, 50);

        btnLuu_pnThongTinCaNhan.setBackground(new java.awt.Color(0, 153, 153));
        btnLuu_pnThongTinCaNhan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLuu_pnThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu_pnThongTinCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_save.png"))); // NOI18N
        btnLuu_pnThongTinCaNhan.setText("Lưu");
        btnLuu_pnThongTinCaNhan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnThongTinCaNhan.add(btnLuu_pnThongTinCaNhan);
        btnLuu_pnThongTinCaNhan.setBounds(735, 585, 180, 50);

        pnDonDatPhong.setBackground(new java.awt.Color(10, 125, 39));
        pnDonDatPhong.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnDonDatPhong.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ ĐƠN ĐẶT PHÒNG");
        pnDonDatPhong.add(jLabel2);
        jLabel2.setBounds(40, 13, 598, 54);

        tbDonDatPhong_pnDonDatPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDonDatPhong_pnDonDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn", "Mã phòng", "Mã người đặt", "Tên người đặt", "Giờ bắt đầu"
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
        tbDonDatPhong_pnDonDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDonDatPhong_pnDonDatPhongMouseClicked(evt);
            }
        });
        spDonDatPhong_pnDonDatPhong.setViewportView(tbDonDatPhong_pnDonDatPhong);
        if (tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumnCount() > 0) {
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(3).setPreferredWidth(300);
            tbDonDatPhong_pnDonDatPhong.getColumnModel().getColumn(4).setPreferredWidth(340);
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

        tbDichVu_pnDichVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDichVu_pnDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại dịch vụ", "Mã dịch vụ", "Tên dịch vụ", "Đơn giá"
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
        tbDichVu_pnDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVu_pnDichVuMouseClicked(evt);
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

        tbKhachHangThanhVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        tbKhachHangThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangThanhVienMouseClicked(evt);
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

        pnPhongHat.setBackground(new java.awt.Color(10, 125, 39));
        pnPhongHat.setMinimumSize(new java.awt.Dimension(1070, 680));
        pnPhongHat.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ PHÒNG HÁT");
        pnPhongHat.add(jLabel5);
        jLabel5.setBounds(40, 13, 480, 54);

        tbPhongHat_pnPhongHat.setBackground(new java.awt.Color(240, 240, 240));
        tbPhongHat_pnPhongHat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        tbPhongHat_pnPhongHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongHat_pnPhongHatMouseClicked(evt);
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

        tbThanhToan_pnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbThanhToan_pnThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn đặt phòng", "Mã phòng", "Thời gian đã dùng", "Người đặt", "Tổng cộng", "Tình trạng"
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
        spThanhToan_pnThanhToan.setViewportView(tbThanhToan_pnThanhToan);
        if (tbThanhToan_pnThanhToan.getColumnModel().getColumnCount() > 0) {
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(1).setPreferredWidth(60);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(3).setPreferredWidth(280);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(4).setPreferredWidth(140);
            tbThanhToan_pnThanhToan.getColumnModel().getColumn(5).setPreferredWidth(180);
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
                    .addComponent(pnThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnKhachHangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPhongHat, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnDonDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnKhachHangThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnPhongHat, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        clearAllDataTable(mTable_DonDatPhong);

        BDonThanhToan bDonDatPhong = new BDonThanhToan();
        ArrayList<DonThanhToan> arrDon = null;

        BKhachHang bKhachHang = new BKhachHang();

        try {
            arrDon = bDonDatPhong.layTatCaDonThanhToan();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrDon.size(); i++) {
            if (arrDon.get(i).getTinhTrang().equals("Đang sử dụng")) {
                KhachHang kh = new KhachHang();
                try {
                    kh = bKhachHang.layKhachHangTheoMa(arrDon.get(i).getMaKhachHang());
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                mTable_DonDatPhong.addRow(new Object[]{
                    arrDon.get(i).getMaDon(),
                    arrDon.get(i).getMaPhong(),
                    arrDon.get(i).getMaKhachHang(),
                    kh.getHoTen(),
                    arrDon.get(i).getThoiGianBatDau()
                });
            }
        }
    }//GEN-LAST:event_btnDonDatPhongActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        setFalseAllButton();
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bDichVu = true;
        btnDichVu.setBackground(NVColor.btn_When_Clicked);
        pnDichVu.setVisible(true);

        clearAllDataTable(mTable_DichVu);

        BDichVu bDichVu = new BDichVu();
        ArrayList<DichVu> arrDV = null;
        BLoaiDichVu bLoaiDichVu = new BLoaiDichVu();

        try {
            arrDV = bDichVu.layThongTinTatCaDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrDV.size(); i++) {
            LoaiDichVu ldv = new LoaiDichVu();
            try {
                ldv = bLoaiDichVu.layThongTinLoaiDichVuTheoMa(arrDV.get(i).getMaLoaiDichVu());
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            mTable_DichVu.addRow(new Object[]{
                ldv.getTenLoaiDichVu(),
                arrDV.get(i).getMaDichVu(),
                arrDV.get(i).getTenDichVu(),
                arrDV.get(i).getDonGia()
            });
        }
    }//GEN-LAST:event_btnDichVuActionPerformed

    private void btnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienActionPerformed
        setFalseAllButton();
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bKhachHangThanhVien = true;
        btnKhachHangThanhVien.setBackground(NVColor.btn_When_Clicked);
        pnKhachHangThanhVien.setVisible(true);

        clearAllDataTable(mTable_KhachHang);

        BKhachHang bKhachHang = new BKhachHang();
        ArrayList<KhachHang> arrKH = null;

        try {
            arrKH = bKhachHang.layTatCaKhachHang();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrKH.size(); i++) {
            mTable_KhachHang.addRow(new Object[]{
                arrKH.get(i).getMaKH(),
                arrKH.get(i).getHoTen(),
                arrKH.get(i).getCmnd(),
                arrKH.get(i).getDiaChi()
            });
        }
    }//GEN-LAST:event_btnKhachHangThanhVienActionPerformed

    private void btnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongHatActionPerformed
        setFalseAllButton();
        setColorAllButton(NVColor.btn_Default);
        setAllPanelDisappear();
        bPhongHat = true;
        btnPhongHat.setBackground(NVColor.btn_When_Clicked);
        pnPhongHat.setVisible(true);

        clearAllDataTable(mTable_PhongHat);

        BPhongHat bPhongHat = new BPhongHat();
        ArrayList<PhongHat> arrPH = null;

        BLoaiPhongHat bLoaiPhongHat = new BLoaiPhongHat();

        try {
            arrPH = bPhongHat.layThongTinTatCaPhongHat();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrPH.size(); i++) {
            LoaiPhongHat lph = new LoaiPhongHat();
            try {
                lph = bLoaiPhongHat.layThongTinLoaiPhongHatTheoMa(arrPH.get(i).getMaLoaiPhong());
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            mTable_PhongHat.addRow(new Object[]{
                arrPH.get(i).getMaPhong(),
                lph.getTenLoai(),
                arrPH.get(i).getTinhTrang(),
                lph.getSucChua(),
                lph.getGiaPhong()
            });
        }
    }//GEN-LAST:event_btnPhongHatActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        setFalseAllButton();
        setAllPanelDisappear();
        setColorAllButton(NVColor.btn_Default);
        bThanhToan = true;
        btnThanhToan.setBackground(NVColor.btn_When_Clicked);
        pnThanhToan.setVisible(true);

        clearAllDataTable(mTable_ThanhToan);

        BDonThanhToan bDonDatPhong = new BDonThanhToan();
        ArrayList<DonThanhToan> arrDon = null;

        BKhachHang bKhachHang = new BKhachHang();

        try {
            arrDon = bDonDatPhong.layTatCaDonThanhToan();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrDon.size(); i++) {
            KhachHang kh = new KhachHang();
            LoaiPhongHat loaiPH = new LoaiPhongHat();
            BLoaiPhongHat bLoaiPH = new BLoaiPhongHat();
            PhongHat phongHat = new PhongHat();
            BPhongHat bPhongHat = new BPhongHat();

            try {
                kh = bKhachHang.layKhachHangTheoMa(arrDon.get(i).getMaKhachHang());
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            int maDon = arrDon.get(i).getMaDon();
            int maPhong = arrDon.get(i).getMaPhong();
            String tenKH = kh.getHoTen();
            String tinhTrang = arrDon.get(i).getTinhTrang();
            long soGioSuDung = 0;
            long tienPhong = 0;
            long tienDichVu = 0;
            long tongTien = 0;

            try {
                phongHat = bPhongHat.layThongTinPhongHatTheoMa(maPhong);
                loaiPH = bLoaiPH.layThongTinLoaiPhongHatTheoMa(phongHat.getMaLoaiPhong());

            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (arrDon.get(i).getTinhTrang().equals("Đã thanh toán")) {
                Date bd = arrDon.get(i).getThoiGianBatDau();
                Date kt = arrDon.get(i).getThoiGianKetThuc();
                long diff = kt.getTime() - bd.getTime();
                
                soGioSuDung = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
                tienPhong = loaiPH.getGiaPhong() * soGioSuDung;
                tongTien = tienPhong + tienDichVu;
                
                mTable_ThanhToan.addRow(new Object[]{
                    maDon,
                    maPhong,
                    soGioSuDung + " giờ",
                    tenKH,
                    tongTien,
                    tinhTrang
                });
            } else if (arrDon.get(i).getTinhTrang().equals("Đang sử dụng")) {
                Date bd = arrDon.get(i).getThoiGianBatDau();
                Date kt = new Date();
                long diff = kt.getTime() - bd.getTime();

                if (diff <= 0) { // thời gian hiện tại < thời gian đặt phòng
                    mTable_ThanhToan.addRow(new Object[]{
                        maDon,
                        maPhong,
                        "0 giờ",
                        tenKH,
                        "0",
                        tinhTrang
                    });
                } else {
                    soGioSuDung = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
                    tienPhong = loaiPH.getGiaPhong() * soGioSuDung;
                    tongTien = tienPhong + tienDichVu;
                    
                    mTable_ThanhToan.addRow(new Object[]{
                        maDon,
                        maPhong,
                        soGioSuDung + " giờ",
                        tenKH,
                        tongTien,
                        tinhTrang
                    });
                }
            } else {
                tienPhong = loaiPH.getGiaPhong();
                tongTien = tienPhong + tienDichVu;
                
                mTable_ThanhToan.addRow(new Object[]{
                    maDon,
                    maPhong,
                    "1 giờ",
                    tenKH,
                    tongTien,
                    tinhTrang
                });
            }

        }
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

    private void btnTaoMoi_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnPhongHatActionPerformed
        Dialog_ThemPhongHat dThemPhongHat = new Dialog_ThemPhongHat(this, rootPaneCheckingEnabled);
        dThemPhongHat.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnPhongHatActionPerformed

    private void btnXoaDon_pnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDon_pnDonDatPhongActionPerformed
        int r = tbDonDatPhong_pnDonDatPhong.getSelectedRow();
        if (r != -1) {
            int maso = Integer.parseInt(mTable_DonDatPhong.getValueAt(r, 0).toString());
            BDonThanhToan bDonDatPhong = new BDonThanhToan();
            Boolean res = false;
            try {
                res = bDonDatPhong.xoaDonDatPhong(maso);
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (res) {
                mTable_DonDatPhong.removeRow(r);
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Succeeded);
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Failed);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
        }
    }//GEN-LAST:event_btnXoaDon_pnDonDatPhongActionPerformed

    private void btnTaoMoi_pnDonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDonDatPhongActionPerformed
        Dialog_ThemDonDatPhong dThemDonDatPhong = new Dialog_ThemDonDatPhong(this, rootPaneCheckingEnabled);
        dThemDonDatPhong.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDonDatPhongActionPerformed

    private void btnXoa_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnDichVuActionPerformed
        int r = tbDichVu_pnDichVu.getSelectedRow();
        if (r != -1) {
            int maso = Integer.parseInt(mTable_DichVu.getValueAt(r, 1).toString());
            BDichVu bDichVu = new BDichVu();
            Boolean res = false;
            try {
                res = bDichVu.xoaDichVu(maso);
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (res) {
                mTable_DichVu.removeRow(r);
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Succeeded);
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Failed);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
        }
    }//GEN-LAST:event_btnXoa_pnDichVuActionPerformed

    private void btnTaoMoi_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDichVuActionPerformed
        Dialog_ThemDichVu dThemDichVu = new Dialog_ThemDichVu(this, rootPaneCheckingEnabled);
        dThemDichVu.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDichVuActionPerformed

    private void btnTaoMoi_pnKhachHangThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnKhachHangThanhVienActionPerformed
        Dialog_ThemKhachHangThanhVien dThemThanhVienKhachHang = new Dialog_ThemKhachHangThanhVien(this, rootPaneCheckingEnabled);
        dThemThanhVienKhachHang.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnKhachHangThanhVienActionPerformed

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
        if (bDonDatPhong == false) {
            btnDonDatPhong.setBackground(NVColor.btn_When_Entered);
        }
        btnDonDatPhong.setText(MyStrings.Booking_Bills);
    }//GEN-LAST:event_btnDonDatPhongMouseEntered

    private void btnDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseEntered
        // TODO add your handling code here:
        if (bDichVu == false) {
            btnDichVu.setBackground(NVColor.btn_When_Entered);
        }
        btnDichVu.setText(MyStrings.Services);
    }//GEN-LAST:event_btnDichVuMouseEntered

    private void btnKhachHangThanhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienMouseEntered
        // TODO add your handling code here:
        if (bKhachHangThanhVien == false) {
            btnKhachHangThanhVien.setBackground(NVColor.btn_When_Entered);
        }
        btnKhachHangThanhVien.setText(MyStrings.Customers);
    }//GEN-LAST:event_btnKhachHangThanhVienMouseEntered

    private void btnPhongHatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhongHatMouseEntered
        // TODO add your handling code here:
        if (bPhongHat == false) {
            btnPhongHat.setBackground(NVColor.btn_When_Entered);
        }
        btnPhongHat.setText(MyStrings.Singing_Rooms);
    }//GEN-LAST:event_btnPhongHatMouseEntered

    private void btnThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseEntered
        // TODO add your handling code here:
        if (bThanhToan == false) {
            btnThanhToan.setBackground(NVColor.btn_When_Entered);
        }
        btnThanhToan.setText(MyStrings.Charged);
    }//GEN-LAST:event_btnThanhToanMouseEntered

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        // TODO add your handling code here:
        btnThoat.setBackground(NVColor.btn_When_Entered);
        btnThoat.setText(MyStrings.Exit);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnDonDatPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonDatPhongMouseExited
        // TODO add your handling code here:
        if (bDonDatPhong == false) {
            btnDonDatPhong.setBackground(NVColor.btn_Default);
        }
        btnDonDatPhong.setText("");
    }//GEN-LAST:event_btnDonDatPhongMouseExited

    private void btnDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseExited
        // TODO add your handling code here:
        if (bDichVu == false) {
            btnDichVu.setBackground(NVColor.btn_Default);
        }
        btnDichVu.setText("");
    }//GEN-LAST:event_btnDichVuMouseExited

    private void btnKhachHangThanhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangThanhVienMouseExited
        // TODO add your handling code here:
        if (bKhachHangThanhVien == false) {
            btnKhachHangThanhVien.setBackground(NVColor.btn_Default);
        }
        btnKhachHangThanhVien.setText("");
    }//GEN-LAST:event_btnKhachHangThanhVienMouseExited

    private void btnPhongHatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhongHatMouseExited
        // TODO add your handling code here:
        if (bPhongHat == false) {
            btnPhongHat.setBackground(NVColor.btn_Default);
        }
        btnPhongHat.setText("");
    }//GEN-LAST:event_btnPhongHatMouseExited

    private void btnThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseExited
        // TODO add your handling code here:
        if (bThanhToan == false) {
            btnThanhToan.setBackground(NVColor.btn_Default);
        }
        btnThanhToan.setText("");
    }//GEN-LAST:event_btnThanhToanMouseExited

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        // TODO add your handling code here:
        btnThoat.setBackground(NVColor.btn_Default);
        btnThoat.setText("");
    }//GEN-LAST:event_btnThoatMouseExited

    private void tbDonDatPhong_pnDonDatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDonDatPhong_pnDonDatPhongMouseClicked
        if (evt.getClickCount() == 2) {
            int r = tbDonDatPhong_pnDonDatPhong.getSelectedRow();
            if (r != -1) {
                BDonThanhToan bDonDatPhong = new BDonThanhToan();
                DonThanhToan donDatPhong = new DonThanhToan();
                int maso = Integer.parseInt(mTable_DonDatPhong.getValueAt(r, 0).toString());
                try {
                    donDatPhong = bDonDatPhong.layDonThanhToanTheoMaDon(maso);
                    Dialog_SuaDonDatPhong dSuaDonDatPhong = new Dialog_SuaDonDatPhong(this, rootPaneCheckingEnabled, donDatPhong);
                    dSuaDonDatPhong.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
            }
        }
    }//GEN-LAST:event_tbDonDatPhong_pnDonDatPhongMouseClicked

    private void tbDichVu_pnDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVu_pnDichVuMouseClicked
        if (evt.getClickCount() == 2) {
            int r = tbDichVu_pnDichVu.getSelectedRow();
            if (r != -1) {
                BDichVu bDichVu = new BDichVu();
                DichVu dv = new DichVu();
                int maso = Integer.parseInt(mTable_DichVu.getValueAt(r, 1).toString());
                try {
                    dv = bDichVu.layThongTinDichVuTheoMa(maso);
                    Dialog_SuaDichVu dSuaDichVu = new Dialog_SuaDichVu(this, rootPaneCheckingEnabled, dv);
                    dSuaDichVu.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
            }
        }
    }//GEN-LAST:event_tbDichVu_pnDichVuMouseClicked

    private void tbKhachHangThanhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangThanhVienMouseClicked
        if (evt.getClickCount() == 2) {
            int r = tbKhachHangThanhVien.getSelectedRow();
            if (r != -1) {
                BKhachHang bKhachHang = new BKhachHang();
                KhachHang kh = new KhachHang();
                int maso = Integer.parseInt(mTable_KhachHang.getValueAt(r, 0).toString());
                try {
                    kh = bKhachHang.layKhachHangTheoMa(maso);
                    Dialog_SuaKhachHangThanhVien dSuaKHThanhVien = new Dialog_SuaKhachHangThanhVien(this, rootPaneCheckingEnabled, kh);
                    dSuaKHThanhVien.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
            }
        }
    }//GEN-LAST:event_tbKhachHangThanhVienMouseClicked

    private void tbPhongHat_pnPhongHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongHat_pnPhongHatMouseClicked
        if (evt.getClickCount() == 2) {
            int r = tbPhongHat_pnPhongHat.getSelectedRow();
            if (r != -1) {
                BPhongHat bPhongHat = new BPhongHat();
                PhongHat phong = new PhongHat();
                int maso = Integer.parseInt(mTable_PhongHat.getValueAt(r, 0).toString());
                try {
                    phong = bPhongHat.layThongTinPhongHatTheoMa(maso);
                    Dialog_SuaPhongHat dSuaPhongHat = new Dialog_SuaPhongHat(this, rootPaneCheckingEnabled, phong);
                    dSuaPhongHat.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Select_Row);
            }
        }
    }//GEN-LAST:event_tbPhongHat_pnPhongHatMouseClicked

    private void jLB_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLB_NameMouseClicked
        setColorAllButton(NVColor.btn_Default);
        setFalseAllButton();
        setAllPanelDisappear();
        
        pnThongTinCaNhan.setVisible(true);
        
        ((JTextField) tfNgaySinh.getDateEditor()).setEditable(false);
        btnChinhSua_pnThongTinCaNhan.setEnabled(true);
        btnLuu_pnThongTinCaNhan.setEnabled(false);
        tfHoTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfCMND.setEditable(false);
        tfSDT.setEditable(false);
        tfDiaChi.setEditable(false);
        
        int maNV = NV.getMaNhanVien();
        Date ngaySinh = NV.getNgaySinh();
        tfHoTen.setText(NV.getHoten());
        cbbGioiTinh.setSelectedItem(NV.getGioiTinh());
        ((JTextField) tfNgaySinh.getDateEditor().getUiComponent()).setText(ngaySinh.toString());
        tfCMND.setText(NV.getCmnd());
        tfSDT.setText(NV.getSdt());
        tfDiaChi.setText(NV.getDiaChi());
        tfLuong.setText(Integer.toString(NV.getLuong()));

    }//GEN-LAST:event_jLB_NameMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua_pnThongTinCaNhan;
    private javax.swing.JButton btnDichVu;
    private javax.swing.JButton btnDonDatPhong;
    private javax.swing.JButton btnKhachHangThanhVien;
    private javax.swing.JButton btnLuu_pnThongTinCaNhan;
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
    private javax.swing.JButton btnXoa_pnDichVu;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLB_Brand;
    private javax.swing.JLabel jLB_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JPanel pnDichVu;
    private javax.swing.JPanel pnDonDatPhong;
    private javax.swing.JPanel pnKhachHangThanhVien;
    private javax.swing.JPanel pnPhongHat;
    private javax.swing.JPanel pnThanhToan;
    private javax.swing.JPanel pnThongTinCaNhan;
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
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfLuong;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTim_pnThanhToan;
    // End of variables declaration//GEN-END:variables
}
