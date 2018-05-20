
package cvWriter;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class writeExp extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String startdate = request.getParameter("startdate");
        String enddate = request.getParameter("enddate");
        String orgname = request.getParameter("organization");
        String joblocation = request.getParameter("joblocation");
        String jobtitle = request.getParameter("jobtitle");
        String joblevel = request.getParameter("joblevel");
        String summary = request.getParameter("summary");



        out.println("The File is written");

         
         replaceExp r = new replaceExp();
        try {
            r.replaceExp(startdate,enddate,orgname,joblocation,jobtitle,joblevel,summary);
        } catch (InvalidFormatException ex) {
            System.out.print("Error");
        }
         
         response.sendRedirect("index.jsp");
         
   
}
   
}
