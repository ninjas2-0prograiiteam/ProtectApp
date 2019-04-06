<%-- 
    Document   : LoginUsuarios
    Created on : 05-abr-2019, 18:54:34
    Author     : HP PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
    </head>
    <body>
        <h1>Iniciar sesión</h1>
        <form>
            <label>Nombre de usuario:</label><br>
            <input type="text" id="username" name="username"/>
            <br><br>
            
            <label>Contraseña:</label><br>
            <input type="text" id="contras" name="contras"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Ingresar"/>
        </form>
    </body>
</html>
