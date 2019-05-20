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
        <title>Conversor</title>
    </head>
    <body>
        <form method="post" action="conversor.jsp"/>
           <h1>conversor de moneda</h1>
      cantidad</br><input type="number" min="0" step="0.01" name="cantidad"></br></br>
      <input type="radio" name="cambio" value="eurosapesetas" checked="checked"> EUROS A PESETAS</br></br>
      <input type="radio" name="cambio" value="pesetasaeuros"> PESETAS A EUROS</br></br>
      <input type="submit" value="Convertir">
    </form>
    </body>
</html>
