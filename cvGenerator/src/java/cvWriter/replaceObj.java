
package cvWriter;

import java.io.File;
import java.io.FileNotFoundException;
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
public class replaceObj {
    

  public static void replaceObj(String objective,String skills)
  throws IOException, InvalidFormatException{
      
   XWPFDocument document = new XWPFDocument();
   XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:/Games/output.docx"));
for (XWPFParagraph p : doc.getParagraphs()) {
    List<XWPFRun> runs = p.getRuns();
    if (runs != null) {
        for (XWPFRun r : runs) {
            String text = r.getText(0);
            if (text != null && text.contains("__objective__")) {
                text = text.replace("__objective__", objective);
                r.setText(text, 0);
                System.out.println("I was in objective");
            }
            if (text != null && text.contains("myskills")) {
                text = text.replace("myskills", skills);
                r.setText(text, 0);
                System.out.println("I was in skill");
            }
        }
    }
}

FileOutputStream fos = new FileOutputStream(new File("C:/Games/output1.docx"));
doc.write(fos);            
            
        }

    

    }

