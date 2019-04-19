package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.PagoLogic;
import tours.prograii.objects.PagoObj;

@WebServlet(name = "PagoServlet", urlPatterns = {"/PagoServlet"})
public class PagoServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strFormId = request.getParameter("formid");
            
            if(strFormId.equals("1"))
            {
                String strIdUsuario = request.getParameter("idusuario");
                String strNodeTarjeta = request.getParameter("nodetarjeta");
                String strCvv = request.getParameter("cvv");
                String strFechadeVencimiento = request.getParameter("fechadevencimiento");
                int iIdUsuario = Integer.parseInt(strIdUsuario);
                int iNodeTarjeta = Integer.parseInt(strNodeTarjeta);
                int iCvv = Integer.parseInt(strCvv);
                int iFechadeVencimiento = Integer.parseInt(strFechadeVencimiento);
                
                PagoLogic CLogic = new PagoLogic();
                int iRows = CLogic.insertPagoRows(iIdUsuario, iNodeTarjeta, iCvv, iFechadeVencimiento);
                System.out.println("inser pago rows: " + iRows);
                
                request.getSession().setAttribute("rows", new Integer(iRows) );
                response.sendRedirect("genericMessage.jsp");
            }
            
            if(strFormId.equals("2"))
            {
                PagoLogic CLogic = new PagoLogic();
                ArrayList<PagoObj> CArray = CLogic.getAllPagos();
                
                request.getSession().setAttribute("pagos", CArray);
                response.sendRedirect("pagoForm.jsp");
            }
            
            if(strFormId.equals("3"))
            {
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                PagoLogic CLogic = new PagoLogic();
                int iRows = CLogic.borrarPagoRows(iId);
                System.out.println("delete pago Rows " + iRows);
            }
            
            if(strFormId.equals("4"))
            {
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                PagoLogic CLogic = new PagoLogic();
                PagoObj CPago = CLogic.getPagoById(iId);
                
                request.getSession().setAttribute("pago", CPago);
                response.sendRedirect("pagoUpdateForm.jsp");
            }   
            
            if(strFormId.equals("5"))
            {
                String strId = request.getParameter("Id");
                String strIdUsuario = request.getParameter("IdUsuario");
                String strNodeTarjeta = request.getParameter("NodeTarjeta");
                String strCvv = request.getParameter("Cvv");
                String strFechadeVencimiento = request.getParameter("FechadeVencimiento");
                int iId = Integer.parseInt(strId);
                int iIdUsuario = Integer.parseInt(strIdUsuario);
                int iNodeTarjeta = Integer.parseInt(strNodeTarjeta);
                int iCvv = Integer.parseInt(strCvv);
                int iFechadeVencimiento = Integer.parseInt(strFechadeVencimiento);
                
                PagoLogic CLogic = new PagoLogic();
                int iRows = CLogic.updatePagoRows(iId, iIdUsuario, iNodeTarjeta, iCvv, iFechadeVencimiento);
                System.out.println("update pago rows: " + iRows);
                
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
