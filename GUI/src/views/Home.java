package views;

import component.Alert;
import controller.MySql;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    MySql mySql = new MySql();
    public PreparedStatement ps;
    public ResultSet rs;

    String id,firstname,lastname,gender,phone,salary,address,image;
    
    public void getData() {
        DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel) searchTable.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);

        String sql = "SELECT * FROM `employee`";
        try {
            ps = mySql.connection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object row[] = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getFloat(7),
                    rs.getString(8),};
                model.addRow(row);
                model2.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void clear() {
        txtFirstName.setText("");
        txtLastName.setText("");
        cbGender.setSelectedIndex(0);
        txtAddress.setText("");
        txtSalary.setText("");
        txtPhone.setText("");
        txtImage.setText("");
        txtId.setText("");
        labImage.setIcon(null);
    }

    public Home() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_board = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        joinSearch = new com.k33ptoo.components.KButton();
        jLabel10 = new javax.swing.JLabel();
        joinHome = new com.k33ptoo.components.KButton();
        joinProfile1 = new com.k33ptoo.components.KButton();
        mainControll = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        labImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        home_imageBtn = new com.k33ptoo.components.KButton();
        home_addBtn = new com.k33ptoo.components.KButton();
        home_updateBtn = new com.k33ptoo.components.KButton();
        home_deleteBtn = new com.k33ptoo.components.KButton();
        txtFirstName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        panelSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        searchListData = new javax.swing.JComboBox<>();
        viewProfile = new com.k33ptoo.components.KButton();
        jlabel1 = new javax.swing.JLabel();
        panelProfile = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pf_address = new javax.swing.JLabel();
        pf_image = new javax.swing.JLabel();
        pf_firstName = new javax.swing.JLabel();
        pf_lastName = new javax.swing.JLabel();
        pf_gender = new javax.swing.JLabel();
        pf_phone = new javax.swing.JLabel();
        pf_salary = new javax.swing.JLabel();
        pf_pathIamge = new javax.swing.JLabel();
        pf_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dash_board.setBackground(new java.awt.Color(255, 255, 255));
        dash_board.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.png"))); // NOI18N
        dash_board.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 140));

        joinSearch.setText("Search");
        joinSearch.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        joinSearch.setkBorderRadius(40);
        joinSearch.setkEndColor(new java.awt.Color(204, 204, 204));
        joinSearch.setkForeGround(new java.awt.Color(0, 0, 0));
        joinSearch.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        joinSearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        joinSearch.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        joinSearch.setkStartColor(new java.awt.Color(204, 204, 204));
        joinSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinSearchActionPerformed(evt);
            }
        });
        dash_board.add(joinSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 40));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        jLabel10.setText("    Sign Out");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        dash_board.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 180, 40));

        joinHome.setText("Home");
        joinHome.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        joinHome.setkBorderRadius(40);
        joinHome.setkEndColor(new java.awt.Color(204, 204, 204));
        joinHome.setkForeGround(new java.awt.Color(0, 0, 0));
        joinHome.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        joinHome.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        joinHome.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        joinHome.setkStartColor(new java.awt.Color(204, 204, 204));
        joinHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinHomeActionPerformed(evt);
            }
        });
        dash_board.add(joinHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 40));

        joinProfile1.setText("Profile");
        joinProfile1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        joinProfile1.setkBorderRadius(40);
        joinProfile1.setkEndColor(new java.awt.Color(204, 204, 204));
        joinProfile1.setkForeGround(new java.awt.Color(0, 0, 0));
        joinProfile1.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        joinProfile1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        joinProfile1.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        joinProfile1.setkStartColor(new java.awt.Color(204, 204, 204));
        joinProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinProfile1ActionPerformed(evt);
            }
        });
        dash_board.add(joinProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 40));

        getContentPane().add(dash_board, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 610));

        mainControll.setBackground(new java.awt.Color(255, 255, 255));
        mainControll.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("First Name");
        panelHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 40));

        jlabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel.setText("Employee System");
        panelHome.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, 40));

        txtImage.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 0, 0));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Last Name");
        panelHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        txtLastName.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender");
        panelHome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 40));

        cbGender.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        panelHome.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, 40));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Salary");
        panelHome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 110, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Phone");
        panelHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 110, 40));

        txtSalary.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 210, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Address");
        panelHome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 110, 40));

        txtAddress.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 40));

        txtPhone.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 210, 40));

        labImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.add(labImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 130, 140));

        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Address", "Phone", "Salary", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(homeTable);
        if (homeTable.getColumnModel().getColumnCount() > 0) {
            homeTable.getColumnModel().getColumn(7).setResizable(false);
        }

        panelHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 820, 270));

        home_imageBtn.setText("Choose Image");
        home_imageBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        home_imageBtn.setkBorderRadius(40);
        home_imageBtn.setkEndColor(new java.awt.Color(204, 204, 204));
        home_imageBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        home_imageBtn.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        home_imageBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        home_imageBtn.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        home_imageBtn.setkStartColor(new java.awt.Color(204, 204, 204));
        home_imageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_imageBtnActionPerformed(evt);
            }
        });
        panelHome.add(home_imageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 190, 40));

        home_addBtn.setText("Add");
        home_addBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        home_addBtn.setkBorderRadius(40);
        home_addBtn.setkEndColor(new java.awt.Color(204, 204, 204));
        home_addBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        home_addBtn.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        home_addBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        home_addBtn.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        home_addBtn.setkStartColor(new java.awt.Color(204, 204, 204));
        home_addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_addBtnActionPerformed(evt);
            }
        });
        panelHome.add(home_addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 190, 40));

        home_updateBtn.setText("Update");
        home_updateBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        home_updateBtn.setkBorderRadius(40);
        home_updateBtn.setkEndColor(new java.awt.Color(204, 204, 204));
        home_updateBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        home_updateBtn.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        home_updateBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        home_updateBtn.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        home_updateBtn.setkStartColor(new java.awt.Color(204, 204, 204));
        home_updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_updateBtnActionPerformed(evt);
            }
        });
        panelHome.add(home_updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 190, 40));

        home_deleteBtn.setText("Delete");
        home_deleteBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        home_deleteBtn.setkBorderRadius(40);
        home_deleteBtn.setkEndColor(new java.awt.Color(204, 204, 204));
        home_deleteBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        home_deleteBtn.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        home_deleteBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        home_deleteBtn.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        home_deleteBtn.setkStartColor(new java.awt.Color(204, 204, 204));
        home_deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_deleteBtnActionPerformed(evt);
            }
        });
        panelHome.add(home_deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 190, 40));

        txtFirstName.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        panelHome.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 40));

        txtId.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        panelHome.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 0, 0));

        mainControll.add(panelHome, "card2");

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Address", "Phone", "Salary", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(7).setResizable(false);
        }

        panelSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 830, 370));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        panelSearch.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 410, 40));

        searchListData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "ID", "First Name", "Last Name", "Gender", "Address", "Phone", "Salary", "Image" }));
        searchListData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchListDataActionPerformed(evt);
            }
        });
        panelSearch.add(searchListData, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 130, 40));

        viewProfile.setText("View Profile");
        viewProfile.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        viewProfile.setkBorderRadius(40);
        viewProfile.setkEndColor(new java.awt.Color(204, 204, 204));
        viewProfile.setkForeGround(new java.awt.Color(0, 0, 0));
        viewProfile.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        viewProfile.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        viewProfile.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        viewProfile.setkStartColor(new java.awt.Color(204, 204, 204));
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });
        panelSearch.add(viewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 190, 40));

        jlabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(60, 63, 65));
        jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel1.setText("Search Employee");
        panelSearch.add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 840, 40));

        mainControll.add(panelSearch, "card3");

        panelProfile.setBackground(new java.awt.Color(255, 255, 255));
        panelProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 63, 65));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Employee Profile");
        panelProfile.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 870, 50));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 63, 65));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Address");
        panelProfile.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 110, 40));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 63, 65));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("First name");
        panelProfile.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 40));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 63, 65));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Last name");
        panelProfile.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 40));

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 63, 65));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Gender");
        panelProfile.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 110, 40));

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 63, 65));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Phone");
        panelProfile.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 110, 40));

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 63, 65));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Salary");
        panelProfile.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 110, 40));

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 63, 65));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Id");
        panelProfile.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 40));

        pf_address.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 390, 40));

        pf_image.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 170, 170));

        pf_firstName.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_firstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 390, 40));

        pf_lastName.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_lastName.setForeground(new java.awt.Color(0, 0, 0));
        pf_lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_lastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 390, 40));

        pf_gender.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 390, 40));

        pf_phone.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 390, 40));

        pf_salary.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_salary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_salary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProfile.add(pf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 390, 40));

        pf_pathIamge.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_pathIamge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_pathIamge.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        panelProfile.add(pf_pathIamge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 0, 0));

        pf_id.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        pf_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pf_id.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelProfile.add(pf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 390, 40));

        mainControll.add(panelProfile, "card4");

        getContentPane().add(mainControll, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 890, 610));

        setSize(new java.awt.Dimension(1100, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int pressed = Alert.showWaring("Warning Message", "Do you want to Sign Out");
        if (pressed == JOptionPane.YES_OPTION) {
            new sign_up();
            dispose();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void joinHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinHomeActionPerformed
        mainControll.removeAll();
        mainControll.add(panelHome);
        mainControll.repaint();
        mainControll.validate();
    }//GEN-LAST:event_joinHomeActionPerformed

    private void home_imageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_imageBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Set the file filter to show only image files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().toLowerCase().endsWith(".jpg")
                        || file.getName().toLowerCase().endsWith(".jpeg")
                        || file.getName().toLowerCase().endsWith(".gif")
                        || file.getName().toLowerCase().endsWith(".png")
                        || file.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Image files (*.jpg, *.jpeg, *.gif, *.png)";
            }
        });

        // Show the file chooser dialog
        int returnValue = fileChooser.showOpenDialog(null);

        // Check if the user selected a file
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txtImage.setText(selectedFile.getPath());
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image scalImage = icon.getImage().getScaledInstance(home_imageBtn.getWidth(), home_imageBtn.getHeight(), Image.SCALE_SMOOTH);
            labImage.setIcon(new ImageIcon(scalImage));
        }

    }//GEN-LAST:event_home_imageBtnActionPerformed

    private void joinSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinSearchActionPerformed
        mainControll.removeAll();
        mainControll.add(panelSearch);
        mainControll.repaint();
        mainControll.validate();
    }//GEN-LAST:event_joinSearchActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        pf_id.setText(id);
        pf_firstName.setText(firstname);
        pf_lastName.setText(lastname);
        pf_gender.setText(gender);
        pf_phone.setText(phone);
        pf_salary.setText(salary);
        pf_address.setText(address);
        pf_pathIamge.setText(image);
        ImageIcon icon = new ImageIcon(pf_pathIamge.getText());
        Image scalImage = icon.getImage().getScaledInstance(pf_image.getWidth(), pf_image.getHeight(), Image.SCALE_SMOOTH);
        pf_image.setIcon(new ImageIcon(scalImage));
        
        mainControll.removeAll();
        mainControll.add(panelProfile);
        mainControll.repaint();
        mainControll.validate();
    }//GEN-LAST:event_viewProfileActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getData();
    }//GEN-LAST:event_formWindowOpened

    private void home_addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_addBtnActionPerformed
        mySql.addEmployee(
                txtFirstName.getText(),
                txtLastName.getText(),
                cbGender.getSelectedItem().toString(),
                txtAddress.getText(),
                txtPhone.getText(),
                txtSalary.getText(),
                txtImage.getText()
        );
        getData();
        clear();
    }//GEN-LAST:event_home_addBtnActionPerformed

    private void home_updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_updateBtnActionPerformed
        mySql.updateEmpoyee(
                txtId.getText(),
                txtFirstName.getText(),
                txtLastName.getText(),
                cbGender.getSelectedItem().toString(),
                txtAddress.getText(),
                txtPhone.getText(),
                txtSalary.getText(),
                txtImage.getText()
        );
        getData();
        clear();
    }//GEN-LAST:event_home_updateBtnActionPerformed

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
        int row = homeTable.getSelectedRow();
        txtId.setText(model.getValueAt(row, 0).toString());
        txtFirstName.setText(model.getValueAt(row, 1).toString());
        txtLastName.setText(model.getValueAt(row, 2).toString());
        cbGender.setSelectedItem(model.getValueAt(row, 3));
        txtAddress.setText(model.getValueAt(row, 4).toString());
        txtPhone.setText(model.getValueAt(row, 5).toString());
        txtSalary.setText(model.getValueAt(row, 6).toString());
        txtImage.setText(model.getValueAt(row, 7).toString());
        ImageIcon icon = new ImageIcon(txtImage.getText());
        Image scalImage = icon.getImage().getScaledInstance(home_imageBtn.getWidth(), home_imageBtn.getHeight(), Image.SCALE_SMOOTH);
        labImage.setIcon(new ImageIcon(scalImage));
    }//GEN-LAST:event_homeTableMouseClicked

    private void home_deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_deleteBtnActionPerformed
        mySql.deleteEmployee(txtId.getText());
        getData();
        clear();
    }//GEN-LAST:event_home_deleteBtnActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String filterBy = searchListData.getSelectedItem().toString();
        if (filterBy.equalsIgnoreCase("first name")) {
            filterBy = "first_name";
        } else if (filterBy.equalsIgnoreCase("last name")) {
            filterBy = "last_name";
        }
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        model.setRowCount(0);
        try {
            String sql = "";
            if (filterBy.toLowerCase().equals("id")) {
                sql = "SELECT * FROM `employee` WHERE id=" + Integer.valueOf(txtSearch.getText());
            } else if (filterBy.toLowerCase().equals("salary")) {
                sql = "SELECT * FROM `employee` WHERE salary=" + Float.valueOf(txtSearch.getText());
            } else if (filterBy.toLowerCase().equals("all")) {
                sql = "SELECT * FROM `employee`";
            }  else {
                sql = "SELECT * FROM `employee` WHERE " + filterBy + " LIKE \"%" + txtSearch.getText() + "%\"";
            }
            ps = mySql.connection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Object row[] = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getFloat(7),
                    rs.getString(8),};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void searchListDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchListDataActionPerformed
        if(searchListData.getSelectedItem().equals("All")){
            getData();
        }
    }//GEN-LAST:event_searchListDataActionPerformed

    private void joinProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinProfile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinProfile1ActionPerformed

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        int row = searchTable.getSelectedRow();
        id        = model.getValueAt(row, 0).toString();
        firstname = model.getValueAt(row, 1).toString();
        lastname  = model.getValueAt(row, 2).toString();
        gender    = model.getValueAt(row, 3).toString();
        address   = model.getValueAt(row, 4).toString();
        phone     = model.getValueAt(row, 5).toString();
        salary    = model.getValueAt(row, 6).toString();
        image     = model.getValueAt(row, 7).toString();
    }//GEN-LAST:event_searchTableMouseClicked

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JPanel dash_board;
    private javax.swing.JTable homeTable;
    private com.k33ptoo.components.KButton home_addBtn;
    private com.k33ptoo.components.KButton home_deleteBtn;
    private com.k33ptoo.components.KButton home_imageBtn;
    private com.k33ptoo.components.KButton home_updateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private com.k33ptoo.components.KButton joinHome;
    private com.k33ptoo.components.KButton joinProfile1;
    private com.k33ptoo.components.KButton joinSearch;
    private javax.swing.JLabel labImage;
    private javax.swing.JPanel mainControll;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JLabel pf_address;
    private javax.swing.JLabel pf_firstName;
    private javax.swing.JLabel pf_gender;
    private javax.swing.JLabel pf_id;
    private javax.swing.JLabel pf_image;
    private javax.swing.JLabel pf_lastName;
    private javax.swing.JLabel pf_pathIamge;
    private javax.swing.JLabel pf_phone;
    private javax.swing.JLabel pf_salary;
    private javax.swing.JComboBox<String> searchListData;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private com.k33ptoo.components.KButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
