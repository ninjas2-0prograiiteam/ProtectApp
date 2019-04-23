package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tours.prograii.objects.EventoViewObj;
import java.util.Iterator;
import java.util.ArrayList;

public final class MisEventos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"Scripts/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/additional-methods.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/UsuariosFormScript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"Style/zigzag.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"JavaScript/ScriptInicio.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"Style/HeaderInicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Style/ImagenStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Style/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"JavaScript/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Mis Eventos</title>\n");
      out.write("        <link href=\"styles/tableStyles.css\" rel=\"stylesheet\" type=\"text/css\"/>        \n");
      out.write("    </head>\n");
      out.write("    ");

        ArrayList<EventoViewObj> CArray = 
                (ArrayList<EventoViewObj>)request.getSession().getAttribute("eventoc");
        Iterator<EventoViewObj> iteArray = CArray.iterator();
        
    
      out.write("\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("              font-family: Arial, Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("                        .a1 {\n");
      out.write("              text-decoration: none;\n");
      out.write("              font-size: 30px;\n");
      out.write("              color: black;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("\n");
      out.write("             a1:hover {\n");
      out.write("              opacity: 0.7;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                  font-size: 18px;\n");
      out.write("                  text-align: center;\n");
      out.write("                  font-weight: bold;\n");
      out.write("                  width: 100%;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .boton {\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("            .success {background-color: #4CAF50;} /* Green */\n");
      out.write(".success:hover {background-color: #46a049;}\n");
      out.write("\n");
      out.write(".info {background-color: #2196F3;} /* Blue */\n");
      out.write(".info:hover {background: #0b7dda;}\n");
      out.write("\n");
      out.write(".warning {background-color: #ff9800;} /* Orange */\n");
      out.write(".warning:hover {background: #e68a00;}\n");
      out.write("\n");
      out.write(".danger {background-color: #f44336;} /* Red */ \n");
      out.write(".danger:hover {background: #da190b;}\n");
      out.write("\n");
      out.write(".default {background-color: #e7e7e7; color: black;} /* Gray */ \n");
      out.write(".default:hover {background: #ddd;}\n");
      out.write("            </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">  \n");
      out.write("            <img class=\"logo\" src=\"imagenes/Logo.png\" alt=\"logo\"/>\n");
      out.write("          <a href=\"#carrito\">Carrito</a> \n");
      out.write("          <a href=\"#ayuda\">Ayuda</a> \n");
      out.write("          <div class=\"dropdown\">\n");
      out.write("          <button class=\"dropbtn\" onclick=\"myFunction()\">Categorías\n");
      out.write("            <i class=\"fa fa-caret-down\"></i>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"dropdown-content\" id=\"myDropdown\">\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Cultural\">Cultural</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Recreativo\">Recreativo</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Grupos Ideológicos\">Grupos Ideológicos</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Deportivo\">Deportivo</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Rural\">Rural</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Urbano\">Urbano</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=De Aventura\">De Aventura</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=De Negocios\">De Negocios</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Ecológico\">Ecológico</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Religioso\">Religioso</a>\n");
      out.write("            <a href=\"CatServlet?formid=2&categoria=Gastronómico\">Gastronómico</a>\n");
      out.write("     \n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("           <a href=\"InicioEmpresa.jsp\">Inicio</a> \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"column-img\"><br><br><br>\n");
      out.write("                                    <img style=\"width: 75%\" src=\"imagenes/avatar empresa.jpg\" alt=\"\"/><br><br>\n");
      out.write("                                     <a class=\"a1\" href=\"#\">");
      out.print( CTemp.getEmpresa() );
      out.write("</a><br><br>\n");
      out.write("                                     <a class=\"a1\" href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                                    <a class=\"a1\" href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("                                    <a class=\"a1\" href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a class=\"a1\" href=\"#\"><i class=\"fa fa-whatsapp\"></i></a>    \n");
      out.write("                                </div>\n");
      out.write("                   <div class=\"column-text\">\n");
      out.write("        <h1>Evento</h1>\n");
      out.write("        <br><br>\n");
      out.write("        <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Empresa</th>\n");
      out.write("            <th>Categoria</th>\n");
      out.write("            <th>Departamento</th>\n");
      out.write("            <th>Hora de salida</th>\n");
      out.write("            <th>Fecha</th>\n");
      out.write("            <th>Hora de retorno</th>\n");
      out.write("            <th>Punto de reencuentro</th>\n");
      out.write("            <th>Precio</th>\n");
      out.write("            <th>Cupos restantes</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            if(iteArray!=null)
            {
                EventoViewObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( CTemp.getEmpresa() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getCategoria() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getDepartamento() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getHoradeSalida() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getFecha() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getHoradeRetorno() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getPuntodeEncuentro() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getPrecio() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( CTemp.getCuposRestantes() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
