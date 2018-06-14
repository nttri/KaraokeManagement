/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.BKhuyenMai;
import DTO.KhuyenMai;
import common.MyStrings;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tu
 */
public class Dialog_SuaKhuyenMai extends javax.swing.JDialog {

    KhuyenMai gKhuyenMai;
    /**
     * Creates new form Dialog_SuaKhuyenMai
     */
    public Dialog_SuaKhuyenMai(java.awt.Frame parent, boolean modal, KhuyenMai khuyenMai) {
        super(parent, modal);
        initComponents();
        gKhuyenMai = khuyenMai;
        customInit();
    }

    void customInit(){
        tfMaKM.setText(gKhuyenMai.getMaKM());
        tfTenKM.setText(gKhuyenMai.getTenKM());
        jDC_ngayBD.setDate(gKhuyenMai.getThoiGianBD());
        jDC_ngayKT.setDate(gKhuyenMai.getThoiGianKT());
        tfGiaTriKM.setText(String.valueOf(gKhuyenMai.getGiaTriKM()));
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
        jLabel3 = new javax.swing.JLabel();
        tfMaKM = new javax.swing.JTextField();
        jDC_ngayBD = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTenKM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDC_ngayKT = new com.toedter.calendar.JDateChooser();
        btn_Luu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfGiaTriKM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 68, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SỬA KHUYẾN MÃI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã khuyến mãi");

        tfMaKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfMaKM.setForeground(new java.awt.Color(10, 145, 39));
        tfMaKM.setEnabled(false);

        jDC_ngayBD.setDateFormatString("dd/MM/yyyy");
        jDC_ngayBD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày bắt đầu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên sự kiện");

        tfTenKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTenKM.setForeground(new java.awt.Color(10, 145, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ngày kết thúc");

        jDC_ngayKT.setDateFormatString("dd/MM/yyyy");
        jDC_ngayKT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_Luu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Luu.setForeground(new java.awt.Color(0, 68, 80));
        btn_Luu.setText("LƯU");
        btn_Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LuuMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Giá trị");

        tfGiaTriKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfGiaTriKM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDC_ngayBD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfTenKM)
                                    .addComponent(jDC_ngayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDC_ngayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDC_ngayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGiaTriKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseClicked
        String maKM = tfMaKM.getText();
        String tenKM = tfTenKM.getText();
        Date ngayBD = jDC_ngayBD.getDate();
        Date ngayKT = jDC_ngayKT.getDate();
        String sGiaTriKM = tfGiaTriKM.getText();

        if (!maKM.isEmpty() && !tenKM.isEmpty() && ngayBD != null && ngayKT != null && !sGiaTriKM.isEmpty()){
            if (ngayKT.compareTo(ngayBD) == -1){
                JOptionPane.showMessageDialog(rootPane, MyStrings.DateEnd_Must_Greater_Than_DateStart);
            }
            int giaTriKM = 0;
            try {
                giaTriKM = Integer.parseInt(sGiaTriKM);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(rootPane, MyStrings.Invalid_Number_Input_String);
                return;
            }

            if (!isValidValueOfPromotion(giaTriKM)){
                JOptionPane.showMessageDialog(rootPane, MyStrings.Value_Promotion_Must_Higher);
                return;
            }
            String sNgayBD = new SimpleDateFormat("yyyy-MM-dd").format(jDC_ngayBD.getDate());
            String sNgayKT = new SimpleDateFormat("yyyy-MM-dd").format(jDC_ngayKT.getDate());

            BKhuyenMai bKhuyenMai = new BKhuyenMai();
            boolean res = false;
            try {
                res = bKhuyenMai.capNhatKhuyenMai(maKM, tenKM, giaTriKM, sNgayBD, sNgayKT);
            } catch (SQLException ex) {
                Logger.getLogger(Dialog_ThemKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!res) {
                JOptionPane.showMessageDialog(rootPane, MyStrings.Edit_Failed);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, MyStrings.Edit_Succeeded);
                this.dispose();
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, MyStrings.Please_Fill_Full);
        }
    }//GEN-LAST:event_btn_LuuMouseClicked

    boolean isValidValueOfPromotion(int giaTriKM){
        return (giaTriKM > 0 && giaTriKM % 10000 == 0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Luu;
    private com.toedter.calendar.JDateChooser jDC_ngayBD;
    private com.toedter.calendar.JDateChooser jDC_ngayKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfGiaTriKM;
    private javax.swing.JTextField tfMaKM;
    private javax.swing.JTextField tfTenKM;
    // End of variables declaration//GEN-END:variables
}