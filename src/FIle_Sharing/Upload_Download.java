package FIle_Sharing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author This PC
 */
public class Upload_Download{
    
    void upload(){
        
        String srcAdd = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\FIle_Server\\src\\FIle_Sharing\\img3.jpg";
        String destAdd = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\FIle_Server\\src\\Database\\img3.jpg";
        
        System.out.println(destAdd);
        try {
            FileChannel srcChnl = FileChannel.open(Paths.get(srcAdd), StandardOpenOption.READ);
            FileChannel destChnl = FileChannel.open(Paths.get(destAdd), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            ByteBuffer buff = ByteBuffer.allocate(1024);
            
            
            while(srcChnl.read(buff)!=-1 || buff.position()>0){
                buff.flip();
                while(buff.hasRemaining()){
                    destChnl.write(buff);
                }
                buff.clear();
            }
            srcChnl.close();
            destChnl.close();
            Uploading down=new Uploading();
            down.setVisible(true);
            
            System.out.println("File Uploaded SuccessFully.....!!!!");
                
            
        } catch (IOException e) {
            System.out.println("Please Select a file ");
            
            e.printStackTrace();
        }
        
        
        
    }
    void download(){
        
        String srcAdd = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\FIle_Server\\src\\Database\\img3.jpg";
        String destAdd = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\FIle_Server\\src\\FIle_Sharing\\img3.jpg";
        
        System.out.println(destAdd);
        try {
            FileChannel srcChnl = FileChannel.open(Paths.get(srcAdd), StandardOpenOption.READ);
            FileChannel destChnl = FileChannel.open(Paths.get(destAdd), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            ByteBuffer buff = ByteBuffer.allocate(1024);
            
            
            while(srcChnl.read(buff)!=-1 || buff.position()>0){
                buff.flip();
                while(buff.hasRemaining()){
                    destChnl.write(buff);
                }
                buff.clear();
            }
            srcChnl.close();
            destChnl.close();
            Downloading down=new Downloading();
            down.setVisible(true);
            System.out.println("File Uploaded SuccessFully.....!!!!");
                
            
        } catch (IOException e) {
            System.out.println("Please Select a file ");
            
            e.printStackTrace();
        }
        
        
        
    }

    
}


