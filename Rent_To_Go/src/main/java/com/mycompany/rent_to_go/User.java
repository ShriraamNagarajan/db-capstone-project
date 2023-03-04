/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Customer.getCustomerList;
import static com.mycompany.rent_to_go.Customer.writeIntoCustomerFile;
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
public class User{
    
    protected String userId;
    protected String name;
    protected String username;
    protected String email;
    protected String password;
    protected String role;
    protected String registeredDate;
    
    User(){
        System.out.println("hello2");
    }
    
    User(String name, String username, String email, String password, String role) throws IOException{
        this.userId = getNewUserId();
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.registeredDate = formatter.format(LocalDate.now());
        
    }
    
    User(String id, String name, String email, String username, String password, String registeredDate, String role){
        this.userId = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
 
        this.registeredDate = registeredDate;
        this.role=role;
        
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    private String getNewUserId() throws IOException{
        ArrayList<String[]> arrayLists = new ArrayList<String[]>();

        String line;
        int newInt;
        
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/User.txt"));
        while((line=reader.readLine()) != null){
            arrayLists.add(line.strip().split(";"));
        }
        if(arrayLists.size()==0){
            return "US1";
        }
        newInt = Integer.parseInt(arrayLists.get(arrayLists.size()-1)[0].substring(2)) + 1;
        return "US" + newInt;
                  
        
    }
    
    
    public static ArrayList<User> getUserList() throws FileNotFoundException, IOException{
        ArrayList<User> userList = new ArrayList<User>();
           
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/User.txt"));
        while((line=reader.readLine()) != null){
            String[] userData = line.strip().split(";");
            User currentUser = new User(userData[0], userData[1], userData[2], userData[3], userData[4], userData[5], userData[6]);
            userList.add(currentUser);
   
        }
        
        return userList;
        
    }
    
    
    public static void writeIntoUserFile(ArrayList<User> userList) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/User.txt"));
       
    
        
        
        for(User theUser: userList){
            
            
            writer.write(theUser.getUserId() + ";" + theUser.getName() + ";" + theUser.getEmail() + ";" + theUser.getUsername() + ";" + theUser.getPassword() + ";" + theUser.getRegisteredDate() + ";" + theUser.getRole() + "\n");
          
           
        }
        writer.close();
        
    }
    
    protected static void modifyUser(User currentUser) throws IOException{
           ArrayList<User> userList = getUserList();
           for(User user: userList){
               if(user.getUserId().equals(currentUser.getUserId())){
                   user.setEmail(currentUser.getEmail());
                   user.setUsername(currentUser.getUsername());
                   user.setPassword(currentUser.getPassword());
               }
           }
           writeIntoUserFile(userList);
        
    }
    
    
    
    public static User verifyLogin(String username, String password) throws IOException{
       
        ArrayList<User> userList = getUserList();
        for(User user: userList){
                if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                    return user;
                }
                
                    
            }
        return null;
    }


    
    public String generateNewId() {
        ArrayList<User> userList;
        try {
            userList = getUserList();
            int newInt;
            if(userList.size()==0){
                return "US1";
            }
            newInt = Integer.parseInt(userList.get(userList.size()-1).getUserId().substring(2)) + 1;
            return "US" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "US";
    }
    
    
    
    public static void recordLoginActivity(String activity) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/LoginRecord.txt", true));
        writer.write(activity+"\n");
        
        writer.close();

    }
    
    
}
