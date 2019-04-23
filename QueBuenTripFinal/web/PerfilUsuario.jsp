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
        <link href="Style/zigzag.css" rel="stylesheet" type="text/css"/>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="JavaScript/ScriptInicio.js" type="text/javascript"></script>
        <link href="Style/HeaderInicio.css" rel="stylesheet" type="text/css"/>
        <link href="Style/ImagenStyle.css" rel="stylesheet" type="text/css"/>
        <link href="Style/font-awesome.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/main.js" type="text/javascript"></script>
        <title>Perfil Usuario</title>
    </head>
    <%
        UsuariosObj UObj = 
                (UsuariosObj)request.getSession().getAttribute("users");
    %>
    
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
           <a href="InicioUsuario.jsp">Inicio</a> 

        </div>
                        <div class="container">
                                <div class="row">
                                    <div class="column-img"><br><br><br>
                                    <img style="width: 75%" src="imagenes/avatar usuario.jpg" alt=""/><br><br>
                                     <a class="a1" href="#"><%= UObj.getUsername() %></a><br><br>
                                     <a class="a1" href="#"><i class="fa fa-linkedin"></i></a>
                                    <a class="a1" href="#"><i class="fa fa-facebook"></i></a> 
                                    <a class="a1" href="#"><i class="fa fa-twitter"></i></a>
                                    <a class="a1" href="#"><i class="fa fa-whatsapp"></i></a>    
                                </div>
                    <div class="column-text">
                      <h1>Datos de tu cuenta</h1>
        <br><br>
        <form id="myform" name="myform" action="UsuariosServlet" method="get">
            <label>Usuario número:  </label>
            <input type="number" id="nonId" name="nonId" value="<%= UObj.getId() %>" disabled/>
            <br><br>
            
            <label>Nombre:  </label>
            <input type="text" id="nombre" name="nombre" value="<%= UObj.getNombre() %>" disabled/>
            <br><br>
            
            <label>Apellido:  </label>
            <input type="text" id="apellido" name="apellido" value="<%= UObj.getApellido() %>" disabled/>
            <br><br>
            
            <label>Edad:  </label>
            <input type="number" id="edad" name="edad" value="<%= UObj.getEdad() %>" disabled/>
            <br><br>
            
            <label>DUI:  </label>
            <input type="number" id="dui" name="dui" value="<%= UObj.getDui() %>" disabled/>
            <br><br>
            
            <label>Email:  </label>
            <input type="email" id="email" name="email" value="<%= UObj.getEmail() %>" disabled/>
            <br><br>
         
            <label>Contaseña:  </label>
            <input type="password" id="contra" name="contra" value="<%= UObj.getPassword() %>" disabled/>
            <br><br>

            <label>Departamento:  </label>
            <input type="text" id="departamento" name="departamento" value="<%= UObj.getIdDepartamento() %>" disabled/><br><br>
                
            <br>
            <a href="UsuariosServlet?formid=3&id=<%= UObj.getId() %>" class="boton info" style="text-decoration:none;">
                Modificar cuenta                
                             </a>
                <br><br><br>
               <a href="UsuariosServlet?formid=2&id=<%= UObj.getId() %>" class="boton danger" style="text-decoration:none;">
                   Eliminar cuenta
                        </a>
               <input type="hidden" id="id" name="id" value="<%= UObj.getId() %>" /> <br><br>
               <p>¿Seguro de que quieres eliminar tu cuenta?</p>
               <p> Si eliminas tu cuenta, se borrará completamente todo registro alguno.</p>
            
        </form>
                              </div>
                            </div>
                            </div>
                         
    </body>
</html>
