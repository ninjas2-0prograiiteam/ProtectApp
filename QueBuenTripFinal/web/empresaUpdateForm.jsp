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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/EmpresaFormScript.js" type="text/javascript"></script>
        <link href="Style/header.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>     
        <title>Modificar Datos</title>
        
         <style>   
                           
            .fondo{
              background-image: url('imagenes/fondoempresa.jpg');
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
    </head>
    <%
        EmpresaObj CEmpresa = 
                (EmpresaObj)request.getSession().getAttribute("empresa");
        
    %>  
    <body class="fondo
          ">
      <br><br>
        <script src="JavaScript/modalregistrar.js" type="text/javascript"></script>
        
        <form  class="modal-content animate" id="myform" name="myform" action="EmpresaServlet" method="get">
            
            <div class="container">       
                <div class="imgcontainer">
                 
                  <img src="imagenes/avatar actualizar.jpg" alt="Avatar" class="avatar">
                </div>   
                <p style="font-size: 120%">Modifica tus datos</p><br><br>
            
            <label>Empresa número:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= CEmpresa.getId() %>" disabled/>
            <br><br>
            
            <label>Empresa:</label><br>
            <input type="text" id="nombre" name="nombre" value="<%= CEmpresa.getNombre() %>"/>
            <br><br>
            
            <label>Email:</label><br>
            <input type="email" id="email" name="email" value="<%= CEmpresa.getEmail() %>"/>
            <br><br>
            
            <label>Teléfono:</label><br>
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
            
            
            <label>Número de cuenta bancaria:</label><br>
            <input type="number" id="nodecuenta" name="nodecuenta" value="<%= CEmpresa.getNodeCuenta() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Modificar" class="boton success"/>
            <input type="hidden" id="formid" name="formid" value="5" />
            <input type="hidden" id="id" name="id" value="<%= CEmpresa.getId() %>" />  
            </div>
        </form>
  
    </body>
</html>
