<%-- 
    Document   : empresaUpdateForm
    Created on : Apr 19, 2019, 12:53:17 AM
    Author     : boris
--%>

<%@page import="tours.prograii.objects.EmpresaObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/EmpresaFormScript.js" type="text/javascript"></script>
        <title>Update empresa</title>
    </head>
    <%
        EmpresaObj CEmpresa = 
                (EmpresaObj)request.getSession().getAttribute("empresa");
        
    %>  
    <body>
        <h1>Update Meal</h1>
        <br><br>
        
        <form id="myform" name="myform" action="EmpresaServlet" method="get">
            <label>Id:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= CEmpresa.getId() %>" disabled/>
            <br><br>
            
            <label>Nombre de la empresa:</label><br>
            <input type="text" id="nombre" name="nombre" value="<%= CEmpresa.getNombre() %>"/>
            <br><br>
            
            <label>Email de la empresa:</label><br>
            <input type="email" id="email" name="email" value="<%= CEmpresa.getEmail() %>"/>
            <br><br>
            
            <label>Teléfono de la empresa:</label><br>
            <input type="number" id="telefono" name="telefono" value="<%= CEmpresa.getTelefono() %>"/>
            <br><br>
            
            <label>NIT de la empresa:</label><br>
            <input type="number" id="nit" name="nit" value="<%= CEmpresa.getNit() %>"/>
            <br><br>
            
            <label>Nombre de usuario para la empresa:</label><br>
            <input type="text" id="username" name="username" value="<%= CEmpresa.getUsername() %>"/>
            <br><br>
            
            <label>Contraseña:</label><br>
            <input type="password" id="password" name="password" value="<%= CEmpresa.getPassword() %>"/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon"/>
            <br><br>
            
            
            <label>Número de cuenta de la empresa:</label><br>
            <input type="number" id="nodecuenta" name="nodecuenta" value="<%= CEmpresa.getNodeCuenta() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Update"/>
            <input type="hidden" id="formid" name="formid" value="5" />
            <input type="hidden" id="id" name="id" value="<%= CEmpresa.getId() %>" />
        </form>
    </body>
</html>
