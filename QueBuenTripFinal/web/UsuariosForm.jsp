<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <title>Registro</title>
        <link href="Style/header.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/UsuariosFormScript.js" type="text/javascript"></script>
        <script src="Scripts/EmpresaFormScript.js" type="text/javascript"></script>
        <style>
            #particles-js{
                background-position: center;
                background-attachment:fixed;
                background-size: cover;
                width: 1350px;
                height: 615px;
                background-image: url('imagenes/registrar.jpg');
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;          
            } 
            .efecto{
                animation-name: wobble;
                animation-duration: 3s;
            }
          
        </style>
    </head>
       <%
        ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
    %>     
   
     <body id="particles-js">  
                  
        <section class="caption">
                <h1 class=" efecto">¿Cómo te gustaría registrarte?</h1>      
             <button class="button" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">
                <span>Usuario</span></button>
            <button class="button" onclick="document.getElementById('id02').style.display='block'" style="width:auto;">
                <span>Empresa</span></button>
        </section>          
        </section>  
   
    <script src="particles.js" type="text/javascript"></script>
    <script src="app.js" type="text/javascript"></script>

        <div id="id01" class="modal">
        <form id="myform" name="myform" class="modal-content animate" action="UsuariosServlet" method="post">           
            <div class="container">       
                  <div class="imgcontainer">
                    <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
                    <img src="imagenes/avatar usuario.jpg" alt="Avatar" class="avatar">
                  </div>
                 
                 <p style="font-size: 120%">Llene el siguiente formulario para crear su cuenta de usuario.</p>
            <label>Nombre:</label><br>
            <input type="text" id="nombre" name="nombre" placeholder="Mi nombre es..." required/>
            <br><br>
            
            <label>Apellido:</label><br>
            <input type="text" id="apellido" name="apellido" placeholder="Mi apellido es..." required/>
            <br><br>
            
            <label>Edad:</label><br>
            <input type="number" id="edad" name="edad" placeholder="Mi edad es..." required/>
            <br><br>
            
            <label>DUI:</label><br>
            <input type="number" id="dui" name="dui" placeholder="123456789" required/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email" placeholder="ejemplo@gmail.com" required/>
            <br><br>
            
            <label>Nombre de usuario:</label><br>
            <input type="text" id="user" name="user" placeholder="Mi nombre de usuario quiero que sea..." required/>
            <br><br>
            
            <label>Contaseña:</label><br>
            <input type="password" id="contra" name="contra" placeholder="Contraseña" required/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon" placeholder="Confirme su contraseña" required/>
            <br><br>

            <label>Departamento:</label>
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
                </select>
                <br><br>
                        <label>
                               <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Recordar
                        </label>

      <p>Al crear una cuenta usted acepta nuestros <a href="#" style="color:dodgerblue">Términos y  Privacidad</a>.</p>
      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancelar</button>
        <button id="mysubmit" type="submit" class="signupbtn">Unirme</button> 
        <input type="hidden" id="formid" name="formid" value="1"/>
      </div>        
     </form>            
   </div> 
   </div>
          
     <div id="id02" class="modal">
  
  <form class="modal-content animate" action="EmpresaServlet" method="post">
    <div class="container">       
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="imagenes/avatar empresa.jpg" alt="Avatar" class="avatar">
    </div>   
                 <p style="font-size: 120%">Llene el siguiente formulario para crear su cuenta de empresa.</p>
     <label>Nombre de la empresa:</label><br>
     <input type="text" id="nombre" name="nombre" placeholder="El nombre de la empresa es..." required/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email" placeholder="ejemplo@outlook.com" required />
            <br><br>
            
            <label>Teléfono:</label><br>
            <input type="number" id="telefono" name="telefono" placeholder="12345678" required/>
            <br><br>
            
            <label>NIT de la empresa:</label><br>
            <input type="number" id="nit" name="nit" placeholder="11112222223334" required/>
            <br><br>
            
            <label>Nombre de usuario para la empresa:</label><br>
            <input type="text" id="username" name="username" placeholder="El nombre de usuario quiero que sea..." required/>
            <br><br>
            
            <label>Contraseña:</label><br>
            <input type="password" id="password" name="password" placeholder="Contraseña" required/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="password" id="contracon" name="contracon" placeholder="Confirme la contraseña" required/>
            <br><br>
            
            <label>Número de cuenta bancaria:</label><br>
            <input type="number" id="nodecuenta" name="nodecuenta" placeholder="001122334455" required/>
            <br><br>
            <label>
                       <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Recordar
            </label>
            <br><br>
             <p>Al crear una cuenta usted acepta nuestros <a href="#" style="color:dodgerblue">Términos y  Privacidad</a>.</p>
      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancelar</button>
        <button id="mysubmit" type="submit" class="signupbtn">Unirme</button> 
        <input type="hidden" id="formid" name="formid" value="1"/>
     </div> 
     </div>
                
  </form>
 </body>
 
</html>
