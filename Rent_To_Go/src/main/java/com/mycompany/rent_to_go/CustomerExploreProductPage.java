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
public class CustomerExploreProductPage extends javax.swing.JFrame {
 
    CarBooking booking;
    ArrayList<Car> carList;
    /**
     * Creates new form CustomerExploreProductPage
     */
    public CustomerExploreProductPage() throws IOException{
   
        initComponents();       
    }

    
    
    public CustomerExploreProductPage(CarBooking carbooking) throws IOException{
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
 
        lblLogo.setIcon(image);
        lblLogo.setText("");
        
        this.booking = carbooking;
        lblPickup.setText(this.booking.getPickupLocation());
        lblDrop.setText(this.booking.getDropOffLocation());
        lblPickDate.setText(this.booking.getPickupDate());
        lblDropDate.setText(this.booking.getDropOffDate());
        lblPickup.setEditable(false);
        lblDrop.setEditable(false);
        lblPickDate.setEditable(false);
        lblDropDate.setEditable(false);
        
        
     

        carList = Car.getAvailableCars(this.booking.getPickupLocation(), this.booking.getPickupDate(), this.booking.getDropOffDate());
        addCars(carList);
        
    }


    private void addCars(ArrayList<Car> carList){
            
        int carLength = carList.size();
 
        if(carLength==0){
            backPanel.removeAll();
            backPanel.setLayout(new GridLayout(2, 1, 3, 3));
            backPanel.removeAll();
            NoResults resultPanel = new NoResults();
            backPanel.add(resultPanel);
            backPanel.revalidate();
            this.repaint();
        }
        else{
            
            if(carLength==1){
                carLength = 2;
            }
            backPanel.removeAll();
            backPanel.setLayout(new GridLayout(carLength, 1, 3, 3));
            backPanel.removeAll();
            CarResult resultPane1;
            for(Car car: carList){
                resultPane1 = new CarResult(car, booking);
                backPanel.add(resultPane1);
            
            }
            backPanel.revalidate();
            this.repaint();
        }

    }
    
    private ArrayList<Car> filterPrice(ArrayList<Car> carlist){
  
        int selection;
        if(chkPrice1.isSelected() && chkPrice2.isSelected() && chkPrice3.isSelected()){
            selection = 7;
            
        }else if(chkPrice1.isSelected() && chkPrice2.isSelected()) {
            selection = 4;
          
            
        }else if(chkPrice2.isSelected() && chkPrice3.isSelected()) {
            selection = 5;
            
        }else if(chkPrice1.isSelected() && chkPrice3.isSelected()){
            selection = 6;
            
        }else if(chkPrice1.isSelected()){
            selection = 1;
            
        }else if(chkPrice2.isSelected()){
            selection = 2;
            
        }else if(chkPrice3.isSelected()){
            selection = 3;
        }else{
            selection = 7;
        }
        
        return Car.filterPrice(carlist, selection);

        
    }
    
    private ArrayList<Car> filterPassenger(ArrayList<Car> carList){

        int selection;
        if(chkPas1.isSelected() && chkPas2.isSelected()){
            selection = 3;
            
        }else if(chkPas2.isSelected()){
            selection = 2;
        }else if(chkPas1.isSelected()){
            selection = 1;
        }else{
            selection = 3;
        }
        
        return Car.filterPassenger(carList, selection);
        

    }
    
    
    
    private ArrayList<Car> filterLuggage(ArrayList<Car> carList){

        int selection;
        if(chkLug1.isSelected() && chkLug2.isSelected()){
            selection = 3;
            
        }else if(chkLug2.isSelected()){
            selection = 2;
        }else if(chkLug1.isSelected()){
            selection = 1;
        }else{
            selection = 3;
        }
        return Car.filterLuggage(carList, selection);

    }
    
    
      
    
    private ArrayList<Car> filterTransmission(ArrayList<Car> carList){

        int selection;
        if(chkAuto.isSelected() && chkManual.isSelected()){
            selection = 3;
            
        }else if(chkManual.isSelected()){
            selection = 2;
        }else if(chkAuto.isSelected()){
            selection = 1;
        }else{
            selection = 3;
        }
        
        return Car.filterTransmission(carList, selection);

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
        jPanel1 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chkPrice1 = new javax.swing.JCheckBox();
        chkPas2 = new javax.swing.JCheckBox();
        chkPrice2 = new javax.swing.JCheckBox();
        chkPas1 = new javax.swing.JCheckBox();
        chkPrice3 = new javax.swing.JCheckBox();
        chkAuto = new javax.swing.JCheckBox();
        chkLug2 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        chkLug1 = new javax.swing.JCheckBox();
        chkManual = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPickDate = new javax.swing.JTextField();
        lblPickup = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDrop = new javax.swing.JTextField();
        lblDropDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        backPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(228, 231, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        btnSearch.setBackground(new java.awt.Color(255, 255, 204));
        btnSearch.setForeground(new java.awt.Color(0, 0, 153));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Passenger Capacity");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Price Per Hour");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Luggage Capacity");

        chkPrice1.setText("<RM50");

        chkPas2.setText(">=5");

        chkPrice2.setText("RM50-150");

        chkPas1.setText("<5");

        chkPrice3.setText(">RM150");
        chkPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPrice3ActionPerformed(evt);
            }
        });

        chkAuto.setText("Auto");

        chkLug2.setText(">10kg");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Transmission");

        chkLug1.setText("<=10kg");

        chkManual.setText("Manual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPas2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPas1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkLug2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkLug1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(chkManual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPrice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPrice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPrice3)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkLug1)
                .addGap(4, 4, 4)
                .addComponent(chkLug2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkManual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(228, 231, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Pick-Up Location");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Drop-Off Location");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Pick-Up Date");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Drop-Off Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPickup, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(lblPickDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDropDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPickDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDropDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(backPanel);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("Filter By");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(lblExplore)
                .addGap(40, 40, 40)
                .addComponent(lblProfile)
                .addGap(42, 42, 42)
                .addComponent(lblMyBookings)
                .addGap(30, 30, 30)
                .addComponent(lblNotification)
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMyBookings)
                            .addComponent(lblNotification)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProfile)
                            .addComponent(lblExplore))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerExploreMain mainPage = new CustomerExploreMain(booking.getCustomer());
        mainPage.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_btnBackActionPerformed

    private void chkPrice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPrice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPrice3ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> newCarList;
        newCarList = filterPrice(carList);
        newCarList = filterPassenger(newCarList);
        newCarList = filterLuggage(newCarList);
        newCarList = filterTransmission(newCarList);

        addCars(newCarList);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerExploreProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerExploreProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CustomerExploreProductPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerExploreProductPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkAuto;
    private javax.swing.JCheckBox chkLug1;
    private javax.swing.JCheckBox chkLug2;
    private javax.swing.JCheckBox chkManual;
    private javax.swing.JCheckBox chkPas1;
    private javax.swing.JCheckBox chkPas2;
    private javax.swing.JCheckBox chkPrice1;
    private javax.swing.JCheckBox chkPrice2;
    private javax.swing.JCheckBox chkPrice3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblDrop;
    private javax.swing.JTextField lblDropDate;
    private javax.swing.JLabel lblExplore;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JTextField lblPickDate;
    private javax.swing.JTextField lblPickup;
    private javax.swing.JLabel lblProfile;
    // End of variables declaration//GEN-END:variables
}
