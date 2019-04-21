package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import tours.prograii.objects.UsuariosObj;
import java.util.ArrayList;

public final class PagoForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" \n");
      out.write("              content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pago</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        ArrayList<UsuariosObj> CUsuariosArray = 
                (ArrayList<UsuariosObj>)request.getSession().getAttribute("cusuarios");
        Iterator<UsuariosObj> iteUsuariosArray = CUsuariosArray.iterator();
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Pago</h1>\n");
      out.write("        <h1>Gracias por confiar en nosotros</h1>\n");
      out.write("       \n");
      out.write("        <form id=\"myform\" name=\"myform\" action=\"PagoServlet\" method=\"get\">\n");
      out.write("            <label>Id Usuario:</label><br>\n");
      out.write("            <select id=\"IdUsuario\" name=\"idusuario\">\n");
      out.write("                <option id=\"IdUsuario0\" name=\"idusuario0\" value=\"0\"></option>                \n");
      out.write("                ");

                    if(iteUsuariosArray!=null)
                    {
                        UsuariosObj CUsuariosTemp;
                        while(iteUsuariosArray.hasNext())
                        {
                            CUsuariosTemp = iteUsuariosArray.next();
                
      out.write("\n");
      out.write("                            <option id=\"IdUsuario");
      out.print( CUsuariosTemp.getId() );
      out.write("\" \n");
      out.write("                                    name=\"IdUsuarios");
      out.print( CUsuariosTemp.getId() );
      out.write("\" \n");
      out.write("                                    value=\"");
      out.print( CUsuariosTemp.getId() );
      out.write("\">\n");
      out.write("                                ");
      out.print( CUsuariosTemp.getNombre());
      out.write("\n");
      out.write("                            </option>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("            <label>Id Usuario:</label><br>\n");
      out.write("            <input type=\"number\" id=\"IdUsuario\" name=\"idusuario\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>No de tarjeta:</label><br>\n");
      out.write("            <input type=\"number\" id=\"NodeTarjeta\" name=\"nodetarjeta\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>CVV:</label><br>\n");
      out.write("            <input type=\"number\" id=\"Cvv\" name=\"cvv\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Fecha de vencimiento:</label><br>\n");
      out.write("            <input type=\"number\" id=\"FechadeVencimiento\" name=\"fechadevencimiento\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" id=\"mysubmit\" name=\"mysubmmit\" value=\"Pagar ahora\"/>\n");
      out.write("            <input type=\"hidden\" id=\"formid\" name=\"formid\" value=\"1\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
