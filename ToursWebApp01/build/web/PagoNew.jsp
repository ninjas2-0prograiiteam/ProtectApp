<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.UsuariosObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>Pago</title>
    </head>
    <%
        ArrayList<UsuariosObj> CUsuariosArray = 
                (ArrayList<UsuariosObj>)request.getSession().getAttribute("cusuarios");
        Iterator<UsuariosObj> iteUsuariosArray = CUsuariosArray.iterator();
    %>
    <body>
        <h1>Pago</h1>
        <h1>Gracias por confiar en nosotros</h1>
        <br><br>
        <form id="myform" name="myform" action="PagoServlet" method="get">
            <label>Usuario:</label><br>
            <select id="idusuario" name="idusuario">
                <option id="usuario0" name="usuario0" value="0"></option>                
                <%
                    if(iteUsuariosArray!=null)
                    {
                        UsuariosObj CUsuariosTemp;
                        while(iteUsuariosArray.hasNext())
                        {
                            CUsuariosTemp = iteUsuariosArray.next();
                %>
                            <option id="idusuario<%= CUsuariosTemp.getId() %>" 
                                    name="idusuario<%= CUsuariosTemp.getId() %>" 
                                    value="<%= CUsuariosTemp.getId() %>">
                                <%= CUsuariosTemp.getNombre()%>
                            </option>
                <%
                        }
                    }
                %>
            </select>
            <br><br>
            
            <label>No de tarjeta:</label><br>
            <input type="number" id="NodeTarjeta" name="nodetarjeta" />
            <br><br>
            
            <label>CVV:</label><br>
            <input type="number" id="Cvv" name="cvv" />
            <br><br>
            
            <label>Fecha de vencimiento:</label><br>
            <input type="number" id="FechadeVencimiento" name="fechadevencimiento" />
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmmit" value="Pagar ahora"/>
            <input type="hidden" id="formid" name="formid" value="1"/>
        </form>
    </body>
</html>