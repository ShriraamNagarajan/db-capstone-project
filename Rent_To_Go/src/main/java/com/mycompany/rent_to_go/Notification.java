/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Review.getReviewList;
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
public class Notification implements NewIdGenerator{
    private String notificationId;
    private String notificationText;
    private String bookingId;


    public Notification(String notificationId, String notificationText, String bookingId){
        this.notificationId = notificationId;
        this.notificationText = notificationText;
        this.bookingId = bookingId;
    }
    
    public Notification(String notificationText, String bookingId) throws IOException{
        this.notificationId = generateNewId();
        this.notificationText = notificationText;
        this.bookingId = bookingId;
    }

    
    
    
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    

    
    public static void writeIntoNotificationFile(ArrayList<Notification> notificationList) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Notification.txt"));
    
        
        
        for(Notification notification: notificationList){
            

           writer.write(notification.getNotificationId() + ";" + notification.getNotificationText() + ";" + notification.getBookingId() + "\n");
           
           
        }
        writer.close();
        
    }
    
    
    public static ArrayList<Notification> getCurrentNotificationList(String bookingId) throws IOException{
        ArrayList<Notification> notificationList = new ArrayList<Notification>();
       
        for(Notification notification: getNotificationList()){
            if(notification.getBookingId().equals(bookingId)){
                 notificationList.add(notification);
            }
        }
        return notificationList;
        
    }
    
   
    
    public static ArrayList<Notification> getNotificationList() throws FileNotFoundException, IOException{
        
        ArrayList<Notification> notificationList = new ArrayList<Notification>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Notification.txt"));
        while((line=reader.readLine()) != null){
            String[] notificationData = line.strip().split(";");
            Notification currentNotification = new Notification(notificationData[0], notificationData[1], notificationData[2]);
            notificationList.add(currentNotification);
   
        }
        
        return notificationList;
        
    }
    
    public static void registerNotification(ArrayList<Notification> notificationList) throws IOException{
        ArrayList<Notification> allNotifications = getNotificationList();
        for(Notification notification: notificationList){
            allNotifications.add(notification);
        }
        writeIntoNotificationFile(allNotifications);
        
    }
    
    public static void addNotification(Notification notification) throws IOException{
        ArrayList<Notification> allNotifications = getNotificationList();
        allNotifications.add(notification);
        writeIntoNotificationFile(allNotifications);
        
    }
    
    public static ArrayList<Notification> getCustomerNotifications(Customer customer) throws IOException{
        ArrayList<Notification> notificationList = new ArrayList<Notification>();

        
        for(Notification notification: getNotificationList()){
            if(CarBooking.getCarBooking(notification.getBookingId()).getCustomer().getCustomerId().equals(customer.getCustomerId())){
                notificationList.add(notification);
            }
        }
        
        
        
        return notificationList;
    }

    @Override
    public String generateNewId() {
        ArrayList<Notification> notificationList;
        try {
            notificationList = getNotificationList();
            int newInt;
            if(notificationList.size()==0){
                return "NF1";
            }
            newInt = Integer.parseInt(notificationList.get(notificationList.size()-1).getNotificationId().substring(2)) + 1;
            return "NF" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "NF";
    }
    
    
}
