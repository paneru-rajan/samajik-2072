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
public class replaceRef {
    
     public static void replaceRef(String refname,String jtitle,String oname,String refemail,String refphone)
            throws IOException, InvalidFormatException{
      
        
        
        XWPFDocument document = new XWPFDocument();
       XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:/Games/output3.docx"));
for (XWPFParagraph p : doc.getParagraphs()) {
    List<XWPFRun> runs = p.getRuns();
    if (runs != null) {
        for (XWPFRun r : runs) {
            String text = r.getText(0);
            if (text != null && text.contains("refname")) {
                text = text.replace("refname", refname);
                r.setText(text, 0);
            }
            if (text != null && text.contains("refemail")) {
                text = text.replace("refemail", refemail + " | " + refphone);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("jobinfor")) {
                text = text.replace("jobinfor", jtitle + " | " + oname );
                r.setText(text, 0);
            }
           
           
        }
    }
}
doc.write(new FileOutputStream("C:/Users/Diwas/Documents/NetBeansProjects/cvGenerator/web/output4.docx"));

               
            
            
        }
    
}
