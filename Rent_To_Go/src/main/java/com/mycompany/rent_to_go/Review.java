/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Payment.getPaymentList;
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
public class Review implements NewIdGenerator{
    private String reviewId;
    private Customer customer;
    private Car car;
    private String comment;
    private int rating;
    
    public Review(String id, Customer customer, Car car, String comment, int rating){
        this.reviewId = id;
        this.customer = customer;
        this.car = car;
        this.comment=comment;
        this.rating = rating;
        
    }
    
    public Review(Customer customer, Car car, String comment, int rating) throws IOException{
        this.reviewId = generateNewId();
        this.customer = customer;
        this.car = car;
        this.comment=comment;
        this.rating = rating;
        
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    

    
    public static void writeIntoReviewFile(ArrayList<Review> reviewList) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Review.txt"));

        for(Review review: reviewList){

            writer.write(review.getReviewId() + ";" + review.getCustomer().getCustomerId() + ";" + review.getCar().getCarId() + ";" + review.getComment() + ";" + String.valueOf(review.getRating()) + "\n");
     
        }
        writer.close();
        
    }
      
      
    public static ArrayList<Review> getReviewList() throws FileNotFoundException, IOException{
        
        ArrayList<Review> reviewList = new ArrayList<Review>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Review.txt"));
        while((line=reader.readLine()) != null){
            String[] reviewData = line.strip().split(";");
            Review currentReview = new Review(reviewData[0], Customer.getCustomer(reviewData[1]), Car.getCar(reviewData[2]), reviewData[3],  Integer.parseInt(reviewData[4]));
            reviewList.add(currentReview);
   
        }
        
        return reviewList;
        
    }
    
    public static ArrayList<Review> getCarReviewList(Car car) throws IOException{
        ArrayList<Review> reviewList = new ArrayList<Review>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Review.txt"));
        while((line=reader.readLine()) != null){
            String[] reviewData = line.strip().split(";");
            if(Car.getCar(reviewData[2]).getCarId().equals(car.getCarId())){
                  Review currentReview = new Review(reviewData[0], Customer.getCustomer(reviewData[1]), Car.getCar(reviewData[2]), reviewData[3],  Integer.parseInt(reviewData[4]));
                  reviewList.add(currentReview);
            }
          
   
        }
        
        return reviewList;
        
    }
    
    public static void addReview(Review currentReview) throws IOException{
        
            ArrayList<Review> reviewList = getReviewList();
            reviewList.add(currentReview);
            writeIntoReviewFile(reviewList);
            
        
    }

    @Override
    public String generateNewId() {
        ArrayList<Review> reviewList;
        try {
            reviewList = getReviewList();
            int newInt;
            if(reviewList.size()==0){
                return "RV1";
            }
            newInt = Integer.parseInt(reviewList.get(reviewList.size()-1).getReviewId().substring(2)) + 1;
            return "RV" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "RV";
    }
    
    
    
    
    
    
}
