package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tours.prograii.objects.PagoObj;

public final class pagoUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" \n");
      out.write("              content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Pago</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        PagoObj CPago = 
                (PagoObj)request.getSession().getAttribute("pago");
        
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Update Pago</h1>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <form id=\"myform\" name=\"myform\" action=\"PagoServlet\" method=\"get\">\n");
      out.write("            <label>Id:</label><br>\n");
      out.write("            <input type=\"number\" id=\"Id\" name=\"Id\" value=\"");
      out.print( CPago.getId() );
      out.write("\" disabled/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Id Usuario:</label><br>\n");
      out.write("            <input type=\"number\" id=\"IdUsuario\" name=\"IdUsuario\" value=\"");
      out.print( CPago.getIdUsuario() );
      out.write("\" disabled/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>No de tarjeta:</label><br>\n");
      out.write("            <input type=\"number\" id=\"NodeTarjeta\" name=\"NodeTarjeta\" value=\"");
      out.print( CPago.getNodeTarjeta() );
      out.write("\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>CVV:</label><br>\n");
      out.write("            <input type=\"number\" id=\"Cvv\" name=\"Cvv\" value=\"");
      out.print( CPago.getCvv() );
      out.write("\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Fecha de vencimiento:</label><br>\n");
      out.write("            <input type=\"number\" id=\"FechadeVencimiento\" name=\"FechadeVencimiento\" value=\"");
      out.print( CPago.getFechadeVencimiento() );
      out.write("\" />\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" id=\"mysubmit\" name=\"mysubmit\" value=\"Update\"/>\n");
      out.write("            <input type=\"hidden\" id=\"formid\" name=\"formid\" value=\"5\" />\n");
      out.write("            <input type=\"hidden\" id=\"Id\" name=\"id\" value=\"");
      out.print( CPago.getId() );
      out.write("\" />\n");
      out.write("            <input type=\"hidden\" id=\"IdUsuario\" name=\"id\" value=\"");
      out.print( CPago.getIdUsuario() );
      out.write("\" />\n");
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
