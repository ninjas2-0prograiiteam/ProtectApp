<%-- 
    Document   : EventoNew
    Created on : 18-abr-2019, 22:45:16
    Author     : HP PC
--%>

<%@page import="tours.prograii.objects.EmpresaObj"%>
<%@page import="tours.prograii.objects.CategoriaObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/EventoFormScript.js" type="text/javascript"></script>
        <link href="Style/header.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="Style/letras y botones.css" rel="stylesheet" type="text/css"/>
        <link href="Style/animate.css" rel="stylesheet" type="text/css"/> <script src="particles.js" type="text/javascript"></script>
        <link href="Style/loginusuarioStyle.css" rel="stylesheet" type="text/css"/>
        <script src="Scripts/UsuariosFormScript.js" type="text/javascript"></script>
        <script src="Scripts/EmpresaFormScript.js" type="text/javascript"></script>
       
        <title>Agregar Evento</title>
        
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
    <%ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
        
        ArrayList<CategoriaObj> CaArray = 
                (ArrayList<CategoriaObj>)request.getSession().getAttribute("categoria");
        Iterator<CategoriaObj> iteCatArray = CaArray.iterator();
        
        ArrayList<EmpresaObj> EmpArray = 
                (ArrayList<EmpresaObj>)request.getSession().getAttribute("empresa");
        Iterator<EmpresaObj> iteEmpArray = EmpArray.iterator();
        
    %> 
    <body class="fondo">
    
        <br><br>
        <script src="JavaScript/modalregistrar.js" type="text/javascript"></script>
        <form class="modal-content animate" action="EventoServlet" method="post">
              

            <div class="container">       
                <div class="imgcontainer">
                 
                  <img src="imagenes/mochila.jpg" alt="Avatar" class="avatar">
                </div>   
                 <p style="font-size: 120%">¡Crea un evento nuevo!</p><br><br>
            
            <label>Empresa:</label><br>
            <select id="empresa" name="empresa">
                <option id="empresa0" name="empresa0" value="0"></option>                
                <%
                    if(iteCatArray!=null)
                    {
                        EmpresaObj CEmpTemp;
                        while(iteEmpArray.hasNext())
                        {
                            CEmpTemp = iteEmpArray.next();
                %>
                            <option id="categoria<%= CEmpTemp.getId() %>" 
                                    name="categoria<%= CEmpTemp.getId() %>" 
                                    value="<%= CEmpTemp.getId() %>">
                                <%= CEmpTemp.getNombre()%>
                            </option>
                <%
                        }
                    }
                %>
                </select>
            <br><br>
            
            <label>Categoria:</label><br>
            <select id="categoria" name="categoria">
                <option id="categoria0" name="categoria0" value="0"></option>                
                <%
                    if(iteCatArray!=null)
                    {
                        CategoriaObj CCatTemp;
                        while(iteCatArray.hasNext())
                        {
                            CCatTemp = iteCatArray.next();
                %>
                            <option id="categoria<%= CCatTemp.getId() %>" 
                                    name="categoria<%= CCatTemp.getId() %>" 
                                    value="<%= CCatTemp.getId() %>">
                                <%= CCatTemp.getTipo()%>
                            </option>
                <%
                        }
                    }
                %>
                </select>
            <br><br>
            
            <label>Departamento:</label><br>
            <select id="departamento" name="departamento">
                <option id="departamento0" name="departamento0" value="0"></option>                
                <%
                    if(iteDepArray!=null)
                    {
                        DepartamentosObj CDepTemp;
                        while(iteDepArray.hasNext())
                        {
                            CDepTemp = iteDepArray.next();
                %>
                            <option id="departamento<%= CDepTemp.getId() %>" 
                                    name="departamento<%= CDepTemp.getId() %>" 
                                    value="<%= CDepTemp.getId() %>">
                                <%= CDepTemp.getNombre()%>
                            </option>
                <%
                        }
                    }
                %>
                </select>
            <br><br>
            
            <label>Hora de salida:</label><br>
            <input type="time" id="horadesalida" name="horadesalida"/>
            <br><br>
            
            <label>Fecha:</label><br>
            <input type="date" id="fecha" name="fecha"/>
            <br><br>
            
            <label>Hora de retorno:</label><br>
            <input type="time" id="horaderetorno" name="horaderetorno"/>
            <br><br>
            
            <label>Punto de encuentro:</label><br>
            <input type="text" id="puntodeencuentro" name="puntodeencuentro" placeholder="Dirección"/>
            <br><br>
            
            <label>Precio:</label><br>
            <input type="number" id="precio" name="precio" placeholder="$"/>
            <br><br>
            
            <label>Cupo:</label><br>
            <input type="number" id="cupo" name="cupo" placeholder="Cupo Disponible"/><br><br>
            
             <p>Al crear un evento nuevo, usted acepta nuestros <a href="#" style="color:dodgerblue">Términos y  Privacidad</a>.</p>
             <br>
             
      <div class="clearfix">
       <a  href="InicioEmpresa.jsp">  <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancelar</button> </a>
        <button id="mysubmit" type="submit" class="signupbtn">Crear evento</button> 
        <input type="hidden" id="formid" name="formid" value="1"/>
      </div>  
            </div>                   
      </form>  
      
           
    </body>
</html>
