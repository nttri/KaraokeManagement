package GUI;

import Business.BDichVu;
import Business.BLoaiDichVu;
import common.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DTO.LoaiDichVu;

/**
 *
 * @author thanhtri
 */
public class Dialog_ThemDichVu extends javax.swing.JDialog {

    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;

    public Dialog_ThemDichVu(java.awt.Frame parent, boolean modal, String fromFrameType) {
        super(parent, modal);
        initComponents();
        if(fromFrameType.equals("NV")){
            fNhanVien = (Frame_NhanVien) parent;
            jPanel1.setBackground(NVColor.background);
        }else{
            fQuanLy = (Frame_QuanLy) parent;
            jPanel1.setBackground(QLColor.background);
        }
        gRootType = fromFrameType;
        customInit();
    }

    void customInit() {
        BLoaiDichVu bLoaiDichVu = new BLoaiDichVu();
        ArrayList<LoaiDichVu> arrLDV = null;

        try {
            arrLDV = bLoaiDichVu.layThongTinTatCaLoaiDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ThemDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrLDV.size(); i++) {
            cbbTenLoaiDichVu.addItem(arrLDV.get(i).getTenLoaiDichVu());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTenDichVu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        cbbTenLoaiDichVu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM DỊCH VỤ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên loại");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên dịch vụ");

        tfTenDichVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTenDichVu.setForeground(new java.awt.Color(10, 145, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Đơn giá");

        tfDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfDonGia.setForeground(new java.awt.Color(10, 145, 39));
        tfDonGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDonGiaKeyTyped(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(10, 145, 39));
        btnThem.setText("THÊM");
        btnThem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        cbbTenLoaiDichVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTenLoaiDichVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDonGia)
                            .addComponent(tfTenDichVu))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTenLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String strDonGia = tfDonGia.getText();
        String tenDichVu = tfTenDichVu.getText();
        String tenLoaiDichVu = cbbTenLoaiDichVu.getSelectedItem().toString();
        if (!strDonGia.isEmpty() && !tenDichVu.isEmpty()) {
            int donGia = Integer.parseInt(strDonGia);
            if (donGia >= 1000) {
                boolean res = false;
                BDichVu bDichVu = new BDichVu();
                try {
                    res = bDichVu.themDichVu(tenLoaiDichVu, donGia, tenDichVu);
                } catch (SQLException ex) {
                    Logger.getLogger(Dialog_ThemDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (res) {
                    if(gRootType.equals("NV")){
                        this.fNhanVien.refreshPanelDichVu();
                    }else{
                        // frame quản lý điền vào đây
                    }
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, MyStrings.Add_Failed);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Service_Price);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Fill_Full);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tfDonGiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDonGiaKeyTyped
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfDonGia.getText().length() > 7) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDonGiaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbTenLoaiDichVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfDonGia;
    private javax.swing.JTextField tfTenDichVu;
    // End of variables declaration//GEN-END:variables
}
