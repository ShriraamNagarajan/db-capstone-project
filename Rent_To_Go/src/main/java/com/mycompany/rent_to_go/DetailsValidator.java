/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class DetailsValidator {
    public static boolean passwordValidator(String password){
        if(password.length()>=8){
            return true;
        }
        return false;
    }
    
    public static boolean licenceNumberValidator(String licenceNumber){
        if(licenceNumber.matches("[0-9]+") && licenceNumber.length()==12){
            return true;
        }
        return false;
    }
    
    public static boolean usernameExists(String username) throws IOException{
        ArrayList<User> userList = User.getUserList();
        for(User user: userList){
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
        
              
    }
    
    public static boolean emailValidator(String emailAddress){

        
        String regex = "[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        
        return matcher.matches();
            
    }
    
    
    public static boolean bookingDateValidator(Calendar c1, Calendar c2, int pickupHour, int dropOffHour, Date pickupDate, Date dropDate){
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        if(c1==null || c2==null){
            return false;
        }else if(pastDateValidator(c1) || pastDateValidator(c2)){
            return false;
        }else if(c2.compareTo(c1)<0){
            return false;
        }
        else{
            if(dateFormat.format(pickupDate).equals(dateFormat.format(dropDate))){
                
                if(dropOffHour<=pickupHour){
                    return false;
                }
            }
  

            return true;
        }
    }
    

    
    public static boolean pastDateValidator(Calendar c){
         LocalDate localDate = LocalDate.now();

         ZoneId zoneId = ZoneId.systemDefault();
         Date date = Date.from(localDate.atStartOfDay(zoneId).toInstant());
         Calendar currentDate = Calendar.getInstance();
         currentDate.setTime(date);
         if(c.before(currentDate)){
             return true;
         }else{
             return false;
         }
       
         
   }
    
    public static boolean validateCardExpiryDate(String expiryDate) {
        return expiryDate.matches("(?:0[1-9]|1[0-2])/[0-9]{2}");
    }
    
    
    public static boolean cvvValidator(String cvv){
        if(cvv.matches("[0-9]+") && cvv.length()==3){
            return true;
        }
        return false;
    }
    
    public static boolean cardNumberValidator(String cardNumber){
        if(cardNumber.matches("[0-9]+") && (cardNumber.length()>=10&&cardNumber.length()<=19)){
            return true;
        }
        return false;
    }
    
    
    public static boolean priceValidator(String price){
        final String regExp = "[0-9]+([.][0-9]{1,2})?";
        return price.matches(regExp);
    }
    
    public static boolean weightValidator(String weight){
        final String regExp = "[0-9]+([.][0-9]+)?";
        return weight.matches(regExp);
    }
    

    public static boolean numberValidator(String num){
        if(num.matches("[0-9]+")){
            return true;
        }
        return false;
    }
    
    public static boolean pastYearValidator(String year){
        if(numberValidator(year)){
            if(Integer.valueOf(year)>LocalDate.now().getYear()){
                return false;
            }else{
                return true;
            }
            
        }else{
            return false;
        }
    }
    
}
