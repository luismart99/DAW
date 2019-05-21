<%-- 
    Document   : eltrile
    Created on : 21-may-2019, 17:31:41
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 18</title>
    <link href="estilos18.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>El Trile</h1>
    <%
      int bola = (int)(Math.random() * 3);
      int vaso = Integer.parseInt(request.getParameter("vaso"));
      String imagen[] = {"vaso.png", "vaso.png", "vaso.png"};
      imagen[bola] = "vasobola.png";
      
      String mensaje;
      if (bola == bola) {
        mensaje = "¡Has acertado!";
      } else {
        mensaje = "No has acertado";
      }
    %>
    <table>
      <tr>
        <td><img src="<%= imagen[0] %>"></td>
        <td><img src="<%= imagen[1] %>"></td>
        <td><img src="<%= imagen[2] %>"></td>
      </tr>
    </table>
  </body>
</html>