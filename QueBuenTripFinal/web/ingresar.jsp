<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
        <title>Ingresar</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <script src="app.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>
        <style>
            #particles-js{
                background-position: center;
                background-attachment:fixed;
                background-size: cover;
                width: 1350px;
                height: 615px;
                background-image: url('imagenes/carretera.jpg');
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;          
            } 
            .efecto{
                animation-name: wobble;
                animation-duration: 3s
            }
          
        </style>
    </head>  
    <body id="particles-js">  
        <section class="caption">
                <h1 class=" efecto">¿Tú eres?</h1>      
            <button class="button" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">
                <span>Usuario</span></button>
            <button class="button" onclick="document.getElementById('id02').style.display='block'" style="width:auto;">
                <span>Empresa</span></button>
        </section>  
   
    <script src="particles.js" type="text/javascript"></script>
  <script src="app.js" type="text/javascript"></script>
  
  <div id="id01" class="modal">
  
  <form class="modal-content animate" action="Login" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="imagenes/avatar usuario.jpg" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Usuario</b></label>
      <input type="text" placeholder="Ingresar usuario" name="uname" required>

      <label for="psw"><b>Contraseña</b></label>
      <input type="password" placeholder="Ingresar contraseña" name="upass" required>
        
      <button type="submit">Entrar</button><br>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Recordar
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancelar</button>
      <span class="psw">¿Olvidaste tu <a href="#">contraseña?</a></span>
    </div>
  </form>
</div>
  <script src="JavaScript/modalingresar.js" type="text/javascript"></script>
  <div id="id02" class="modal">
  
  <form class="modal-content animate" action="LoginEmpresa">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="imagenes/avatar empresa.jpg" alt="Avatar" class="avatar">

    </div>

    <div class="container">
      <label for="uname"><b>Usuario</b></label>
      <input type="text" placeholder="Ingresar usuario" name="uname" required>

      <label for="psw"><b>Contraseña</b></label>
      <input type="password" placeholder="Ingresar contraseña" name="upass" required>
        
      <button type="submit">Entrar</button><br>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Recordar
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancelar</button>
      <span class="psw">¿Olvidaste tu <a href="#">contraseña?</a></span>
    </div>
  </form>
</div>
  <script src="JavaScript/modalingresar.js" type="text/javascript"></script>
    </body>
</html>
