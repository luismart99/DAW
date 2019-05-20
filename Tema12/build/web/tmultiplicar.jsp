<%-- 
    Document   : tmultiplicar
    Created on : 15-may-2019, 12:19:42
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos8.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <% int num = Integer.parseInt(request.getParameter("numero")); %>
        <table>
           <%
           
           for (int i = 0; i < 11; i++) {
                 out.println("<tr><td>" + i + " x " + num + "</td><td> = </td><td>" + i * num + "</td></tr>");
               }
         
           %>           
        </table>
    </body>
</html>
