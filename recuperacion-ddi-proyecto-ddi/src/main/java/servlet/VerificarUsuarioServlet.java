package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Votantes;
import model.EnviarCorreo;


public class VerificarUsuarioServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //feth form value
           String nombre = request.getParameter("nombre");
           String email = request.getParameter("email");
           
      		//create instance object of the SendEmail Class
           EnviarCorreo ec = new EnviarCorreo();
      		//get the 6-digit code
           String code = ec.getRandom();
           
      		//craete new user using all information
           Votantes votante = new Votantes(0, nombre,0, email, code);
           
           //call the send email method
           boolean test = ec.enviarCorreo(votante);
           
      		//check if the email send successfully
           if(test){
               HttpSession session  = request.getSession();
               session.setAttribute("authcode", votante);
               response.sendRedirect("Verificar.jsp");
           }else{
      		  out.println("Failed to send verification email");
      	   }
           
        }
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
