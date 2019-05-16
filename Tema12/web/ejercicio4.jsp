<%-- 
    Document   : ejercicio4
    Created on : 09-may-2019, 18:20:41
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ejercicio4</title>
    </head>
    <body>
        <form method="post" action="media.jsp"/>
        Ingrese tres notas:
        <input type="number" min="0" max="10" step="0.01" name="nota1" />
        <input type="number" min="0" max="10" step="0.01" name="nota2" />
        <input type="number" min="0" max="10" step="0.01" name="nota3" />
        <input type="submit" value="Calcular"/>
        
    </body>
</html>
