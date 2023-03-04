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
public class CreditCardPayment extends CreditCardValidator implements NewIdGenerator{
    private String cardId;
    private String cardHolderName;
    private String cvv;
    private String cardNumber;
    private String cardExpiryDate;
    
    public CreditCardPayment(String name, String cvv, String cardNum, String cardExpiry) throws IOException{
        this.cardId = generateNewId();
        this.cardHolderName = name;
        this.cvv = cvv;
        this.cardNumber = cardNum;
        this.cardExpiryDate = cardExpiry;
    }
    
    
    public CreditCardPayment(String id, String name, String cvv, String cardNum, String cardExpiry) throws IOException{
        this.cardId = id;
        this.cardHolderName = name;
        this.cvv = cvv;
        this.cardNumber = cardNum;
        this.cardExpiryDate = cardExpiry;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }
    
    public String getNewCreditCardId() throws FileNotFoundException, IOException{
        ArrayList<String[]> arrayLists = new ArrayList<String[]>();

        String line;
        int newInt;
        
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/CreditCardPayment.txt"));
        while((line=reader.readLine()) != null){
            arrayLists.add(line.strip().split(";"));
        }
        if(arrayLists.size()==0){
            return "CC1";
        }
        newInt = Integer.parseInt(arrayLists.get(arrayLists.size()-1)[0].substring(2)) + 1;
        return "CC" + newInt;
    }
    
    
            
    public static void writeIntoCreditCardPaymentFile(ArrayList<CreditCardPayment> creditCardList) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/CreditCardPayment.txt"));
    
        
        
        for(CreditCardPayment card: creditCardList){
            

           writer.write(card.getCardId() + ";" + card.getCardHolderName() + ";" + card.getCvv() + ";" + card.getCardNumber() + ";" + card.getCardExpiryDate() + "\n");
           
           
        }
        writer.close();
        
    }
    
    
    
        
    public static ArrayList<CreditCardPayment> getCreditCardPaymentList() throws IOException{
        
        ArrayList<CreditCardPayment> creditCardPaymentList = new ArrayList<CreditCardPayment>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/CreditCardPayment.txt"));
        while((line=reader.readLine()) != null){
            String[] creditCardData = line.strip().split(";");
            CreditCardPayment currentCard = new CreditCardPayment(creditCardData[0], creditCardData[1], creditCardData[2], creditCardData[3], creditCardData[4]);
            creditCardPaymentList.add(currentCard);
   
        }
        
        return creditCardPaymentList;
        
    }
    
    
    public static CreditCardPayment getCreditCardPayment(String cardId) throws IOException{
        ArrayList<CreditCardPayment> creditCardPaymentList = getCreditCardPaymentList();
       
        for(CreditCardPayment creditCardPayment: creditCardPaymentList){
            if(creditCardPayment.getCardId().equals(cardId)){
                 return creditCardPayment;
            }
        }
        return creditCardPaymentList.get(0);
        
    }
    
    public static void registerCreditCard(CreditCardPayment card) throws IOException{
        ArrayList<CreditCardPayment> creditPaymentList = getCreditCardPaymentList();
        creditPaymentList.add(card);
        writeIntoCreditCardPaymentFile(creditPaymentList);
        
    }

    @Override
    public String generateNewId() {
        ArrayList<CreditCardPayment> cardList;
        try {
            cardList = getCreditCardPaymentList();
            int newInt;
            if(cardList.size()==0){
                return "CC1";
            }
            newInt = Integer.parseInt(cardList.get(cardList.size()-1).getCardId().substring(2)) + 1;
            return "CC" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(CreditCardPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "CC";
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
    
    
}
