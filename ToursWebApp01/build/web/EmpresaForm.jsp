<%-- 
    Document   : EmpresaForm
    Created on : Apr 18, 2019, 9:23:37 PM
    Author     : boris
--%>/*
<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.EmpresaObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa Form</title>
    </head>
    <%
        ArrayList<EmpresaObj> CArray = 
                (ArrayList<EmpresaObj>)request.getSession().getAttribute("empresas");
        Iterator<EmpresaObj> iteArray = CArray.iterator();
    %>    
    <body>
        <h1>Empresa</h1>
        <br>
        <a href="EmpresaNew.html">New Empresa</a>
        <br><br>
        <table>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Email</th>
            <th>Telefono</th>
            <th>NIT</th>
            <th>Username</th>
            <th>Password</th>
            <th>Nodecuenta</th>
        </tr>
        <%
            if(iteArray!=null)
            {
                EmpresaObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <tr>
                    <td><%= CTemp.getId() %></td>
                    <td><%= CTemp.getNombre() %></td>
                    <td><%= CTemp.getEmail() %></td>
                    <td><%= CTemp.getTelefono() %></td>
                    <td><%= CTemp.getNit() %></td>
                    <td><%= CTemp.getUsername() %></td>
                    <td><%= CTemp.getPassword() %></td>
                    <td><%= CTemp.getNodeCuenta() %></td>
                    <td>
                        <a href="EmpresaServlet?formid=4&id=<%= CTemp.getId() %>">
                            update
                        </a>
                    </td>
                    <td>
                        <a href="EmpresaServlet?formid=3&id=<%= CTemp.getId() %>">
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
