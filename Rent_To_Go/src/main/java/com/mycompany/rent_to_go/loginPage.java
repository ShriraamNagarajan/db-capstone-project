/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rentToGoLogo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/renttogo_ad1.png");

        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblAd.setIcon(image2);
        lblAd.setText("");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        chkPassword = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        lblAd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 231, 242));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Password");

        btnLogin.setBackground(new java.awt.Color(240, 240, 192));
        btnLogin.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("Login");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        lblLogo.setText("jLabel2");

        jSeparator2.setBackground(new java.awt.Color(240, 240, 192));
        jSeparator2.setForeground(new java.awt.Color(240, 240, 192));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Are you a new customer?");

        btnRegister.setBackground(new java.awt.Color(240, 240, 192));
        btnRegister.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        btnRegister.setText("Register Now!");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        chkPassword.setText("Show Password");
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });
        chkPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chkPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(chkPassword))
                            .addComponent(btnRegister)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLogo)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPassword)
                .addGap(24, 24, 24)
                .addComponent(btnLogin)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        lblAd.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAd)
                .addGap(303, 303, 303)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if(checkEmptyFields(username, password)){
            try {
                loginUser(username, password);
            } catch (IOException ex) {
                Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter all the required details", "title", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private boolean checkEmptyFields(String username, String password){
        if(username.length()==0||password.length()==0){
            return false;
        }
        return true;
    }
    private void loginUser(String username, String password) throws IOException{
        
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

          String loginDateTime = dtf.format(LocalDateTime.now());
          
        User currentUser = User.verifyLogin(username, password);
        if(currentUser!=null){
            if(currentUser.getRole().equals("Customer")){
                Customer currentCustomer = Customer.getCustomer(currentUser);
                
                switch(currentCustomer.getApprovalStatus().toString()){
                    case "Pending" -> {
                        User.recordLoginActivity("Login failure by an unapproved customer with user id "+  currentUser.getUserId() +  " at " + loginDateTime);

                        JOptionPane.showMessageDialog(null, "Sorry, You have not been approved yet. Your details are still being reviewd by our admin.", "title", JOptionPane.PLAIN_MESSAGE);
                    }
                    case "Approved" -> {
                        User.recordLoginActivity("Successful login by customer with user id "+  currentUser.getUserId() +  " at " + loginDateTime);

                        JOptionPane.showMessageDialog(null, "Hi " + currentUser.getRole() + " " + currentUser.getName() + ". You have successfully logged in", "title", JOptionPane.PLAIN_MESSAGE);
                        CustomerExplore explorePage = new CustomerExplore(currentCustomer);
                        explorePage.setVisible(true);
                        this.setVisible(false);
                    }
                    
                    default -> {
                        User.recordLoginActivity("Login failure  by  a rejected customer with user id "+  currentUser.getUserId() +  " at " + loginDateTime);
                        
                        JOptionPane.showMessageDialog(null, "Sorry, Your application has been rejected by our admin. Please register again in order to use our system", "title", JOptionPane.PLAIN_MESSAGE);
                    }
                        
                }
                
                
                
               
                      
            }else{
                User.recordLoginActivity("Successful login by admin with user id "+  currentUser.getUserId() +  " at " + loginDateTime);

                Admin currentAdmin = Admin.getAdmin(currentUser.userId);
                JOptionPane.showMessageDialog(null, "Hi " + currentUser.getRole() + " " + currentUser.getName() + ". You have successfully logged in", "title", JOptionPane.PLAIN_MESSAGE);
                AdminDashboard adminDashboard = new AdminDashboard(currentAdmin);
                adminDashboard.setVisible(true);
                this.setVisible(false);
              
            }
        }else{
                User.recordLoginActivity("Login failure by a user with trial username: " + username + " password: " + password + " at " + loginDateTime);
                JOptionPane.showMessageDialog(null, "No Records Exist", "title", JOptionPane.PLAIN_MESSAGE);
            
        }


    }
    
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
          CustomerRegistrationForm custRegForm = new CustomerRegistrationForm();
          custRegForm.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void chkPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkPasswordKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_chkPasswordKeyReleased

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
        // TODO add your handling code here:
        if(chkPassword.isSelected()){
         
            txtPassword.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chkPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}