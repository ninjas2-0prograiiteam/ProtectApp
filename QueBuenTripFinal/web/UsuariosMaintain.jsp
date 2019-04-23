<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tours.prograii.objects.UsuariosObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de la tabla usuario</title>
    </head>
    <%
        ArrayList<UsuariosObj> CArray = 
                (ArrayList<UsuariosObj>)request.getSession().getAttribute("users");
        Iterator<UsuariosObj> iteArray = CArray.iterator();
    %>
    <body>
        <h1>Usuarios</h1>
        <br>
        <a href="DepServlet?formid=5">Registrarse como usuario</a>
        <br><br>
        <table>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Edad</th>
            <th>DUI</th>
            <th>Email</th>
            <th>Username</th>
            <th>Password</th>
            <th>Departamento</th>
        </tr>
        <%
            if(iteArray!=null)
            {
                UsuariosObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <tr>
                    <td><%= CTemp.getId() %></td>
                    <td><%= CTemp.getNombre() %></td>
                    <td><%= CTemp.getApellido() %></td>
                    <td><%= CTemp.getEdad() %></td>
                    <td><%= CTemp.getDui() %></td>
                    <td><%= CTemp.getEmail() %></td>
                    <td><%= CTemp.getUsername() %></td>
                    <td><%= CTemp.getPassword() %></td>
                    <td><%= CTemp.getIdDepartamento() %></td>
                    <td>
                        <a href="UsuariosServlet?formid=3&id=<%= CTemp.getId() %>">
                            update
                        </a>
                    </td>
                    <td>
                        <a href="UsuariosServlet?formid=2&id=<%= CTemp.getId() %>">
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
