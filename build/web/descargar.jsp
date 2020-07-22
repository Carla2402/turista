<%-- 
    Document   : descargar
    Created on : 25/07/2019, 10:58:14 PM
    Author     : HP
--%>

<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%
        String nomFile=request.getParameter("nom");
        try{
        
        FileInputStream archivo = new FileInputStream("c:/archivos/"+nomFile);
        int longitud = archivo.available();
        byte[] datos = new byte[longitud];
        archivo.read(datos);
        archivo.close();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename="+nomFile);
        ServletOutputStream ouputStream = response.getOutputStream();
        ouputStream.write(datos);
        ouputStream.flush();
        ouputStream.close();
      }catch(Exception e){ e.printStackTrace(); }  
        %>
        
    </body>
</html>
