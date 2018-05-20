/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
/**
 *
 * @author Diwas
 */
public class writeToDocx extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String objective = request.getParameter("objective");

        String tempadd = request.getParameter("tempadd");
        String permadd = request.getParameter("permadd");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String religion = request.getParameter("religion");
        String nationality = request.getParameter("nation");
        out.println("The File is written");

         
         replaceName r = new replaceName();
        try {
            r.replaceName(name,phone,email,tempadd,permadd);
        } catch (InvalidFormatException ex) {
            System.out.print("Error");
        }
         
         response.sendRedirect("index.jsp");
         
   
}
    
}

