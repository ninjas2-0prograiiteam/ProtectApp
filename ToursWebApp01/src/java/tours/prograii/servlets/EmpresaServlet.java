package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.EmpresaLogic;
import tours.prograii.objects.EmpresaObj;

@WebServlet(name = "EmpresaServlet", urlPatterns = {"/EmpresaServlet"})
public class EmpresaServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            //formid
            String strFormId = request.getParameter("formid");
            
            if(strFormId.equals("1"))
            {
                //get parameters
                String strNombre = request.getParameter("nombre");
                String strEmail = request.getParameter("email");
                String strTelefono = request.getParameter("telefono");
                String strNit = request.getParameter("nit");
                String strUsername = request.getParameter("username");
                String strPassword = request.getParameter("password");
                String strNodecuenta = request.getParameter("nodecuenta");
                int iNodecuenta = Integer.parseInt(strNodecuenta);
                int iTelefono = Integer.parseInt(strTelefono);
                
                
                //access logic
                EmpresaLogic CLogic = new EmpresaLogic();
                int iRows = CLogic.insertEmpresaRows(strNombre, strEmail, iTelefono, strNit, strUsername, strPassword, iNodecuenta);
                System.out.println("insert empresa rows: " + iRows);
                                
                //send to frontend
                request.getSession().setAttribute("rows", iRows );
                response.sendRedirect("genericMessage.jsp");                
            }
            
            if(strFormId.equals("2"))
            {
                //work
                //access logic
                EmpresaLogic CLogic = new EmpresaLogic();
                ArrayList<EmpresaObj> CArray = CLogic.getAllEmpresas();
                
                //send to frontend
                request.getSession().setAttribute("empresas", CArray);
                response.sendRedirect("EmpresaForm.jsp");
                
            }
            
            if(strFormId.equals("3"))
            {
                //get parameters
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                //access logic
                EmpresaLogic CLogic = new EmpresaLogic();
                int iRows = CLogic.BorrarEmpresa(iId);
                
                //send to frontend
                request.getSession().setAttribute("rows", iRows);
                response.sendRedirect("genericMessage.jsp");                
            }
            
            if(strFormId.equals("4"))
            {
                //get parameters
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                //access logic
                EmpresaLogic ELogic = new EmpresaLogic();
                EmpresaObj CEvento = ELogic.getEmpresaById(iId);
                
                //send to frontend
                request.getSession().setAttribute("empresa", CEvento);
                response.sendRedirect("empresaUpdateForm.jsp");                
            }
            
            if(strFormId.equals("5"))
            {
                //get parameters
                String strId = request.getParameter("id");
                String strNombre = request.getParameter("nombre");
                String strEmail = request.getParameter("email");
                String strTelefono = request.getParameter("telefono");
                String strNit = request.getParameter("nit");
                String strUsername = request.getParameter("username");
                String strPassword = request.getParameter("password");
                String strNodecuenta = request.getParameter("nodecuenta");
                int iId = Integer.parseInt(strId);
                int iNodecuenta = Integer.parseInt(strNodecuenta);
                int iTelefono = Integer.parseInt(strTelefono);
                
                //access logic
                EmpresaLogic CLogic = new EmpresaLogic();
                int iRows = CLogic.updateEmpresaRows(iId,strNombre, strEmail, iTelefono, strNit, strUsername, strPassword, iNodecuenta);
                System.out.println("update empresa rows: " + iRows); 
                
                //send to frontend
                request.getSession().setAttribute("rows", new Integer(iRows) );
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
