package views;

import component.Alert;
import controller.MySql;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.UserModel;


public class login_form extends javax.swing.JFrame {
    
    MySql mySQL = new MySql();
    UserModel user ;
    String sql;
    ResultSet rs;
    PreparedStatement ps;
//    void getData(){
//        sql = "SELECT * FROM auth";
//        try {
//            ps = mySQL.connection().prepareStatement(sql);
//            rs = ps.executeQuery();
//            int i = 0;
//            while (rs.next()) {
//                String email    = rs.getString(2);
//                String password = rs.getString(3);
//                user.list.add(1,new UserModel(email, password));
//                i++;
//            }
//        } catch (SQLException e) {
//           JOptionPane.showMessageDialog(null, e.getSQLState());
//        }
//    }
    
    public login_form() {
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreateNewAcc = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSignIn = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email or user name");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 370, 40));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 370, 50));

        btnCreateNewAcc.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnCreateNewAcc.setForeground(new java.awt.Color(51, 153, 255));
        btnCreateNewAcc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCreateNewAcc.setText("Create new account ?");
        btnCreateNewAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateNewAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateNewAccMouseClicked(evt);
            }
        });
        jPanel1.add(btnCreateNewAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 170, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 370, 50));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 370, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("forgot password ?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 150, 30));

        btnSignIn.setText("Sign In");
        btnSignIn.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnSignIn.setkBorderRadius(60);
        btnSignIn.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignIn.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignIn.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignIn.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignIn.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 370, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6310507 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 699, 600));

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

        setSize(new java.awt.Dimension(1219, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateNewAccMouseClicked
        new sign_up();
        dispose();
    }//GEN-LAST:event_btnCreateNewAccMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        
        // if data empty
        if ( email.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your information");
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your email");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your password");
        } else {
            sql = "SELECT * FROM auth";
            try {
                ps = mySQL.connection().prepareStatement(sql);
                rs = ps.executeQuery();
                boolean isEmail = false;
                boolean isPassword = false;
                while (rs.next()) {
                   if(email.equals(rs.getString(2)) && password.equals(rs.getString(3))){
                       isEmail = true;
                       isPassword = true;
                   } else {
                       if (!email.equals(rs.getString(2)) && password.equals(rs.getString(3)) ) {
                           isEmail = false;
                           isPassword = true;
                       } else if (email.equals(rs.getString(2)) && !password.equals(rs.getString(3)) ) {
                           isPassword = false;
                           isEmail = true;
                       }
                   }
                }
                if (isPassword == true && isEmail == true) {
                    Alert.showSuccess("Auth", "Success");
                    new Home();
                    dispose();
                } else {
                    if (isPassword == true && isEmail == false) {
                        Alert.showError("Auth", "Wrong Email");
                    } else if (isPassword == false && isEmail == true) {
                        Alert.showError("Auth", "Wrong Password");
                    } else {
                        Alert.showError("Auth", "Wrong Email and Password");
                    }
                }
            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.getSQLState());
            }
        }
    }//GEN-LAST:event_btnSignInActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCreateNewAcc;
    private com.k33ptoo.components.KButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void print(ArrayList<UserModel> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
