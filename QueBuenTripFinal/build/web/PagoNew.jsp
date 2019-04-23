<%@page import="tours.prograii.objects.PagoObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.UsuariosObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
           <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script> 
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/PagoFormScript.js" type="text/javascript"></script>
        <title>Pago</title>
        <link href="Style/header.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <%
        
          UsuariosObj UObj = 
                (UsuariosObj)request.getSession().getAttribute("cusuarios");

    %>
      
         <style>   
                           
            .fondo{
                            background-image: url('imagenes/albania.jpg');
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
        </style>
    </head>
    <body class="fondo">
        
         <br><br>
        <script src="JavaScript/modalregistrar.js" type="text/javascript"></script>
        <form class="modal-content animate" action="PagoServlet" method="post">
              

            <div class="container">       
                <div class="imgcontainer">
                 
                  <img src="imagenes/iconotarjetas.jpg" alt="Avatar" class="avatar">
                </div>   
                 <p style="font-size: 120%">¡Gracias por confiar en nosotros!</p><br><br>
          
            <label>No de tarjeta:</label><br>
            <input type="number" id="NodeTarjeta" name="nodetarjeta"/>
            <br><br>
            
            <label>CVV:</label><br>
            <input type="number" id="Cvv" name="cvv" />
            <br><br>
            
            <label>Fecha de vencimiento:</label><br>
            <input type="number" id="FechadeVencimiento" name="fechadevencimiento" />
           <br><br>
             
           
                  
                       

             <p>Al ingresar una nueva tarjeta, usted acepta nuestros <a href="#" style="color:dodgerblue">Términos y  Privacidad</a>.</p>
             <br>
            <div class="clearfix">
           <a  href="InicioUsuario.jsp">  <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancelar</button> </a>
        <button id="mysubmit" type="submit" class="signupbtn">Agregar tarjeta</button> 
         <input type="hidden" id="formid" name="formid" value="1"/>    
        <input type="hidden" id="idusuario" name="idusuario" value="<%= UObj.getId() %>" />
            </div>
            
       
        
      </div>  
        </form>
    </body>
</html>