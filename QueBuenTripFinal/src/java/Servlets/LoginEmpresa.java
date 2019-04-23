
package Servlets;
import Controlador.ConsultasEmpresa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tours.prograii.logic.EventoViewLogic;
import tours.prograii.objects.EventoViewObj;

@WebServlet(name = "LoginEmpresa", urlPatterns = {"/LoginEmpresa"})
public class LoginEmpresa extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario= request.getParameter("uname"); 
            String contrasena= request.getParameter("upass");  
           
            if(usuario !=null && contrasena !=null){
                 ConsultasEmpresa co = new ConsultasEmpresa();
           
           if(co.autenticacion(usuario, contrasena)) {
               HttpSession objsesion = request.getSession(true);
               objsesion.setAttribute("usuario", usuario);
               objsesion.setAttribute("contrasena", contrasena);
               
               EventoViewLogic ELogic = new EventoViewLogic();
                ArrayList<EventoViewObj> CArray = ELogic.getView();
                
                //send to frontend
                request.getSession().setAttribute("eventos", CArray);
               
               response.sendRedirect("InicioEmpresa.jsp");
           }else{
             response.sendRedirect("contrasenainvalida.html");
                   
               
           }
            }   
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}