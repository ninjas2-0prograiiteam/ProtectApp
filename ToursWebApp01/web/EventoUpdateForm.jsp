<%-- 
    Document   : EventoUpdateForm
    Created on : 04-18-2019, 01:34:04 AM
    Author     : Marcos
--%>

<%@page import="tours.prograii.objects.EventoObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="Scripts/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/additional-methods.js" type="text/javascript"></script>
        <script src="Scripts/EventoFormScript.js" type="text/javascript"></script>
        <title>Actualizar Evento</title>
    </head>
    <%
        EventoObj CEvento = 
                (EventoObj)request.getSession().getAttribute("evento");
    %>
    <body>
        <h1>Actualizar Evento</h1>
        <br><br>
        
        <form id="myform" name="myform" action="EventoServlet" method="get">
            <label>Id:</label><br>
            <input type="number" id="idnon" name="idnon" value="<%= CEvento.getId() %>" disabled/>
            <br><br>
            
            <label>Empresa:</label><br>
            <input type="number" id="empresa" name="empresa" value="<%= CEvento.getIdEmpresa() %>"/>
            <br><br>
            
            <label>Categoria:</label><br>
            <input type="number" id="categoria" name="categoria" value="<%= CEvento.getIdCategoria() %>"/>
            <br><br>
            
            <label>Departamento:</label><br>
            <input type="number" id="departamento" name="departamento" value="<%= CEvento.getIdDepartamento() %>"/>
            <br><br>
            
            <label>Hora de salida:</label><br>
            <input type="text" id="horadesalida" name="horadesalida" value="<%= CEvento.getHoradeSalida() %>"/>
            <br><br>
            
            <label>Fecha:</label><br>
            <input type="text" id="fecha" name="fecha" value="<%= CEvento.getFecha() %>"/>
            <br><br>
            
            <label>Hora de retorno:</label><br>
            <input type="text" id="horaderetorno" name="horaderetorno" value="<%= CEvento.getHoradeRetorno() %>"/>
            <br><br>
            
            <label>Punto de encuentro:</label><br>
            <input type="text" id="puntodeencuentro" name="puntodeencuentro" value="<%= CEvento.getPuntodeEncuentro() %>"/>
            <br><br>
            
            <label>Precio:</label><br>
            <input type="number" id="precio" name="precio" value="<%= CEvento.getPrecio() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Actualizar"/>
            <input type="hidden" id="formid" name="formid" value="5" />
            <input type="hidden" id="id" name="id" value="<%= CEvento.getId() %>" />
        </form>
    </body>
</html>
