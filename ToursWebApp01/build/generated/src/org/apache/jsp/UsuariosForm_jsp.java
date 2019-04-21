package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tours.prograii.objects.DepartamentosObj;
import java.util.Iterator;
import java.util.ArrayList;

public final class UsuariosForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"Scripts/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/additional-methods.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/UsuariosFormScript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Registro de usuarios</title>\n");
      out.write("    </head>\n");
      out.write("       ");

        ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
    
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de usuarios</h1>\n");
      out.write("        <h2>Por favor ingrese sus datos</h2>\n");
      out.write("        \n");
      out.write("        <form id=\"myform\" name=\"myform\" action=\"UsuariosServlet\" method=\"get\">\n");
      out.write("            <label>Nombre:</label><br>\n");
      out.write("            <input type=\"text\" id=\"nombre\" name=\"nombre\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Apellido:</label><br>\n");
      out.write("            <input type=\"text\" id=\"apellido\" name=\"apellido\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Edad:</label><br>\n");
      out.write("            <input type=\"number\" id=\"edad\" name=\"edad\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>DUI:</label><br>\n");
      out.write("            <input type=\"number\" id=\"dui\" name=\"dui\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Email:</label><br>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Nombre de usuario:</label><br>\n");
      out.write("            <input type=\"text\" id=\"user\" name=\"user\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Contaseña:</label><br>\n");
      out.write("            <input type=\"password\" id=\"contra\" name=\"contra\"/>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label>Confirme contraseña:</label><br>\n");
      out.write("            <input type=\"password\" id=\"contracon\" name=\"contracon\"/>\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <label>Departamento:</label><br>\n");
      out.write("            <select id=\"departamento\" name=\"departamento\">\n");
      out.write("                <option id=\"departamento0\" name=\"departamento0\" value=\"0\"></option>                \n");
      out.write("                ");

                    if(iteDepArray!=null)
                    {
                        DepartamentosObj CDepTemp;
                        while(iteDepArray.hasNext())
                        {
                            CDepTemp = iteDepArray.next();
                
      out.write("\n");
      out.write("                            <option id=\"departamento");
      out.print( CDepTemp.getId() );
      out.write("\" \n");
      out.write("                                    name=\"departamento");
      out.print( CDepTemp.getId() );
      out.write("\" \n");
      out.write("                                    value=\"");
      out.print( CDepTemp.getId() );
      out.write("\">\n");
      out.write("                                ");
      out.print( CDepTemp.getNombre());
      out.write("\n");
      out.write("                            </option>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" id=\"mysubmit\" name=\"mysubmmit\" value=\"Unirme\"/>\n");
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
