<%@page import="tours.prograii.objects.EventoViewObj"%>
<%@page import="java.util.Iterator"%>
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
        ArrayList<EventoViewObj> CArray = 
                (ArrayList<EventoViewObj>)request.getSession().getAttribute("eventoc");
        Iterator<EventoViewObj> iteArray = CArray.iterator();
        
    %>
    <body>
        <h1>Evento</h1>
        <br><br>
        <table>
        <tr>
            <th>Empresa</th>
            <th>Categoria</th>
            <th>Departamento</th>
            <th>Hora de salida</th>
            <th>Fecha</th>
            <th>Hora de retorno</th>
            <th>Punto de reencuentro</th>
            <th>Precio</th>
            <th>Cupos restantes</th>
        </tr>
        <%
            if(iteArray!=null)
            {
                EventoViewObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <tr>
                    <td><%= CTemp.getEmpresa() %></td>
                    <td><%= CTemp.getCategoria() %></td>
                    <td><%= CTemp.getDepartamento() %></td>
                    <td><%= CTemp.getHoradeSalida() %></td>
                    <td><%= CTemp.getFecha() %></td>
                    <td><%= CTemp.getHoradeRetorno() %></td>
                    <td><%= CTemp.getPuntodeEncuentro() %></td>
                    <td><%= CTemp.getPrecio() %></td>
                    <td><%= CTemp.getCuposRestantes() %></td>
                </tr>
        <%
                }
            }
        %>
        
        </table>
    </body>
</html>

