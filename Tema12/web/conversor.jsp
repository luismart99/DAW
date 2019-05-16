<%-- 
    Document   : conversor
    Created on : 14-may-2019, 17:06:31
    Author     : Luis
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
          double valor = Double.parseDouble(request.getParameter("valor"));
          DecimalFormat moneda = new DecimalFormat("0.00");
          
          if (request.getParameter("Convertir").equals("euros")) {
            out.print(moneda.format(valor) + Math.round(valor * 166.386) + " pesetas.");
          } else {
            out.print(Math.round(valor) + moneda.format(valor / 166.386) + " euro/s.");
          }
        
        %>
    </body>
</html>
