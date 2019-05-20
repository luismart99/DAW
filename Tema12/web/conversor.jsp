<%-- 
    Document   : conversor
    Created on : 20-may-2019, 16:18:20
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
      <h2>
        <%
          double c = Double.parseDouble(request.getParameter("cantidad"));
          DecimalFormat formatoEuros = new DecimalFormat("0.00");
          if (request.getParameter("cambio").equals("eurosapesetas")) {
            out.print(formatoEuros.format(c) + Math.round(c * 166.386) + " pesetas.");
          } else {
            out.print(Math.round(c) +  formatoEuros.format(c / 166.386) + " euros.");
          }
        %>
    </body>
</html>
