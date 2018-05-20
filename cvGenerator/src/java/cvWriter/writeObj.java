/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvWriter;

import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class writeObj extends HttpServlet {

   
    
     public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String objective = request.getParameter("objective");
        String skills = request.getParameter("skills");
        out.println("The File is written");

         
         replaceObj r = new replaceObj();
        try {
            r.replaceObj(objective,skills);
        } catch (InvalidFormatException ex) {
            System.out.print("Error");
        }
         
         response.sendRedirect("index.jsp");
         
   
}

    
}

