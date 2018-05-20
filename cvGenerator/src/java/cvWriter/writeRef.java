
package cvWriter;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class writeRef extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String refname = request.getParameter("refname");
        String jtitle = request.getParameter("jtitle");
        String oname = request.getParameter("oname");
        String refemail = request.getParameter("refemail");
        String refphone = request.getParameter("refphone");

        out.println("The File is written");

         
         replaceRef r = new replaceRef();
        try {
            r.replaceRef(refname,jtitle,oname,refemail,refphone);
        } catch (InvalidFormatException ex) {
            System.out.print("Error");
        }
         
         response.sendRedirect("download.html");
         
   
}
    
   
}
