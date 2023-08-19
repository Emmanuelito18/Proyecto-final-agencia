/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;
import java.io.BufferedWriter;
import java.io.File; //crea el archivo
import java.io.FileWriter;//controla en donde se escribr
import java.io.IOException;//controla errores
/**
 *+++
 * @author Emmanuel
 */
public class clsFormulario {
    public void CrearArchivo(String strInfo,String strDatos){
        String strRuta="C:\\Users\\holas\\Desktop\\Boleto.txt";
        String strTexto=strDatos;
        String strInformacion=strInfo;
        
        try{
            File objArchivo=new File(strRuta);
            if(!objArchivo.exists()){
                objArchivo.createNewFile();
            }
            FileWriter objFW=new FileWriter(objArchivo);
            BufferedWriter objBF=new BufferedWriter(objFW);
            
            objBF.write(strInformacion);
            objBF.newLine();
            objBF.write(strTexto);
            objBF.close();
        }
        catch(IOException ex){
        System.out.print(ex.getMessage());
        }
        //
    }
}
