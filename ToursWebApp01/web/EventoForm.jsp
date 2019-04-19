<%-- 
    Document   : EventoForm
    Created on : 04-18-2019, 12:22:23 AM
    Author     : Marcos
--%>

<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.EventoObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>Evento Form</title>
        <link href="styles/tableStyles.css" rel="stylesheet" type="text/css"/>        
    </head>
    <%
        ArrayList<EventoObj> CArray = 
                (ArrayList<EventoObj>)request.getSession().getAttribute("evento");
        Iterator<EventoObj> iteArray = CArray.iterator();
    %>
    <body>
        <h1>Evento</h1>
        <br>
        <a href="EventoServlet?formid=6">Ingresar un nuevo evento</a>
        <br><br>
        <table>
        <tr>
            <th>Id</th>
            <th>IdEmpresa</th>
            <th>IdCategoria</th>
            <th>IdDepartamento</th>
            <th>Hora de salida</th>
            <th>Fecha</th>
            <th>Hora de retorno</th>
            <th>Punto de reencuentro</th>
            <th>Precio</th>
        </tr>
        <%
            if(iteArray!=null)
            {
                EventoObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <tr>
                    <td><%= CTemp.getId() %></td>
                    <td><%= CTemp.getIdEmpresa() %></td>
                    <td><%= CTemp.getIdCategoria() %></td>
                    <td><<%= CTemp.getIdDepartamento() %>/td>
                    <td><%= CTemp.getHoradeSalida() %></td>
                    <td><%= CTemp.getFecha() %></td>
                    <td><%= CTemp.getHoradeRetorno() %></td>
                    <td><%= CTemp.getPuntodeEncuentro() %></td>
                    <td><%= CTemp.getPrecio() %></td>
                    <td>
                        <a href="EventoServlet?formid=4&id=<%= CTemp.getId() %>">
                            update
                        </a>
                    </td>
                    <td>
                        <a href="EventoServlet?formid=3&id=<%= CTemp.getId() %>">
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