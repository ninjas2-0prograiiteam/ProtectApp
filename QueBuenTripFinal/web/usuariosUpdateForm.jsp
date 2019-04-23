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
        <link href="Style/header.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>
       
      
        <title>Modificar datos</title>
    </head>
     <style>   
                           
            .fondo{
                            background-image: url('imagenes/mesitas.jpg');
                             /* Full height */
                             height: 100%; 

              /* Center and scale the image nicely */
              background-position: center;
              background-repeat: no-repeat;
              background-size: cover;            
            }  
           .efecto{ 
           animation-name: tada;
           animation-duration: 2s}
           
           select,input{
               width: 100%;
           }
           .boton {
  border: none;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
}
            .success {background-color: #4CAF50;} /* Green */
.success:hover {background-color: #46a049;}

        </style>
    <%
        UsuariosObj UObj = 
                (UsuariosObj)request.getSession().getAttribute("users");
        
ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
    %>
   
    <body style="background-image: url('imagenes/mesitas.jpg'); height:100%; background-size: cover">
      <br><br>
        <script src="JavaScript/modalregistrar.js" type="text/javascript"></script>
        
        <form  class="modal-content animate" id="myform" name="myform" action="UsuariosServlet" method="get">
            
            <div class="container">       
                <div class="imgcontainer">
                 
                  <img src="imagenes/avatar actualizar.jpg" alt="Avatar" class="avatar">
                </div>   
                <p style="font-size: 120%">Modifica tus datos</p><br><br>
       
            <label>Usuario número:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= UObj.getId() %>" disabled/>
            <br><br>
            
            <label>Nombre:</label><br>
            <input type="text" id="nombre" name="nombre" value="<%= UObj.getNombre() %>"/>
            <br><br>
            
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
            <input type="text" id="email" name="email" value="<%= UObj.getEmail() %>"/>
            <br><br>
            
            <label>Nombre de usuario:</label><br>
            <input type="text" id="user" name="user" value="<%= UObj.getUsername() %>"/>
            <br><br>
            
            <label>Contaseña:</label><br>
            <input type="password" id="contra" name="contra" value="<%= UObj.getPassword() %>"/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon"/>
            <br><br>
            
            <label>Departamento:</label><br>
            <select id="departamento" name="departamento" value="<%= UObj.getIdDepartamento()%>">
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
                            </option> <br><br>
                <%
                        }
                    }
                %>
                
            <input type="submit" id="mysubmit" name="mysubmmit" value="Actualizar" class="boton success"/>
            <input type="hidden" id="formid" name="formid" value="4"/>
            <input type="hidden" id="id" name="id" value="<%= UObj.getId() %>" />
        </form>
    </body>
</html>
