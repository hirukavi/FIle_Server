/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionProvider {
    public static Connection conn(){
        try{
            String url ="jdbc:mysql://localhost:3306/CMS";
            String user ="root";
            String pw ="";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection(url,user,pw); // database details-->connect database
           return conn;
           
        }
        catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
