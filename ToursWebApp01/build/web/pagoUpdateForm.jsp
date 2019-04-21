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
                (PagoObj)request.getSession().getAttribute("pagos");
    %>
    <body>
        <h1>Actualizar Pago</h1>
        <br><br>
        <form id="myform" name="myform" action="PagoServlet" method="get">
            
            <label>Id:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= CPago.getId() %>" disabled/>
            <br><br>
            
            <label>Usuario:</label><br>
            <input type="number" id="IdUsuario" name="idusuario" value="<%= CPago.getIdUsuario() %>" />
            <br><br>
            
            <label>No de tarjeta:</label><br>
            <input type="number" id="NodeTarjeta" name="nodetarjeta" value="<%= CPago.getNodeTarjeta() %>"/>
            <br><br>

            <label>CVV:</label><br>
            <input type="number" id="Cvv" name="cvv" value="<%= CPago.getCvv() %>"/>
            <br><br>
            
            <label>Fecha de vencimiento:</label><br>
            <input type="number" id="FechadeVencimiento" name="fechadevencimiento" value="<%= CPago.getFechadeVencimiento() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmmit" value="Actualizar Pago"/>
            <input type="hidden" id="formid" name="formid" value="4"/>
            <input type="hidden" id="id" name="id" value="<%= CPago.getId() %>" />

        </form>
    </body>
</html>
