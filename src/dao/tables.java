/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Rampukar
 */
public class tables {
    public static void main(String[] args) {
        try{
            //String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','Nepal','admin','What primary school did you attend?','ABC','true')";
//            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
//            String TableNo = "create table Tables(id int AUTO_INCREMENT primary key,tablenumber varchar(3))";
//            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
//            String billTable = "create table bill(id int primary key,tablenumber varchar(3),name varchar(200),mobileNumber numeric(10,0),email varchar(30),date varchar(50),total varchar(200),createdBy varchar(200))";
            //DbOperations.setDataorDelete(userTable, "User Table Created Successfully!");
            DbOperations.setDataorDelete(adminDetails, "Admin Details Added Successfully!");
//            DbOperations.setDataorDelete(categoryTable, "Category Table Created Successfully!");
//            DbOperations.setDataorDelete(TableNo, "TableNo. Created Successfully!");
//            DbOperations.setDataorDelete(productTable, "Product Table Created Successfully!");
//            DbOperations.setDataorDelete(billTable, "Bill Table Created Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
