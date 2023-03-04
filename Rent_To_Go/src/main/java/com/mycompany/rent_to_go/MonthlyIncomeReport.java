/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class MonthlyIncomeReport extends Report{
    public MonthlyIncomeReport(String month) throws IOException{
        super(month);
    }
    
    public  ArrayList<ArrayList<String>> getEarningPerDay() throws IOException{
        ArrayList<ArrayList<String>> earningPerDay = new ArrayList<ArrayList<String>>();

        ArrayList<String> dateList = new ArrayList<String>();
        
        for(CarBooking booking: this.bookingList){
            if(!dateList.contains(booking.getPayment().getPaymentDate())){
                dateList.add(booking.getPayment().getPaymentDate());
            }
        }

        
        for(String paymentDate: dateList){
            Double paymentTotal = 0.0;
            ArrayList<String> earningData = new ArrayList<String>();
            earningData.add(paymentDate);
            for(CarBooking booking: this.bookingList){
                if(paymentDate.equals(booking.getPayment().getPaymentDate())){
              
                    paymentTotal += booking.getPayment().getTotalPayment();
                }
            }
            earningData.add(String.valueOf(paymentTotal));
            earningPerDay.add(earningData);
        }
  
        return earningPerDay;
    }
    public double calculateTotalEarning(){
        double earning = 0;
        for(CarBooking booking: this.bookingList){
            earning += booking.getPayment().getTotalPayment();
        }
        return earning;
    }
    





}
