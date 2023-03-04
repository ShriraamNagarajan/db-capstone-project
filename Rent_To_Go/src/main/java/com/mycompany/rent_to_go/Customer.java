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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Customer extends User implements NewIdGenerator{


    public enum ApprovalStatus{
        Pending,
        Approved,
        Rejected;
    }
    private String customerId;
    private String address;
    private DrivingLicence licence;
    private ApprovalStatus approvalStatus;
    
    Customer(){
        super();

    }
    
    Customer(String id, String name, String username, String email, String password, String registeredDate, String customerId, String address, String validityDate, String licenceNum, String approvalStatus){
        super(id, name, email, username, password, registeredDate, "Customer");
        this.customerId = customerId;
        this.address = address;
        this.licence = new DrivingLicence(licenceNum, validityDate);
        this.setApprovalStatus(approvalStatus);

      
        
    }
    
    Customer(String name, String username, String email, String password, String address, String validityDate, String licenceNum) throws IOException{
        super(name, username, email, password, "Customer");
        this.customerId = generateNewId();
        this.address=address;
        this.licence = new DrivingLicence(licenceNum, validityDate);
        this.approvalStatus = ApprovalStatus.Pending;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DrivingLicence getLicence() {
        return licence;
    }

    public void setLicence(DrivingLicence licence) {
        this.licence = licence;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
    
    public void setApprovalStatus(String approvalStatus){
        switch(approvalStatus){
            case "Pending":
                this.approvalStatus = ApprovalStatus.Pending;
                break;
            case "Rejected":
                this.approvalStatus = ApprovalStatus.Rejected;
                break;
            default:
                this.approvalStatus = ApprovalStatus.Approved;
                break;
        }
        
    }

    
    

    
    
    public static ArrayList<Customer> getCustomerList() throws IOException{
        ArrayList<Customer> customerlist  = new ArrayList<Customer>();

        
        ArrayList<String[]> customerData = new ArrayList<String[]>();
        
        ArrayList<User> userList = User.getUserList();       
        
        String line;
      
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/mycompany/rent_to_go/Data/Customer.txt"));
        
        while((line=reader.readLine()) != null){
            customerData.add(line.strip().split(";"));
   
        }
        
        for(String[] cust: customerData){
            for(User user: userList){
                if(cust[1].equals(user.getUserId())){
                    Customer currentCustomer = new Customer(user.getUserId(), user.getName(), user.getUsername(), user.getEmail(), user.getPassword(), user.getRegisteredDate(), cust[0], cust[2], cust[4], cust[3],cust[5]);
                    customerlist.add(currentCustomer);
                }
            }
        }
        
        return customerlist;
    }
    
    public static ArrayList<Customer> getApprovedCustomerList() throws IOException{
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        for(Customer customer: getCustomerList()){
          if(customer.getApprovalStatus().toString().equals("Approved")){
              customerList.add(customer);
          }
        }
        return customerList;
        
        
    }
    
    public static ArrayList<Customer> getNewCustomerList() throws IOException{
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        for(Customer customer: getCustomerList()){
          if(customer.getApprovalStatus().toString().equals("Pending")){
              customerList.add(customer);
          }else{
            continue;
        }
        }
        return customerList;
        
        
    }
    
    public static Customer getCustomer(User user) throws IOException{
        ArrayList<Customer> customerList = getCustomerList();
        for(Customer customer: customerList){
            if(customer.getUserId().equals(user.userId)){
                return customer;
            }
        }
        return customerList.get(0);
    }
    
    public static Customer getCustomer(String customerId) throws IOException{
        ArrayList<Customer> customerList = getCustomerList();
       
        for(Customer customer: customerList){
            if(customer.getCustomerId().equals(customerId)){
                 return customer;
            }
        }
        return customerList.get(0);
     
    }
    
    public static void writeIntoCustomerFile(ArrayList<Customer> customerList) throws IOException{
              
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/com/mycompany/rent_to_go/Data/Customer.txt"));
    
        
        
        for(Customer theCustomer: customerList){
            
           
            writer.write(theCustomer.getCustomerId() + ";" + theCustomer.getUserId() + ";" + theCustomer.getAddress() + ";" +  theCustomer.getLicence().getLicenceNumber() + ";" + theCustomer.getLicence().getValidityDate() + ";" + theCustomer.getApprovalStatus() + "\n");
           
           
           
        }
        writer.close();
        
    }
    
    public static void saveCustomer(Customer customer) throws IOException{
        ArrayList<Customer> customerList = getCustomerList();
        customerList.add(customer);
        ArrayList<User> userList = new ArrayList<User>();
        if(User.getUserList().size()>0){
            userList.add(User.getUserList().get(0));
        }
        for(Customer currentcustomer: customerList){
            userList.add(currentcustomer);
            }
        User.writeIntoUserFile(userList);

        Customer.writeIntoCustomerFile(customerList);

        
       
            
    }
    
    public static void modifyCustomer(Customer currentCustomer) throws IOException{
           ArrayList<Customer> customerList = getCustomerList();
           for(Customer customer: customerList){
               if(customer.getCustomerId().equals(currentCustomer.getCustomerId())){
                   customer.setEmail(currentCustomer.getEmail());
                   customer.setAddress(currentCustomer.getAddress());
                   customer.setPassword(currentCustomer.getPassword());
                   customer.setApprovalStatus(currentCustomer.getApprovalStatus());
                   customer.setUsername(currentCustomer.getUsername());
                   User.modifyUser(customer);
                   break;
               }
           }
           writeIntoCustomerFile(customerList);
    }
    
    @Override
    public String generateNewId() {
        ArrayList<Customer> customerList;
        try {
            customerList = getCustomerList();
            int newInt;
            if(customerList.size()==0){
                return "CUS1";
            }
            newInt = Integer.parseInt(customerList.get(customerList.size()-1).getCustomerId().substring(3)) + 1;
            return "CUS" + newInt;
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "CUS";
    }
    
    
    @Override
    public String toString(){
        return this.getCustomerId() + ";" + this.getUserId() + ";" + this.getAddress() + ";" +  this.getLicence().getLicenceNumber() + ";" + this.getLicence().getValidityDate() + ";" + this.getApprovalStatus();
    }

}
