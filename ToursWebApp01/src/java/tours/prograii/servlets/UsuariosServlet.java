
package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.UsuariosLogic;
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
                response.sendRedirect("genericMessage.jsp");
            }
            
            if(strFormId.equals("2")){
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                UsuariosLogic ULogic = new UsuariosLogic();
                int iRows = ULogic.BorrarUsuario(iId);
            }
            
            if(strFormId.equals("3")){
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                UsuariosLogic ULogic = new UsuariosLogic();
                UsuariosObj UObj = ULogic.getClientById(iId);
                
                request.getSession().setAttribute("usuarios", UObj);
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
                response.sendRedirect("genericMessage.jsp");
                
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
