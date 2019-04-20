
package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.CatLogic;
import tours.prograii.logic.DepLogic;
import tours.prograii.logic.EventoLogic;
import tours.prograii.objects.CategoriaObj;
import tours.prograii.objects.DepartamentosObj;
import tours.prograii.objects.EventoObj;

@WebServlet(name = "EventoServlet", urlPatterns = {"/EventoServlet"})
public class EventoServlet extends HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strFormId = request.getParameter("formid");
            
            if(strFormId.equals("1"))
            {
                //obtener parametros
                String strIdEmpresa = request.getParameter("empresa");
                String strIdCategoria = request.getParameter("categoria");
                String strIdDepartamento = request.getParameter("departamento");
                String strHoradeSalida = request.getParameter("horadesalida");
                String strFecha = request.getParameter("fecha");
                String strHoradeRetorno = request.getParameter("horaderetorno");
                String strPuntodeEncuentro = request.getParameter("puntodeencuentro");
                String strPrecio = request.getParameter("precio");
                int iIdEmpresa = Integer.parseInt(strIdEmpresa);
                int iIdCategoria = Integer.parseInt(strIdCategoria);
                int iIdDepartamento = Integer.parseInt(strIdDepartamento);
                int iPrecio = Integer.parseInt(strPrecio);
                
                //acceder logic
                EventoLogic ELogic = new EventoLogic();
                int iRows = ELogic.InsertarNuevoEventoInt
                (iIdEmpresa, iIdCategoria, iIdDepartamento, strHoradeSalida, strFecha, strHoradeRetorno, strPuntodeEncuentro, iPrecio);
                 System.out.println("insert event rows: " + iRows);
                
                //enviar 
                 request.getSession().setAttribute("rows", iRows);
                response.sendRedirect("genericMessage.jsp");
            }
            
             if(strFormId.equals("2"))
            {
                //work
                //access logic
                EventoLogic ELogic = new EventoLogic();
                ArrayList<EventoObj> CArray = ELogic.getAllEventos();
                
                //send to frontend
                request.getSession().setAttribute("evento", CArray);
                response.sendRedirect("EventoForm.jsp");
                
                }
             
             if(strFormId.equals("3"))
            {
                //get parameters
                String strId = request.getParameter("id");
                int iId = Integer.parseInt(strId);
                
                //access logic
                EventoLogic ELogic = new EventoLogic();
                int iRows = ELogic.BorrarEvento(iId);
                
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
                EventoLogic ELogic = new EventoLogic();
                EventoObj CEvento = ELogic.getEventoPorId(iId);
                
                //send to frontend
                request.getSession().setAttribute("evento", CEvento);
                response.sendRedirect("EventoUpdateForm.jsp");                
            }
             
             if(strFormId.equals("5"))
            {
                //get parameters
                String strId = request.getParameter("id");
                String strIdEmpresa = request.getParameter("empresa");
                String strIdCategoria = request.getParameter("categoria");
                String strIdDepartamento = request.getParameter("departamento");
                String strHoradeSalida = request.getParameter("horadesalida");
                String strFecha = request.getParameter("fecha");
                String strHoradeRetorno = request.getParameter("horaderetorno");
                String strPuntodeEncuentro = request.getParameter("puntodeencuentro");
                String strPrecio = request.getParameter("precio");
                int iId = Integer.parseInt(strId);
                int iIdEmpresa = Integer.parseInt(strIdEmpresa);
                int iIdCategoria = Integer.parseInt(strIdCategoria);
                int iIdDepartamento = Integer.parseInt(strIdDepartamento);
                int iPrecio = Integer.parseInt(strPrecio);
                
                //access logic
                EventoLogic ELogic = new EventoLogic();
                int iRows = ELogic.ActualizarEvento(iId, iIdEmpresa, iIdCategoria, iIdDepartamento, strHoradeSalida, strFecha, strHoradeRetorno, strPuntodeEncuentro, iPrecio);
                System.out.println("update events rows: " + iRows); 
                
                //send to frontend
                request.getSession().setAttribute("rows", new Integer(iRows) );
                response.sendRedirect("genericMessage.jsp");                 
            }
             if(strFormId.equals("6"))
            {
                //access logic
                DepLogic DLogic = new DepLogic();
                ArrayList<DepartamentosObj> CArray = DLogic.getAllDeps();
              //send to frontend
                request.getSession().setAttribute("departamentos", CArray);
                
                CatLogic CLogic = new CatLogic();
                ArrayList<CategoriaObj> CaArray = CLogic.getAllDeps();
              //send to frontend
                request.getSession().setAttribute("categoria", CaArray);
                
                response.sendRedirect("EventoNew.jsp");
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


