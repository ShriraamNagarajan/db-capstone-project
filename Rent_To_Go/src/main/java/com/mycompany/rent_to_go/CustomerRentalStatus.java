/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CustomerRentalStatus extends javax.swing.JFrame {
    Car car;
    CarBooking booking;

    /**
     * Creates new form CustomerRentalStatus
     */
    public CustomerRentalStatus() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_11rsz_1rsz_check.png");
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/radio-button(1).png");
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblTick1.setIcon(image2);
        lblTick1.setText("");
        lblTick2.setIcon(image2);
        lblTick2.setText("");
        lblTick3.setIcon(image2);
        lblTick3.setText("");
        lblTick4.setIcon(image2);
        lblTick4.setText("");
    }
    
    public CustomerRentalStatus(CarBooking carbooking) throws IOException {
        this.car = carbooking.getCar();
        this.booking = carbooking;

        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_11rsz_1rsz_check.png");
        ImageIcon image3 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/radio-button(1).png");
       
        ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user.png");        
        ImageIcon image5 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_briefcase.png");        
        ImageIcon image6 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_steering-wheel.png");
        ImageIcon image7 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_speedometer.png");
        ImageIcon image8 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_cancel.png");
       
        
        
        
        
        
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblTick1.setIcon(image2);
        lblTick1.setText("");
        lblTick2.setIcon(image2);
        lblTick2.setText("");
        lblTick3.setIcon(image2);
        lblTick3.setText("");
        lblTick4.setIcon(image2);
        lblTick4.setText("");
        
        if(this.booking.getRentalStatus() == RentalStatus.checkedOut){
             lblTick1.setIcon(image2);
             lblTick2.setIcon(image3);
             lblTick3.setIcon(image3);
             lblTick4.setIcon(image3);
            
        }else if(this.booking.getRentalStatus()==RentalStatus.rejected){
             lblTick1.setIcon(image2);
             lblTick2.setIcon(image8);
             lblTick3.setIcon(image3);
             lblTick4.setIcon(image3);
        }
        
        
        
        else if(this.booking.getRentalStatus() == RentalStatus.approved){
             lblTick1.setIcon(image2);
             lblTick2.setIcon(image2);
             lblTick3.setIcon(image3);
             lblTick4.setIcon(image3);
            
        }else if(this.booking.getRentalStatus() == RentalStatus.pickedUp){
             lblTick1.setIcon(image2);
             lblTick2.setIcon(image2);
             lblTick3.setIcon(image2);
             lblTick4.setIcon(image3);
        }else{
             lblTick1.setIcon(image2);
             lblTick2.setIcon(image2);
             lblTick3.setIcon(image2);
             lblTick4.setIcon(image2);
        }
        
        
        
        
        lblLogo.setIcon(image);
        lblLogo.setText("");
        
        lblPassenger1.setIcon(image4);
        lblPassenger1.setText("");
        lblLuggage1.setIcon(image5);
        lblLuggage1.setText("");
        lblTransmission1.setText("");
        lblTransmission1.setIcon(image6);
        lblMileage1.setIcon(image7);
        lblMileage1.setText("");
        
                
        
        lblName1.setText(car.getMake() + " " + car.getModel());
        lblLugCap.setText(String.valueOf(car.getLuggageCapacity()) + "KG");
        lblPasCap.setText(String.valueOf(car.getPassengerCapacity()));
        lblTrans.setText(String.valueOf(car.getTransmission()));
        lblPrice.setText("RM" + String.valueOf(car.getPricePerHour()));
        lblTotal.setText("RM" + String.valueOf(this.booking.getTotalHours()*car.getPricePerHour()));
        lblPickupDatetime.setText(this.booking.getPickupDate() + " | " +  this.booking.getFormattedPickupTime());
        lblDropDatetime.setText(this.booking.getDropOffDate() + " | " +  this.booking.getFormattedDropOffTime());
        lblPickupLocation.setText(this.booking.getPickupLocation());
        lblDropOffLocation.setText(this.booking.getDropOffLocation());
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMyBookings = new javax.swing.JLabel();
        lblNotification = new javax.swing.JLabel();
        lblExplore = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblDropDatetime = new javax.swing.JLabel();
        lblDropOffLocation = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPickupDatetime = new javax.swing.JLabel();
        lblPickupLocation = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblPassenger1 = new javax.swing.JLabel();
        lblPasCap = new javax.swing.JLabel();
        lblTransmission1 = new javax.swing.JLabel();
        lblLuggage1 = new javax.swing.JLabel();
        lblLugCap = new javax.swing.JLabel();
        lblMileage1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblLugCap2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        lblTick1 = new javax.swing.JLabel();
        lblTick2 = new javax.swing.JLabel();
        lblTick3 = new javax.swing.JLabel();
        lblTick4 = new javax.swing.JLabel();
        lblTrans3 = new javax.swing.JLabel();
        lblTrans4 = new javax.swing.JLabel();
        lblTrans5 = new javax.swing.JLabel();
        lblTrans6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblLogo.setText("jLabel2");

        jPanel7.setBackground(new java.awt.Color(228, 231, 242));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jPanel6.setBackground(new java.awt.Color(228, 231, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        lblDropDatetime.setText("12/11/2022 12:30");

        lblDropOffLocation.setText("George Town Rental Centre");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Drop-Off");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblDropDatetime))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblDropOffLocation))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblDropDatetime)
                .addGap(33, 33, 33)
                .addComponent(lblDropOffLocation)
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(228, 231, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        lblPickupDatetime.setText("12/11/2022 10:30");

        lblPickupLocation.setText("George Town Rental Centre");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("Pick-Up");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblPickupLocation))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblPickupDatetime))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel14)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblPickupDatetime)
                .addGap(30, 30, 30)
                .addComponent(lblPickupLocation)
                .addGap(14, 14, 14))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel5.setBackground(new java.awt.Color(228, 231, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("Booking Summary");

        lblPassenger1.setText("jLabel4");

        lblPasCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPasCap.setText("5");

        lblTransmission1.setText("jLabel5");

        lblLuggage1.setText("jLabel6");

        lblLugCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugCap.setText("6KG");

        lblMileage1.setText("jLabel4");

        jLabel6.setText("Total Rent");

        lblLugCap2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugCap2.setText("Unlimited Mileage");

        lblTotal.setText("RM100");

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName1.setText("BMW-M135");

        lblPrice.setText("RM50");

        jLabel4.setText("Rent Per Hour");

        lblTrans.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans.setText("Manual");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTransmission1)
                        .addGap(18, 18, 18)
                        .addComponent(lblTrans))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblPassenger1)
                        .addGap(18, 18, 18)
                        .addComponent(lblPasCap)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMileage1)
                        .addGap(18, 18, 18)
                        .addComponent(lblLugCap2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblLuggage1)
                        .addGap(18, 18, 18)
                        .addComponent(lblLugCap)))
                .addGap(16, 16, 16))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrice))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)
                                .addComponent(lblTotal))
                            .addComponent(jLabel13)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblName1)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName1)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPasCap)
                            .addComponent(lblPassenger1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTransmission1)
                            .addComponent(lblTrans)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLuggage1)
                            .addComponent(lblLugCap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMileage1)
                            .addComponent(lblLugCap2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPrice))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTotal))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblTick1.setText("jLabel3");

        lblTick2.setText("jLabel3");

        lblTick3.setText("jLabel3");

        lblTick4.setText("jLabel3");

        lblTrans3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans3.setText("Checkout");

        lblTrans4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans4.setText("Approval");

        lblTrans5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans5.setText("Pickup");

        lblTrans6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrans6.setText("Drop-Off");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(lblExplore))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTrans3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTick1)
                                .addGap(9, 9, 9)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTrans4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblTick2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTick3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTrans5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProfile)
                                .addGap(33, 33, 33)
                                .addComponent(lblMyBookings)))
                        .addGap(35, 35, 35)
                        .addComponent(lblNotification)
                        .addGap(0, 202, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrans6)
                            .addComponent(lblTick4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMyBookings)
                            .addComponent(lblNotification)
                            .addComponent(lblProfile)
                            .addComponent(lblExplore))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTick2)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTrans4)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTick1)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTrans3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTick3)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTrans5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTick4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTrans6)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CustomerRentalStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRentalStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRentalStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRentalStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRentalStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDropDatetime;
    private javax.swing.JLabel lblDropOffLocation;
    private javax.swing.JLabel lblExplore;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLugCap;
    private javax.swing.JLabel lblLugCap2;
    private javax.swing.JLabel lblLuggage1;
    private javax.swing.JLabel lblMileage1;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JLabel lblPasCap;
    private javax.swing.JLabel lblPassenger1;
    private javax.swing.JLabel lblPickupDatetime;
    private javax.swing.JLabel lblPickupLocation;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblTick1;
    private javax.swing.JLabel lblTick2;
    private javax.swing.JLabel lblTick3;
    private javax.swing.JLabel lblTick4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblTrans3;
    private javax.swing.JLabel lblTrans4;
    private javax.swing.JLabel lblTrans5;
    private javax.swing.JLabel lblTrans6;
    private javax.swing.JLabel lblTransmission1;
    // End of variables declaration//GEN-END:variables
}
