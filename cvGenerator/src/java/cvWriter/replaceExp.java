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
public class replaceExp {
    
    
     public static void replaceExp(String startdate,String enddate,String organization,String joblocation,String jobtitle,String joblevel,String summary)
            throws IOException, InvalidFormatException{
      
        
        
        XWPFDocument document = new XWPFDocument();
       XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:/Games/output2.docx"));
for (XWPFParagraph p : doc.getParagraphs()) {
    List<XWPFRun> runs = p.getRuns();
    if (runs != null) {
        for (XWPFRun r : runs) {
            String text = r.getText(0);
            if (text != null && text.contains("dateexperience")) {
                text = text.replace("dateexperience", startdate + "-" + enddate);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("jobinfo")) {
                text = text.replace("jobinfo", jobtitle + " | " + joblevel + " | " + organization);
                r.setText(text, 0);
            }
           else if (text != null && text.contains("jobsummary")) {
                text = text.replace("jobsummary", summary);
                r.setText(text, 0);
            }
        }
    }
}
doc.write(new FileOutputStream("C:/Games/output3.docx"));

               
            
            
        }
    
    
    
}
