/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIle_Sharing;

import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author DELL
 */
public class serve_handler implements Runnable  {
     
    
    private Socket cliSock;
    
    public serve_handler(Socket cliSocket) {
        this.cliSock=cliSocket;
        
    }

    @Override
    public void run() {
        try{
            PrintWriter out=new PrintWriter(cliSock.getOutputStream(),true); 
            
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }
    
}