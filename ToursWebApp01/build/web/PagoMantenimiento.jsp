<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tours.prograii.objects.PagoObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>Mantenimiento de Pago</title>
    </head>
    <%
        ArrayList<PagoObj> CArray = 
                (ArrayList<PagoObj>)request.getSession().getAttribute("pagos");
        Iterator<PagoObj> iteArray = CArray.iterator();
    %>
    <body>
        <h1>Verificar Pagos</h1>
        <br><br>
        <table>
        <tr>
            <th>Id</th>
            <th>Usuario</th>
            <th>No de Tarjeta</th>
            <th>CVV</th>
            <th>Fecha de Vencimiento</th>
        </tr>
        <%
            if(iteArray!=null)
            {
                PagoObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <tr>
                    <td><%= CTemp.getId() %></td>
                    <td><%= CTemp.getIdUsuario() %></td>
                    <td><%= CTemp.getNodeTarjeta() %></td>
                    <td><%= CTemp.getCvv() %></td>
                    <td><%= CTemp.getFechadeVencimiento() %></td>
                    <td>
                        <a href="PagoServlet?formid=3&id=<%= CTemp.getId() %>">
                            update
                        </a>
                    </td>
                    <td>
                        <a href="PagoServlet?formid=2&id=<%= CTemp.getId() %>">
                            delete
                        </a>
                    </td>
                </tr>
        <%
                }
            }
        %>
        
        </table>
    </body>
</html>

