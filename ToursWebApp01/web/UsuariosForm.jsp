<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/UsuariosFormScript.js" type="text/javascript"></script>
        <title>Registro de usuarios</title>
    </head>
       <%
        ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
    %> 
    <body>
        <h1>Registro de usuarios</h1>
        <h2>Por favor ingrese sus datos</h2>
        
        <form id="myform" name="myform" action="UsuariosServlet" method="get">
            <label>Nombre:</label><br>
            <input type="text" id="nombre" name="nombre"/>
            <br><br>
            
            <label>Apellido:</label><br>
            <input type="text" id="apellido" name="apellido"/>
            <br><br>
            
            <label>Edad:</label><br>
            <input type="number" id="edad" name="edad"/>
            <br><br>
            
            <label>DUI:</label><br>
            <input type="number" id="dui" name="dui"/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email"/>
            <br><br>
            
            <label>Nombre de usuario:</label><br>
            <input type="text" id="user" name="user"/>
            <br><br>
            
            <label>Contaseña:</label><br>
            <input type="password" id="contra" name="contra"/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon"/>
            <br><br>

            <label>Departamento:</label><br>
            <select id="departamento" name="departamento">
                <option id="departamento0" name="departamento0" value="0"></option>                
                <%
                    if(iteDepArray!=null)
                    {
                        DepartamentosObj CDepTemp;
                        while(iteDepArray.hasNext())
                        {
                            CDepTemp = iteDepArray.next();
                %>
                            <option id="departamento<%= CDepTemp.getId() %>" 
                                    name="departamento<%= CDepTemp.getId() %>" 
                                    value="<%= CDepTemp.getId() %>">
                                <%= CDepTemp.getNombre()%>
                            </option>
                <%
                        }
                    }
                %>
                <br><br>

            <input type="submit" id="mysubmit" name="mysubmmit" value="Unirme"/>
            <input type="hidden" id="formid" name="formid" value="1"/>
        </form>
    </body>
</html>
