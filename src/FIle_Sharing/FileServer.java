package FIle_Sharing;


import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.Arrays;

public class FileServer {

    private static final String UPLOAD_DIRECTORY = "uploads"; // Define the directory for uploaded files

    public static void main(String[] args) {
        
        final int PORT = 8080;
        try (ServerSocket ServSock = new ServerSocket(PORT)){
            System.out.println("Server Listening Port : " + PORT);
            
            while(true){
                
                Socket cliSocket=ServSock.accept();
                System.out.println("New Client Connected..,!" + cliSocket.getInetAddress());
                
                Thread clientThrd=new Thread(new serve_handler(cliSocket));
                clientThrd.start();
                
            }
            
        } catch (Exception e) { 
        }
        
        
    }    
}

