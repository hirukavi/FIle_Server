/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;

public class DbOperations {
    public static void setDataorDelete(String Query,String msg){
        try{
            Connection con = ConnectionProvider.conn();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static ResultSet getData(String query){
        try{
           Connection conn = ConnectionProvider.conn();
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query);
           return rs; 
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
