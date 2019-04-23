
package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.DepLogic;
import tours.prograii.logic.UsuariosLogic;
import tours.prograii.objects.DepartamentosObj;
import tours.prograii.objects.EventoViewObj;
import tours.prograii.objects.UsuariosObj;

@WebServlet(name = "UsuariosServlet", urlPatterns = {"/UsuariosServlet"})
public class UsuariosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strFormId = request.getParameter("formid");
            
            if(strFormId.equals("1"))
            {
                String strNombre = request.getParameter("nombre");
                String strApellido = request.getParameter("apellido");
                String strEdad = request.getParameter("edad");
                String strDui = request.getParameter("dui");
                String strEmail = request.getParameter("email");
                String strUsername = request.getParameter("user");
                String strPassword = request.getParameter("contra");
                String strIdDepartamento = request.getParameter("departamento");
                int iEdad = Integer.parseInt(strEdad);
                int iDui = Integer.parseInt(strDui);
                int iIdDepartamento = Integer.parseInt(strIdDepartamento);
                
                UsuariosLogic ULogic = new UsuariosLogic();
                int iRows = ULogic.RegistrarNuevoUsuarioInt
                (strNombre, strApellido, iEdad, iDui, strEmail, strUsername, strPassword, iIdDepartamento);
                 System.out.println("inser client rows: " + iRows);
                 
                request.getSession().setAttribute("rows", iRows);
                response.sendRedirect("cuentacreada.jsp");
            }
            
            if(strFormId.equals("2")){
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                UsuariosLogic ULogic = new UsuariosLogic();
                int iRows = ULogic.BorrarUsuario(iId);
                
                request.getSession().setAttribute("rows", iRows);
                response.sendRedirect("Baja.jsp");
            }
            
            if(strFormId.equals("3")){
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                DepLogic DLogic = new DepLogic();
                ArrayList<DepartamentosObj> CArray = DLogic.getAllDeps();

                request.getSession().setAttribute("departamentos", CArray);
                UsuariosLogic ULogic = new UsuariosLogic();
                UsuariosObj UObj = ULogic.getUsersById(iId);
                
                request.getSession().setAttribute("users", UObj);
                response.sendRedirect("usuariosUpdateForm.jsp");
            }
            
            if(strFormId.equals("4")){
                String strId = request.getParameter("id");
               String strNombre = request.getParameter("nombre");
                String strApellido = request.getParameter("apellido");
                String strEdad = request.getParameter("edad");
                String strDui = request.getParameter("dui");
                String strEmail = request.getParameter("email");
                String strUsername = request.getParameter("user");
                String strPassword = request.getParameter("contra");
                String strIdDepartamento = request.getParameter("departamento");
                int iEdad = Integer.parseInt(strEdad);
                int iDui = Integer.parseInt(strDui);
                int iId = Integer.parseInt(strId);
                int iIdDepartamento = Integer.parseInt(strIdDepartamento);
                
                UsuariosLogic ULogic = new UsuariosLogic();
                int iRows = ULogic.ActualizarUsuario(iId, strNombre, strApellido, iEdad, iDui, strEmail, strUsername, strPassword, iIdDepartamento) ;
                System.out.println("update client rows: " + iRows);
                
                request.getSession().setAttribute("rows", iRows);
                response.sendRedirect("ActualizacionUsuario.jsp");
                
            }
            
            if(strFormId.equals("5"))
            {
                //access logic
                UsuariosLogic ULogic = new UsuariosLogic();
                ArrayList<UsuariosObj> CArray = ULogic.getAllUsers();
                
                //envair un correo
                
                //send to frontend
                request.getSession().setAttribute("users", CArray);
                response.sendRedirect("UsuariosMaintain.jsp");
            }
            
            if(strFormId.equals("6")){
                String strUsername = request.getParameter("usuario");
                

                UsuariosLogic ULogic = new UsuariosLogic();
                UsuariosObj UObj = ULogic.getUsersByUsername(strUsername);
                
                request.getSession().setAttribute("users", UObj);
                response.sendRedirect("MiPerfil.jsp");
            }
            if(strFormId.equals("9")){
                String strUsername = request.getParameter("usuario");
                

                UsuariosLogic ULogic = new UsuariosLogic();
                UsuariosObj UObj = ULogic.getUsersByUsername(strUsername);
                
                request.getSession().setAttribute("users", UObj);
                response.sendRedirect("PerfilUsuario.jsp");
            }
            if(strFormId.equals("7")){
                String strUsername = request.getParameter("usuario");
                

                UsuariosLogic ULogic = new UsuariosLogic();
                UsuariosObj UObj = ULogic.getUsersByUsername(strUsername);
                
                request.getSession().setAttribute("users", UObj);
                response.sendRedirect("PagoNew.jsp");
            }
            String strUsername = request.getParameter("usuario");
            if(strFormId.equals("8"))
            {
                //work
                //access logic
                UsuariosLogic ULogic = new UsuariosLogic();
                ArrayList<EventoViewObj> CArray = ULogic.MisEventos(strUsername);
                
                //send to frontend
                request.getSession().setAttribute("eventoc", CArray);
                response.sendRedirect("MisEventosUsuario.jsp");
                
                }
                }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
