<%-- 
    Document   : ejercicio6
    Created on : 14-may-2019, 16:32:29
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="conversorpesetaseuros.jsp"/>
      Introduzca la cantidad de pesetas que quiera convertir a euros:
      <input  type = " number "  min = " 0 "  step = " 0.01 "  name = "pesetas" />
      <input type="submit" value="Convertir"/>
    </body>
</html>
