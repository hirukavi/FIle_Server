/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.Files;
import java.util.ArrayList;
import java.sql.*;

public class filesdao {
    public static void Upload(Files files){
        String query = "insert into files(fileName,Size,file_path)values('"+files.getFilename()+"','"+files.getSize()+"','"+files.getFile_path()+"')";
        DbOperations.setDataorDelete(query, "File added successfully.");
    }
    public static ArrayList<Files> getAllRecords(){
        ArrayList<Files> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from files");
            while (rs.next()){
                Files files = new Files();
                files.setFileID(rs.getInt("FileID"));
                files.setFilename(rs.getString("filename"));
                files.setSize(rs.getString("Size"));
                files.setFile_path(rs.getString("file_path"));
                arrayList.add(files);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void delete(String fileID){
        String query = "delete from files where fileID='"+fileID+"'";
        DbOperations.setDataorDelete(query, "File deleted successfully.");
    }
}
