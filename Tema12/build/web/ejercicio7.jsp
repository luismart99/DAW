<%-- 
    Document   : ejercicio7
    Created on : 14-may-2019, 17:15:35
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
        <h1> Introduzca el valor de la moneda <h1/>
        <form method="post" action="conversor.jsp"/>
        <input  type = " number "  min = " 0 "  step = " 0.01 "  name = "valor" />
            <h2>EUROS A PESETAS</h2>
             <input type="submit" value="Convertir" name="euros"/>
            <h2>PESETAS A EUROS</h2>
             <input type="submit" value="Convertir" name="pesetas"/>
          
    </body>
</html>
