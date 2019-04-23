<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cuenta Creada</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/>
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <style>       
            .fondo{
                background-image: url('imagenes/el-tunco-surf.jpg');
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
                <h1 class="efecto">Tu cuenta fue creada éxitosamente.</h1>      
                <h1 class="efecto">Por favor, inicie sesión.</h1>      
                <h1 class="efecto">¡Disfruta la aventura con nosotros!</h1>      
            <a href="ingresar.jsp"><button class="button"><span>Iniciar Sesión</span></button></a>
        </section>
    </body>
</html>