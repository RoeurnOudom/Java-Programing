package views;

import java.sql.*;
import component.Alert;
import controller.MySql;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sign_up extends javax.swing.JFrame {

    MySql connector = new MySql();
    PreparedStatement ps;
    ResultSet rs;
    
    public sign_up() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnGoToLogin = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnSigUp = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        txtConPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnCreateNewAcc1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel2.setText("Email or user name");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 370, 40));

        txtEmail.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 370, 50));

        btnGoToLogin.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnGoToLogin.setForeground(new java.awt.Color(51, 153, 255));
        btnGoToLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGoToLogin.setText("Sign in");
        btnGoToLogin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnGoToLoginAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnGoToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoToLoginMouseClicked(evt);
            }
        });
        jPanel1.add(btnGoToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 170, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 370, 50));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 370, 40));

        btnSigUp.setText("Create");
        btnSigUp.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnSigUp.setkBorderRadius(60);
        btnSigUp.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSigUp.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSigUp.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSigUp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSigUp.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSigUp.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSigUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSigUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 380, 60));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setText("Re-Password");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 370, 40));

        txtConPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 370, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6310507 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 699, 600));

        btnCreateNewAcc1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnCreateNewAcc1.setForeground(new java.awt.Color(153, 153, 153));
        btnCreateNewAcc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCreateNewAcc1.setText("Do you have an account ?");
        btnCreateNewAcc1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnCreateNewAcc1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(btnCreateNewAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 170, 30));

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

        setSize(new java.awt.Dimension(1214, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToLoginAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnGoToLoginAncestorAdded

    }//GEN-LAST:event_btnGoToLoginAncestorAdded

    private void btnCreateNewAcc1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnCreateNewAcc1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateNewAcc1AncestorAdded

    private void btnSigUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigUpActionPerformed
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String conPassword = txtConPassword.getText();
        boolean check = true;
        if (email.isEmpty() || password.isEmpty() || conPassword.isEmpty()) {
            Alert.showError("Error Message", "Please enter your information");
        } else {
            if (!password.equals(conPassword)) {
                Alert.showError("Error Message", "Your Confirm Password is not Correct");
            } else {
                String sql = "INSERT INTO `auth`(`email`, `password`) VALUES (?,?)";
                String sqlSelect = "SELECT * FROM auth";
                try {
                    ps = connector.connection().prepareStatement(sqlSelect);
                    rs = ps.executeQuery();
                    while (rs.next()) {                        
                        if (email.equals(rs.getString("email"))) {
                            check = false;
                        }
                    }
                    
                    if (check == false) {
                        Alert.showError("Error Message", "Your Email has been used");
                    }else{
                        ps = connector.connection().prepareStatement(sql);
                        ps.setString(1, email);
                        ps.setString(2, password);
                        int i = ps.executeUpdate();
                        if (i > 0) {
                            Alert.showSuccess("Success Message", "Your Account are created");
                            new Home();
                        }else{
                            Alert.showSuccess("Error Message", "Your Account can not create");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(sign_up.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnSigUpActionPerformed

    private void btnGoToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoToLoginMouseClicked
        new login_form();
        dispose();
    }//GEN-LAST:event_btnGoToLoginMouseClicked

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCreateNewAcc1;
    private javax.swing.JLabel btnGoToLogin;
    private com.k33ptoo.components.KButton btnSigUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
