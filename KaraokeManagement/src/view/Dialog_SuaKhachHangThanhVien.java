package view;

import Business.BKhachHang;
import common.MyStrings;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.KhachHang;

/**
 *
 * @author thanhtri
 */
public class Dialog_SuaKhachHangThanhVien extends javax.swing.JDialog {

    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;
    KhachHang gKhachHang;
    
    public Dialog_SuaKhachHangThanhVien(java.awt.Frame parent, boolean modal, KhachHang kh, String fromFrameType) {
        super(parent, modal);
        initComponents();
        if(fromFrameType.equals("NV")){
            fNhanVien = (Frame_NhanVien) parent;
        }else{
            fQuanLy = (Frame_QuanLy) parent;
        }
        gRootType = fromFrameType;
        gKhachHang = kh;
        customInit();
    }
    
    void customInit(){
        ((JTextField)tfNgaySinh.getDateEditor()).setEditable(false);
        showData();
    }
    
    private void showData(){
        tfHoTen.setText(gKhachHang.getHoTen());
        cbbGioiTinh.setSelectedItem(gKhachHang.isGioiTinh());
        tfCMND.setText(gKhachHang.getCmnd());
        ((JTextField) tfNgaySinh.getDateEditor()).setText(gKhachHang.getNgaySinh().toString());
        tfDiaChi.setText(gKhachHang.getDiaChi());
        tfSDT.setText(gKhachHang.getSdt());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCMND = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KHÁCH HÀNG THÀNH VIÊN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ tên");

        tfHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfHoTen.setForeground(new java.awt.Color(10, 145, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày sinh");

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbGioiTinh.setForeground(new java.awt.Color(10, 145, 39));
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        tfNgaySinh.setForeground(new java.awt.Color(10, 145, 39));
        tfNgaySinh.setDateFormatString("yyyy-MM-dd");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số điện thoại");

        tfCMND.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCMND.setForeground(new java.awt.Color(10, 145, 39));
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });

        tfSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSDT.setForeground(new java.awt.Color(10, 145, 39));
        tfSDT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSDTKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Địa chỉ");

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfDiaChi.setForeground(new java.awt.Color(10, 145, 39));

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(10, 145, 39));
        btnLuu.setText("LƯU");
        btnLuu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCMND, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSDT)
                                    .addComponent(jLabel5)
                                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(cbbGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String hoten = tfHoTen.getText();
        String gioitinh = cbbGioiTinh.getSelectedItem().toString();
        String cmnd = tfCMND.getText();
        String sdt = tfSDT.getText();
        String diachi = tfDiaChi.getText();
        String ngaysinh = ((JTextField)tfNgaySinh.getDateEditor().getUiComponent()).getText();
        
        if(!hoten.isEmpty() && !diachi.isEmpty() && !ngaysinh.isEmpty()){
            Boolean res = false;
            BKhachHang bKhachHang = new BKhachHang();
            try {
                res = bKhachHang.capNhatKhachHang(gKhachHang.getMaKH(), hoten, gioitinh, ngaysinh, diachi, cmnd, sdt);
            } catch (SQLException ex) {
                Logger.getLogger(Dialog_SuaKhachHangThanhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (res) {
                    if(gRootType.equals("NV")){
                        this.fNhanVien.refreshPanelKhachHangThanhVien();
                    }else{
                        // frame quản lý điền vào đây
                    }   
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, MyStrings.Edit_Failed);
                }
        }else{
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Fill_Full);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tfCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCMNDKeyTyped
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
            evt.consume();
        if(tfCMND.getText().length()>8)
            evt.consume();
    }//GEN-LAST:event_tfCMNDKeyTyped

    private void tfSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSDTKeyTyped
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
            evt.consume();
        if(tfSDT.getText().length()>10)
            evt.consume();
    }//GEN-LAST:event_tfSDTKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoTen;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfSDT;
    // End of variables declaration//GEN-END:variables
}
