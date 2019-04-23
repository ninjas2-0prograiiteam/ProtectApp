package Servlets;

import Controlador.Consultas;
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
import tours.prograii.logic.UsuariosLogic;
import tours.prograii.objects.EventoViewObj;
import tours.prograii.objects.UsuariosObj;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    static int LoginId;
    String strLoginId;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario= request.getParameter("uname"); 
            String contrasena= request.getParameter("upass");  
           
            if(usuario !=null && contrasena !=null){
                 Consultas co = new Consultas();
           
           if(co.autenticacion(usuario, contrasena)) {
               HttpSession objsesion = request.getSession(true);
               objsesion.setAttribute("usuario", usuario);
               objsesion.setAttribute("contrasena", contrasena);
               
               EventoViewLogic ELogic = new EventoViewLogic();
                ArrayList<EventoViewObj> CArray = ELogic.getView();
                
              UsuariosLogic ULogic = new UsuariosLogic();
              UsuariosObj UArray = ULogic.getUsersByUsername(usuario);
                
                LoginId = UArray.getId();
                strLoginId = Integer.toString(LoginId);
                
                System.out.println(strLoginId);
                
                
                
                //send to frontend
                request.getSession().setAttribute("eventos", CArray);
                request.getSession().setAttribute("strLoginId", strLoginId);
               
               response.sendRedirect("InicioUsuario.jsp");
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