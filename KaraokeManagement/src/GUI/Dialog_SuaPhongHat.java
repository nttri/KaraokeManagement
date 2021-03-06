package GUI;

import Business.BLoaiPhongHat;
import Business.BPhongHat;
import common.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DTO.LoaiPhongHat;
import DTO.PhongHat;

/**
 *
 * @author thanhtri
 */
public class Dialog_SuaPhongHat extends javax.swing.JDialog {

    PhongHat gPhongHat;
    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;

    public Dialog_SuaPhongHat(java.awt.Frame parent, boolean modal, PhongHat phong, String fromFrameType) {
        super(parent, modal);
        initComponents();
        if (fromFrameType.equals("NV")) {
            fNhanVien = (Frame_NhanVien) parent;
            jPanel1.setBackground(NVColor.background);
        } else {
            fQuanLy = (Frame_QuanLy) parent;
            jPanel1.setBackground(QLColor.background);
        }
        gRootType = fromFrameType;
        gPhongHat = phong;
        customInit();
    }

    void customInit() {
        BLoaiPhongHat bLoaiPhongHat = new BLoaiPhongHat();
        ArrayList<LoaiPhongHat> arrLPH = null;

        try {
            arrLPH = bLoaiPhongHat.layThongTinTatCaLoaiPhongHat();
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ThemPhongHat.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrLPH.size(); i++) {
            cbbLoaiPhong.addItem(arrLPH.get(i).getTenLoai());
        }

        tfDonGia.setEditable(false);
        tfSucChua.setEditable(false);
        tfMoTa.setEditable(false);
        showData();
    }

    private void showData() {
        int maLoaiPhong = gPhongHat.getMaLoaiPhong();
        BLoaiPhongHat bLoaiPH = new BLoaiPhongHat();
        LoaiPhongHat loaiPH = new LoaiPhongHat();
        try {
            loaiPH = bLoaiPH.layThongTinLoaiPhongHatTheoMa(maLoaiPhong);
            cbbLoaiPhong.setSelectedItem(loaiPH.getTenLoai());
            cbbTinhTrang.setSelectedItem(gPhongHat.getTinhTrang());
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_SuaDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLB_PH.setText("PHÒNG HÁT " + Integer.toString(gPhongHat.getMaPhong()));
        tfDonGia.setText(Integer.toString(loaiPH.getGiaPhong()));
        tfSucChua.setText(Integer.toString(loaiPH.getSucChua()));
        tfMoTa.setText(loaiPH.getMoTa());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLB_PH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbLoaiPhong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbTinhTrang = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfMoTa = new javax.swing.JTextArea();
        tfDonGia = new javax.swing.JTextField();
        tfSucChua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));

        jLB_PH.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLB_PH.setForeground(new java.awt.Color(255, 255, 255));
        jLB_PH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLB_PH.setText("PHÒNG HÁT 000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loại phòng");

        cbbLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbLoaiPhong.setForeground(new java.awt.Color(10, 125, 39));
        cbbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiPhongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tình trạng");

        cbbTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbTinhTrang.setForeground(new java.awt.Color(10, 125, 39));
        cbbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn trống", "Đang sử dụng", "Đã đặt trước" }));

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(10, 145, 39));
        btnLuu.setText("LƯU");
        btnLuu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tfMoTa.setColumns(20);
        tfMoTa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfMoTa.setRows(5);
        tfMoTa.setAutoscrolls(false);
        jScrollPane1.setViewportView(tfMoTa);

        tfDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfSucChua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sức chứa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đơn giá");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mô tả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLB_PH, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(cbbLoaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(tfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(tfSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLB_PH)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String loaiPhong = cbbLoaiPhong.getSelectedItem().toString();
        String tinhTrang = cbbTinhTrang.getSelectedItem().toString();

        boolean res = false;
        BPhongHat bPhongHat = new BPhongHat();
        BLoaiPhongHat bLoaiPhongHat = new BLoaiPhongHat();
        LoaiPhongHat loaiPH = new LoaiPhongHat();

        try {
            loaiPH = bLoaiPhongHat.layThongTinLoaiPhongHatTheoTen(loaiPhong);
            res = bPhongHat.capNhatPhongHat(gPhongHat.getMaPhong(), loaiPH.getMaLoaiPhong(), tinhTrang);
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ThemPhongHat.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (res) {
            if (gRootType.equals("NV")) {
                this.fNhanVien.refreshPanelPhongHat();
            } else {
                // frame quản lý điền vào đây
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, MyStrings.Edit_Failed);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void cbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiPhongActionPerformed
        String tenLoai = cbbLoaiPhong.getSelectedItem().toString();
        BLoaiPhongHat bLoaiPhongHat = new BLoaiPhongHat();
        LoaiPhongHat loaiPH = new LoaiPhongHat();
        try {
            loaiPH = bLoaiPhongHat.layThongTinLoaiPhongHatTheoTen(tenLoai);
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ThemPhongHat.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfDonGia.setText(Integer.toString(loaiPH.getGiaPhong()));
        tfSucChua.setText(Integer.toString(loaiPH.getSucChua()));
        tfMoTa.setText(loaiPH.getMoTa());
    }//GEN-LAST:event_cbbLoaiPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbbLoaiPhong;
    private javax.swing.JComboBox<String> cbbTinhTrang;
    private javax.swing.JLabel jLB_PH;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfDonGia;
    private javax.swing.JTextArea tfMoTa;
    private javax.swing.JTextField tfSucChua;
    // End of variables declaration//GEN-END:variables
}
