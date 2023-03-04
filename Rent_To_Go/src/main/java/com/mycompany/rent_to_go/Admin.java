/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rent_to_go;

import static com.mycompany.rent_to_go.Customer.getCustomerList;
import static com.mycompany.rent_to_go.Customer.writeIntoCustomerFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Admin extends User{
    private String adminId;
    
 
    
    public Admin(String id, String name, String username, String email, String password, String registeredDate, String adminId){
        super(id, name, email, username, password, registeredDate, "Admin");
        this.adminId = adminId;
        
        
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    public static void writeIntoAdminFile(ArrayList<Admin> adminList) throws IOException{
        
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Admin.txt"));
    
        
        
        for(Admin theAdmin: adminList){
            
           
            writer.write(theAdmin.getAdminId() + ";" + theAdmin.getUserId() + "\n");
           
           
           
        }
        writer.close();
        
    }
    
    
    public static ArrayList<Admin> getAdminList() throws IOException{
        ArrayList<Admin> adminList  = new ArrayList<Admin>();

        
        ArrayList<String[]> adminData = new ArrayList<String[]>();
        
        ArrayList<User> userList = User.getUserList();
        
        
        
        String line;
      
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Admin.txt"));
        
        while((line=reader.readLine()) != null){
            adminData.add(line.strip().split(";"));
   
        }
     
        
        for(String[] admin: adminData){
            for(User user: userList){
              
                if(admin[1].equals(user.getUserId())){
                   
                    Admin currentAdmin = new Admin(user.getUserId(), user.getName(), user.getUsername(), user.getEmail(), user.getPassword(), user.getRegisteredDate(), admin[0]);
                  
                    adminList.add(currentAdmin);
                }
            }
        }
        
        return adminList;
    }
    
    public static Admin getAdmin(String userId) throws IOException{
        ArrayList<Admin> adminList = getAdminList();
        for(Admin admin: adminList){
            if(admin.getUserId().equals(userId)){
                return admin;
            }
        }
        return adminList.get(0);
    }
    
    
    public static void modifyAdmin(Admin currentAdmin) throws IOException{
           ArrayList<Admin> adminList = getAdminList();
           for(Admin admin: adminList){
               if(admin.getAdminId().equals(currentAdmin.getAdminId())){
                   admin.setEmail(currentAdmin.getEmail());
  
                   admin.setPassword(currentAdmin.getPassword());
                   User.modifyUser(admin);
                   break;
               }
           }
           writeIntoAdminFile(adminList);
    }
    
    
    
}
