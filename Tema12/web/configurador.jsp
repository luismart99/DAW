<%-- 
    Document   : configurador
    Created on : 21-may-2019, 16:46:06
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos17.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hyundai i30N</h1>
    <%
      String color = request.getParameter("color");
      String interior = request.getParameter("Interior");
      String imagen = color + ".png";
      String imagen2 = interior + ".png";
    %>
    <p><img src="<%= imagen %>"></p>
    <p><img src="<%= imagen2 %>"></p>
    </body>
</html>
