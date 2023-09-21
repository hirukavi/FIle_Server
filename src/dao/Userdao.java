/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

public class Userdao {
   public static void save(User user) {
    String query = "insert into user(name,email,mnumber,password) values(?,?,?,?)";
    
    try (Connection con = ConnectionProvider.conn();
        PreparedStatement preparedStatement = con.prepareStatement(query)) {
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getMnumber());
        preparedStatement.setString(4, user.getPassword());
        
        preparedStatement.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Sign in Successfully.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
    }
}

    
    public static User Login(String email, String password){
        User user = null;
        
        try{
            ResultSet rs = DbOperations.getData("Select * from user where email='"+email+"'and password='"+password+"'");
            while(rs.next()){
                user = new User();
                
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
