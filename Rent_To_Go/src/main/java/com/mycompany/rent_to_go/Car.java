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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class Car implements NewIdGenerator{


    
    public enum Transmission{
        Auto, Manual;
    };
    
    private String carId;
    private String plateNumber;
    private int passengerCapacity;
    private double luggageCapacity;
    private Transmission transmission;
    private String make;
    private String model;
    private int manufacturingYear;
    private double pricePerHour;
    private boolean availabilityStatus;
    private String rentalCenter;


    
    Car(String carId, String plateNumber, int pasCap, double lugCap, String transmission, String make, String model, int year, double price, boolean status, String rentalCenter){
        this.carId = carId;
        this.plateNumber = plateNumber;
        this.passengerCapacity = pasCap;
        this.luggageCapacity = lugCap;
        if(transmission.equals("Auto")){
            this.transmission = Transmission.Auto;
        }else{
            this.transmission = Transmission.Manual;
        }
        this.make = make;
        this.model = model;
        this.manufacturingYear = year;
        this.pricePerHour = price;
        this.availabilityStatus = status;
        this.rentalCenter = rentalCenter;
    }
    
    Car(String plateNumber, int pasCap, double lugCap, String transmission, String make, String model, int year, double price, String rentalCenter) throws IOException{
        this.carId = generateNewId();
        this.plateNumber = plateNumber;
        this.passengerCapacity = pasCap;
        this.luggageCapacity = lugCap;
        if(transmission.equals("Auto")){
            this.transmission = Transmission.Auto;
        }else{
            this.transmission = Transmission.Manual;
        }
        this.make = make;
        this.model = model;
        this.manufacturingYear = year;
        this.pricePerHour = price;
        this.availabilityStatus = true;
        this.rentalCenter = rentalCenter;
    }
    
    

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTransmission(String transmission){
        if(transmission.equals("Auto")){
            this.transmission = Transmission.Auto;
        }else{
            this.transmission=Transmission.Manual;
        }
    }
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public String getRentalCenter() {
        return rentalCenter;
    }

    public void setRentalCenter(String rentalCenter) {
        this.rentalCenter = rentalCenter;
    }
    
    @Override
    public String generateNewId() {
        ArrayList<Car> carList;
        try {
            carList = Car.getCarList();
                  int newInt;
            if(carList.size()==0){
                return "CA1";
            }
            newInt = Integer.parseInt(carList.get(carList.size()-1).getCarId().substring(2)) + 1;
            return "CA" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "CA";
  
    }
    
    
    
    

    
        
    public static ArrayList<Car> getCarList() throws FileNotFoundException, IOException{
        ArrayList<Car> carList = new ArrayList<Car>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Car.txt"));
        while((line=reader.readLine()) != null){
            String[] carData = line.strip().split(";");
            Car currentCar = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Double.parseDouble(carData[3]), carData[4], carData[5], carData[6], Integer.parseInt(carData[7]), Double.parseDouble(carData[8]), Boolean.parseBoolean(carData[9]), carData[10]);
            carList.add(currentCar);
   
        }
        
        return carList;
    }
    
    public static ArrayList<Car> getAvailableCarList() throws IOException{
        ArrayList<Car> carList = new ArrayList<Car>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Car.txt"));
        while((line=reader.readLine()) != null){
            String[] carData = line.strip().split(";");
            if(!Boolean.parseBoolean(carData[9])){
                continue;
            }
            Car currentCar = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Double.parseDouble(carData[3]), carData[4], carData[5], carData[6], Integer.parseInt(carData[7]), Double.parseDouble(carData[8]), Boolean.parseBoolean(carData[9]), carData[10]);
            carList.add(currentCar);
   
        }
        
        return carList;      
    }
           
    public static Car getCar(String carId) throws IOException{
        ArrayList<Car> carList = getCarList();
       
        for(Car car: carList){
            if(car.getCarId().equals(carId)){
                 return car;
            }
        }
        return carList.get(0);
     
    }
    
    public static void setCarNotAvailable(Car currentCar) throws IOException{
        ArrayList<Car> carList = getCarList();
        for(Car car: carList){
            if(car.getCarId().equals(currentCar.getCarId())){
                car.setAvailabilityStatus(false);
                break;
            }
            
        }
        writeIntoCarFile(carList);
        
        
    }
    public static boolean isClash(LocalDate bookingStartDate, LocalDate bookingEndDate, LocalDate pickupDate, LocalDate dropDate){
        double bookEndComparePick = bookingEndDate.compareTo(pickupDate);
        double bookStartCompareDrop = bookingStartDate.compareTo(dropDate);
        if(bookEndComparePick<0 || bookStartCompareDrop>0){
            return false;
        }
        return true;
    }
    
    public static ArrayList<Car> getAvailableCars(String pickupLocation, String pickUpDate, String dropOffDate) throws IOException{
        ArrayList<Car> availableCars = new ArrayList<Car>();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate pickupDate = LocalDate.parse(pickUpDate, formatter);
        LocalDate dropDate = LocalDate.parse(dropOffDate, formatter);
        
        for(Car car: getCarList()){
            if(!car.getRentalCenter().equals(pickupLocation)){
                continue;
            }
            boolean available = true;
            for(CarBooking booking: CarBooking.getCarBookingList() ){
                if(booking.getCar().getCarId().equals(car.getCarId())){
                    if(!(booking.getRentalStatus()==RentalStatus.rejected)){
                        LocalDate  startDate = LocalDate.parse(booking.getPickupDate(), formatter);
                        LocalDate endDate = LocalDate.parse(booking.getDropOffDate(), formatter);
                        if(isClash(startDate, endDate, pickupDate, dropDate)){
                            available = false;
                            break;
                        }
                        
                    }

                    
                }

            }
            
            if(available){
                
                availableCars.add(car);
            }
            
        }
        
        
        
        return availableCars;
    }
    
    public static void writeIntoCarFile(ArrayList<Car> carList) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Car.txt"));
    
        
        
        for(Car theCar: carList){
            
           
            writer.write(theCar.getCarId() + ";" + theCar.getPlateNumber() + ";" + String.valueOf(theCar.getPassengerCapacity())+ ";" + String.valueOf(theCar.getLuggageCapacity()) + ";" + theCar.getTransmission() + ";" + theCar.getMake() + ";" + theCar.getModel() + ";" + String.valueOf(theCar.getManufacturingYear()) + ";" + String.valueOf(theCar.getPricePerHour())+ ";" + String.valueOf(theCar.getAvailabilityStatus()) + ";" + theCar.getRentalCenter() + "\n");
           
           
           
        }
        writer.close();
        
    }
    
    
    public static void registerNewCar(Car car) throws IOException{
        ArrayList<Car> carList = getCarList();
        carList.add(car);
        writeIntoCarFile(carList);
    }
    
    
    
    
    
    
    
    
    public static ArrayList<Car> filterPrice(ArrayList<Car> carlist, int selection){
        ArrayList<Car> newCarList = new ArrayList<Car>();

        for(Car car: carlist){
                double carPrice = car.getPricePerHour();
                if(selection == 1){
                    if(carPrice<50){
                        newCarList.add(car);
                    }
                }
                else if(selection == 2){
                    if(carPrice>=50 && carPrice<=150){
                        newCarList.add(car);
                    }
                }
                else if(selection == 3){
                    if(carPrice>150){
                        newCarList.add(car);
                    }
                }
                else if(selection == 4){
                    if(carPrice<=150){
                        newCarList.add(car);
                    }
                }
                else if(selection == 5){
                    if(carPrice>=50){
                        newCarList.add(car);
                    }
                }else if(selection == 6){
                    if(carPrice<50 || carPrice>150){
                        newCarList.add(car);
                    }
                }else{
                    newCarList.add(car);
                }
            }
        return newCarList;
        
    }
    
    public static ArrayList<Car> filterPassenger(ArrayList<Car> carList, int selection){
        ArrayList<Car> newCarList = new ArrayList<Car>();

        for(Car car: carList){
            int pasCap = car.getPassengerCapacity();
            if(selection == 1){
                if(pasCap<5){
                    newCarList.add(car);
                }
                
            }else if(selection == 2){
                if(pasCap>=5){
                    newCarList.add(car);
                }
            }else{
                newCarList.add(car);
            }
            
        }
        return newCarList;
    }
    
    
    
    public static ArrayList<Car> filterLuggage(ArrayList<Car> carList, int selection){
        ArrayList<Car> newCarList = new ArrayList<Car>();

        
        for(Car car: carList){
            double lugCap = car.getLuggageCapacity();
            if(selection == 1){
                if(lugCap<=10){
                    newCarList.add(car);
                }
                
            }else if(selection == 2){
                if(lugCap>10){
                    newCarList.add(car);
                }
            }else{
                newCarList.add(car);
            }
            
        }
        return newCarList;
    }
    
    
      
    
    public static ArrayList<Car> filterTransmission(ArrayList<Car> carList, int selection){
        ArrayList<Car> newCarList = new ArrayList<Car>();

        
        for(Car car: carList){
            String transmission = car.getTransmission().toString();
            if(selection == 1){
                if(transmission.equals("Auto")){
                    newCarList.add(car);
                }
                
            }else if(selection == 2){
                if(transmission.equals("Manual")){
                    newCarList.add(car);
                }
            }else{
                newCarList.add(car);
            }
            
        }
        return newCarList;
    }
    
    
    public static void modifyCar(Car currentCar) throws IOException{
        ArrayList<Car> carList = getCarList();
        for(Car car: carList){
            if(car.getCarId().equals(currentCar.getCarId())){
                car.setMake(currentCar.getMake());
                car.setModel(currentCar.getModel());
                car.setPlateNumber(currentCar.getPlateNumber());
                car.setPassengerCapacity(currentCar.getPassengerCapacity());
                car.setLuggageCapacity(Double.valueOf(currentCar.getLuggageCapacity()));
                car.setTransmission((currentCar.getTransmission()));
                car.setPricePerHour(currentCar.getPricePerHour());
                car.setManufacturingYear(currentCar.getManufacturingYear());
                car.setRentalCenter(currentCar.getRentalCenter());
                break;
            
            }
            
        }
        writeIntoCarFile(carList);
    }
    
    

    
    
    

    
    
    
    
}
