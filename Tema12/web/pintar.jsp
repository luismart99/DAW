<%-- 
    Document   : pintar
    Created on : 15-may-2019, 12:36:35
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilospiramide.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%
      int alturaTotal = Integer.parseInt(request.getParameter("altura"));
      int altura = 1;
      int i = 0;
      int espacios = alturaTotal - 1;
            while (altura <= alturaTotal) {

              for (i = 1; i <= espacios; i++) {
                out.print("<img src=\"blanco.jpg\">");
              }

              for (i = 1; i < altura * 2; i++) {
                out.print("<img src=\"b.png\">");
              }
              out.println("</br>");
              altura++;
              espacios--;
      } 
     %>
    </body>
</html>
