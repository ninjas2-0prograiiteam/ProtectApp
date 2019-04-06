

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de empresa</title>
    </head>
    <body>
        <h1>Registro de empresa</h1>
        <h2>Por favor ingrese los datos de su empresa</h2>
        
        <form>
            <label>Nombre de la empresa:</label><br>
            <input type="text" id="nombree" name="nombree"/>
            <br><br>
            
            <label>Email de la empresa:</label><br>
            <input type="text" id="emaile" name="emaile"/>
            <br><br>
            
            <label>Teléfono de la empresa:</label><br>
            <input type="number" id="telefonoe" name="telefonoe"/>
            <br><br>
            
            <label>NIT de la empresa:</label><br>
            <input type="number" id="nite" name="nite"/>
            <br><br>
            
            <label>Nombre de usuario para la empresa:</label><br>
            <input type="text" id="usere" name="usere"/>
            <br><br>
            
            <label>Contaseña:</label><br>
            <input type="text" id="contra" name="contra"/>
            <br><br>
            
            <label>Confirme contraseña:</label><br>
            <input type="text" id="contracon" name="contracon"/>
            <br><br>
            
            <label>Número de cuenta de la empresa:</label><br>
            <input type="number" id="numerodecuenta" name="numerodecuenta"/>
            <br><br>
            
             <input type="submit" id="mysubmit" name="mysubmmit" value="Unirme"/>
        </form>
    </body>
</html>
