package writeFiles;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "writeToDocx")
public class writeToDocx extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String tempadd = request.getParameter("tempadd");
        String permadd = request.getParameter("permadd");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String religion = request.getParameter("religion");
        String nationality = request.getParameter("nation");


        try {
            File myCv = new File("myCV.docx");
            PrintWriter output = new PrintWriter(myCv);
            output.println(name);
            output.close();

        } catch (FileNotFoundException ex) {


        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
