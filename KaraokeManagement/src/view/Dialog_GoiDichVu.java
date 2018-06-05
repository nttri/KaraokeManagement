package view;

import Business.BDichVu;
import Business.BDonThanhToan;
import Business.BLoaiDichVu;
import common.MyStrings;
import common.NVColor;
import common.QLColor;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.DichVu;
import model.DonThanhToan;
import model.LoaiDichVu;

/**
 *
 * @author thanhtri
 */
public class Dialog_GoiDichVu extends javax.swing.JDialog {

    String gRootType;
    Frame_NhanVien fNhanVien;
    Frame_QuanLy fQuanLy;
    DefaultTableModel m_TableDV;

    public Dialog_GoiDichVu(java.awt.Frame parent, boolean modal, String fromFrameType) {
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
        m_TableDV = (DefaultTableModel) tbDichVu.getModel();
        customInit();
    }

    void customInit() {
        tbDichVu.setRowHeight(28);
        int maLoaiDV = 0;

        // đổ dữ liệu những đơn đặt phòng đang thật sự sử dụng
        BDonThanhToan bDonDatPhong = new BDonThanhToan();
        ArrayList<DonThanhToan> arrDon = null;

        try {
            arrDon = bDonDatPhong.layTatCaDonThanhToan();
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_GoiDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < arrDon.size(); i++) {
            Date bd = arrDon.get(i).getThoiGianBatDau();
            String ngayBD = bd.toString();
            LocalDateTime datetime = LocalDateTime.now();
            String sDay = datetime.toString().substring(0, 10);
            String sTime = datetime.toString().substring(11, 21);
            String sTimeNow = sDay + " " + sTime;
            
            if (arrDon.get(i).getTinhTrang().equals(MyStrings.Bill_Is_Using) && sTimeNow.compareTo(ngayBD) > 0) {
                cbbMaDon.addItem(Integer.toString(arrDon.get(i).getMaDon()));
            }
        }
        
        // đổ dữ liệu loại dịch vụ lên combobox
        BLoaiDichVu bLoaiDichVu = new BLoaiDichVu();
        BDichVu bDichVu = new BDichVu();
        ArrayList<DichVu> arrDV = null;
        ArrayList<LoaiDichVu> arrLDV = null;

        try {
            arrLDV = bLoaiDichVu.layThongTinTatCaLoaiDichVu();
            arrDV = bDichVu.layThongTinTatCaDichVu();
            maLoaiDV = arrLDV.get(0).getMaLoaiDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_GoiDichVu.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        for (int i = 0; i < arrLDV.size(); i++) {
            cbbLoaiDichVu.addItem(arrLDV.get(i).getTenLoaiDichVu());
        }

        // đổ dữ liệu các dịch vụ lên table
        refreshTable();
        for (int i = 0; i < arrDV.size(); i++) {
            if (arrDV.get(i).getMaLoaiDichVu() == maLoaiDV) {
                m_TableDV.addRow(new Object[]{
                    arrDV.get(i).getMaDichVu(),
                    arrDV.get(i).getTenDichVu(),
                    arrDV.get(i).getDonGia()
                });
            }
        }

    }
    
    void refreshTable(){
        for (int i = m_TableDV.getRowCount() - 1; i >= 0; i--) {
            m_TableDV.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbMaDon = new javax.swing.JComboBox<>();
        tfSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDichVu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbbLoaiDichVu = new javax.swing.JComboBox<>();
        btnDat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐẶT DỊCH VỤ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã đơn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Số lượng");

        cbbMaDon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSoLuongKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dịch vụ");

        tbDichVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbDichVu);
        if (tbDichVu.getColumnModel().getColumnCount() > 0) {
            tbDichVu.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbDichVu.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbDichVu.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loại dịch vụ");

        cbbLoaiDichVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbLoaiDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiDichVuActionPerformed(evt);
            }
        });

        btnDat.setBackground(new java.awt.Color(153, 0, 153));
        btnDat.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDat.setForeground(new java.awt.Color(255, 255, 255));
        btnDat.setText("ĐẶT");
        btnDat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbbMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbbLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSoLuong))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnDat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbbMaDon)
                        .addComponent(tfSoLuong))
                    .addComponent(cbbLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void cbbLoaiDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiDichVuActionPerformed
        refreshTable();
        String tenLoaiDV = cbbLoaiDichVu.getSelectedItem().toString();
        BLoaiDichVu bLoaiDichVu = new BLoaiDichVu();
        BDichVu bDichVu = new BDichVu();
        LoaiDichVu loaiDV = new LoaiDichVu();
        ArrayList<DichVu> arrDV = null;
        
        try {
            loaiDV =  bLoaiDichVu.layThongTinLoaiDichVuTheoTen(tenLoaiDV);
            arrDV = bDichVu.layThongTinTatCaDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(Dialog_GoiDichVu.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        for (int i = 0; i < arrDV.size(); i++) {
            if (arrDV.get(i).getMaLoaiDichVu() == loaiDV.getMaLoaiDichVu()) {
                m_TableDV.addRow(new Object[]{
                    arrDV.get(i).getMaDichVu(),
                    arrDV.get(i).getTenDichVu(),
                    arrDV.get(i).getDonGia()
                });
            }
        }
    }//GEN-LAST:event_cbbLoaiDichVuActionPerformed

    private void tfSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSoLuongKeyTyped
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfSoLuong.getText().length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_tfSoLuongKeyTyped

    private void btnDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDat;
    private javax.swing.JComboBox<String> cbbLoaiDichVu;
    private javax.swing.JComboBox<String> cbbMaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDichVu;
    private javax.swing.JTextField tfSoLuong;
    // End of variables declaration//GEN-END:variables
}
