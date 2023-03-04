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
public class AdminReportsDashboard extends javax.swing.JFrame {
    Admin admin;

    /**
     * Creates new form AdminReportsDashboard
     */
    public AdminReportsDashboard() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2= new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_11rsz_baby-car.png");
        ImageIcon image3= new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_notes.png");
       ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_profits.png");
     
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCarStats.setIcon(image2);
        lblCarStats.setText("");
        lblRecords.setIcon(image3);
        lblRecords.setText("");
        lblIncomeStats.setIcon(image4);
        lblIncomeStats.setText("");
        
    }
    
    public AdminReportsDashboard(Admin admin){
        this.admin = admin;
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        ImageIcon image2= new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_11rsz_baby-car.png");
        ImageIcon image3= new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_notes.png");
       ImageIcon image4 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_profits.png");
     
        lblLogo.setIcon(image);
        lblLogo.setText("");
        lblCarStats.setIcon(image2);
        lblCarStats.setText("");
        lblRecords.setIcon(image3);
        lblRecords.setText("");
        lblIncomeStats.setIcon(image4);
        lblIncomeStats.setText("");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblRecords = new javax.swing.JLabel();
        btnRecords = new javax.swing.JButton();
        lblCarStats = new javax.swing.JLabel();
        btnCarStats = new javax.swing.JButton();
        btnIncStats = new javax.swing.JButton();
        lblIncomeStats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setBackground(new java.awt.Color(240, 240, 192));
        btnBack.setForeground(new java.awt.Color(0, 0, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblLogo.setText("jLabel2");

        lblRecords.setText("jLabel1");

        btnRecords.setBackground(new java.awt.Color(255, 255, 204));
        btnRecords.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnRecords.setText("Monthly Rental Records");
        btnRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordsActionPerformed(evt);
            }
        });

        lblCarStats.setText("jLabel1");

        btnCarStats.setBackground(new java.awt.Color(255, 255, 204));
        btnCarStats.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnCarStats.setText("Monthly Car Statistics");
        btnCarStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarStatsActionPerformed(evt);
            }
        });

        btnIncStats.setBackground(new java.awt.Color(255, 255, 204));
        btnIncStats.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnIncStats.setText("Monthly Income Statistics");
        btnIncStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncStatsActionPerformed(evt);
            }
        });

        lblIncomeStats.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblCarStats))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnCarStats)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIncomeStats)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIncStats)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(lblRecords))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnRecords)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblRecords)
                .addGap(18, 18, 18)
                .addComponent(btnRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCarStats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarStats, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIncomeStats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncStats, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminDashboard dashboardPage = new AdminDashboard(admin);
        dashboardPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordsActionPerformed
        // TODO add your handling code here:
        MonthlyRentalRecords rentalRecord;
        try {
            rentalRecord = new MonthlyRentalRecords(admin);
            rentalRecord.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminReportsDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_btnRecordsActionPerformed

    private void btnCarStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarStatsActionPerformed
        SummaryStatistics summaryStat;
        try {
            summaryStat = new SummaryStatistics(admin);
            summaryStat.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminReportsDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
        
    }//GEN-LAST:event_btnCarStatsActionPerformed

    private void btnIncStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncStatsActionPerformed
        try {
            // TODO add your handling code here:
            IncomeReport incomePage = new IncomeReport(admin);
            incomePage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminReportsDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_btnIncStatsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminReportsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminReportsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminReportsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminReportsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminReportsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCarStats;
    private javax.swing.JButton btnIncStats;
    private javax.swing.JButton btnRecords;
    private javax.swing.JLabel lblCarStats;
    private javax.swing.JLabel lblIncomeStats;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRecords;
    // End of variables declaration//GEN-END:variables
}