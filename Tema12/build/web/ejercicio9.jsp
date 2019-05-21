<%-- 
    Document   : ejercicio9
    Created on : 21-may-2019, 16:25:01
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilospiramide.css">
        <title>Pirámide</title>
    </head>
    <body>
        <h1>Pirámide</h1>
        <form method="get" action="pintar.jsp">
            <h3>Introduzca la cantidad de filas:</h3>
         <br>
         <div>  <input type="number" min="1" max="10" name="altura"> </div>
         <br>
         <div><input type="submit" value="Crear pirámide"></div>
        </form>
    </body>
</html>
