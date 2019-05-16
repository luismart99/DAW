<%-- 
    Document   : hola
    Created on : 09-may-2019, 18:18:11
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola...</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Hola <% out.print(request.getParameter("nombre")); %>
    </body>
</html>
