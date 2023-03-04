/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class MonthlyRentalRecordsReport extends Report{
    

      
    private int numOfRentals;
    private double totalEarning;
  

    public MonthlyRentalRecordsReport(String month) throws IOException{
        super(month);

        this.numOfRentals = this.bookingList.size();
        this.totalEarning = calculateTotalEarning();
        
    }
    
    
    

    
    public int getNumOfRentals() {
        return numOfRentals;
    }

    public void setNumOfRentals(int numOfRentals) {
        this.numOfRentals = numOfRentals;
    }
    public void updateNumOfRentals(){
        this.numOfRentals = this.bookingList.size();
    }

    public double getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(double totalEarning) {
        this.totalEarning = totalEarning;
    }
    public void updateTotalEarning(){
        this.totalEarning = calculateTotalEarning();
    }


    
    
    

    

    
    public double calculateTotalEarning(){
        double earning = 0;
        for(CarBooking booking: this.bookingList){
            earning += booking.getPayment().getTotalPayment();
        }
        return earning;
    }
    
    
 


 
    
}
