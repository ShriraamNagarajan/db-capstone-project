/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.CarBooking.getCarBookingList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Payment implements NewIdGenerator{
    private String paymentId;
    private String paymentDate;
    private boolean paymentStatus;
    private  double totalPayment;
    private  CreditCardPayment creditCardDetail;

    
    public Payment(String paymentDate, boolean status, double payment, String name, String cvv, String cardNum, String cardExpiry) throws IOException{
        this.paymentId = generateNewId();
        this.paymentDate = paymentDate;
        this.paymentStatus = status;
        this.totalPayment = payment;
        
        this.creditCardDetail = new CreditCardPayment(name, cvv, cardNum, cardExpiry);
    }
    
     public Payment(String id, String paymentDate, boolean status, double payment, String name, String cvv, String cardNum, String cardExpiry) throws IOException{
        this.paymentId = id;
        this.paymentDate = paymentDate;
        this.paymentStatus = status;
        this.totalPayment = payment;
        
        this.creditCardDetail = new CreditCardPayment(name, cvv, cardNum, cardExpiry);
    }
     
     
    public Payment(String id, String paymentDate, boolean status, double payment, String cardid, String name, String cvv, String cardNum, String cardExpiry) throws IOException{
        this.paymentId = id;
        this.paymentDate = paymentDate;
        this.paymentStatus = status;
        this.totalPayment = payment;
        
        this.creditCardDetail = new CreditCardPayment(cardid, name, cvv, cardNum, cardExpiry);
    }

    
 
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public CreditCardPayment getCreditCardDetail() {
        return creditCardDetail;
    }

    public void setCreditCardDetail(CreditCardPayment creditCardDetail) {
        this.creditCardDetail = creditCardDetail;
    }
    

    public static void writeIntoPaymentFile(ArrayList<Payment> paymentList) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Payment.txt"));
    
        
        
        for(Payment payment: paymentList){
            

           writer.write(payment.getPaymentId() + ";" + payment.getPaymentDate() + ";" + String.valueOf(payment.isPaymentStatus()) + ";" + String.valueOf(payment.getTotalPayment()) + ";" + payment.getCreditCardDetail().getCardId() + "\n");
           
           
        }
        writer.close();
        
    }
    
    public static ArrayList<Payment> getPaymentList() throws IOException{
        
        ArrayList<Payment> paymentList = new ArrayList<Payment>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Payment.txt"));
        while((line=reader.readLine()) != null){
            String[] paymentData = line.strip().split(";");
            Payment currentPayment = new Payment(paymentData[0], paymentData[1], Boolean.parseBoolean(paymentData[2]), Double.parseDouble(paymentData[3]), CreditCardPayment.getCreditCardPayment(paymentData[4]).getCardId(), CreditCardPayment.getCreditCardPayment(paymentData[4]).getCardHolderName(), CreditCardPayment.getCreditCardPayment(paymentData[4]).getCardHolderName(), CreditCardPayment.getCreditCardPayment(paymentData[4]).getCvv(), CreditCardPayment.getCreditCardPayment(paymentData[4]).getCardExpiryDate());
            paymentList.add(currentPayment);
   
        }
        
        return paymentList;
        
    }
    
    
    public static void registerPayment(Payment payment) throws IOException{
        ArrayList<Payment> paymentList = getPaymentList();
        paymentList.add(payment);
        writeIntoPaymentFile(paymentList);
    }
    
    
    public static Payment getPayment(String paymentId) throws IOException{
        ArrayList<Payment> paymentList = getPaymentList();
       
        for(Payment payment: paymentList){
            if(payment.getPaymentId().equals(paymentId)){
                 return payment;
            }
        }
        return paymentList.get(0);
        
    }
    

 

    @Override
    public String generateNewId() {
        ArrayList<Payment> paymentList;
        try {
            paymentList = getPaymentList();
            int newInt;
            if(paymentList.size()==0){
                return "P1";
            }
            newInt = Integer.parseInt(paymentList.get(paymentList.size()-1).getPaymentId().substring(1)) + 1;
            return "P" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "P";
    }
}
