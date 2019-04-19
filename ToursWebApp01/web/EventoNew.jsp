<%-- 
    Document   : EventoNew
    Created on : 18-abr-2019, 22:45:16
    Author     : HP PC
--%>

<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Evento</title>
    </head>
    <%
        ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
    %> 
    <body>
        <h1>Nuevo Evento</h1>
        <br><br>
        
        <form id="myform" name="myform" action="EventoServlet" method="get">
            <label>Empresa:</label><br>
            <input type="number" id="empresa" name="empresa"/>
            <br><br>
            
            <label>Categoria:</label><br>
            <input type="number" id="categoria" name="categoria"/>
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
            <br><br>
            
            <label>Hora de salida:</label><br>
            <input type="text" id="horadesalida" name="horadesalida"/>
            <br><br>
            
            <label>Fecha:</label><br>
            <input type="text" id="fecha" name="fecha"/>
            <br><br>
            
            <label>Hora de retorno:</label><br>
            <input type="text" id="horaderetorno" name="horaderetorno"/>
            <br><br>
            
            <label>Punto de encuentro:</label><br>
            <input type="text" id="puntodeencuentro" name="puntodeencuentro"/>
            <br><br>
            
            <label>Precio:</label><br>
            <input type="number" id="precio" name="precio"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Create"/>
            <input type="hidden" id="formid" name="formid" value="1" />
        </form>
    </body>
</html>
