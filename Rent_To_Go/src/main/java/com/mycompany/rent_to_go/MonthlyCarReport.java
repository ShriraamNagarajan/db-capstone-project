/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MonthlyCarReport extends Report{
    
    private ArrayList<Car> carlist;
    public MonthlyCarReport(String month) throws IOException{
        super(month);
        carlist = Car.getCarList();
    }
    
    
    
    public ArrayList<ArrayList<String>> getEarningPerCar() throws IOException{
        ArrayList<ArrayList<String>> finalEarningCar = new ArrayList<ArrayList<String>>();
        
        
        
        for(Car car: this.carlist){
            ArrayList<String> carData = new ArrayList<String>();
            carData.add(car.getCarId());
            double finalTotal = 0;
            for(CarBooking booking: this.bookingList){
                if(car.getCarId().equals(booking.getCar().getCarId())){
                    finalTotal += booking.getPayment().getTotalPayment();
                }
                                                
            }
            carData.add(String.valueOf(finalTotal));
            finalEarningCar.add(carData);
        }
        return finalEarningCar;
       
        
        
    }
    
    public ArrayList<ArrayList<String>> getNumPerCar() throws IOException{
        ArrayList<ArrayList<String>> finalNumCar = new ArrayList<ArrayList<String>>();
        
        
        
        for(Car car: this.carlist){
            ArrayList<String> carData = new ArrayList<String>();
            carData.add(car.getCarId());
            int carNum = 0;
            for(CarBooking booking: this.bookingList){
                if(car.getCarId().equals(booking.getCar().getCarId())){
                    carNum += 1;
                }
                                                
            }
            carData.add(String.valueOf(carNum));
            finalNumCar.add(carData);
        }
        return finalNumCar;
       
        
        
    }
    
    
        
    public ArrayList<ArrayList<String>> getDurationPerCar() throws IOException{
        ArrayList<ArrayList<String>> finalDurationCar = new ArrayList<ArrayList<String>>();
        
        for(Car car: this.carlist){
            ArrayList<String> carData = new ArrayList<String>();
            carData.add(car.getCarId());
            double totalDuration = 0;
            for(CarBooking booking: this.bookingList){
                if(car.getCarId().equals(booking.getCar().getCarId())){
                    totalDuration += booking.getTotalHours();
                }
                                                
            }
            carData.add(String.valueOf(totalDuration));
            finalDurationCar.add(carData);
        }
        return finalDurationCar;
       
        
        
    }


    
}
