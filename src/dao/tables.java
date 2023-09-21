/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class tables {
    public static void main(String[] args) {
        try{
            String userTable ="create table user(id int AUTO_INCREMENT primary key, name varchar(20),email varchar(200),mnumber varchar(11),password varchar(20),UNIQUE(email) )";
            String adminDetails ="insert into user(name,email,mnumber,password) values('Admin','admin@gmail.com','0770435366','1234')";
            String fileTable = "create table files(fileID int PRIMARY KEY AUTO_INCREMENT ,filename VARCHAR(255),Size VARCHAR(100),file_path VARCHAR(255))";
            DbOperations.setDataorDelete(userTable, "User table created successfully.");
            DbOperations.setDataorDelete(adminDetails, "Admin details added successfully.");
            DbOperations.setDataorDelete(fileTable, "File added successfully.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

