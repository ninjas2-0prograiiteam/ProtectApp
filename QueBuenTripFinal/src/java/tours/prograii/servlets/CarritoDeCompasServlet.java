package tours.prograii.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tours.prograii.logic.CarritoDeComprasLogic;
import tours.prograii.logic.EventoLogic;
import tours.prograii.logic.EventoViewLogic;
import tours.prograii.objects.CarritoDeComprasObj;
import tours.prograii.objects.CarritoView;
import tours.prograii.objects.EventoObj;
import tours.prograii.objects.EventoViewObj;


@WebServlet(name = "CarritoDeCompasServlet", urlPatterns = {"/CarritoDeCompasServlet"})
public class CarritoDeCompasServlet extends HttpServlet {

  static int ingresoId;
  static int eventoId;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strFormId = request.getParameter("formid");
            String strUsername = request.getParameter("usuario");
            if(strFormId.equals("1"))
            {
                String strLoginId = request.getParameter("id");
                String strFecha = request.getParameter("Fecha");
                String strHoraRetorno = request.getParameter("HoraRetorno");
                String strHoraSalida = request.getParameter("HoraSalida");
                
                int iLoginId = Integer.parseInt(strLoginId);
                
                
                EventoLogic idEvento = new EventoLogic();
                EventoObj EventoArray = idEvento.getEventoPorFecha(strFecha,strHoraRetorno,strHoraSalida);
                eventoId = EventoArray.getId();
                System.out.println(eventoId);
                
                
                 CarritoDeComprasLogic CLogic = new CarritoDeComprasLogic();
                 int iRows = CLogic.insertCarritoRows
                (iLoginId, eventoId, 20);
                System.out.println("inser client rows: " + iRows);
                
                EventoViewLogic ELogic = new EventoViewLogic();
                ArrayList<EventoViewObj> CArray = ELogic.getView();
                 
                
                request.getSession().setAttribute("eventoiD", EventoArray);
                request.getSession().setAttribute("eventos", CArray);
                request.getSession().setAttribute("strLoginId", strLoginId);
                response.sendRedirect("InicioUsuario.jsp");
            }
                if(strFormId.equals("2")){
   
                CarritoDeComprasLogic CLogic = new CarritoDeComprasLogic();
                ArrayList<CarritoView> CArray = CLogic.getAllCarritoView(strUsername);
                
                request.getSession().setAttribute("view", CArray);
                response.sendRedirect("CarritoView.jsp");
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