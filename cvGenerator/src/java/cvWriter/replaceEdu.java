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
public class replaceEdu {
    
     public static void replaceEdu(String schoolname,String degreename,String dograd,String majorfield,String gpa)
            throws IOException, InvalidFormatException{
      
        
        
        XWPFDocument document = new XWPFDocument();
       XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:/Games/output1.docx"));
for (XWPFParagraph p : doc.getParagraphs()) {
    List<XWPFRun> runs = p.getRuns();
    if (runs != null) {
        for (XWPFRun r : runs) {
            String text = r.getText(0);
            if (text != null && text.contains("schoolname")) {
                text = text.replace("schoolname", schoolname);
                r.setText(text, 0);
            }
            if (text != null && text.contains("majorfield")) {
                text = text.replace("majorfield", majorfield);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("degreename")) {
                text = text.replace("degreename", degreename + " | " + dograd );
                r.setText(text, 0);
            }
           else if (text != null && text.contains("mygpa")) {
                text = text.replace("mygpa", gpa); 
                r.setText(text, 0);
            }
           
        }
    }
}
doc.write(new FileOutputStream("C:/Games/output2.docx"));

               
            
            
        }
    
}
