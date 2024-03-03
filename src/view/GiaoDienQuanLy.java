package view;

import connection.LoadData;
import controller.Controller;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import model.NhanVien;

/**
 *
 * @author TuMy
 */
public class GiaoDienQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienQuanLy
     */
    public GiaoDienQuanLy() {
        initComponents();

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

        thongTinTaiKhoan();
        jButton_KhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_ThongKe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_NhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jButton_HoaDon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jButton_ChuyenBay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_DuongBay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_SanBay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jButton_TimChuyen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jButton_MayBay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        jPanel_TaiKhoan = new javax.swing.JPanel();
        jLabel_XinChao = new javax.swing.JLabel();
        jLabel_PhanQuyen = new javax.swing.JLabel();
        jLabel_TenNguoiDung = new javax.swing.JLabel();
        jLabel_XemThongTinTaiKhoan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_DangXuat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_KhachHang = new javax.swing.JButton();
        jButton_NhanVien = new javax.swing.JButton();
        jButton_ThongKe = new javax.swing.JButton();
        jLabel_QuanLy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_HoaDon = new javax.swing.JButton();
        jButton_ChuyenBay = new javax.swing.JButton();
        jButton_SanBay = new javax.swing.JButton();
        jButton_DuongBay = new javax.swing.JButton();
        jButton_TimChuyen = new javax.swing.JButton();
        jButton_MayBay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý");

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

        jPanel_TaiKhoan.setBackground(new java.awt.Color(255, 0, 0));

        jLabel_XinChao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_XinChao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XinChao.setText("Xin chào,");

        jLabel_PhanQuyen.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_PhanQuyen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PhanQuyen.setText("Đối tượng");

        jLabel_TenNguoiDung.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_TenNguoiDung.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenNguoiDung.setText("Tên đối tượng");

        jLabel_XemThongTinTaiKhoan.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel_XemThongTinTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XemThongTinTaiKhoan.setText("<HTML><u>Xem thông tin tài khoản</u></HTML>");
        jLabel_XemThongTinTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_XemThongTinTaiKhoanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        jLabel_DangXuat.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel_DangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DangXuat.setText("<HTML><u>Đăng xuất</u></HTML>");
        jLabel_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DangXuatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TaiKhoanLayout = new javax.swing.GroupLayout(jPanel_TaiKhoan);
        jPanel_TaiKhoan.setLayout(jPanel_TaiKhoanLayout);
        jPanel_TaiKhoanLayout.setHorizontalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_XinChao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_PhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_TaiKhoanLayout.setVerticalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_XinChao)
                        .addComponent(jLabel_PhanQuyen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton_KhachHang.setBackground(new java.awt.Color(45, 52, 54));
        jButton_KhachHang.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_KhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jButton_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_customer_50px_2.png"))); // NOI18N
        jButton_KhachHang.setText("Khách Hàng");
        jButton_KhachHang.setBorderPainted(false);
        jButton_KhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_KhachHang.setMargin(new java.awt.Insets(14, 14, 14, 14));
        jButton_KhachHang.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KhachHangActionPerformed(evt);
            }
        });

        jButton_NhanVien.setBackground(new java.awt.Color(225, 112, 85));
        jButton_NhanVien.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_NhanVien.setForeground(new java.awt.Color(45, 52, 54));
        jButton_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_front_desk_52px.png"))); // NOI18N
        jButton_NhanVien.setText("Nhân Viên");
        jButton_NhanVien.setBorderPainted(false);
        jButton_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_NhanVien.setMargin(new java.awt.Insets(14, 14, 14, 14));
        jButton_NhanVien.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NhanVienActionPerformed(evt);
            }
        });

        jButton_ThongKe.setBackground(new java.awt.Color(255, 77, 77));
        jButton_ThongKe.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThongKe.setForeground(new java.awt.Color(45, 52, 54));
        jButton_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_statistics_52px.png"))); // NOI18N
        jButton_ThongKe.setText("Thống Kê");
        jButton_ThongKe.setBorderPainted(false);
        jButton_ThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ThongKe.setMargin(new java.awt.Insets(14, 14, 14, 14));
        jButton_ThongKe.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThongKeActionPerformed(evt);
            }
        });

        jLabel_QuanLy.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_QuanLy.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_QuanLy.setText("QUẢN LÝ");

        jButton_HoaDon.setBackground(new java.awt.Color(0, 204, 204));
        jButton_HoaDon.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_HoaDon.setForeground(new java.awt.Color(45, 52, 54));
        jButton_HoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_bill_52px.png"))); // NOI18N
        jButton_HoaDon.setText("Hóa Đơn");
        jButton_HoaDon.setBorderPainted(false);
        jButton_HoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_HoaDon.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HoaDonActionPerformed(evt);
            }
        });

        jButton_ChuyenBay.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ChuyenBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_take_off_52px.png"))); // NOI18N
        jButton_ChuyenBay.setText("Chuyến Bay");
        jButton_ChuyenBay.setBorderPainted(false);
        jButton_ChuyenBay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ChuyenBay.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_ChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChuyenBayActionPerformed(evt);
            }
        });

        jButton_SanBay.setBackground(new java.awt.Color(60, 60, 153));
        jButton_SanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SanBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SanBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_runway_52px.png"))); // NOI18N
        jButton_SanBay.setText("Sân Bay");
        jButton_SanBay.setBorderPainted(false);
        jButton_SanBay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_SanBay.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_SanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SanBayActionPerformed(evt);
            }
        });

        jButton_DuongBay.setBackground(new java.awt.Color(20, 0, 65));
        jButton_DuongBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_DuongBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DuongBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_paper_plane_52px.png"))); // NOI18N
        jButton_DuongBay.setText("Đường Bay");
        jButton_DuongBay.setBorderPainted(false);
        jButton_DuongBay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_DuongBay.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_DuongBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DuongBayActionPerformed(evt);
            }
        });

        jButton_TimChuyen.setBackground(new java.awt.Color(204, 204, 0));
        jButton_TimChuyen.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_TimChuyen.setForeground(new java.awt.Color(45, 52, 54));
        jButton_TimChuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_52px.png"))); // NOI18N
        jButton_TimChuyen.setText("Tìm Chuyến");
        jButton_TimChuyen.setBorderPainted(false);
        jButton_TimChuyen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_TimChuyen.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_TimChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimChuyenActionPerformed(evt);
            }
        });

        jButton_MayBay.setBackground(new java.awt.Color(0, 102, 51));
        jButton_MayBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_MayBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_mode_on_52px.png"))); // NOI18N
        jButton_MayBay.setText("Máy Bay");
        jButton_MayBay.setBorderPainted(false);
        jButton_MayBay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_MayBay.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_MayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MayBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_QuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_KhachHang)
                                    .addComponent(jButton_ChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton_DuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton_SanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_MayBay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton_TimChuyen)))))
                .addGap(61, 61, 61))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_ChuyenBay, jButton_DuongBay, jButton_HoaDon, jButton_KhachHang, jButton_MayBay, jButton_NhanVien, jButton_SanBay, jButton_ThongKe, jButton_TimChuyen});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel_QuanLy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_TimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_ChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_SanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_MayBay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_ChuyenBay, jButton_DuongBay, jButton_HoaDon, jButton_KhachHang, jButton_MayBay, jButton_NhanVien, jButton_SanBay, jButton_ThongKe, jButton_TimChuyen});

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
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void thongTinTaiKhoan() {
        //// Phần thông tin cơ bản , đăng xuất
        jLabel_XemThongTinTaiKhoan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel_DangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        new LoadData();
        jLabel_PhanQuyen.setText("quản lý");
        for (NhanVien nv : Controller.arrayListNhanVien) {
            if (nv.getSdtNhanVien().equals(Controller.tk.getSdt())) {
                jLabel_TenNguoiDung.setText(nv.getTenNhanVien());
                break;
            }
        }
    }
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KhachHangActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienQuanLyKhachHang().setVisible(true);
    }//GEN-LAST:event_jButton_KhachHangActionPerformed

    private void jButton_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThongKeActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienThongKe().setVisible(true);
    }//GEN-LAST:event_jButton_ThongKeActionPerformed

    private void jLabel_XemThongTinTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_XemThongTinTaiKhoanMousePressed
        // TODO add your handling code here:
        if (jLabel_PhanQuyen.getText().equals("nhân viên")) {
            this.dispose();
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("quản lý")) {
            this.dispose();
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("khách hàng")) {
            this.dispose();
            new GiaoDienThongTinKhachHang().setVisible(true);
        }
    }//GEN-LAST:event_jLabel_XemThongTinTaiKhoanMousePressed

    private void jLabel_DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangXuatMousePressed
        // TODO add your handling code here:
        dispose();
        new GiaoDienDangNhap().setVisible(true);
    }//GEN-LAST:event_jLabel_DangXuatMousePressed

    private void jButton_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NhanVienActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienQuanLyNhanVien().setVisible(true);
    }//GEN-LAST:event_jButton_NhanVienActionPerformed

    private void jButton_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HoaDonActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienThanhToanHoaDon().setVisible(true);
    }//GEN-LAST:event_jButton_HoaDonActionPerformed

    private void jButton_SanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SanBayActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienQuanLySanBay().setVisible(true);
    }//GEN-LAST:event_jButton_SanBayActionPerformed

    private void jButton_ChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChuyenBayActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienQuanLyChuyenBay().setVisible(true);
    }//GEN-LAST:event_jButton_ChuyenBayActionPerformed

    private void jButton_DuongBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DuongBayActionPerformed
        // TODO add your handling code here:
        dispose();
        new GiaoDienQuanLyDuongBay().setVisible(true);
    }//GEN-LAST:event_jButton_DuongBayActionPerformed

    private void jButton_TimChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimChuyenActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienTimChuyenBay().setVisible(true);
    }//GEN-LAST:event_jButton_TimChuyenActionPerformed

    private void jButton_MayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MayBayActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLyMayBay().setVisible(true);
    }//GEN-LAST:event_jButton_MayBayActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ChuyenBay;
    private javax.swing.JButton jButton_DuongBay;
    private javax.swing.JButton jButton_HoaDon;
    private javax.swing.JButton jButton_KhachHang;
    private javax.swing.JButton jButton_MayBay;
    private javax.swing.JButton jButton_NhanVien;
    private javax.swing.JButton jButton_SanBay;
    private javax.swing.JButton jButton_ThongKe;
    private javax.swing.JButton jButton_TimChuyen;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_DangXuat;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_PhanQuyen;
    private javax.swing.JLabel jLabel_QuanLy;
    private javax.swing.JLabel jLabel_TenNguoiDung;
    private javax.swing.JLabel jLabel_XemThongTinTaiKhoan;
    private javax.swing.JLabel jLabel_XinChao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_TaiKhoan;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
