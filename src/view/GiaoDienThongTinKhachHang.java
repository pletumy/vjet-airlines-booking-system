package view;

import connection.LoadData;
import connection.UpdateData;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.KhachHang;
import model.TaiKhoan;

/**
 *
 * @author TuMy
 */
public class GiaoDienThongTinKhachHang extends javax.swing.JFrame {

    String tenKhachHang;

    public GiaoDienThongTinKhachHang() {
        initComponents();
        jButton_XemLichSu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_XacNhanSuaThongTin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_DoiMatKhau.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_ThoatGiaoDienThongTinKhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        new LoadData();
        for (KhachHang kh : controller.Controller.arrayListKhachHang) {
            if (kh.getSdtKhachHang().equals(controller.Controller.tk.getSdt())) {
                this.tenKhachHang = kh.getTenKhachHang();

                jTextField_TenKhachHang.setText(kh.getTenKhachHang());
                jTextField_TenDangNhap.setText(kh.getTenDangNhap());
                jTextField_SoDienThoai.setText(kh.getSdtKhachHang());
                jTextField_Email.setText(kh.getEmail());
                jTextField_CMND.setText(kh.getCmnd());
                jTextField_DiaChi.setText(kh.getDiaChi());
                jTextField_DiemTichLuy.setText(kh.getDiemTichLuy() + "");
            }
        }

        jTextField_CMND.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cmnd = jTextField_CMND.getText();
                jLabel_ThongBao.setText("");
                jLabel_CMND.setForeground(Color.white);
                jTextField_CMND.setForeground(Color.black);
                for (int i = 0; i < cmnd.length(); i++) {
                    if (cmnd.charAt(i) < '0' || cmnd.charAt(i) > '9') {
                        jLabel_ThongBao.setText("*CMND phải nhập số");
                        jLabel_CMND.setForeground(Color.yellow);
                        jTextField_CMND.setForeground(Color.yellow);
                        break;
                    }
                }
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jButton_XacNhanSuaThongTin = new javax.swing.JButton();
        jLabel_ThongTinKhachHang = new javax.swing.JLabel();
        jButton_ThoatGiaoDienThongTinKhachHang = new javax.swing.JButton();
        jLabel_TenKhachHang = new javax.swing.JLabel();
        jTextField_TenKhachHang = new javax.swing.JTextField();
        jLabel_SoDienThoai = new javax.swing.JLabel();
        jTextField_SoDienThoai = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_CMND = new javax.swing.JLabel();
        jTextField_CMND = new javax.swing.JTextField();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jTextField_DiemTichLuy = new javax.swing.JTextField();
        jLabel_DiemTichLuy = new javax.swing.JLabel();
        jLabel_TenDangNhap = new javax.swing.JLabel();
        jTextField_TenDangNhap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_DoiMatKhau = new javax.swing.JButton();
        jLabel_MatKhau = new javax.swing.JLabel();
        jButton_XemLichSu = new javax.swing.JButton();
        jLabel_ThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin khách hàng");

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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jButton_XacNhanSuaThongTin.setBackground(new java.awt.Color(0, 153, 0));
        jButton_XacNhanSuaThongTin.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XacNhanSuaThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XacNhanSuaThongTin.setText("Sửa thông tin");
        jButton_XacNhanSuaThongTin.setBorderPainted(false);
        jButton_XacNhanSuaThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_XacNhanSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanSuaThongTinActionPerformed(evt);
            }
        });

        jLabel_ThongTinKhachHang.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel_ThongTinKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThongTinKhachHang.setText("THÔNG TIN KHÁCH HÀNG");

        jButton_ThoatGiaoDienThongTinKhachHang.setBackground(new java.awt.Color(255, 0, 0));
        jButton_ThoatGiaoDienThongTinKhachHang.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThoatGiaoDienThongTinKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThoatGiaoDienThongTinKhachHang.setText("Quay lại");
        jButton_ThoatGiaoDienThongTinKhachHang.setBorderPainted(false);
        jButton_ThoatGiaoDienThongTinKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_ThoatGiaoDienThongTinKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatGiaoDienThongTinKhachHangActionPerformed(evt);
            }
        });

        jLabel_TenKhachHang.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenKhachHang.setText("Tên khách hàng");

        jTextField_TenKhachHang.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_SoDienThoai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_SoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoai.setText("Số điện thoại");

        jTextField_SoDienThoai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_SoDienThoai.setEnabled(false);

        jLabel_Email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email");

        jTextField_Email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_CMND.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_CMND.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CMND.setText("CMND");

        jTextField_CMND.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_DiaChi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_DiaChi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiaChi.setText("Địa chỉ");

        jTextField_DiaChi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jTextField_DiemTichLuy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_DiemTichLuy.setEnabled(false);

        jLabel_DiemTichLuy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_DiemTichLuy.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiemTichLuy.setText("Điểm tích lũy");

        jLabel_TenDangNhap.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenDangNhap.setText("Tên đăng nhập");

        jTextField_TenDangNhap.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_TenDangNhap.setEnabled(false);

        jButton_DoiMatKhau.setBackground(new java.awt.Color(255, 0, 0));
        jButton_DoiMatKhau.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton_DoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DoiMatKhau.setText("Đổi mật khẩu");
        jButton_DoiMatKhau.setBorderPainted(false);
        jButton_DoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DoiMatKhauActionPerformed(evt);
            }
        });

        jLabel_MatKhau.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_MatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MatKhau.setText("Mật khẩu");

        jButton_XemLichSu.setBackground(new java.awt.Color(153, 153, 153));
        jButton_XemLichSu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton_XemLichSu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XemLichSu.setText("Xem lịch sử");
        jButton_XemLichSu.setBorderPainted(false);
        jButton_XemLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XemLichSuActionPerformed(evt);
            }
        });

        jLabel_ThongBao.setForeground(java.awt.Color.yellow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_TenDangNhap)
                            .addComponent(jTextField_TenDangNhap)
                            .addComponent(jButton_ThoatGiaoDienThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_SoDienThoai)
                            .addComponent(jLabel_Email)
                            .addComponent(jTextField_SoDienThoai)
                            .addComponent(jTextField_Email)
                            .addComponent(jLabel_TenKhachHang)
                            .addComponent(jTextField_TenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_XacNhanSuaThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_DiaChi)
                            .addComponent(jTextField_DiemTichLuy)
                            .addComponent(jButton_DoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_DiemTichLuy)
                                    .addComponent(jLabel_DiaChi)
                                    .addComponent(jLabel_CMND)
                                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jLabel_MatKhau)
                                    .addComponent(jButton_XemLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel_ThongTinKhachHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_CMND, jTextField_Email, jTextField_SoDienThoai, jTextField_TenDangNhap, jTextField_TenKhachHang});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ThongTinKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TenKhachHang)
                    .addComponent(jLabel_MatKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DoiMatKhau))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel_DiaChi)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel_DiemTichLuy)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_DiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TenDangNhap)
                            .addComponent(jLabel_CMND))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel_SoDienThoai)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_XemLichSu)
                    .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_XacNhanSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ThoatGiaoDienThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThoatGiaoDienThongTinKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatGiaoDienThongTinKhachHangActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienTimChuyenBay().setVisible(true);
    }//GEN-LAST:event_jButton_ThoatGiaoDienThongTinKhachHangActionPerformed

    private void jButton_XacNhanSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanSuaThongTinActionPerformed
        // TODO add your handling code here:
        if (jTextField_CMND.getText().isEmpty()) {
            jLabel_ThongBao.setText("*CMND chưa được điền");
            return;
        } else {
            jLabel_ThongBao.setText("");
        }
        if (jTextField_TenKhachHang.getText().isEmpty()) {
            jLabel_ThongBao.setText("*Tên khách hàng chưa được điền");
            return;
        } else {
            jLabel_ThongBao.setText("");
        }
        if (jLabel_ThongBao.getText().isEmpty()) {
            int luaChon = JOptionPane.showConfirmDialog(this, "Xác nhân sửa thông tin cho khách hàng " + this.tenKhachHang, "Xác nhận sửa", JOptionPane.YES_NO_OPTION);

            if (luaChon == JOptionPane.YES_OPTION) {
                //gọi hàm sửa thông tin
                KhachHang khachHang = new KhachHang(jTextField_SoDienThoai.getText(), jTextField_TenKhachHang.getText(),
                        jTextField_Email.getText(), jTextField_DiaChi.getText(), jTextField_TenDangNhap.getText(),
                        jTextField_CMND.getText(), Integer.parseInt(jTextField_DiemTichLuy.getText()));

                if (connection.UpdateData.updateKhachHang(khachHang) == true) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa không thành công");
                }

            }
        }

    }//GEN-LAST:event_jButton_XacNhanSuaThongTinActionPerformed

    private void jButton_DoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DoiMatKhauActionPerformed
        // TODO add your handling code here:
        JTextField matKhauMoi = new JTextField();
        JTextField matKhauCu = new JPasswordField();
        Object[] message = {
            "Mật khẩu cũ:", matKhauCu,
            "Mật khẩu mới:", matKhauMoi
        };

        int luaChon = JOptionPane.showConfirmDialog(null, message, "Thay đổi mật khẩu", JOptionPane.OK_CANCEL_OPTION);
        if (luaChon == JOptionPane.OK_OPTION) {
            if (matKhauCu.getText().equals(controller.Controller.tk.getMatKhau())) {
                if (matKhauMoi.getText().isBlank()) {
                    JOptionPane.showMessageDialog(rootPane, "Không để trống mật khẩu mới");
                    return;
                }
                String matKhauMoi_String = matKhauMoi.getText();
                TaiKhoan taiKhoan = new TaiKhoan(controller.Controller.tk.getTenDangNhap(), matKhauMoi_String,
                        controller.Controller.tk.getLoaiTaiKhoan(), controller.Controller.tk.getSdt());
                if (UpdateData.updateTaiKhoan(taiKhoan) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công");
                    controller.Controller.tk.setMatKhau(matKhauMoi_String);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu cũ không khớp");
            }
        }
    }//GEN-LAST:event_jButton_DoiMatKhauActionPerformed

    private void jButton_XemLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XemLichSuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienLichSuHoaDon().setVisible(true);
    }//GEN-LAST:event_jButton_XemLichSuActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThongTinKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DoiMatKhau;
    private javax.swing.JButton jButton_ThoatGiaoDienThongTinKhachHang;
    private javax.swing.JButton jButton_XacNhanSuaThongTin;
    private javax.swing.JButton jButton_XemLichSu;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_CMND;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_DiemTichLuy;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_SoDienThoai;
    private javax.swing.JLabel jLabel_TenDangNhap;
    private javax.swing.JLabel jLabel_TenKhachHang;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JLabel jLabel_ThongTinKhachHang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_CMND;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_DiemTichLuy;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_SoDienThoai;
    private javax.swing.JTextField jTextField_TenDangNhap;
    private javax.swing.JTextField jTextField_TenKhachHang;
    // End of variables declaration//GEN-END:variables
}
