<%-- 
    Document   : index.jsp
    Created on : 04-21-2019, 03:36:06 AM
    Author     : melvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tours Web App</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>¡Bienvenido/a!</h1>
        <h1>Iniciar sesion</h1>
        
        <a href="LoginUsuarios.jsp">Soy un usuario</a>
        <br>
        <a href="LoginEmpresa.jsp">Soy una empresa</a>
        <br>
        <br>
        <a href="UsuariosServlet?formid=5">Mantenimiento de usuarios</a>
        <br>
        <a href="EventoServlet?formid=2">Mantenimiento de evento</a>
        <br>
        <a href="EmpresaServlet?formid=2">Mantenimiento de empresa</a>
        <br>
        <a href="PagoServlet?formid=5">Mantenimiento de pago</a>
        <br>
        <a href="EventoViewServlet?formid=2">Vista de Eventos</a>
    </body>
</html>
