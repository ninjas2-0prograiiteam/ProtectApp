<%-- 
    Document   : Baja
    Created on : 04-22-2019, 02:38:15 AM
    Author     : melvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Baja</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/>
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <style>       
            .fondo{
                background-image: url('imagenes/baja.jpg');
                 height: 100%; 
              background-size: cover;    
            }  
           .efecto{ 
               
           animation-name: tada;
           animation-duration: 2s}
        </style>
    </head>
    <body class="fondo">
        <section class="caption">
                <h1 class="efecto">Tu cuenta fue dada de baja éxitosamente.</h1>      
                <h1 class="efecto">¡Gracias por dejarnos acompañarte en tus aventuras!</h1>      
            <a href="index.html"><button class="button"><span>Regresar</span></button></a>
        </section>
    </body>
</html>