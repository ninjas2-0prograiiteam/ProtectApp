<%-- 
    Document   : EmpresaForm
    Created on : 05-abr-2019, 16:05:18
    Author     : HP PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de empresa</title>
    </head>
    <body>
        <h1>Registro de empresa</h1>
        <h2>Por favor ingrese los datos de su empresa</h2>
        
        <form id="myform" name="myform" ation="EmpresaServlet" method="get"> 
            <label>Nombre de la empresa:</label><br>
            <input type="text" id="nombre" name="nombre"/>
            <br><br>
            
            <label>Email de la empresa:</label><br>
            <input type="text" id="email" name="email"/>
            <br><br>
            
            <label>Teléfono de la empresa:</label><br>
            <input type="number" id="telefono" name="telefono"/>
            <br><br>
            
            <label>NIT de la empresa:</label><br>
            <input type="number" id="nit" name="nit"/>
            <br><br>
            
            <label>Nombre de usuario para la empresa:</label><br>
            <input type="text" id="username" name="username"/>
            <br><br>
            
            <label>Contraseña:</label><br>
            <input type="text" id="password" name="password"/>
            <br><br>
            
            <%--<label>Confirme contraseña:</label><br>
            <input type="text" id="contracon" name="contracon"/>
            <br><br>
            --%>
            
            <label>Número de cuenta de la empresa:</label><br>
            <input type="number" id="nodecuenta" name="nodecuenta"/>
            <br><br>
            
             <input type="submit" id="mysubmit" name="mysubmmit" value="Unirme"/>
              <input type="hidden" id="formid" name="formid" value="1" />
        </form>
    </body>
</html>
