package view;

import connection.InsertData;
import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import model.SanBay;

/**
 *
 * @author TuMy
 */
public class GiaoDienThemSanBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienThemSanBay
     */
    public GiaoDienThemSanBay() {
        initComponents();
        jButton_QuayLai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_ThemSanBay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        new LoadData();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
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
        jLabel_IconMayBay = new javax.swing.JLabel();
        jLabel_HPT = new javax.swing.JLabel();
        jLabel_AirLines = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel_ThemSanBay = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_ThemSanBay = new javax.swing.JButton();
        jTextField_MaSanBay = new javax.swing.JTextField();
        jLabel_MaSanBay = new javax.swing.JLabel();
        jLabel_TenSanBay = new javax.swing.JLabel();
        jTextField_TenSanBay = new javax.swing.JTextField();
        jButton_QuayLai = new javax.swing.JButton();
        jLabel_ThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm sân bay");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel_IconMayBay.setForeground(new java.awt.Color(204, 255, 255));
        jLabel_IconMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/main_logo.png"))); // NOI18N

        jLabel_HPT.setFont(new java.awt.Font("Roboto Mono Light", 1, 48)); // NOI18N
        jLabel_HPT.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HPT.setText("VJET");

        jLabel_AirLines.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel_AirLines.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AirLines.setText("AIRLINES");

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel_ThemSanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel_ThemSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThemSanBay.setText("THÊM SÂN BAY");

        jButton_ThemSanBay.setBackground(new java.awt.Color(0, 153, 0));
        jButton_ThemSanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemSanBay.setText("Thêm Sân Bay");
        jButton_ThemSanBay.setBorderPainted(false);
        jButton_ThemSanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemSanBayActionPerformed(evt);
            }
        });

        jTextField_MaSanBay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MaSanBayKeyReleased(evt);
            }
        });

        jLabel_MaSanBay.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_MaSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MaSanBay.setText("Mã Sân Bay");

        jLabel_TenSanBay.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_TenSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenSanBay.setText("Tên Sân Bay");

        jTextField_TenSanBay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_QuayLai.setBackground(new java.awt.Color(255, 0, 0));
        jButton_QuayLai.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_QuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai.setText("Quay Lại");
        jButton_QuayLai.setBorderPainted(false);
        jButton_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLaiActionPerformed(evt);
            }
        });

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ThongBao.setForeground(java.awt.Color.yellow);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel_MaSanBay)
                        .addGap(569, 569, 569))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_MaSanBay)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_ThemSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField_TenSanBay, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                            .addComponent(jLabel_ThongBao))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_TenSanBay))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel_ThemSanBay)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel_ThongBao, jTextField_TenSanBay});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThemSanBay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_MaSanBay)
                .addGap(9, 9, 9)
                .addComponent(jTextField_MaSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_TenSanBay)
                .addGap(9, 9, 9)
                .addComponent(jTextField_TenSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ThemSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_IconMayBay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_HPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLySanBay().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

    private void jButton_ThemSanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemSanBayActionPerformed
        if (jTextField_MaSanBay.getText().isEmpty()) {
            jLabel_ThongBao.setText("*Mã sân bay chưa được điền");
            jLabel_MaSanBay.setForeground(Color.yellow);
            return;
        } else {
            jLabel_ThongBao.setText("");
            jLabel_MaSanBay.setForeground(Color.white);
        }
        if (jTextField_MaSanBay.getText().length() != 3) {
            jLabel_ThongBao.setText("*Mã sân bay chỉ chứa đúng 3 ký tự");
            jLabel_MaSanBay.setForeground(Color.yellow);
            return;
        } else {
            jLabel_ThongBao.setText("");
            jLabel_MaSanBay.setForeground(Color.white);
        }
        for (int i = 0; i < 3; i++) {
            char ch = jTextField_MaSanBay.getText().charAt(i);
            if (ch < 'A' || ch > 'Z') {
                jLabel_ThongBao.setText("Mã sân bay chỉ chứa chữ cái từ A-Z");
                jLabel_MaSanBay.setForeground(Color.yellow);
                return;
            }
        }
        jLabel_ThongBao.setText("");
        jLabel_MaSanBay.setForeground(Color.white);
        for (SanBay sb : Controller.arrayListSanBay) {
            if (sb.getMaSanBay().equals(jTextField_MaSanBay.getText())) {
                jLabel_ThongBao.setText("Mã sân bay đã tồn tại trong danh sách");
                jLabel_MaSanBay.setForeground(Color.yellow);
                return;
            }
        }
        jLabel_ThongBao.setText("");
        jLabel_MaSanBay.setForeground(Color.white);

        if (jTextField_TenSanBay.getText().isEmpty()) {
            jLabel_ThongBao.setText("*Tên sân bay chưa được điền");
            jLabel_TenSanBay.setForeground(Color.yellow);
            return;
        } else {
            jLabel_ThongBao.setText("");
            jLabel_TenSanBay.setForeground(Color.white);
        }

        SanBay sanBay = new SanBay(
                jTextField_MaSanBay.getText(),
                jTextField_TenSanBay.getText());
        Controller.arrayListSanBay.add(sanBay);
        InsertData.insertSanBay(sanBay);
        jLabel_ThongBao.setText("Thêm sân bay thành công");


    }//GEN-LAST:event_jButton_ThemSanBayActionPerformed

    private void jTextField_MaSanBayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MaSanBayKeyReleased
        jTextField_MaSanBay.setText(jTextField_MaSanBay.getText().toUpperCase());
    }//GEN-LAST:event_jTextField_MaSanBayKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThemSanBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai;
    private javax.swing.JButton jButton_ThemSanBay;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MaSanBay;
    private javax.swing.JLabel jLabel_TenSanBay;
    private javax.swing.JLabel jLabel_ThemSanBay;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_MaSanBay;
    private javax.swing.JTextField jTextField_TenSanBay;
    // End of variables declaration//GEN-END:variables
}
