/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class DrivingLicence extends DrivingLicenceValidator{
    private String licenceNumber;
    private String validityDate;
    
    public DrivingLicence(String num, String valid){
        this.licenceNumber=num;
        this.validityDate=valid;
        
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    
    public static boolean licenceNumberValidator(String licenceNumber) {
        if(licenceNumber.matches("[0-9]+") && licenceNumber.length()==12){
            return true;
        }
        return false;
    }

    
    public static boolean expiryDateValidator(Calendar c) {
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
    
    
}
