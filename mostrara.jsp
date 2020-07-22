<%-- 
    Document   : mostrara
    Created on : 31/05/2019, 01:29:47 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <title>Turista</title>
    <link rel="stylesheet" href="estilos.css">
    <link rel="stylesheet" href="fonts.css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One" rel="stylesheet">
  </head>
       
    <center><h1>Marcadores Malinalco</h1></center>
         <table border="1">
            <tr>
                <td><b><h2><p style="color:red;">Clave</p></h2></b></td>
                <td><b><h2><p style="color:red;">Nombre</p></h2></b></td></h2>
                <td><b><h2><p style="color:red;">Tipo</p></h2></b></td>
                <td><b><h2><p style="color:red;">Accion1</p></h2></b></td>
                <td><b><h2><p style="color:red;">Accion2</p></h2></b></td>
            </tr>
            
            <%
                ResultSet ra = new datos.Conecta().conectar().createStatement().
                executeQuery("select * from archivo ");
            while(ra.next()){
                %>
                <tr>
                <td><b><h2><p style="color:blue;"><%=ra.getString(1)%></p></h2></b></td>
                <td> <b><h2><p style="color:blue;"><%=ra.getString(2)%> </p></h2></b></td>
                <td> <b><h2><p style="color:blue;"><%=ra.getString(3)%> </p></h2></b></td>
                
                <td> 
                    <form name="ok" action="descargar.jsp">
                        <input type="hidden" name="nom" value="<%=ra.getString(2)%>"/>
                        <input type="submit"  value="descargar">
                    </form>
                </td>
                              
            </tr>
                <%
                    }
                %>
        </table>
        <form name="ok" action="mali.jsp" method="post">
            <br/><br/><input type="submit" value="Regresar"/>
        </form>
    </body>
</html>
