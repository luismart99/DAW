<%-- 
    Document   : ejercicio7
    Created on : 20-may-2019, 16:11:27
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="estilos7.css">
        <title>Conversor</title>
    </head>
    <body>
        <form method="post" action="conversor.jsp"/>
           <h1>Conversor de monedas</h1>
           <h3> Introduzca una cantidad</h3> 
      <input type="number" min="0" step="0.01" name="cantidad">
      <input type="radio" name="cambio" value="eurosapesetas" checked="checked"> <h4>EUROS A PESETAS</h4>
          <br>
          <input type="radio" name="cambio" value="pesetasaeuros"> <h4>PESETAS A EUROS</h4>
          <br>
      <input type="submit" value="Convertir" align="center">
    </form>
    </body>
</html>
