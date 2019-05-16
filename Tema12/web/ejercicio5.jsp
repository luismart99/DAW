<%-- 
    Document   : ejercicio5
    Created on : 14-may-2019, 15:58:16
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de euros a pesetas</title>
    </head>
    <body>
       <form method="post" action="conversoreurospesetas.jsp"/>
        Ingrese la cantidad de euros que quiere convertir a pesetas:
       <input  type = " number "  min = " 0 "  step = " 0.01 "  name = "euros" />
       <input type="submit" value="Convertir"/>
    </body>
</html>
