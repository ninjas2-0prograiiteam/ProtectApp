<%-- 
    Document   : EventoUpdateForm
    Created on : 04-18-2019, 01:34:04 AM
    Author     : Marcos
--%>

<%@page import="tours.prograii.objects.EmpresaObj"%>
<%@page import="tours.prograii.objects.CategoriaObj"%>
<%@page import="java.util.Iterator"%>
<%@page import="tours.prograii.objects.DepartamentosObj"%>
<%@page import="java.util.ArrayList"%>
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
        
        ArrayList<DepartamentosObj> CDepArray = 
                (ArrayList<DepartamentosObj>)request.getSession().getAttribute("departamentos");
        Iterator<DepartamentosObj> iteDepArray = CDepArray.iterator();
        
        ArrayList<CategoriaObj> CaArray = 
                (ArrayList<CategoriaObj>)request.getSession().getAttribute("categoria");
        Iterator<CategoriaObj> iteCatArray = CaArray.iterator();
    %>
    <body>
        <h1>Actualizar Evento</h1>
        <br><br>
        
        <form id="myform" name="myform" action="EventoServlet" method="get">
            <label>Id:</label><br>
            <input type="number" id="nonId" name="nonId" value="<%= CEvento.getId() %>" disabled/>
            <br><br>
            
            <label>Empresa:</label><br>
            <input type="number" id="nonEmpresa" name="nonEmpresa" value="<%= CEvento.getIdEmpresa() %>" disabled/>
            <br><br>
            
            <label>Categoria:</label><br>
            <select id="categoria" name="categoria">
                <option id="categoria0" name="categoria0" value="<%= CEvento.getIdCategoria() %>"></option>                
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
                <option id="departamento0" name="departamento0" value="<%= CEvento.getIdDepartamento() %>"></option>                
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
            <input type="time" id="horadesalida" name="horadesalida" value="<%= CEvento.getHoradeSalida() %>"/>
            <br><br>
            
            <label>Fecha:</label><br>
            <input type="date" id="fecha" name="fecha" value="<%= CEvento.getFecha() %>"/>
            <br><br>
            
            <label>Hora de retorno:</label><br>
            <input type="time" id="horaderetorno" name="horaderetorno" value="<%= CEvento.getHoradeRetorno() %>"/>
            <br><br>
            
            <label>Punto de encuentro:</label><br>
            <input type="text" id="puntodeencuentro" name="puntodeencuentro" value="<%= CEvento.getPuntodeEncuentro() %>"/>
            <br><br>
            
            <label>Precio:</label><br>
            <input type="number" id="precio" name="precio" value="<%= CEvento.getPrecio() %>"/>
            <br><br>
            
            <label>Cupo:</label><br>
            <input type="number" id="cupo" name="cupo" value="<%= CEvento.getCupo() %>"/>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="Actualizar"/>
            <input type="hidden" id="formid" name="formid" value="5" />
            <input type="hidden" id="id" name="id" value="<%= CEvento.getId() %>" />
            <input type="hidden" id="empresa" name="empresa" value="<%= CEvento.getIdEmpresa() %>"/>
        </form>
    </body>
</html>
