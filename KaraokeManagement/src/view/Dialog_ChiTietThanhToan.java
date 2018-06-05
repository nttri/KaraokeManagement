package view;

import Business.BChiTietDichVu;
import Business.BDichVu;
import Business.BDonThanhToan;
import Business.BLoaiPhongHat;
import Business.BPhongHat;
import common.MyStrings;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChiTietDichVu;
import model.DichVu;
import model.DonThanhToan;
import model.LoaiPhongHat;
import model.PhongHat;

/**
 *
 * @author thanhtri
 */
public class Dialog_ChiTietThanhToan extends javax.swing.JDialog {

    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;
    DonThanhToan gDonThanhToan;
    Boolean gLayTienThieu = true;
    String gTrangThaiThanhToan = "";
    long gSoGio = 0;

    DefaultTableModel mTable_DichVu, mTable_TienPhongThieu;

    public Dialog_ChiTietThanhToan(java.awt.Frame parent, boolean modal, DonThanhToan dtt, String fromFrameType) {
        super(parent, modal);
        initComponents();
        gDonThanhToan = dtt;
        if (fromFrameType.equals(MyStrings.Staff)) {
            fNhanVien = (Frame_NhanVien) parent;
        } else {
            fQuanLy = (Frame_QuanLy) parent;
        }
        gRootType = fromFrameType;
        mTable_DichVu = (DefaultTableModel) tbDichVuSuDung.getModel();
        mTable_TienPhongThieu = (DefaultTableModel) tbTienPhongThieu.getModel();
        tbDichVuSuDung.setRowHeight(28);
        tbTienPhongThieu.setRowHeight(28);
        checkRoomStatus();
        customInit();
    }

    void checkRoomStatus() {
        String trangThai = gDonThanhToan.getTinhTrang();
        if (trangThai.equals("Chưa thanh toán")) {
            gSoGio = 1;
            gLayTienThieu = false;
            gTrangThaiThanhToan = "Chưa thanh toán";
        } else if (trangThai.equals("Đã thanh toán")) {
            Date bd = gDonThanhToan.getThoiGianBatDau();
            Date kt = gDonThanhToan.getThoiGianKetThuc();
            long diff = kt.getTime() - bd.getTime();
            gSoGio = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
            gLayTienThieu = false;
            btnThanhToan.setVisible(false);
            gTrangThaiThanhToan = "Đã thanh toán";
        } else {
            Date bd = gDonThanhToan.getThoiGianBatDau();
            String ngayBD = bd.toString();
            LocalDateTime datetime = LocalDateTime.now();
            String sDay = datetime.toString().substring(0, 10);
            String sTime = datetime.toString().substring(11, 21);
            String sTimeNow = sDay + " " + sTime;

            if (sTimeNow.compareTo(ngayBD) <= 0) { // thanh toán trước ngày đặt phòng (không cho phép)
                gSoGio = 0;
                gLayTienThieu = false;
                btnThanhToan.setVisible(false);
                gTrangThaiThanhToan = "Chưa tới ngày dùng";
            } else {
                Date now = new Date();
                long diff = now.getTime() - bd.getTime();
                long soPhut = TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS) % 60;
                gSoGio = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
                if (soPhut >= 30) {
                    gSoGio++;
                }
                gLayTienThieu = true;
                gTrangThaiThanhToan = "Đang dùng";
            }
        }
    }

    void customInit() {

        long tongTienDichVu = 0;
        long tongTienPhong = 0;
        long tongTienPhongThieu = 0;
        long tongCong = 0;

        int maDonTT = gDonThanhToan.getMaDon();
        int maPhong = gDonThanhToan.getMaPhong();
        int maKH = gDonThanhToan.getMaKhachHang();
        Date ngayBD = gDonThanhToan.getThoiGianBatDau();

        lblMaDon.setText("Mã đơn thanh toán: " + Integer.toString(maDonTT));
        lblMaPhong.setText("Mã phòng: " + Integer.toString(maPhong));
        lblMaKhachHang.setText("Mã khách hàng: " + Integer.toString(maKH));
        lblNgayBatDau.setText(ngayBD.toString());

        //Xử lý phần dịch vụ
        if (gTrangThaiThanhToan.equals("Đang dùng") || gTrangThaiThanhToan.equals("Đã thanh toán")) {
            BChiTietDichVu bChiTietDV = new BChiTietDichVu();
            BDichVu bDichVu = new BDichVu();
            ArrayList<ChiTietDichVu> arrDonDV = null;

            try {
                arrDonDV = bChiTietDV.layThongTinChiTietDichVuTheoMaDon(maDonTT);
            } catch (SQLException ex) {
                Logger.getLogger(Dialog_ChiTietThanhToan.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }

            for (int i = 0; i < arrDonDV.size(); i++) {
                DichVu dv = new DichVu();
                try {
                    dv = bDichVu.layThongTinDichVuTheoMa(arrDonDV.get(i).getMaDichVu());
                } catch (SQLException ex) {
                    Logger.getLogger(Dialog_ChiTietThanhToan.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }

                int donGia = arrDonDV.get(i).getDonGia();
                int soLuong = arrDonDV.get(i).getSoLuong();
                tongTienDichVu += donGia * soLuong;

                mTable_DichVu.addRow(new Object[]{
                    dv.getMaDichVu(),
                    dv.getTenDichVu(),
                    donGia,
                    soLuong
                });
            }
        }
        lblTongTienDichVu.setText(Long.toString(tongTienDichVu));

        //Xử lý phần phòng hát
        BLoaiPhongHat bLoaiPH = new BLoaiPhongHat();
        LoaiPhongHat loaiPH = new LoaiPhongHat();
        BPhongHat bPhongHat = new BPhongHat();
        PhongHat phongHat = new PhongHat();
        int maLoaiPhong = 0;

        try {
            phongHat = bPhongHat.layThongTinPhongHatTheoMa(maPhong);
            maLoaiPhong = phongHat.getMaLoaiPhong();
            loaiPH = bLoaiPH.layThongTinLoaiPhongHatTheoMa(maLoaiPhong);
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ChiTietThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        lblLoaiPhong.setText(loaiPH.getTenLoai());
        lblDonGia.setText(Integer.toString(loaiPH.getGiaPhong()));
        lblSoGioSuDung.setText(Long.toString(gSoGio));
        tongTienPhong = loaiPH.getGiaPhong() * gSoGio;
        lblTongTienPhong.setText(Long.toString(tongTienPhong));

        //Xử lý phần tiền phòng chưa trả (nếu có)
        if (gTrangThaiThanhToan.equals("Đang dùng")) {
            BDonThanhToan bDonTT = new BDonThanhToan();
            ArrayList<DonThanhToan> arrDonTT = null;

            try {
                arrDonTT = bDonTT.layDonThanhToanTheoMaKHVaTinhTrang(maKH, "Chưa thanh toán");
                for (int i = 0; i < arrDonTT.size(); i++) {
                    int _maphong = arrDonTT.get(i).getMaPhong();
                    PhongHat _phonghat = new PhongHat();
                    LoaiPhongHat _loaiPH = new LoaiPhongHat();
                    
                    _phonghat = bPhongHat.layThongTinPhongHatTheoMa(_maphong);
                    _loaiPH = bLoaiPH.layThongTinLoaiPhongHatTheoMa(_phonghat.getMaLoaiPhong());
                    
                    mTable_TienPhongThieu.addRow(new Object[]{
                        arrDonTT.get(i).getMaDon(),
                        _loaiPH.getTenLoai(),
                        arrDonTT.get(i).getThoiGianBatDau(),
                        _loaiPH.getGiaPhong()
                    });
                    tongTienPhongThieu += _loaiPH.getGiaPhong();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dialog_ChiTietThanhToan.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }

        }
        lblTienPhongConThieu.setText(Long.toString(tongTienPhongThieu));

        tongCong = tongTienDichVu + tongTienPhong + tongTienPhongThieu;
        lblTongTien.setText(Long.toString(tongCong));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaDon = new javax.swing.JLabel();
        lblMaPhong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDichVuSuDung = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblTongTienDichVu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTongTienPhong = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblSoGioSuDung = new javax.swing.JLabel();
        lblMaKhachHang = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTienPhongConThieu = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTienPhongThieu = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lblNgayBatDau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 750));
        jPanel1.setLayout(null);

        lblMaDon.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaDon.setForeground(new java.awt.Color(204, 204, 204));
        lblMaDon.setText("Mã đơn thanh toán:");
        jPanel1.add(lblMaDon);
        lblMaDon.setBounds(540, 34, 300, 27);

        lblMaPhong.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaPhong.setForeground(new java.awt.Color(204, 204, 204));
        lblMaPhong.setText("Mã phòng:");
        jPanel1.add(lblMaPhong);
        lblMaPhong.setBounds(540, 94, 220, 27);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("Dịch vụ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 32, 99, 32);

        tbDichVuSuDung.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbDichVuSuDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên dịch vụ", "Đơn giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDichVuSuDung);
        if (tbDichVuSuDung.getColumnModel().getColumnCount() > 0) {
            tbDichVuSuDung.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbDichVuSuDung.getColumnModel().getColumn(1).setPreferredWidth(220);
            tbDichVuSuDung.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbDichVuSuDung.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 470, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 255));
        jLabel2.setText("Tổng tiền dịch vụ (vnd)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 320, 220, 25);

        lblTongTienDichVu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongTienDichVu.setForeground(new java.awt.Color(255, 153, 255));
        lblTongTienDichVu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongTienDichVu.setText("000000000");
        jPanel1.add(lblTongTienDichVu);
        lblTongTienDichVu.setBounds(270, 320, 220, 29);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(510, 0, 10, 749);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Phòng hát");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 400, 150, 32);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Loại phòng");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 460, 110, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Đơn giá");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 520, 90, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Số giờ sử dụng");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 580, 140, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 51));
        jLabel8.setText("Tổng tiền phòng (vnd)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 660, 220, 25);

        lblTongTienPhong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongTienPhong.setForeground(new java.awt.Color(51, 255, 51));
        lblTongTienPhong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongTienPhong.setText("000000000");
        jPanel1.add(lblTongTienPhong);
        lblTongTienPhong.setBounds(270, 660, 220, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("-----------");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 460, 82, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("-----------");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 520, 82, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("-----------");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 580, 82, 22);

        lblLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLoaiPhong.setForeground(new java.awt.Color(204, 204, 204));
        lblLoaiPhong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLoaiPhong.setText("null");
        jPanel1.add(lblLoaiPhong);
        lblLoaiPhong.setBounds(360, 460, 130, 22);

        lblDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(204, 204, 204));
        lblDonGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDonGia.setText("null");
        jPanel1.add(lblDonGia);
        lblDonGia.setBounds(360, 520, 130, 22);

        lblSoGioSuDung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSoGioSuDung.setForeground(new java.awt.Color(204, 204, 204));
        lblSoGioSuDung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoGioSuDung.setText("null");
        jPanel1.add(lblSoGioSuDung);
        lblSoGioSuDung.setBounds(360, 580, 130, 22);

        lblMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        lblMaKhachHang.setText("Mã khách hàng:");
        jPanel1.add(lblMaKhachHang);
        lblMaKhachHang.setBounds(540, 154, 250, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Tiền phòng chưa trả lần trước (nếu có)");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(640, 280, 428, 27);

        lblTienPhongConThieu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTienPhongConThieu.setForeground(new java.awt.Color(255, 153, 0));
        lblTienPhongConThieu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTienPhongConThieu.setText("000000000");
        jPanel1.add(lblTienPhongConThieu);
        lblTienPhongConThieu.setBounds(780, 440, 220, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("(vnd)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1010, 443, 52, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("TỔNG CỘNG");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(540, 630, 200, 37);

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(102, 255, 255));
        lblTongTien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTongTien.setText("000000000");
        jPanel1.add(lblTongTien);
        lblTongTien.setBounds(540, 668, 300, 61);

        btnThanhToan.setBackground(new java.awt.Color(51, 255, 255));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(10, 125, 39));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(btnThanhToan);
        btnThanhToan.setBounds(870, 675, 200, 50);

        tbTienPhongThieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbTienPhongThieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn", "Loại phòng", "Ngày đặt", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbTienPhongThieu);
        if (tbTienPhongThieu.getColumnModel().getColumnCount() > 0) {
            tbTienPhongThieu.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbTienPhongThieu.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbTienPhongThieu.getColumnModel().getColumn(2).setPreferredWidth(270);
            tbTienPhongThieu.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(540, 310, 530, 120);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Bắt đầu lúc:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(540, 214, 120, 27);

        lblNgayBatDau.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblNgayBatDau.setForeground(new java.awt.Color(204, 204, 204));
        lblNgayBatDau.setText("yyyy-MM-dd hh:mm:ss.s");
        jPanel1.add(lblNgayBatDau);
        lblNgayBatDau.setBounds(680, 214, 300, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblMaDon;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblSoGioSuDung;
    private javax.swing.JLabel lblTienPhongConThieu;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTongTienDichVu;
    private javax.swing.JLabel lblTongTienPhong;
    private javax.swing.JTable tbDichVuSuDung;
    private javax.swing.JTable tbTienPhongThieu;
    // End of variables declaration//GEN-END:variables
}
