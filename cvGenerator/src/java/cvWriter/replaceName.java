/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;   
 import org.apache.poi.xwpf.usermodel.XWPFRun;  
/**
 *
 * @author Diwas
 */
public class replaceName {
    
    public static void replaceName(String name,String phone,String email,String tempadd,String permadd)
            throws IOException, InvalidFormatException{
      
        
        
        XWPFDocument document = new XWPFDocument();
       XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:/Games/templates.docx"));
for (XWPFParagraph p : doc.getParagraphs()) {
    List<XWPFRun> runs = p.getRuns();
    if (runs != null) {
        for (XWPFRun r : runs) {
            String text = r.getText(0);
            if (text != null && text.contains("__Name__")) {
                text = text.replace("__Name__", name);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("__email__")) {
                text = text.replace("__email__", email);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("__phone__")) {
                text = text.replace("__phone__", phone);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("temporary")) {
                text = text.replace("temporary",tempadd);
                r.setText(text, 0);
                System.out.print("I was here at tempadd");
            }
           else if (text != null && text.contains("__permadd__")) {
                text = text.replace("__permadd__",permadd);
                r.setText(text, 0);
                System.out.print("I was here at permadd");
            }
        }
    }
}
doc.write(new FileOutputStream("C:/Games/output.docx"));

               
            
            
        }
    
        
        
    }
    

