
<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.EventoViewObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    String strLoginId = (String)objsesion.getAttribute("strLoginId");

    //if(usuario.equals(""))
    //{
    //    objsesion.invalidate();  
    //}  
%>
<!DOCTYPE html>
<html>
    <head>
           <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>QBT Usuario</title>
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
                (ArrayList<EventoViewObj>)request.getSession().getAttribute("eventos");
                  Iterator<EventoViewObj> iteArray = CArray.iterator();  
            %>       
    <body>
        <div class="navbar">  <a href="CarritoDeCompasServlet?formid=2&usuario=<%= usuario %>">Carrito</a>
            <img class="logo" src="imagenes/Logo.png" alt="logo"/><a href="#ayuda">Ayuda</a>                  
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
                        <div id="mySidebar" class="sidebar">
                    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                    <a href="index.html"><i class="fa fa-fw fa-home"></i>Cerrar sesión</a>
                    <a href="UsuariosServlet?formid=9&usuario=<%= usuario %>"><i class="fa fa-fw fa-user"></i>Mi perfil</a>
                   
                    <a href="PagoServlet?formid=5&usuario=<%= usuario %>"><i class="fa fa-fw fa-money"></i>Adminitración de tarjeta</a>
                    <a href="contactanos.html"><i class="fa fa-fw fa-envelope"></i> Contáctanos</a>
                  </div>
                    <div id="main">
                  <button class="openbtn" onclick="openNav()">☰ <% out.println(usuario);%></button> 
                  <script src="JavaScript/opensidebar.js" type="text/javascript"></script>
                  </div><br><br>
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
                    <h2 style="text-align:center"><%= CTemp.getEmpresa()%></h2><br>
                      <img src="imagenes/avatar evento.jpg" alt="Imagen" style="width:100%">
                    <h1><%= CTemp.getCategoria() %></h1><br>
                   
                    <p class="price">$<%= CTemp.getPrecio()%></p><br>
                    <p>
                        Departamento: <%= CTemp.getDepartamento() %><br>
                        Fecha: <%= CTemp.getFecha() %><br>
                        Punto de encuentro: <%= CTemp.getPuntodeEncuentro() %><br>
                        Hora de salida: <%= CTemp.getHoradeSalida() %><br>
                        Hora de retorno: <%= CTemp.getHoradeRetorno() %><br>
                        Cupos disponibles: <%= CTemp.getCuposRestantes() %><br>                   
                    </p><br>
                   <p><a href="CarritoDeCompasServlet?formid=1&Fecha=<%=CTemp.getFecha()%>&HoraRetorno=<%=CTemp.getHoradeRetorno()%>&HoraSalida=<%= CTemp.getHoradeSalida()%>&id=<%= strLoginId %>"><button class="button"><span>Adquirir</span></button></p></a>                
                    </div>            
        <%
                }
            }
        %>
        
    </body>
</html>
