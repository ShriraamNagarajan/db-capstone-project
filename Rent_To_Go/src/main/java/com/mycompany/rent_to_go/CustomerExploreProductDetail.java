/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CustomerExploreProductDetail extends javax.swing.JFrame {
    Car car;
    CarBooking booking;
    CarBooking previousBooking;
    /**
     * Creates new form CustomerExploreProductDetail
     */
    public CustomerExploreProductDetail() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/carLogo.png");
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user.png");        
        ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_briefcase.png");        
        ImageIcon image5 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_steering-wheel.png");
        ImageIcon image6 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_speedometer.png");
        
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCarLogo.setText("");
        lblCarLogo.setIcon(image2);
        lblPassenger.setIcon(image3);
        lblPassenger.setText("");
        lblLuggage.setIcon(image4);
        lblLuggage.setText("");
        lblTransmission.setText("");
        lblTransmission.setIcon(image5);
        lblMileage.setIcon(image6);
        lblMileage.setText("");

        //lblMileage.setText("A cool car manufactured in the year 1989" + "\n" + " by Honda with unlimited mileage.");
    }

    
    public CustomerExploreProductDetail(CarBooking carbooking) throws IOException{
        initComponents();
        this.previousBooking = carbooking;
        this.booking = carbooking;
        this.car = booking.getCar();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/carLogo.png");
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user.png");        
        ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_briefcase.png");        
        ImageIcon image5 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_steering-wheel.png");
        ImageIcon image6 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_speedometer.png");
        
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCarLogo.setText("");
        lblCarLogo.setIcon(image2);
        lblPassenger.setIcon(image3);
        lblPassenger.setText("");
        lblLuggage.setIcon(image4);
        lblLuggage.setText("");
        lblTransmission.setText("");
        lblTransmission.setIcon(image5);
        lblMileage.setIcon(image6);
        lblMileage.setText("");
        
        
        lblName.setText(car.getMake() + " " + car.getModel());
        lblLugCap.setText(String.valueOf(car.getLuggageCapacity()) + "KG");
        lblPasCap.setText(String.valueOf(car.getPassengerCapacity()));
        lblTrans.setText(String.valueOf(car.getTransmission()));
        lblPrice.setText("RM" + String.valueOf(car.getPricePerHour()));
        lblTotal.setText("RM" + String.valueOf(this.booking.getTotalHours()*car.getPricePerHour()));

        ArrayList<Review> reviewList = Review.getCarReviewList(car);
        addReviews(reviewList);

    }
    
    
    
    
    private void addReviews(ArrayList<Review> reviewList){
            
        
        if(reviewList.size()==0){
            backPanel.setLayout(new GridLayout(2, 2, 3, 3));
            backPanel.removeAll();
            NoResults resultPanel = new NoResults();
            backPanel.add(resultPanel);
            backPanel.validate();
        }
        else{
            int reviewLength = (int) (reviewList.size()/ (double)2);
            if(reviewLength==0){
                reviewLength = 2;
            }
            backPanel.setLayout(new GridLayout(reviewLength, 2, 3, 3));
            backPanel.removeAll();
            ReviewResult resultPane1;
            for(Review review: reviewList){
                resultPane1 = new ReviewResult(review);
                backPanel.add(resultPane1);
            
            }
            backPanel.validate();
        }

    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMyBookings = new javax.swing.JLabel();
        lblNotification = new javax.swing.JLabel();
        lblExplore = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBookNow = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCarLogo = new javax.swing.JLabel();
        lblPassenger = new javax.swing.JLabel();
        lblPasCap = new javax.swing.JLabel();
        lblLugCap = new javax.swing.JLabel();
        lblLuggage = new javax.swing.JLabel();
        lblTransmission = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblMileage = new javax.swing.JLabel();
        lblLugCap1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        backPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setText("jLabel2");

        btnBack.setBackground(new java.awt.Color(240, 240, 192));
        btnBack.setForeground(new java.awt.Color(0, 0, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMyBookings.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblMyBookings.setForeground(new java.awt.Color(0, 0, 102));
        lblMyBookings.setText("MyBookings");
        lblMyBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMyBookingsMouseReleased(evt);
            }
        });

        lblNotification.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(0, 0, 102));
        lblNotification.setText("Notifications");
        lblNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNotificationMouseReleased(evt);
            }
        });

        lblExplore.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblExplore.setForeground(new java.awt.Color(0, 0, 102));
        lblExplore.setText("Explore");
        lblExplore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExploreMouseReleased(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(0, 0, 102));
        lblProfile.setText("Profile");
        lblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProfileMouseReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(228, 231, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel3.setText("Rental Price Per Hour");

        jLabel5.setText("Total Rent");

        btnBookNow.setBackground(new java.awt.Color(67, 136, 204));
        btnBookNow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBookNow.setForeground(new java.awt.Color(255, 255, 0));
        btnBookNow.setText("Confirm Booking");
        btnBookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowActionPerformed(evt);
            }
        });

        lblPrice.setText("RM50");

        lblTotal.setText("RM100");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Car Price Breakdown");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice)
                    .addComponent(lblTotal))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBookNow, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPrice))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnBookNow)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(67, 136, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        lblCarLogo.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblCarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        lblPassenger.setText("jLabel4");

        lblPasCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPasCap.setText("5");

        lblLugCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugCap.setText("6KG");

        lblLuggage.setText("jLabel6");

        lblTransmission.setText("jLabel5");

        lblTrans.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans.setText("Manual");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("BMW-M135");

        lblMileage.setText("jLabel4");

        lblLugCap1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugCap1.setText("Unlimited Mileage");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(backPanel);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Customer Review");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(lblExplore)
                .addGap(40, 40, 40)
                .addComponent(lblProfile)
                .addGap(42, 42, 42)
                .addComponent(lblMyBookings)
                .addGap(30, 30, 30)
                .addComponent(lblNotification)
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTransmission)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTrans))
                                    .addComponent(lblPassenger))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMileage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLugCap1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLuggage)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblLugCap))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPasCap)
                                .addComponent(lblName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMyBookings)
                            .addComponent(lblNotification)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProfile)
                            .addComponent(lblExplore))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTrans)
                                .addComponent(lblMileage)
                                .addComponent(lblLugCap1)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPasCap)
                                .addComponent(lblLuggage)
                                .addComponent(lblLugCap)
                                .addComponent(lblPassenger))
                            .addGap(63, 63, 63)
                            .addComponent(lblTransmission)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerExploreProductPage productPage;
        try {
            productPage = new CustomerExploreProductPage(this.previousBooking);
            this.setVisible(false);
            productPage.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExploreProductDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowActionPerformed
        // TODO add your handling code here:
        CustomerExploreProductCheckout checkoutPage = new CustomerExploreProductCheckout(booking);
        checkoutPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBookNowActionPerformed

    private void lblExploreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExploreMouseReleased
        // TODO add your handling code here:
        CustomerExplore mainPage = new CustomerExplore(booking.getCustomer());
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_lblExploreMouseReleased

    private void lblProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseReleased
        // TODO add your handling code here:
        CustomerProfile profilePage = new CustomerProfile(booking.getCustomer());
        this.setVisible(false);
        profilePage.setVisible(true);
    }//GEN-LAST:event_lblProfileMouseReleased

    private void lblMyBookingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyBookingsMouseReleased
        // TODO add your handling code here:
        CustomerBooking bookingPage;
        try {
            bookingPage = new CustomerBooking(booking.getCustomer());
            this.setVisible(false);
            bookingPage.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExploreProductCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblMyBookingsMouseReleased

    private void lblNotificationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificationMouseReleased
        // TODO add your handling code here:
        CustomerNotifications notificationPage;
        try {
            notificationPage = new CustomerNotifications(booking.getCustomer());
            notificationPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExploreProductCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblNotificationMouseReleased

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
            java.util.logging.Logger.getLogger(CustomerExploreProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerExploreProductDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookNow;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarLogo;
    private javax.swing.JLabel lblExplore;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLugCap;
    private javax.swing.JLabel lblLugCap1;
    private javax.swing.JLabel lblLuggage;
    private javax.swing.JLabel lblMileage;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JLabel lblPasCap;
    private javax.swing.JLabel lblPassenger;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblTransmission;
    // End of variables declaration//GEN-END:variables
}
