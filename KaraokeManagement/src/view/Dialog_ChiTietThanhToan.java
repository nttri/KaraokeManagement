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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 125, 39));
        jPanel1.setLayout(null);

        lblMaDon.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaDon.setForeground(new java.awt.Color(204, 204, 204));
        lblMaDon.setText("Mã đơn thanh toán:");
        jPanel1.add(lblMaDon);
        lblMaDon.setBounds(20, 34, 300, 27);

        lblMaPhong.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblMaPhong.setForeground(new java.awt.Color(204, 204, 204));
        lblMaPhong.setText("Mã phòng:");
        jPanel1.add(lblMaPhong);
        lblMaPhong.setBounds(20, 94, 180, 27);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dịch vụ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 32, 99, 32);

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
        jScrollPane1.setBounds(400, 80, 470, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tổng tiền dịch vụ (vnd)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 320, 220, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("000000000");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 320, 220, 29);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaDon;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JTable tbDichVuSuDung;
    // End of variables declaration//GEN-END:variables
}
