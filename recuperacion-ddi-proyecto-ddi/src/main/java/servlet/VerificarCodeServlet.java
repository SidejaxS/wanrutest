package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Votantes;

import org.h2.engine.User;

public class VerificarCodeServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, Votantes votante)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            User user= (User) session.getAttribute("authcode");
            
            String code = request.getParameter("authcode");
 
			if(code.equals(votante.getCode())){
                out.println("Verification Done");
            }else{
                out.println("Incorrect verification code");
            }
            
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, null);
    }

}
