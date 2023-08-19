/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

/**
 *
 * @author Emmanuel
 */
import java.io.IOException;
import java.net.InetAddress;
public class clsIP {
 public String obtenerIP(){
     String strIP="";
     try{
     InetAddress objIA=InetAddress.getLocalHost();
     strIP=objIA.getHostAddress();
     System.out.println(strIP);
 }
 catch(IOException e){
    e.printStackTrace();
    strIP="";
}
 return strIP;
}
}

