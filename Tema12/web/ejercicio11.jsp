<%-- 
    Document   : ejercicio10
    Created on : 15-may-2019, 12:54:49
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="estilos11.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Generador de calendarios</h1>
        <form method="post" action="calendario.jsp">
            Selecciona el mes 
            <select name="mes">
                <option>Enero</option>
                <option>Febrero</option>
                <option>Marzo</option>
                <option>Abril</option>
                <option>Mayo</option>
                <option>Junio</option>
                <option>Julio</option>
                <option>Agosto</option>
                <option>Septiembre</option>
                <option>Octubre</option>
                <option>Noviembre</option>
                <option>Diciembre</option>
            </select>
            <br>
            <br>
            Escriba el año
            <input type="number" min="1" name="anio">
            <br>
            <br>
            Seleccione el día en el que empieza el mes
            <select name="dia1">
            <option value="1">Lunes</option>
            <option value="2">Martes</option>
            <option value="3">Miércoles</option>
            <option value="4">Jueves</option>
            <option value="5">Viernes</option>
            <option value="6">Sábado</option>
            <option value="7">Domingo</option>
            </select></br></br>
            Número de días que tiene el mes <input type="number" min="28" max="31" name="diastotales"></br></br>
            <hr>
            </br></br>
            <input type="submit" value="Generar">
            
    </body>
</html>
