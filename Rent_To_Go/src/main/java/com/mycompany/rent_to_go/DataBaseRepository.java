/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DataBaseRepository {
    
    public static void recordLoginActivity(String activity) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/LoginRecord.txt", true));
        writer.write(activity+"\n");
        
        writer.close();

    }
    
//    public static void writeIntoCarBookingFile(ArrayList<CarBooking> carBookingList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/CarBooking.txt"));
//
//        for(CarBooking carBooking: carBookingList){
//            
//
//           writer.write(carBooking.getBookingId() + ";" + carBooking.getCustomer().getCustomerId() + ";" + carBooking.getCar().getCarId() + ";" + carBooking.getPickupDate() + ";" + String.valueOf(carBooking.getPickupHour()) +  ";" + String.valueOf(carBooking.getPickupMinute()) + ";" + carBooking.getDropOffDate() + ";" + String.valueOf(carBooking.getDropHour()) + ";" + String.valueOf(carBooking.getDropMinute()) + ";" + carBooking.getRentalStatus() + ";" + String.valueOf(carBooking.getTotalHours()) + ";" + carBooking.getPickupLocation() + ";" + carBooking.getDropOffLocation() + ";" + carBooking.getPayment().getPaymentId() + "\n");
//           
//           
//        }
//        
//        writer.close();
//        
//    }
//    
//    public static ArrayList<ArrayList<String>> getEarningPerCar() throws IOException{
//        ArrayList<ArrayList<String>> finalEarningCar = new ArrayList<ArrayList<String>>();
//        ArrayList<Car> carlist = Car.getCarList();
//        
//        
//        for(Car car: carlist){
//            ArrayList<String> carData = new ArrayList<String>();
//            carData.add(car.getCarId());
//            double finalTotal = 0;
//            for(CarBooking booking: CarBooking.getCarBookingList()){
//                if(car.getCarId().equals(booking.getCar().getCarId())){
//                    finalTotal += booking.getPayment().getTotalPayment();
//                }
//                                                
//            }
//            carData.add(String.valueOf(finalTotal));
//            finalEarningCar.add(carData);
//        }
//        return finalEarningCar;
//       
//        
//        
//    }
//    
//    public static ArrayList<ArrayList<String>> getNumPerCar() throws IOException{
//        ArrayList<ArrayList<String>> finalNumCar = new ArrayList<ArrayList<String>>();
//        ArrayList<Car> carlist = Car.getCarList();
//        
//        
//        for(Car car: carlist){
//            ArrayList<String> carData = new ArrayList<String>();
//            carData.add(car.getCarId());
//            int carNum = 0;
//            for(CarBooking booking: CarBooking.getCarBookingList()){
//                if(car.getCarId().equals(booking.getCar().getCarId())){
//                    carNum += 1;
//                }
//                                                
//            }
//            carData.add(String.valueOf(carNum));
//            finalNumCar.add(carData);
//        }
//        return finalNumCar;
//       
//        
//        
//    }
//    
//    
//        
//    public static ArrayList<ArrayList<String>> getDurationPerCar() throws IOException{
//        ArrayList<ArrayList<String>> finalDurationCar = new ArrayList<ArrayList<String>>();
//        ArrayList<Car> carlist = Car.getCarList();
//        
//        
//        for(Car car: carlist){
//            ArrayList<String> carData = new ArrayList<String>();
//            carData.add(car.getCarId());
//            double totalDuration = 0;
//            for(CarBooking booking: CarBooking.getCarBookingList()){
//                if(car.getCarId().equals(booking.getCar().getCarId())){
//                    totalDuration += booking.getTotalHours();
//                }
//                                                
//            }
//            carData.add(String.valueOf(totalDuration));
//            finalDurationCar.add(carData);
//        }
//        return finalDurationCar;
//       
//        
//        
//    }
//    
//    public static ArrayList<ArrayList<String>> getEarningPerDay() throws IOException{
//        ArrayList<ArrayList<String>> earningPerDay = new ArrayList<ArrayList<String>>();
//
//        ArrayList<String> dateList = new ArrayList<String>();
//        for(Payment payment: Payment.getPaymentList()){
//            if(!dateList.contains(payment.getPaymentDate())){
//                dateList.add(payment.getPaymentDate());
//            }
//        }
//
//        
//        for(String paymentDate: dateList){
//            Double paymentTotal = 0.0;
//            ArrayList<String> earningData = new ArrayList<String>();
//            earningData.add(paymentDate);
//            for(Payment payment: Payment.getPaymentList()){
//                if(paymentDate.equals(payment.getPaymentDate())){
//                    paymentTotal += payment.getTotalPayment();
//                }
//            }
//            earningData.add(String.valueOf(paymentTotal));
//            earningPerDay.add(earningData);
//        }
//  
//        return earningPerDay;
//        
//    }
    
    
    
    
//    Customer myCustomer = new Customer("hari", "john", "ljl", "sfds", "asdfsfd", "sfdsf", "sdfsdf");
    
//    public static void writeIntoUserFile(ArrayList<User> userList) throws IOException{
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/User.txt"));
//       
//    
//        
//        
//        for(User theUser: userList){
//            
//            
//            writer.write(theUser.getUserId() + ";" + theUser.getName() + ";" + theUser.getEmail() + ";" + theUser.getUsername() + ";" + theUser.getPassword() + ";" + theUser.getRegisteredDate() + ";" + theUser.getRole() + "\n");
//          
//           
//        }
//        writer.close();
//        
//    }
//    
//    public static void writeIntoCustomerFile(ArrayList<Customer> customerList) throws IOException{
//      
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Customer.txt"));
//    
//        
//        
//        for(Customer theCustomer: customerList){
//            
//           
//            writer.write(theCustomer.getCustomerId() + ";" + theCustomer.getUserId() + ";" + theCustomer.getAddress() + ";" +  theCustomer.getLicence().getLicenceNumber() + ";" + theCustomer.getLicence().getValidityDate() + ";" + String.valueOf(theCustomer.isApprovalStatus()) + "\n");
//           
//           
//           
//        }
//        writer.close();
//
//        
//        
//        
//    }
//    
//    public static void writeIntoAdminFile(ArrayList<Admin> adminList) throws IOException{
//        
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Admin.txt"));
//    
//        
//        
//        for(Admin theAdmin: adminList){
//            
//           
//            writer.write(theAdmin.getAdminId() + ";" + theAdmin.getUserId() + "\n");
//           
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    
//    
//    
//    public static void writeIntoCarFile(ArrayList<Car> carList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Car.txt"));
//    
//        
//        
//        for(Car theCar: carList){
//            
//           
//            writer.write(theCar.getCarId() + ";" + theCar.getPlateNumber() + ";" + String.valueOf(theCar.getPassengerCapacity())+ ";" + String.valueOf(theCar.getLuggageCapacity()) + ";" + theCar.getTransmission() + ";" + theCar.getMake() + ";" + theCar.getModel() + ";" + String.valueOf(theCar.getManufacturingYear()) + ";" + String.valueOf(theCar.getPricePerHour())+ ";" + String.valueOf(theCar.getAvailabilityStatus()) + "\n");
//           
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    public static void writeIntoReviewFile(ArrayList<Review> reviewList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Review.txt"));
//    
//        
//        
//        for(Review review: reviewList){
//            
//           
//            writer.write(review.getReviewId() + ";" + review.getCustomer().getCustomerId() + ";" + review.getCar().getCarId() + ";" + review.getComment() + ";" + String.valueOf(review.getRating()) + "\n");
//           
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    public static void writeIntoCarBookingFile(ArrayList<CarBooking> carBookingList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/CarBooking.txt"));
//
//        for(CarBooking carBooking: carBookingList){
//            
//
//           writer.write(carBooking.getBookingId() + ";" + carBooking.getCustomer().getCustomerId() + ";" + carBooking.getCar().getCarId() + ";" + carBooking.getPickupDate() + ";" + String.valueOf(carBooking.getPickupHour()) +  ";" + String.valueOf(carBooking.getPickupMinute()) + ";" + carBooking.getDropOffDate() + ";" + String.valueOf(carBooking.getDropHour()) + ";" + String.valueOf(carBooking.getDropMinute()) + ";" + carBooking.getRentalStatus() + ";" + String.valueOf(carBooking.getTotalHours()) + ";" + carBooking.getPickupLocation() + ";" + carBooking.getDropOffLocation() + ";" + carBooking.getPayment().getPaymentId() + "\n");
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    
//    
//    public static void writeIntoPaymentFile(ArrayList<Payment> paymentList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Payment.txt"));
//    
//        
//        
//        for(Payment payment: paymentList){
//            
//
//           writer.write(payment.getPaymentId() + ";" + payment.getPaymentDate() + ";" + String.valueOf(payment.isPaymentStatus()) + ";" + String.valueOf(payment.getTotalPayment()) + ";" + payment.getCreditCardDetail().getCardId() + "\n");
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//        
//    public static void writeIntoCreditCardPaymentFile(ArrayList<CreditCardPayment> creditCardList) throws IOException{
//        
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/CreditCardPayment.txt"));
//    
//        
//        
//        for(CreditCardPayment card: creditCardList){
//            
//
//           writer.write(card.getCardId() + ";" + card.getCardHolderName() + ";" + card.getCvv() + ";" + card.getCardNumber() + ";" + card.getCardExpiryDate() + "\n");
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    public static void writeIntoNotificationFile(ArrayList<Notification> notificationList) throws IOException{
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Notification.txt"));
//    
//        
//        
//        for(Notification notification: notificationList){
//            
//
//           writer.write(notification.getNotificationId() + ";" + notification.getNotificationText() + ";" + notification.getBookingId() + "\n");
//           
//           
//        }
//        writer.close();
//        
//    }
//    
//    
//    
//    
//    public static ArrayList<User> getUserList() throws FileNotFoundException, IOException{
//        ArrayList<User> userList = new ArrayList<User>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/User.txt"));
//        while((line=reader.readLine()) != null){
//            String[] userData = line.strip().split(";");
//            User currentUser = new User(userData[0], userData[1], userData[2], userData[3], userData[4], userData[5], userData[6]);
//            userList.add(currentUser);
//   
//        }
//        
//        return userList;
//        
//    }
//    public static ArrayList<Customer> getCustomerList() throws FileNotFoundException, IOException{
//        ArrayList<Customer> customerlist  = new ArrayList<Customer>();
//
//        
//        ArrayList<String[]> customerData = new ArrayList<String[]>();
//        
//        ArrayList<User> userList = getUserList();
//        
//        
//        
//        String line;
//      
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Customer.txt"));
//        
//        while((line=reader.readLine()) != null){
//            customerData.add(line.strip().split(";"));
//   
//        }
//        
//        for(String[] cust: customerData){
//            for(User user: userList){
//                if(cust[1].equals(user.getUserId())){
//                    Customer currentCustomer = new Customer(user.getUserId(), user.getName(), user.getUsername(), user.getEmail(), user.getPassword(), user.getRegisteredDate(), cust[0], cust[2], cust[4], cust[3],Boolean.valueOf(cust[5]));
//                    customerlist.add(currentCustomer);
//                }
//            }
//        }
//        
//        return customerlist;
//    }
//    
//    public static ArrayList<Admin> getAdminList() throws IOException{
//        ArrayList<Admin> adminList  = new ArrayList<Admin>();
//
//        
//        ArrayList<String[]> adminData = new ArrayList<String[]>();
//        
//        ArrayList<User> userList = getUserList();
//        
//        
//        
//        String line;
//      
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Admin.txt"));
//        
//        while((line=reader.readLine()) != null){
//            adminData.add(line.strip().split(";"));
//   
//        }
//     
//        
//        for(String[] admin: adminData){
//            for(User user: userList){
//              
//                if(admin[1].equals(user.getUserId())){
//                   
//                    Admin currentAdmin = new Admin(user.getUserId(), user.getName(), user.getUsername(), user.getEmail(), user.getPassword(), user.getRegisteredDate(), admin[0]);
//                  
//                    adminList.add(currentAdmin);
//                }
//            }
//        }
//        
//        return adminList;
//    }
//    
//    
//    
//    
//    
//    
//    public static ArrayList<Car> getCarList() throws FileNotFoundException, IOException{
//        ArrayList<Car> carList = new ArrayList<Car>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Car.txt"));
//        while((line=reader.readLine()) != null){
//            String[] carData = line.strip().split(";");
//            Car currentCar = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Double.parseDouble(carData[3]), carData[4], carData[5], carData[6], Integer.parseInt(carData[7]), Double.parseDouble(carData[8]), Boolean.parseBoolean(carData[9]));
//            carList.add(currentCar);
//   
//        }
//        
//        return carList;
//    }
//    
//    
//    
//    public static ArrayList<CreditCardPayment> getCreditCardPaymentList() throws IOException{
//        
//        ArrayList<CreditCardPayment> creditCardPaymentList = new ArrayList<CreditCardPayment>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/CreditCardPayment.txt"));
//        while((line=reader.readLine()) != null){
//            String[] creditCardData = line.strip().split(";");
//            CreditCardPayment currentCard = new CreditCardPayment(creditCardData[0], creditCardData[1], creditCardData[2], creditCardData[3], creditCardData[4]);
//            creditCardPaymentList.add(currentCard);
//   
//        }
//        
//        return creditCardPaymentList;
//        
//    }
//    
//    public static ArrayList<Payment> getPaymentList() throws IOException{
//        
//        ArrayList<Payment> paymentList = new ArrayList<Payment>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Payment.txt"));
//        while((line=reader.readLine()) != null){
//            String[] paymentData = line.strip().split(";");
//            Payment currentPayment = new Payment(paymentData[0], paymentData[1], Boolean.parseBoolean(paymentData[2]), Double.parseDouble(paymentData[3]), getCreditCardPayment(paymentData[4]).getCardId(), getCreditCardPayment(paymentData[4]).getCardHolderName(), getCreditCardPayment(paymentData[4]).getCardHolderName(), getCreditCardPayment(paymentData[4]).getCvv(), getCreditCardPayment(paymentData[4]).getCardExpiryDate());
//            paymentList.add(currentPayment);
//   
//        }
//        
//        return paymentList;
//        
//    }
//    
//    
//    
//   
//    
//    
//    public static Customer getCustomer(String customerId) throws IOException{
//        ArrayList<Customer> customerList = getCustomerList();
//       
//        for(Customer customer: customerList){
//            if(customer.getCustomerId().equals(customerId)){
//                 return customer;
//            }
//        }
//        return customerList.get(0);
//     
//    }
//    
//    
//        
//    public static Car getCar(String carId) throws IOException{
//        ArrayList<Car> carList = getCarList();
//       
//        for(Car car: carList){
//            if(car.getCarId().equals(carId)){
//                 return car;
//            }
//        }
//        return carList.get(0);
//     
//    }
//    
//    public static CreditCardPayment getCreditCardPayment(String cardId) throws IOException{
//        ArrayList<CreditCardPayment> creditCardPaymentList = getCreditCardPaymentList();
//       
//        for(CreditCardPayment creditCardPayment: creditCardPaymentList){
//            if(creditCardPayment.getCardId().equals(cardId)){
//                 return creditCardPayment;
//            }
//        }
//        return creditCardPaymentList.get(0);
//        
//    }
//    
//    public static Payment getPayment(String paymentId) throws IOException{
//        ArrayList<Payment> paymentList = getPaymentList();
//       
//        for(Payment payment: paymentList){
//            if(payment.getPaymentId().equals(paymentId)){
//                 return payment;
//            }
//        }
//        return paymentList.get(0);
//        
//    }
//    
//    
//    public static CarBooking getCarBooking(String bookingId) throws IOException{
//        ArrayList<CarBooking> bookingList = getCarBookingList();
//       
//        for(CarBooking booking: bookingList){
//            if(booking.getBookingId().equals(bookingId)){
//                 return booking;
//            }
//        }
//        return bookingList.get(0);
//        
//    }
//    
//    public static ArrayList<Notification> getCurrentNotificationList(String bookingId) throws IOException{
//        ArrayList<Notification> notificationList = new ArrayList<Notification>();
//       
//        for(Notification notification: getNotificationList()){
//            if(notification.getBookingId().equals(bookingId)){
//                 notificationList.add(notification);
//            }
//        }
//        return notificationList;
//        
//    }
//    
//   
//    
//    public static ArrayList<Notification> getNotificationList() throws FileNotFoundException, IOException{
//        
//        ArrayList<Notification> notificationList = new ArrayList<Notification>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Notification.txt"));
//        while((line=reader.readLine()) != null){
//            String[] notificationData = line.strip().split(";");
//            Notification currentNotification = new Notification(notificationData[0], notificationData[1], notificationData[2]);
//            notificationList.add(currentNotification);
//   
//        }
//        
//        return notificationList;
//        
//    }
//    
//    public static ArrayList<Review> getReviewList() throws FileNotFoundException, IOException{
//        
//        ArrayList<Review> reviewList = new ArrayList<Review>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Review.txt"));
//        while((line=reader.readLine()) != null){
//            String[] reviewData = line.strip().split(";");
//            Review currentReview = new Review(reviewData[0], getCustomer(reviewData[1]), getCar(reviewData[2]), reviewData[3],  Integer.parseInt(reviewData[4]));
//            reviewList.add(currentReview);
//   
//        }
//        
//        return reviewList;
//        
//    }
//    
//    
//    public static ArrayList<CarBooking> getCarBookingList() throws FileNotFoundException, IOException{
//        
//        ArrayList<CarBooking> bookingList = new ArrayList<CarBooking>();
//           
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/CarBooking.txt"));
//        while((line=reader.readLine()) != null){
//            String[] bookingData = line.strip().split(";");
//            CarBooking currentBooking = new CarBooking(bookingData[0], getCustomer(bookingData[1]), getCar(bookingData[2]), bookingData[3], Integer.parseInt(bookingData[4]), Integer.parseInt(bookingData[5]), bookingData[6], Integer.parseInt(bookingData[7]), Integer.parseInt(bookingData[8]), bookingData[9], Double.parseDouble(bookingData[10]), bookingData[11], bookingData[12], getPayment(bookingData[13]), getCurrentNotificationList(bookingData[0]));
//            bookingList.add(currentBooking);
//   
//        }
//        
//        return bookingList;
//        
//    }
    
    
    

}
