/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CustomerExplore extends javax.swing.JFrame {
    Customer customer;

    /**
     * Creates new form CustomerExplore
     */
    public CustomerExplore() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_family-car.png");

        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCar.setIcon(image2);
        lblCar.setText("");
    }

    
    public CustomerExplore(Customer customer){
        initComponents();
        this.customer = customer;
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_family-car.png");

        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCar.setIcon(image2);
        lblCar.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblNotification = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCar = new javax.swing.JLabel();
        lblMyBookings = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel3.setText("Let's Rent A Car");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNotification.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(0, 0, 102));
        lblNotification.setText("Notifications");
        lblNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNotificationMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Explore");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Profile");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });

        lblCar.setText("jLabel2");

        lblMyBookings.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblMyBookings.setForeground(new java.awt.Color(0, 0, 102));
        lblMyBookings.setText("MyBookings");
        lblMyBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBookingsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMyBookingsMouseReleased(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(240, 240, 192));
        btnLogOut.setForeground(new java.awt.Color(0, 0, 102));
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel4.setText("Let's Rent A Car");

        lblLogo.setText("jLabel2");

        btnBook.setBackground(new java.awt.Color(240, 240, 192));
        btnBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBook.setForeground(new java.awt.Color(0, 0, 102));
        btnBook.setText("Book a Car");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Rent It Out At the Cheapest Rates");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(lblMyBookings)
                        .addGap(30, 30, 30)
                        .addComponent(lblNotification)))
                .addGap(32, 32, 32)
                .addComponent(btnLogOut)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(285, 285, 285))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyBookings)
                    .addComponent(lblNotification)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblCar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(444, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNotificationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificationMouseReleased
        // TODO add your handling code here:
        CustomerNotifications notificationPage;
        try {
            notificationPage = new CustomerNotifications(customer);
            notificationPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExplore.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_lblNotificationMouseReleased

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        // TODO add your handling code here:
        CustomerProfile profilePage = new CustomerProfile(customer);
        profilePage.setVisible(true);
        this.setVisible(false);
  
    }//GEN-LAST:event_jLabel9MouseReleased

    private void lblMyBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyBookingsMouseClicked

    }//GEN-LAST:event_lblMyBookingsMouseClicked

    private void lblMyBookingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyBookingsMouseReleased
        // TODO add your handling code here:
        CustomerBooking bookingPage;
        try {
            bookingPage = new CustomerBooking(customer);
            bookingPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExplore.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_lblMyBookingsMouseReleased

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        loginPage login = new loginPage();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        CustomerExploreMain mainPage = new CustomerExploreMain(customer);
        mainPage.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBookActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerExplore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerExplore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerExplore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerExplore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerExplore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblNotification;
    // End of variables declaration//GEN-END:variables
}
