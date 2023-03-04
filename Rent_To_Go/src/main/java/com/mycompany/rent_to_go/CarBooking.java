/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Customer.getCustomerList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CarBooking implements NewIdGenerator{

    private String bookingId;
    private Customer customer;
    private Car car;
    private String pickupDate;
    private int pickupHour;
    private int pickupMinute;
    private String dropOffDate;
    private int dropHour;
    private int dropMinute;
    private RentalStatus rentalStatus;
    private double totalHours;
    private String pickupLocation;
    private String dropOffLocation;
    private Payment payment;
    private ArrayList<Notification> notifications;

    
      
    public CarBooking(String pick, String drop, String pickDate, int pickHour, int pickMin, int dropHour, int dropMin, String dropDate) throws IOException{
        this.bookingId = generateNewId();
        this.pickupLocation = pick;
        this.dropOffLocation = drop;
        this.pickupDate = pickDate;
        this.pickupHour = pickHour;
        this.pickupMinute = pickMin;        
        this.dropOffDate = dropDate;
        this.dropHour = dropHour;
        this.dropMinute = dropMinute;
        this.notifications = new ArrayList<Notification>();
        
        
    }
    
    public CarBooking(String id, Customer customer, Car car, String pickDate, int pickupHour,
            int pickupMinute, String dropDate, int dropHour, int dropMinute, String rentalStatus, 
            double totalHours, String pickLocation, String dropLocation, Payment payment, 
            ArrayList<Notification> notificationList){
        
        this.bookingId = id;
        this.customer = customer;
        this.car = car;
        this.pickupDate = pickDate;
        this.pickupHour = pickupHour;
        this.pickupMinute = pickupMinute;
        this.dropOffDate = dropDate;
        this.dropHour = dropHour;
        this.dropMinute = dropMinute;

        this.totalHours = totalHours;
        
        this.pickupLocation = pickLocation;
        this.dropOffLocation = dropLocation;
        this.payment = payment;
        this.notifications = notificationList;
        
        
        switch(rentalStatus){
            case "checkedOut":
                this.rentalStatus = RentalStatus.checkedOut;
                break;
            case "rejected":
                this.rentalStatus = RentalStatus.rejected;
                break;
            case "approved":
                this.rentalStatus = RentalStatus.approved;
                break;
            case "pickedUp":
                this.rentalStatus = RentalStatus.pickedUp;
                break;
            default:
                this.rentalStatus = RentalStatus.dropedOff;
                break;
        }
    }
    
    
    
    
    
    
    
    
    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(ArrayList<Notification> notifications) {
        this.notifications = notifications;
    }

    
    
       public int getPickupHour() {
        return pickupHour;
    }

    public void setPickupHour(int pickupHour) {
        this.pickupHour = pickupHour;
    }

    public int getPickupMinute() {
        return pickupMinute;
    }

    public void setPickupMinute(int pickupMinute) {
        this.pickupMinute = pickupMinute;
    }

    public int getDropHour() {
        return dropHour;
    }

    public void setDropHour(int dropHour) {
        this.dropHour = dropHour;
    }

    public int getDropMinute() {
        return dropMinute;
    }

    public void setDropMinute(int dropMinute) {
        this.dropMinute = dropMinute;
    }
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(String dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(String paymentDate, boolean status, double payment, String name, String cvv, String cardNum, 
            String cardExpiry) throws IOException {
        this.payment = new Payment(paymentDate, status, payment, name, cvv, cardNum, cardExpiry);
    }
    
    
    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(RentalStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    
    public void addNotificationList(Notification notification){
        this.notifications.add(notification);
    }
    
    

    
    public void setTotalHours(Calendar c1, Calendar c2){
        Calendar pickDateTime;
        pickDateTime = c1;
        Calendar dropDateTime;
        dropDateTime = c2;
        
        pickDateTime.set(pickDateTime.get(Calendar.YEAR), pickDateTime.get(Calendar.MONTH), pickDateTime.get(Calendar.DATE), this.pickupHour, this.pickupMinute); 
        dropDateTime.set(dropDateTime.get(Calendar.YEAR), dropDateTime.get(Calendar.MONTH), dropDateTime.get(Calendar.DATE), this.dropHour, this.dropMinute); 
      
        
        double hours = ChronoUnit.HOURS.between(pickDateTime.toInstant(), dropDateTime.toInstant());
        this.totalHours=hours;
        
    }
    
    
    public static void writeIntoCarBookingFile(ArrayList<CarBooking> carBookingList) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/CarBooking.txt"));

        for(CarBooking carBooking: carBookingList){
            

           writer.write(carBooking.getBookingId() + ";" + carBooking.getCustomer().getCustomerId() + ";" + carBooking.getCar().getCarId() + ";" + carBooking.getPickupDate() + ";" + String.valueOf(carBooking.getPickupHour()) +  ";" + String.valueOf(carBooking.getPickupMinute()) + ";" + carBooking.getDropOffDate() + ";" + String.valueOf(carBooking.getDropHour()) + ";" + String.valueOf(carBooking.getDropMinute()) + ";" + carBooking.getRentalStatus() + ";" + String.valueOf(carBooking.getTotalHours()) + ";" + carBooking.getPickupLocation() + ";" + carBooking.getDropOffLocation() + ";" + carBooking.getPayment().getPaymentId() + "\n");
        }
        
        writer.close();
        
    }
    
    
    public static ArrayList<CarBooking> getCarBookingList() throws FileNotFoundException, IOException{
        
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/CarBooking.txt"));
        while((line=reader.readLine()) != null){
            String[] bookingData = line.strip().split(";");
            CarBooking currentBooking = new CarBooking(bookingData[0], Customer.getCustomer(bookingData[1]), Car.getCar(bookingData[2]), bookingData[3], Integer.parseInt(bookingData[4]), Integer.parseInt(bookingData[5]), bookingData[6], Integer.parseInt(bookingData[7]), Integer.parseInt(bookingData[8]), bookingData[9], Double.parseDouble(bookingData[10]), bookingData[11], bookingData[12], Payment.getPayment(bookingData[13]), Notification.getCurrentNotificationList(bookingData[0]));
            bookingList.add(currentBooking);
   
        }
        
        return bookingList;
        
    }
    
    public static CarBooking getCarBooking(String bookingId) throws IOException{
        ArrayList<CarBooking> bookingList = getCarBookingList();
       
        for(CarBooking booking: bookingList){
            if(booking.getBookingId().equals(bookingId)){
                 return booking;
            }
        }
        return bookingList.get(0);
        
    }
    
    public static ArrayList<CarBooking> getSpecificCarBooking(Car car) throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking: getCarBookingList()){
            if(booking.getCar().getCarId().equals(car.getCarId())){
                bookingList.add(booking);
            }
        }
        return bookingList;
    }
    public static ArrayList<CarBooking> getCustomerCarBooking(Customer customer) throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking: getCarBookingList()){
              if(booking.getCustomer().getCustomerId().equals(customer.getCustomerId())){
                  bookingList.add(booking);
              }
          }
        return bookingList;
    }
    
    public static void addBooking(CarBooking booking) throws IOException{
        registerBooking(booking);
        Payment.registerPayment(booking.getPayment());
        CreditCardPayment.registerCreditCard(booking.getPayment().getCreditCardDetail());
        Notification.registerNotification(booking.getNotifications());
    }
    
    private static void registerBooking(CarBooking booking) throws IOException{
        
        ArrayList<CarBooking> carBookingList = getCarBookingList();
        carBookingList.add(booking);
        writeIntoCarBookingFile(carBookingList);
    }
    
    public static ArrayList<CarBooking> getOngoingBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.approved) || booking.getRentalStatus().equals(RentalStatus.pickedUp) || booking.getRentalStatus().equals(RentalStatus.dropedOff)){
                bookingList.add(booking);
            }
        }
        return bookingList;
    }
   
    public static ArrayList<CarBooking> getCheckedOutBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.checkedOut)){
                bookingList.add(booking);
            }
        }
        return bookingList;
    }
    
    public static ArrayList<CarBooking> getApprovedBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.approved)){
                bookingList.add(booking);
            }
        }
        return bookingList;  
    }
    
    public static ArrayList<CarBooking> getRejectedBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.rejected)){
                bookingList.add(booking);
            }
        }
        return bookingList;  
        
    }
    
    public static ArrayList<CarBooking> getPickUpBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.pickedUp)){
                bookingList.add(booking);
            }
        }
        return bookingList; 
    }
    
    public static ArrayList<CarBooking> getDropOffBookings() throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getRentalStatus().equals(RentalStatus.dropedOff)){
                bookingList.add(booking);
            }
        }
        return bookingList; 
    }
    
    
    public static void modifyBookingStatus(CarBooking currentBooking) throws IOException{
        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
        for(CarBooking booking:getCarBookingList()){
            if(booking.getBookingId().equals(currentBooking.getBookingId())){

                booking.setRentalStatus(currentBooking.getRentalStatus());
                booking.setNotifications(currentBooking.getNotifications());
                
                Notification.addNotification(booking.getNotifications().get(booking.getNotifications().size()-1));
                
            }
            bookingList.add(booking);
        }
        writeIntoCarBookingFile(bookingList);
    
        
    }
    
    public String getFormattedPickupTime(){
        if(this.pickupHour < 12){
            if(this.pickupMinute<10){
                return String.valueOf(this.pickupHour) + ":" +  "0" + String.valueOf(this.pickupMinute) + " a.m.";
            }
             return String.valueOf(this.pickupHour) + ":" + String.valueOf(this.pickupMinute) + " a.m.";
        }else{
             if(this.pickupMinute<10){
                return String.valueOf(this.pickupHour) + ":" +  "0" + String.valueOf(this.pickupMinute) + " p.m.";
            }
             return String.valueOf(this.pickupHour) + ":" + String.valueOf(this.pickupMinute) + " p.m.";
        }
    }
    
    
    public String getFormattedDropOffTime(){
        if(this.dropHour < 12){
            if(this.dropMinute<10){
                return String.valueOf(this.dropHour) + ":" +  "0" + String.valueOf(this.dropMinute) + " a.m.";
            }
             return String.valueOf(this.dropHour) + ":" + String.valueOf(this.dropMinute) + " a.m.";
        }else{
             if(this.dropMinute<10){
                return String.valueOf(this.dropHour) + ":" +  "0" + String.valueOf(this.dropMinute) + " p.m.";
            }
             return String.valueOf(this.dropHour) + ":" + String.valueOf(this.dropMinute) + " p.m.";
        }
    }
    
    public String generateNewId() {
        ArrayList<CarBooking> bookingList;
        try {
            bookingList = getCarBookingList();
            int newInt;
            if(bookingList.size()==0){
                return "CB1";
            }
            newInt = Integer.parseInt(bookingList.get(bookingList.size()-1).getBookingId().substring(2)) + 1;
            return "CB" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(CarBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "CB";
    }

  
    
    
    
    
}
