<%@page import="tours.prograii.objects.EventoViewObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>Mis Eventos</title>
        <link href="styles/tableStyles.css" rel="stylesheet" type="text/css"/>        
    <link href="styles/tableStyles.css" rel="stylesheet" type="text/css"/>  
        <link href="Style/sidebar.css" rel="stylesheet" type="text/css"/>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="JavaScript/ScriptInicio.js" type="text/javascript"></script>
        <link href="Style/HeaderInicio.css" rel="stylesheet" type="text/css"/>
        <link href="Style/ImagenStyle.css" rel="stylesheet" type="text/css"/>
        <link href="Style/font-awesome.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/jquery-3.1.0.min.js" type="text/javascript"></script>
        <script src="JavaScript/main.js" type="text/javascript"></script>
        <link href="animate.css" rel="stylesheet" type="text/css"/>
        <link href="Style/eventos.css" rel="stylesheet" type="text/css"/>
        <link href="Style/column.css" rel="stylesheet" type="text/css"/>
    </head>
    <%
        ArrayList<EventoViewObj> CArray = 
                (ArrayList<EventoViewObj>)request.getSession().getAttribute("eventoc");
        Iterator<EventoViewObj> iteArray = CArray.iterator();
        
    %>
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
            <a href="CatServlet?formid=2&categoria=Grupos Ideologicos">Grupos Ideológicos</a>
            <a href="CatServlet?formid=2&categoria=Deportivo">Deportivo</a>
            <a href="CatServlet?formid=2&categoria=Rural">Rural</a>
            <a href="CatServlet?formid=2&categoria=Urbano">Urbano</a>
            <a href="CatServlet?formid=2&categoria=De Aventura">De Aventura</a>
            <a href="CatServlet?formid=2&categoria=De Negocios">De Negocios</a>
            <a href="CatServlet?formid=2&categoria=Ecologico">Ecológico</a>
            <a href="CatServlet?formid=2&categoria=Religioso">Religioso</a>
            <a href="CatServlet?formid=2&categoria=Gastronomico">Gastronómico</a>
     
          </div>
          </div>
          <a href="InicioUsuario.jsp">Inicio</a>
        </div>
    
        <%
            if(iteArray!=null)
            {
                EventoViewObj CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
        %>
                <div style="padding: 10px; float: left; width: 420px; height: 600px ; margin-right: 50px; margin-left: 80px;
                       margin-bottom: 50px;" class="card">
                    <img src="imagenes/avatar evento.jpg" alt="Imagen" style="width:100%">
                   
                    <h1><%= CTemp.getCategoria() %></h1><br>
                    <p class="price">$<%= CTemp.getPrecio()%></p><br>
                    <p>
                        Departamento: <%= CTemp.getDepartamento() %><br>
                        Fecha: <%= CTemp.getFecha() %><br>
                        Punto de encuentro: <%= CTemp.getPuntodeEncuentro() %><br>
                        Hora de salida: <%= CTemp.getHoradeSalida() %><br>
                        Hora de retorno: <%= CTemp.getHoradeRetorno() %><br>
                        Cupos sobrantes: <%= CTemp.getCuposRestantes() %><br>                   
                    </p><br>
                    <p><button>Mi Evento </button></p>
                  </div> 
        <%
                }
            }
        %>
        
    </body>
</html>

