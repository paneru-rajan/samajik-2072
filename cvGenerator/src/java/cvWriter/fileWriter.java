/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
/**
 *
 * @author Diwas
 */
public class fileWriter {
    public static void creator(String name,String Email){
        
         File file = new File("C:\\Games\\1.docx");
            
        try{
        PrintWriter output = new PrintWriter(file);
        output.println(name);
        output.println(Email);
        output.close();
        }catch(IOException ex){
            System.out.printf("Error : %s",ex);
    }
    
}
}

