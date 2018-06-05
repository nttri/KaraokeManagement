package view;

import model.DonThanhToan;

/**
 *
 * @author thanhtri
 */
public class Dialog_ChiTietThanhToan extends javax.swing.JDialog {

    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;
    DonThanhToan gDonThanhToan = new DonThanhToan();
    
    public Dialog_ChiTietThanhToan(java.awt.Frame parent, boolean modal, DonThanhToan dtt, String fromFrameType) {
        super(parent, modal);
        gDonThanhToan = dtt;
        if(fromFrameType.equals("NV")){
            fNhanVien = (Frame_NhanVien) parent;
        }else{
            fQuanLy = (Frame_QuanLy) parent;
        }
        gRootType = fromFrameType;
        initComponents();
        customInit();
    }
    
    void customInit(){
        
        
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 750));
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
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
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
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tổng tiền dịch vụ (vnd)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 320, 220, 25);

        lblTongTienDichVu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongTienDichVu.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tổng tiền phòng (vnd)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 660, 220, 25);

        lblTongTienPhong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongTienPhong.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(lblLoaiPhong);
        lblLoaiPhong.setBounds(360, 460, 130, 28);

        lblDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(204, 204, 204));
        lblDonGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblDonGia);
        lblDonGia.setBounds(360, 520, 130, 28);

        lblSoGioSuDung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSoGioSuDung.setForeground(new java.awt.Color(204, 204, 204));
        lblSoGioSuDung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblSoGioSuDung);
        lblSoGioSuDung.setBounds(360, 580, 130, 28);

        lblMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        lblMaKhachHang.setText("Mã khách hàng:");
        jPanel1.add(lblMaKhachHang);
        lblMaKhachHang.setBounds(540, 154, 250, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Tiền phòng chưa trả lần trước (nếu có)");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(540, 270, 428, 27);

        lblTienPhongConThieu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTienPhongConThieu.setForeground(new java.awt.Color(255, 153, 0));
        lblTienPhongConThieu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTienPhongConThieu.setText("000000000");
        jPanel1.add(lblTienPhongConThieu);
        lblTienPhongConThieu.setBounds(670, 320, 220, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("(vnd)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(910, 324, 52, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("TỔNG CỘNG");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(770, 430, 200, 37);

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(102, 255, 255));
        lblTongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongTien.setText("000000000");
        jPanel1.add(lblTongTien);
        lblTongTien.setBounds(600, 480, 370, 61);

        btnThanhToan.setBackground(new java.awt.Color(51, 255, 255));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(10, 125, 39));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(btnThanhToan);
        btnThanhToan.setBounds(770, 640, 200, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblMaDon;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblSoGioSuDung;
    private javax.swing.JLabel lblTienPhongConThieu;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTongTienDichVu;
    private javax.swing.JLabel lblTongTienPhong;
    private javax.swing.JTable tbDichVuSuDung;
    // End of variables declaration//GEN-END:variables
}
