/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rent_to_go;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Rent_To_Go {
    
    public static void main(String[] args) throws IOException, InterruptedException {


        LoadingFrame ld = new LoadingFrame();
        ld.setVisible(true);
        
        int initValue = 0;
        
        
        
        
        while(initValue<=100){
            ld.progressBar.setValue(initValue);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Rent_To_Go.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            initValue += 20;
            
        }
        ld.progressBar.setVisible(false);
        ld.lblGo.setVisible(true);
        Thread.sleep(1000);
        loginPage lgPage = new loginPage();
        ld.setVisible(false);
        lgPage.setVisible(true);
        

    }
}
