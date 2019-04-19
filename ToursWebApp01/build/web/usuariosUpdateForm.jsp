<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="tours.prograii.objects.UsuariosObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/UsuariosFormScript.js" type="text/javascript"></script>
        <title>Actualización de datos</title>
    </head>
    <%
        UsuariosObj UObj = 
                (UsuariosObj)request.getSession().getAttribute("users");
        
    %>
    <body>
        <h1>Actualización de datos</h1>
        <br><br>
        <form id="myform" name="myform" action="UsuariosServlet" method="get">
            <label>Id:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= UObj.getId() %>" disabled/>
            <br><br>
            
            <label>Nombre:</label><br>
            <input type="text" id="nombre" name="nombre" value="<%= UObj.getNombre() %>"/>
            <br><br>bj
            
            <label>Apellido:</label><br>
            <input type="text" id="apellido" name="apellido" value="<%= UObj.getApellido() %>"/>
            <br><br>
            
            <label>Edad:</label><br>
            <input type="number" id="edad" name="edad" value="<%= UObj.getEdad() %>"/>
            <br><br>
            
            <label>DUI:</label><br>
            <input type="number" id="dui" name="dui" value="<%= UObj.getDui() %>"/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email" value="<%= UObj.getEmail() %>"/>
            <br><br>
            
            <label>Nombre de usuario:</label><br>
            <input type="text" id="user" name="user" value="<%= UObj.getUsername() %>"/>
            <br><br>
            
            <label>Contaseña:</label><br>
            <input type="password" id="contra" name="contra" value="<%= UObj.getPassword() %>"/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon" />
            <br><br>

            <label>Departamento:</label><br>
            <input type="number" id="departamento" name="departamento" value="<%= UObj.getIdDepartamento() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmmit" value="Actualizar"/>
            <input type="hidden" id="formid" name="formid" value="4"/>
            <input type="hidden" id="id" name="id" value="<%= UObj.getId() %>" />
        </form>
    </body>
</html>
