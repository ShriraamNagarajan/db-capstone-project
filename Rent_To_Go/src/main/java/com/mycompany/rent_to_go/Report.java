/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Payment.getPaymentList;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class Report{
    
    protected String month;
    protected String reportDate;
    protected ArrayList<CarBooking> bookingList;


    public Report(String month) throws IOException{
        this.month = month.toUpperCase();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.reportDate = formatter.format(LocalDate.now());
        updateBookingList();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month.toUpperCase();
    }


    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }
    public ArrayList<CarBooking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(ArrayList<CarBooking> bookingList) {
        this.bookingList = bookingList;
    }
    
    public void updateBookingList() throws IOException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        ArrayList<CarBooking> monthBookings = new ArrayList<CarBooking>();
        for(CarBooking booking: CarBooking.getCarBookingList()){
            LocalDate date = LocalDate.parse(booking.getPayment().getPaymentDate(), formatter);

            String currentMonth = date.getMonth().toString();

            if(currentMonth.equals(this.month)){

                monthBookings.add(booking);
            }
        }
        
        this.bookingList = monthBookings;
        
    }
    
    


    

    

    
    

   
    
  
    
}
