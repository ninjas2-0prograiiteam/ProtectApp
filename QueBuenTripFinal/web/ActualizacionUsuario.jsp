<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Actualización</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/>
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <style>       
            .fondo{
                background-image: url('imagenes/fondo2.jpg');
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
                <h1 class="efecto">Tus datos fueron actualizados éxitosamente</h1>      
            <a href="InicioUsuario.jsp"><button class="button"><span>Regresar</span></button></a>
        </section>
    </body>
</html>