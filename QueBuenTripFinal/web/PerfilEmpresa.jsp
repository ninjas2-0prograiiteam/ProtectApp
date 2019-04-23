<%-- 
    Document   : empresaUpdateForm
    Created on : Apr 19, 2019, 12:53:17 AM
    Author     : boris
--%>

<%@page import="tours.prograii.objects.EmpresaObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/UsuariosFormScript.js" type="text/javascript"></script>
        <link href="Style/zigzag.css" rel="stylesheet" type="text/css"/>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="JavaScript/ScriptInicio.js" type="text/javascript"></script>
        <link href="Style/HeaderInicio.css" rel="stylesheet" type="text/css"/>
        <link href="Style/ImagenStyle.css" rel="stylesheet" type="text/css"/>
        <link href="Style/font-awesome.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/main.js" type="text/javascript"></script>
        <title>Perfil Empresa</title>
    </head>
    <%
        EmpresaObj CEmpresa = 
                (EmpresaObj)request.getSession().getAttribute("empresa");
        
    %>  
    <body>
        
    <style>
        *{
              font-family: Arial, Helvetica, sans-serif;

        }
                        .a1 {
              text-decoration: none;
              font-size: 30px;
              color: black;
              
            }

             a1:hover {
              opacity: 0.7;
            }
            input{
                  font-family: Arial, Helvetica, sans-serif;
                  font-size: 18px;
                  text-align: center;
                  font-weight: bold;
                  width: 100%;
            }
            label{
                font-size: 18px;
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

.info {background-color: #2196F3;} /* Blue */
.info:hover {background: #0b7dda;}

.warning {background-color: #ff9800;} /* Orange */
.warning:hover {background: #e68a00;}

.danger {background-color: #f44336;} /* Red */ 
.danger:hover {background: #da190b;}

.default {background-color: #e7e7e7; color: black;} /* Gray */ 
.default:hover {background: #ddd;}
            </style>
    <body>
        <div class="navbar">  
            <img class="logo" src="imagenes/Logo.png" alt="logo"/>
          <a href="#carrito">Carrito</a> 
          <a href="#ayuda">Ayuda</a> 
          <div class="dropdown">
          <button class="dropbtn" onclick="myFunction()">Categorías
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="dropdown-content" id="myDropdown">
            <a href="CatServlet?formid=2&categoria=Cultural">Cultural</a>
            <a href="CatServlet?formid=2&categoria=Recreativo">Recreativo</a>
            <a href="CatServlet?formid=2&categoria=Grupos Ideológicos">Grupos Ideológicos</a>
            <a href="CatServlet?formid=2&categoria=Deportivo">Deportivo</a>
            <a href="CatServlet?formid=2&categoria=Rural">Rural</a>
            <a href="CatServlet?formid=2&categoria=Urbano">Urbano</a>
            <a href="CatServlet?formid=2&categoria=De Aventura">De Aventura</a>
            <a href="CatServlet?formid=2&categoria=De Negocios">De Negocios</a>
            <a href="CatServlet?formid=2&categoria=Ecológico">Ecológico</a>
            <a href="CatServlet?formid=2&categoria=Religioso">Religioso</a>
            <a href="CatServlet?formid=2&categoria=Gastronómico">Gastronómico</a>
     
          </div>
          </div>
           <a href="InicioEmpresa.jsp">Inicio</a> 
        </div>
        </div>
                        <div class="container">
                                <div class="row">
                                    <div class="column-img"><br><br><br>
                                    <img style="width: 75%" src="imagenes/avatar empresa.jpg" alt=""/><br><br>
                                     <a class="a1" href="#"><%= CEmpresa.getUsername() %></a><br><br>
                                     <a class="a1" href="#"><i class="fa fa-linkedin"></i></a>
                                    <a class="a1" href="#"><i class="fa fa-facebook"></i></a> 
                                    <a class="a1" href="#"><i class="fa fa-twitter"></i></a>
                                    <a class="a1" href="#"><i class="fa fa-whatsapp"></i></a>    
                                </div>
                   <div class="column-text">
                      <h1>Datos de tu cuenta</h1>
        <br><br>
        <form id="myform" name="myform" action="EmpresaServlet" method="get">
            <label>Empresa número:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= CEmpresa.getId() %>" disabled/>
            <br><br>
            
            <label>Empresa:</label><br>
            <input type="text" id="nombre" name="nombre" value="<%= CEmpresa.getNombre() %>" disabled/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email" value="<%= CEmpresa.getEmail() %>" disabled/>
            <br><br>
            
            <label>Teléfono:</label><br>
            <input type="number" id="telefono" name="telefono" value="<%= CEmpresa.getTelefono() %>" disabled/>
            <br><br>
            
            <label>NIT de la empresa:</label><br>
            <input type="number" id="nit" name="nit" value="<%= CEmpresa.getNit() %>" disabled=""/>
            <br><br>
     
            <label>Contraseña:</label><br>
            <input type="password" id="password" name="password" value="<%= CEmpresa.getPassword() %>" disabled/>
            <br><br>
            
            <label>Número de cuenta bancaria:</label><br>
            <input type="number" id="nodecuenta" name="nodecuenta" value="<%= CEmpresa.getNodeCuenta() %>" disabled/>
            <br><br><br>
     
                   </div>
                            </div>
                            </div>
                          
        </form>
    </body>
</html>
