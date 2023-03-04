/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.rent_to_go;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class ReviewResult extends javax.swing.JPanel {

    /**
     * Creates new form ReviewResult
     */
    public ReviewResult() {
        initComponents();
         ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_star.png");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user1.png");    
        lblProfile.setText("");
        lblProfile.setIcon(image2);
        lblStar1.setIcon(image);
        lblStar1.setText("");
        lblStar2.setIcon(image);
        lblStar2.setText("");
        lblStar3.setIcon(image);
        lblStar3.setText("");
        lblStar4.setIcon(image);
        lblStar4.setText("");
        lblStar5.setIcon(image);
        lblStar5.setText("");
    }
    
    
    public ReviewResult(Review review) {
        initComponents();
         ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_star.png");
        ImageIcon image2 = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_1rsz_1rsz_user1.png");    
        lblProfile.setText("");
        lblProfile.setIcon(image2);
        lblStar1.setIcon(image);
        lblStar1.setText("");
        lblStar2.setIcon(image);
        lblStar2.setText("");
        lblStar3.setIcon(image);
        lblStar3.setText("");
        lblStar4.setIcon(image);
        lblStar4.setText("");
        lblStar5.setIcon(image);
        lblStar5.setText("");
        lblComment.setText(review.getComment());
        lblName.setText(review.getCustomer().getName());
        if(review.getRating()==1){
            lblStar2.setVisible(false);
            lblStar3.setVisible(false);
            lblStar4.setVisible(false);
            lblStar5.setVisible(false);
          
        }
        if(review.getRating()==2){
            lblStar3.setVisible(false);
            lblStar4.setVisible(false);
            lblStar5.setVisible(false);
            
        }
        if(review.getRating()==3){
            
            lblStar4.setVisible(false);
            lblStar5.setVisible(false);
            
        }
        if(review.getRating()==4){

            lblStar5.setVisible(false);
            
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

        lblProfile = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 192));

        lblProfile.setText("jLabel1");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("jLabel2");

        lblStar1.setText("jLabel3");

        lblStar2.setText("jLabel3");

        lblStar3.setText("jLabel3");

        lblStar4.setText("jLabel3");

        lblStar5.setText("jLabel3");

        lblComment.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComment)
                    .addComponent(lblName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar5)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblProfile))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStar1)
                            .addComponent(lblStar2)
                            .addComponent(lblStar3)
                            .addComponent(lblStar4)
                            .addComponent(lblStar5))))
                .addGap(18, 18, 18)
                .addComponent(lblComment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    // End of variables declaration//GEN-END:variables
}