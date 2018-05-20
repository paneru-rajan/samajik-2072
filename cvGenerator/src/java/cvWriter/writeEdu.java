
package cvWriter;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class writeEdu extends HttpServlet {

     public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String degreename = request.getParameter("degree");
        String majorfield = request.getParameter("eprogram");
        String eboard = request.getParameter("eboard");
        String schoolname = request.getParameter("nameofins");
        String startdate = request.getParameter("startdate");
        String gpa = request.getParameter("marks");
        String dograd = request.getParameter("gdate");



        out.println("The File is written");

         
         replaceEdu r = new replaceEdu();
        try {
            r.replaceEdu(schoolname,degreename,dograd,majorfield,gpa);
        } catch (InvalidFormatException ex) {
            System.out.print("Error");
        }
         
         response.sendRedirect("index.jsp");
         
   
}
    
    
}
