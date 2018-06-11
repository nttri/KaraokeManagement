/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.LoaiDichVu;
import DTO.PhongHat;
import DTO.DichVu;
import DTO.NhanVien;
import DTO.LoaiPhongHat;
import Business.*;
import common.*;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Tu
 */
public class Frame_QuanLy extends javax.swing.JFrame {

    static NhanVien QL;
    
    boolean bQuanLyNhanVien = false;
    boolean bQuanLyPhongHat = false;
    boolean bQuanLyDichVu = false;
    boolean bQuanLyDoanhThu = false;
    
    DefaultTableModel mTable_NhanVien, mTable_PhongHat, mTable_DichVu, mTable_DoanhThu;
    
    /**
     * Creates new form Frame_QuanLy
     */
    public Frame_QuanLy() {
        initComponents();       
        mTable_NhanVien = (DefaultTableModel) tbDanhSachNhanVien_pnQuanLyNhanVien.getModel();
        mTable_PhongHat = (DefaultTableModel) tbPhongHat_pnQuanLyPhongHat.getModel();
        mTable_DichVu = (DefaultTableModel) tbDichVu_pnQuanLyDichVu.getModel();
        //...
    }

    public Frame_QuanLy(NhanVien ql){
        this();
        QL = ql;
        jLB_Brand.setText(MyStrings.AppTitle);
        jLB_Name.setText("Chào " + QL.getHoten());
        customInit();
    }
    void customInit(){
        setFalseAllButton();
        bQuanLyNhanVien = true;
        
        setColorAllButton(QLColor.btn_Default);
        btn_QuanLyNhanVien.setBackground(QLColor.btn_When_Clicked);
        btn_QuanLyNhanVien.setText(MyStrings.Management_Staffs);
        
        setAllPanelDisappear();
        jpn_QuanLyNhanVien.setVisible(true);
        
        //////////////////////////////////////
        // Để tạm ở đây để hiển thị, sẽ được thay thế bằng một đối tượng khác
        BNhanVien bNhanVien = new BNhanVien();
        ArrayList<NhanVien> arrNV = null;
        
        try {
            arrNV = bNhanVien.layThongTinTatCaNhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        Predicate<NhanVien> qlPredicate = p->p.getMaNhanVien() == QL.getMaNhanVien();
        arrNV.removeIf(qlPredicate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for(int i = 0; i < arrNV.size(); i++){
            mTable_NhanVien.addRow(new Object[]{
                arrNV.get(i).getMaNhanVien(), arrNV.get(i).getHoten(), arrNV.get(i).getGioiTinh(),
                sdf.format(arrNV.get(i).getNgaySinh()), arrNV.get(i).getDiaChi(), arrNV.get(i).getCmnd(),
                arrNV.get(i).getSdt(), arrNV.get(i).getLuong()
            });           
        }
        ////////////////////////////////////
    }
    
    void setAllPanelDisappear(){
        jpn_ThongTinCaNhan.setVisible(false);
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
        
        btnXoa_pnQuanLyNhanVien.setEnabled(false);
        btnXoaPhong_pnPhongHat.setEnabled(false);
        btnXoa_pnDichVu.setEnabled(false);
    }
    
    void clearAllDataTable(DefaultTableModel dtm){
        for(int i = dtm.getRowCount() - 1; i >=0; i--){
            dtm.removeRow(i);
        }
    }
    
    void updateQuanLyNhanVien(){
        clearAllDataTable(mTable_NhanVien);
        btnXoa_pnQuanLyNhanVien.setEnabled(false);
        
        BNhanVien bNhanVien = new BNhanVien();
        ArrayList<NhanVien> arrNV = null;
        
        try {
            arrNV = bNhanVien.layThongTinTatCaNhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        Predicate<NhanVien> qlPredicate = p->p.getMaNhanVien() == QL.getMaNhanVien();
        arrNV.removeIf(qlPredicate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for(int i = 0; i < arrNV.size(); i++){
            mTable_NhanVien.addRow(new Object[]{
                arrNV.get(i).getMaNhanVien(), arrNV.get(i).getHoten(), arrNV.get(i).getGioiTinh(),
                sdf.format(arrNV.get(i).getNgaySinh()), arrNV.get(i).getDiaChi(), arrNV.get(i).getCmnd(),
                arrNV.get(i).getSdt(), arrNV.get(i).getLuong()           
            });            
        }
    }
    
    void updateQuanLyPhongHat(){
        clearAllDataTable(mTable_PhongHat);
        btnXoaPhong_pnPhongHat.setEnabled(false);
        
        BPhongHat bPhongHat = new BPhongHat();
        ArrayList<PhongHat> arrPH = null;       
        try {
            arrPH = bPhongHat.layThongTinTatCaPhongHat();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BLoaiPhongHat bLoaiPH = new BLoaiPhongHat();
        ArrayList<LoaiPhongHat> arrLPH = new ArrayList();
        
        for(int i = 0; i < arrPH.size(); i++){
            try {
                arrLPH.add(bLoaiPH.layThongTinLoaiPhongHatTheoMa(arrPH.get(i).getMaLoaiPhong()));
            } catch (SQLException ex) {
                Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
        for(int i = 0; i < arrPH.size(); i++){
            mTable_PhongHat.addRow(new Object[]{
                arrPH.get(i).getMaPhong(), arrLPH.get(i).getTenLoai(), arrPH.get(i).getTinhTrang(), 
                arrLPH.get(i).getSucChua(), arrLPH.get(i).getGiaPhong(), arrLPH.get(i).getMoTa()                
            });
        }
    }
    
    void updateQuanLyDichVu(){
        clearAllDataTable(mTable_DichVu);
        btnXoa_pnDichVu.setEnabled(false);
        
        BDichVu bDichVu = new BDichVu();
        ArrayList<DichVu> arrDV = null;        
        try {
            arrDV = bDichVu.layThongTinTatCaDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BLoaiDichVu bLoaiDV = new BLoaiDichVu();
        ArrayList<LoaiDichVu> arrLDV = new ArrayList();
        for(int i = 0; i < arrDV.size(); i++){
            try {
                arrLDV.add(bLoaiDV.layThongTinLoaiDichVuTheoMa(arrDV.get(i).getMaLoaiDichVu()));
            } catch (SQLException ex) {
                Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i = 0; i < arrDV.size(); i++){
            mTable_DichVu.addRow(new Object[]{
                arrDV.get(i).getMaDichVu(), arrDV.get(i).getTenDichVu(),
                arrDV.get(i).getDonGia(), arrLDV.get(i).getTenLoaiDichVu()
            });
        }
    }
    
    void updateQuanLyDoanhThu(){
        
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
        jLB_Brand = new javax.swing.JLabel();
        jLB_Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_QuanLyNhanVien = new javax.swing.JButton();
        btn_QuanLyPhongHat = new javax.swing.JButton();
        btn_QuanLyDichVu = new javax.swing.JButton();
        btn_QuanLyDoanhThu = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jpn_ThongTinCaNhan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        tfCMND = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        btnChinhSua_pnThongTinCaNhan = new javax.swing.JButton();
        btnLuu_pnThongTinCaNhan = new javax.swing.JButton();
        lblAvatar = new javax.swing.JLabel();
        jpn_QuanLyNhanVien = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSachNhanVien_pnQuanLyNhanVien = new javax.swing.JTable();
        btnTaoMoi_pnQuanLyNhanVien = new javax.swing.JButton();
        btnXoa_pnQuanLyNhanVien = new javax.swing.JButton();
        jpn_QuanLyPhongHat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnTaoMoi_pnPhongHat = new javax.swing.JButton();
        spPhongHat_pnPhongHat = new javax.swing.JScrollPane();
        tbPhongHat_pnQuanLyPhongHat = new javax.swing.JTable();
        btnXoaPhong_pnPhongHat = new javax.swing.JButton();
        btnThemLoaiPhongHat = new javax.swing.JButton();
        jpn_QuanLyDichVu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spDichVu_pnDichVu = new javax.swing.JScrollPane();
        tbDichVu_pnQuanLyDichVu = new javax.swing.JTable();
        btnTaoMoi_pnDichVu = new javax.swing.JButton();
        btnXoa_pnDichVu = new javax.swing.JButton();
        btnThemLoaiDichVu = new javax.swing.JButton();
        jpn_QuanLyDoanhThu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 708));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 708));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setMinimumSize(new java.awt.Dimension(210, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 100));
        jPanel1.setLayout(null);

        jLB_Brand.setBackground(new java.awt.Color(0, 0, 0));
        jLB_Brand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLB_Brand.setForeground(new java.awt.Color(255, 255, 255));
        jLB_Brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLB_Brand.setText("Tên APP");
        jLB_Brand.setMaximumSize(new java.awt.Dimension(210, 70));
        jLB_Brand.setMinimumSize(new java.awt.Dimension(210, 70));
        jLB_Brand.setPreferredSize(new java.awt.Dimension(210, 70));
        jPanel1.add(jLB_Brand);
        jLB_Brand.setBounds(0, 0, 210, 70);
        jLB_Brand.getAccessibleContext().setAccessibleName("Tên app");

        jLB_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLB_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLB_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLB_Name.setText("Chào Tú");
        jLB_Name.setPreferredSize(new java.awt.Dimension(210, 30));
        jLB_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLB_NameMouseClicked(evt);
            }
        });
        jPanel1.add(jLB_Name);
        jLB_Name.setBounds(0, 70, 210, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 210, 100);

        jPanel2.setBackground(new java.awt.Color(32, 78, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 580));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 580));
        jPanel2.setLayout(null);

        btn_QuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_QLNV.png"))); // NOI18N
        btn_QuanLyNhanVien.setBorder(null);
        btn_QuanLyNhanVien.setFocusable(false);
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
        btn_QuanLyPhongHat.setBorder(null);
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
        btn_QuanLyDichVu.setBorder(null);
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
        btn_QuanLyDoanhThu.setBorder(null);
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
        btn_Thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jpn_ThongTinCaNhan.setBackground(new java.awt.Color(0, 68, 80));
        jpn_ThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1070, 680));
        jpn_ThongTinCaNhan.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("THÔNG TIN CÁ NHÂN");
        jpn_ThongTinCaNhan.add(jLabel8);
        jLabel8.setBounds(40, 13, 490, 54);

        lblMaNV.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(204, 204, 204));
        lblMaNV.setText("Mã nhân viên:");
        jpn_ThongTinCaNhan.add(lblMaNV);
        lblMaNV.setBounds(760, 330, 270, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Họ tên");
        jpn_ThongTinCaNhan.add(jLabel1);
        jLabel1.setBounds(40, 140, 47, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Giới tính");
        jpn_ThongTinCaNhan.add(jLabel9);
        jLabel9.setBounds(40, 200, 60, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ngày sinh");
        jpn_ThongTinCaNhan.add(jLabel10);
        jLabel10.setBounds(40, 260, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Số CMND");
        jpn_ThongTinCaNhan.add(jLabel11);
        jLabel11.setBounds(40, 320, 67, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Số điện thoại");
        jpn_ThongTinCaNhan.add(jLabel12);
        jLabel12.setBounds(40, 380, 93, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Địa chỉ");
        jpn_ThongTinCaNhan.add(jLabel13);
        jLabel13.setBounds(40, 440, 48, 20);

        tfHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpn_ThongTinCaNhan.add(tfHoTen);
        tfHoTen.setBounds(200, 133, 310, 34);

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jpn_ThongTinCaNhan.add(cbbGioiTinh);
        cbbGioiTinh.setBounds(200, 192, 150, 34);

        tfNgaySinh.setDateFormatString("dd-MM-yyyy");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpn_ThongTinCaNhan.add(tfNgaySinh);
        tfNgaySinh.setBounds(200, 252, 150, 34);

        tfCMND.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });
        jpn_ThongTinCaNhan.add(tfCMND);
        tfCMND.setBounds(200, 312, 150, 34);

        tfSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSDTKeyTyped(evt);
            }
        });
        jpn_ThongTinCaNhan.add(tfSDT);
        tfSDT.setBounds(200, 372, 150, 34);

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpn_ThongTinCaNhan.add(tfDiaChi);
        tfDiaChi.setBounds(200, 432, 590, 34);

        btnChinhSua_pnThongTinCaNhan.setBackground(new java.awt.Color(102, 102, 102));
        btnChinhSua_pnThongTinCaNhan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnChinhSua_pnThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua_pnThongTinCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_edit.png"))); // NOI18N
        btnChinhSua_pnThongTinCaNhan.setText("Chỉnh sửa");
        btnChinhSua_pnThongTinCaNhan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChinhSua_pnThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_pnThongTinCaNhanActionPerformed(evt);
            }
        });
        jpn_ThongTinCaNhan.add(btnChinhSua_pnThongTinCaNhan);
        btnChinhSua_pnThongTinCaNhan.setBounds(185, 585, 180, 50);

        btnLuu_pnThongTinCaNhan.setBackground(new java.awt.Color(0, 153, 153));
        btnLuu_pnThongTinCaNhan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLuu_pnThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu_pnThongTinCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_save.png"))); // NOI18N
        btnLuu_pnThongTinCaNhan.setText("Lưu");
        btnLuu_pnThongTinCaNhan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLuu_pnThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu_pnThongTinCaNhanActionPerformed(evt);
            }
        });
        jpn_ThongTinCaNhan.add(btnLuu_pnThongTinCaNhan);
        btnLuu_pnThongTinCaNhan.setBounds(735, 585, 180, 50);

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ava.png"))); // NOI18N
        jpn_ThongTinCaNhan.add(lblAvatar);
        lblAvatar.setBounds(750, 60, 256, 256);

        getContentPane().add(jpn_ThongTinCaNhan);
        jpn_ThongTinCaNhan.setBounds(210, 0, 1070, 680);

        jpn_QuanLyNhanVien.setBackground(new java.awt.Color(0, 68, 80));
        jpn_QuanLyNhanVien.setMinimumSize(new java.awt.Dimension(1070, 680));
        jpn_QuanLyNhanVien.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        jpn_QuanLyNhanVien.add(jLabel2);
        jLabel2.setBounds(40, 30, 535, 70);

        tbDanhSachNhanVien_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbDanhSachNhanVien_pnQuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Ngày sinh", "Địa chỉ", "CMND", "SĐT", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDanhSachNhanVien_pnQuanLyNhanVien.setRowHeight(24);
        tbDanhSachNhanVien_pnQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachNhanVien_pnQuanLyNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDanhSachNhanVien_pnQuanLyNhanVien);
        if (tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumnCount() > 0) {
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(0).setMinWidth(80);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(0).setMaxWidth(80);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(1).setMinWidth(200);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(1).setMaxWidth(250);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(2).setMinWidth(60);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(2).setMaxWidth(60);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(3).setMinWidth(90);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(3).setMaxWidth(90);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(5).setMinWidth(100);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(5).setMaxWidth(100);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(6).setMinWidth(100);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(6).setMaxWidth(100);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(7).setMinWidth(100);
            tbDanhSachNhanVien_pnQuanLyNhanVien.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        jpn_QuanLyNhanVien.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 990, 430);

        btnTaoMoi_pnQuanLyNhanVien.setBackground(new java.awt.Color(10, 125, 39));
        btnTaoMoi_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTaoMoi_pnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi_pnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_add.png"))); // NOI18N
        btnTaoMoi_pnQuanLyNhanVien.setText("TẠO MỚI");
        btnTaoMoi_pnQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTaoMoi_pnQuanLyNhanVien.setBorderPainted(false);
        btnTaoMoi_pnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoi_pnQuanLyNhanVienActionPerformed(evt);
            }
        });
        jpn_QuanLyNhanVien.add(btnTaoMoi_pnQuanLyNhanVien);
        btnTaoMoi_pnQuanLyNhanVien.setBounds(42, 585, 200, 48);

        btnXoa_pnQuanLyNhanVien.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa_pnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa_pnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_pnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoa_pnQuanLyNhanVien.setText("XÓA");
        btnXoa_pnQuanLyNhanVien.setBorder(null);
        btnXoa_pnQuanLyNhanVien.setEnabled(false);
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

        tbPhongHat_pnQuanLyPhongHat.setBackground(new java.awt.Color(240, 240, 240));
        tbPhongHat_pnQuanLyPhongHat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbPhongHat_pnQuanLyPhongHat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Tình trạng", "Sức chứa", "Đơn giá", "Mô tả"
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
        tbPhongHat_pnQuanLyPhongHat.setRowHeight(24);
        tbPhongHat_pnQuanLyPhongHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongHat_pnQuanLyPhongHatMouseClicked(evt);
            }
        });
        spPhongHat_pnPhongHat.setViewportView(tbPhongHat_pnQuanLyPhongHat);
        if (tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumnCount() > 0) {
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(0).setMinWidth(80);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(0).setMaxWidth(80);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(1).setMinWidth(200);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(1).setMaxWidth(200);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(2).setMinWidth(200);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(2).setMaxWidth(200);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(3).setMinWidth(80);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(3).setMaxWidth(80);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(4).setMinWidth(120);
            tbPhongHat_pnQuanLyPhongHat.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jpn_QuanLyPhongHat.add(spPhongHat_pnPhongHat);
        spPhongHat_pnPhongHat.setBounds(40, 110, 990, 430);

        btnXoaPhong_pnPhongHat.setBackground(new java.awt.Color(204, 0, 0));
        btnXoaPhong_pnPhongHat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaPhong_pnPhongHat.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPhong_pnPhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoaPhong_pnPhongHat.setText("XÓA PHÒNG");
        btnXoaPhong_pnPhongHat.setBorder(null);
        btnXoaPhong_pnPhongHat.setEnabled(false);
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

        tbDichVu_pnQuanLyDichVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbDichVu_pnQuanLyDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Đơn giá", "Loại dịch vụ"
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
        tbDichVu_pnQuanLyDichVu.setRowHeight(24);
        tbDichVu_pnQuanLyDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVu_pnQuanLyDichVuMouseClicked(evt);
            }
        });
        spDichVu_pnDichVu.setViewportView(tbDichVu_pnQuanLyDichVu);
        if (tbDichVu_pnQuanLyDichVu.getColumnModel().getColumnCount() > 0) {
            tbDichVu_pnQuanLyDichVu.getColumnModel().getColumn(0).setMinWidth(100);
            tbDichVu_pnQuanLyDichVu.getColumnModel().getColumn(0).setMaxWidth(100);
        }

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

        btnXoa_pnDichVu.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa_pnDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa_pnDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_pnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon_remove.png"))); // NOI18N
        btnXoa_pnDichVu.setText("XÓA");
        btnXoa_pnDichVu.setBorder(null);
        btnXoa_pnDichVu.setEnabled(false);
        btnXoa_pnDichVu.setFocusCycleRoot(true);
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
        
        updateQuanLyNhanVien();      
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseClicked

    private void btn_QuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseEntered
        // TODO add your handling code here:
        if (bQuanLyNhanVien == false)
            btn_QuanLyNhanVien.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyNhanVien.setText(MyStrings.Management_Staffs);
            
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseEntered

    private void btn_QuanLyNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseExited
        // TODO add your handling code here:
        if (bQuanLyNhanVien == false){
            btn_QuanLyNhanVien.setBackground(QLColor.btn_Default);
            btn_QuanLyNhanVien.setText("");
        }
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
        
        updateQuanLyPhongHat();       
    }//GEN-LAST:event_btn_QuanLyPhongHatMouseClicked

    private void btn_QuanLyPhongHatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatMouseEntered
        // TODO add your handling code here:
        if (bQuanLyPhongHat == false)
            btn_QuanLyPhongHat.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyPhongHat.setText(MyStrings.Management_Singing_Rooms);
    }//GEN-LAST:event_btn_QuanLyPhongHatMouseEntered

    private void btn_QuanLyPhongHatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyPhongHatMouseExited
        // TODO add your handling code here:
        if (bQuanLyPhongHat == false){
            btn_QuanLyPhongHat.setBackground(QLColor.btn_Default);
            btn_QuanLyPhongHat.setText("");
        }
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
        
        updateQuanLyDichVu();
    }//GEN-LAST:event_btn_QuanLyDichVuMouseClicked

    private void btn_QuanLyDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuMouseEntered
        // TODO add your handling code here:
        if (bQuanLyDichVu == false)
            btn_QuanLyDichVu.setBackground(QLColor.btn_When_Entered);
        btn_QuanLyDichVu.setText(MyStrings.Management_Services);
    }//GEN-LAST:event_btn_QuanLyDichVuMouseEntered

    private void btn_QuanLyDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDichVuMouseExited
        // TODO add your handling code here:
        if (bQuanLyDichVu == false){
            btn_QuanLyDichVu.setBackground(QLColor.btn_Default);
            btn_QuanLyDichVu.setText("");
        }
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
        btn_QuanLyDoanhThu.setText(MyStrings.Management_Revenues);
    }//GEN-LAST:event_btn_QuanLyDoanhThuMouseEntered

    private void btn_QuanLyDoanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyDoanhThuMouseExited
        // TODO add your handling code here:
        if (bQuanLyDoanhThu == false){
            btn_QuanLyDoanhThu.setBackground(QLColor.btn_Default);
            btn_QuanLyDoanhThu.setText("");
        }
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
        btn_Thoat.setText(MyStrings.Exit);
    }//GEN-LAST:event_btn_ThoatMouseEntered

    private void btn_ThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseExited
        // TODO add your handling code here:
        btn_Thoat.setBackground(QLColor.btn_Default);
        btn_Thoat.setText("");
    }//GEN-LAST:event_btn_ThoatMouseExited

    private void btnTaoMoi_pnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnQuanLyNhanVienActionPerformed
        Dialog_ThemNhanVien dThemNhanVien = new Dialog_ThemNhanVien(this, rootPaneCheckingEnabled);
        dThemNhanVien.setVisible(true);
        updateQuanLyNhanVien();
    }//GEN-LAST:event_btnTaoMoi_pnQuanLyNhanVienActionPerformed

    private void btnXoa_pnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnQuanLyNhanVienActionPerformed
        int r = tbDanhSachNhanVien_pnQuanLyNhanVien.getSelectedRow();
        int input = JOptionPane.showConfirmDialog(rootPane, MyStrings.Confirm_Delete_Staff, MyStrings.Confirm, JOptionPane.OK_CANCEL_OPTION);
        if (input == 0){ // OK
            BNhanVien bNhanVien = new BNhanVien();
            int maNV = Integer.parseInt(mTable_NhanVien.getValueAt(r, 0).toString());
            boolean rs = true;
            try {
                rs = bNhanVien.xoaNhanVien(maNV);
            } catch (SQLException ex) {
                Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (rs){
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Succeeded);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Failed);
            }
        }
        
        updateQuanLyNhanVien();
    }//GEN-LAST:event_btnXoa_pnQuanLyNhanVienActionPerformed

    private void btnTaoMoi_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnPhongHatActionPerformed
        Dialog_ThemPhongHat dThemPhongHat = new Dialog_ThemPhongHat(this, rootPaneCheckingEnabled, MyStrings.Manager);
        dThemPhongHat.setBackground(QLColor.background);
        dThemPhongHat.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnPhongHatActionPerformed

    private void btnXoaPhong_pnPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhong_pnPhongHatActionPerformed
        int r = tbPhongHat_pnQuanLyPhongHat.getSelectedRow();
        int input = JOptionPane.showConfirmDialog(rootPane, MyStrings.Confirm_Delete_Singing_Room, MyStrings.Confirm, JOptionPane.OK_CANCEL_OPTION);
        if (input == 0){ // OK
            BPhongHat bPhongHat = new BPhongHat();
            int maPH = Integer.parseInt(mTable_PhongHat.getValueAt(r, 0).toString());
            boolean rs = true;
            try {
                rs = bPhongHat.xoaPhongHat(maPH);
            } catch (SQLException ex) {
                Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (rs){
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Succeeded);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Failed);
            }
        }
        
        updateQuanLyPhongHat();
    }//GEN-LAST:event_btnXoaPhong_pnPhongHatActionPerformed

    private void btnThemLoaiPhongHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiPhongHatActionPerformed
        Dialog_ThemLoaiPhongHat dThemLoaiPhongHat = new Dialog_ThemLoaiPhongHat(this, rootPaneCheckingEnabled);
        dThemLoaiPhongHat.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiPhongHatActionPerformed

    private void btnTaoMoi_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoi_pnDichVuActionPerformed
        Dialog_ThemDichVu dThemDichVu = new Dialog_ThemDichVu(this, rootPaneCheckingEnabled, MyStrings.Manager);
        dThemDichVu.setBackground(QLColor.background);
        dThemDichVu.setVisible(true);
    }//GEN-LAST:event_btnTaoMoi_pnDichVuActionPerformed

    private void btnXoa_pnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_pnDichVuActionPerformed
        int r = tbDichVu_pnQuanLyDichVu.getSelectedRow();
        int input = JOptionPane.showConfirmDialog(rootPane, MyStrings.Confirm_Delete_Service, MyStrings.Confirm, JOptionPane.OK_CANCEL_OPTION);
        if (input == 0){ // OK
            BDichVu bDichVu = new BDichVu();
            int maDV = Integer.parseInt(mTable_DichVu.getValueAt(r, 0).toString());
            boolean rs = true;
            try {
                rs = bDichVu.xoaDichVu(maDV);
            } catch (SQLException ex) {
                Logger.getLogger(Frame_QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (rs){
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Succeeded);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, MyStrings.Delete_Failed);
            }
        }
        
        updateQuanLyDichVu();
    }//GEN-LAST:event_btnXoa_pnDichVuActionPerformed

    private void btnThemLoaiDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiDichVuActionPerformed
        Dialog_ThemLoaiDichVu dThemLoaiDichVu = new Dialog_ThemLoaiDichVu(this, rootPaneCheckingEnabled);
        dThemLoaiDichVu.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiDichVuActionPerformed

    private void tfCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCMNDKeyTyped
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfCMND.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCMNDKeyTyped

    private void tfSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSDTKeyTyped
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfSDT.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_tfSDTKeyTyped

    private void btnChinhSua_pnThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_pnThongTinCaNhanActionPerformed

        btnChinhSua_pnThongTinCaNhan.setEnabled(false);
        btnLuu_pnThongTinCaNhan.setEnabled(true);

        tfHoTen.setEditable(true);
        cbbGioiTinh.setEnabled(true);
        tfNgaySinh.getCalendarButton().setEnabled(true);
        tfCMND.setEditable(true);
        tfSDT.setEditable(true);
        tfDiaChi.setEditable(true);
    }//GEN-LAST:event_btnChinhSua_pnThongTinCaNhanActionPerformed

    private void btnLuu_pnThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu_pnThongTinCaNhanActionPerformed

        String hoTen = tfHoTen.getText();
        String gioiTinh = cbbGioiTinh.getSelectedItem().toString();
        String ngaySinh = new SimpleDateFormat("yyyy-MM-dd").format(tfNgaySinh.getDate());
        String cmnd = tfCMND.getText();
        String sdt = tfSDT.getText();
        String diaChi = tfDiaChi.getText();

        if (!hoTen.isEmpty() && !diaChi.isEmpty() && !ngaySinh.isEmpty()) {
            if (cmnd.length() != 9 && cmnd.length() != 12) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_CMND);
                return;
            }
            if (sdt.length() < 10) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Phone);
                return;
            }
            if (sdt.length() == 10 && !sdt.startsWith("09")) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Phone);
                return;
            }
            if (sdt.length() == 11 && !sdt.startsWith("01")) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Phone);
                return;
            }
            if (!isOldEnough(ngaySinh)) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Birthday);
                return;
            }

            Boolean res = false;
            BNhanVien bNhanVien = new BNhanVien();
            try {
                res = bNhanVien.capNhatNhanVien(QL.getMaNhanVien(), hoTen, gioiTinh, ngaySinh, diaChi, cmnd, sdt, QL.getLuong());
                tfHoTen.setEditable(false);
                cbbGioiTinh.setEnabled(false);
                tfCMND.setEditable(false);
                tfSDT.setEditable(false);
                tfDiaChi.setEditable(false);
                btnChinhSua_pnThongTinCaNhan.setEnabled(true);
                btnLuu_pnThongTinCaNhan.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(Dialog_ThemKhachHangThanhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!res) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Add_Failed);
            }

            try {
                NhanVien ql = bNhanVien.layThongTinNhanVienTheoMaNV(QL.getMaNhanVien());
                QL = ql;
                jLB_Name.setText(QL.getHoten());
            } catch (SQLException ex) {
                Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Fill_Full);
        }
    }//GEN-LAST:event_btnLuu_pnThongTinCaNhanActionPerformed

    private void jLB_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLB_NameMouseClicked
        setColorAllButton(QLColor.btn_Default);
        setFalseAllButton();
        setAllPanelDisappear();

        jpn_ThongTinCaNhan.setVisible(true);

        ((JTextField) tfNgaySinh.getDateEditor()).setEditable(false);
        tfNgaySinh.getCalendarButton().setEnabled(false);
        btnChinhSua_pnThongTinCaNhan.setEnabled(true);
        btnLuu_pnThongTinCaNhan.setEnabled(false);
        tfHoTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfCMND.setEditable(false);
        tfSDT.setEditable(false);
        tfDiaChi.setEditable(false);

        int maQL = QL.getMaNhanVien();
        String sMaQL = Integer.toString(maQL);
        lblMaNV.setText("Mã quản lý: " + sMaQL);
        tfHoTen.setText(QL.getHoten());
        cbbGioiTinh.setSelectedItem(QL.getGioiTinh());
        tfNgaySinh.setDate(QL.getNgaySinh());
        tfCMND.setText(QL.getCmnd());
        tfSDT.setText(QL.getSdt());
        tfDiaChi.setText(QL.getDiaChi());
    }//GEN-LAST:event_jLB_NameMouseClicked

    private void tbDanhSachNhanVien_pnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachNhanVien_pnQuanLyNhanVienMouseClicked
        int r = tbDanhSachNhanVien_pnQuanLyNhanVien.getSelectedRow();
        if (r != -1){
            btnXoa_pnQuanLyNhanVien.setEnabled(true);

            if (evt.getClickCount() == 2) {
                BNhanVien bNhanVien = new BNhanVien();
                NhanVien nhanVien = null;
                int maNV = Integer.parseInt(mTable_NhanVien.getValueAt(r, 0).toString());
                try {
                    nhanVien = bNhanVien.layThongTinNhanVienTheoMaNV_TaiKhoan(maNV);
                    Dialog_XemNhanVien dXemNhanVien = new Dialog_XemNhanVien(this, rootPaneCheckingEnabled, nhanVien);
                    dXemNhanVien.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tbDanhSachNhanVien_pnQuanLyNhanVienMouseClicked

    private void tbPhongHat_pnQuanLyPhongHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongHat_pnQuanLyPhongHatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPhongHat_pnQuanLyPhongHatMouseClicked

    private void tbDichVu_pnQuanLyDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVu_pnQuanLyDichVuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDichVu_pnQuanLyDichVuMouseClicked

    Boolean isOldEnough(String input) {
        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(_today);
        int _namHienTai = cal.get(Calendar.YEAR);

        Date _ngaySinh = new Date();
        try {
            _ngaySinh = sdf.parse(input);
        } catch (ParseException ex) {
            //
        }
        cal.setTime(_ngaySinh);
        int _namSinh = cal.get(Calendar.YEAR);

        if (_namHienTai - _namSinh < 18) {
            return false;
        }
        return true;
    }
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
    private javax.swing.JButton btnChinhSua_pnThongTinCaNhan;
    private javax.swing.JButton btnLuu_pnThongTinCaNhan;
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
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLB_Brand;
    private javax.swing.JLabel jLB_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpn_QuanLyDichVu;
    private javax.swing.JPanel jpn_QuanLyDoanhThu;
    private javax.swing.JPanel jpn_QuanLyNhanVien;
    private javax.swing.JPanel jpn_QuanLyPhongHat;
    private javax.swing.JPanel jpn_ThongTinCaNhan;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JScrollPane spDichVu_pnDichVu;
    private javax.swing.JScrollPane spPhongHat_pnPhongHat;
    private javax.swing.JTable tbDanhSachNhanVien_pnQuanLyNhanVien;
    private javax.swing.JTable tbDichVu_pnQuanLyDichVu;
    private javax.swing.JTable tbPhongHat_pnQuanLyPhongHat;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoTen;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfSDT;
    // End of variables declaration//GEN-END:variables
}
