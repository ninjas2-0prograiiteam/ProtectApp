<%@page import="tours.prograii.objects.PagoObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>Actualizar Pago</title>
    </head>
    <%
        PagoObj CPago = 
                (PagoObj)request.getSession().getAttribute("pago");
        
    %>
    <body>
        <h1>Actualizar Pago</h1>
        <br><br>
        
        <form id="myform" name="myform" action="PagoServlet" method="get">
            <label>Id:</label><br>
            <input type="number" id="Id" name="id" value="<%= CPago.getId() %>" disabled/>
            <br><br>
            
            <label>Id Usuario:</label><br>
            <input type="number" id="IdUsuario" name="idusuario" value="<%= CPago.getIdUsuario() %>" />
            <br><br>
            
            <label>No de tarjeta:</label><br>
            <input type="number" id="NodeTarjeta" name="nodetarjeta" value="<%= CPago.getNodeTarjeta() %>" />
            <br><br>
            
            <label>CVV:</label><br>
            <input type="number" id="Cvv" name="cvv" value="<%= CPago.getCvv() %>" />
            <br><br>
            
            <label>Fecha de vencimiento:</label><br>
            <input type="number" id="FechadeVencimiento" name="fechadevencimiento" value="<%= CPago.getFechadeVencimiento() %>" />
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Update"/>
            <input type="hidden" id="formid" name="formid" value="5" />
            <input type="hidden" id="Id" name="id" value="<%= CPago.getId() %>" />
        </form>
    </body>
</html>
