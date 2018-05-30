package view;

import Business.BDichVu;
import Business.BLoaiPhongHat;
import Business.BPhongHat;
import common.MyStrings;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.LoaiPhongHat;

/**
 *
 * @author thanhtri
 */
public class Dialog_ThemPhongHat extends javax.swing.JDialog {

    Frame_NhanVien fNhanVien;

    public Dialog_ThemPhongHat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fNhanVien = (Frame_NhanVien) parent;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbLoaiPhong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbTinhTrang = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM PHÒNG HÁT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loại phòng");

        cbbLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbLoaiPhong.setForeground(new java.awt.Color(10, 125, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tình trạng");

        cbbTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbTinhTrang.setForeground(new java.awt.Color(10, 125, 39));
        cbbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn trống", "Đang sử dụng", "Đã đặt trước" }));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(10, 145, 39));
        btnThem.setText("THÊM");
        btnThem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cbbLoaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
        String loaiPhong = cbbLoaiPhong.getSelectedItem().toString();
        String tinhTrang = cbbTinhTrang.getSelectedItem().toString();

        boolean res = false;
        BPhongHat bPhongHat = new BPhongHat();
        try {
            res = bPhongHat.themPhongHatTheoTenLoaiPhong(loaiPhong, tinhTrang);
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_ThemPhongHat.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (res) {
            this.fNhanVien.refreshPanelPhongHat();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, MyStrings.Add_Failed);
        }
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbLoaiPhong;
    private javax.swing.JComboBox<String> cbbTinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
