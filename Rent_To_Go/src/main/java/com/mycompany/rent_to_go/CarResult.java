/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CarResult extends javax.swing.JPanel {

    Car car;
    CarBooking booking;

    /**
     * Creates new form CarResult
     */
    public CarResult() {
        initComponents();
//        this.setBackground(Color(255, 255, 204));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/carLogo.png");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user.png");        
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_briefcase.png");        
        ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_steering-wheel.png");
        lblCarLogo.setText("");
        lblCarLogo.setIcon(image);
        lblPassenger.setIcon(image2);
        lblPassenger.setText("");
        lblLuggage.setIcon(image3);
        lblLuggage.setText("");
        lblTransmission.setText("");
        lblTransmission.setIcon(image4);
     
    }
    
    public CarResult(Car car, CarBooking carBooking){
    
        this.car = car;
        this.booking=carBooking;
        
        initComponents();
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/carLogo.png");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user.png");        
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_briefcase.png");        
        ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_steering-wheel.png");
        lblCarLogo.setText("");
        lblCarLogo.setIcon(image);
        lblPassenger.setIcon(image2);
        lblPassenger.setText("");
        lblLuggage.setIcon(image3);
        lblLuggage.setText("");
        lblTransmission.setText("");
        lblTransmission.setIcon(image4);
        
        lblName.setText(car.getMake() + " " + car.getModel());
        lblPrice.setText("RM" + String.valueOf(car.getPricePerHour()) + "/Per Hour");
        lblLugCap.setText(String.valueOf(car.getLuggageCapacity()) + "KG");
        lblPasCap.setText(String.valueOf(car.getPassengerCapacity()));
        lblTrans.setText(String.valueOf(car.getTransmission()));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblCarLogo = new javax.swing.JLabel();
        lblPassenger = new javax.swing.JLabel();
        lblTransmission = new javax.swing.JLabel();
        lblLuggage = new javax.swing.JLabel();
        lblPasCap = new javax.swing.JLabel();
        lblLugCap = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("BMW-M135");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice.setText("RM20 / Hour");

        lblCarLogo.setText("jLabel3");

        lblPassenger.setText("jLabel4");

        lblTransmission.setText("jLabel5");

        lblLuggage.setText("jLabel6");

        lblPasCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPasCap.setText("5");

        lblLugCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugCap.setText("5KG");

        lblTrans.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans.setText("Manual");

        btnDetail.setBackground(new java.awt.Color(255, 153, 255));
        btnDetail.setForeground(new java.awt.Color(0, 0, 102));
        btnDetail.setText("View Details");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblName)
                        .addGap(58, 58, 58)
                        .addComponent(lblPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblCarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassenger)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLuggage)
                            .addComponent(lblTransmission))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTrans)
                                    .addComponent(lblPasCap))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLugCap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnDetail)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(lblPrice)
                        .addComponent(lblPassenger))
                    .addComponent(lblPasCap, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLuggage)
                                    .addComponent(lblLugCap)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnDetail)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTransmission)
                            .addComponent(lblTrans))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        CustomerExploreProductDetail productDetail;
        try {
            this.booking.setCar(car);
            productDetail = new CustomerExploreProductDetail(booking);
            productDetail.setVisible(true);
            javax.swing.SwingUtilities.getWindowAncestor(CarResult.this).dispose();
        } catch (IOException ex) {
            Logger.getLogger(CarResult.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_btnDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JLabel lblCarLogo;
    private javax.swing.JLabel lblLugCap;
    private javax.swing.JLabel lblLuggage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPasCap;
    private javax.swing.JLabel lblPassenger;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblTransmission;
    // End of variables declaration//GEN-END:variables
}