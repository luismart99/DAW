<%-- 
    Document   : conversorv2
    Created on : 19-may-2019, 20:10:51
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
       <div class="dinero">
      <h2>
        <%
          Double c = Double.parseDouble(request.getParameter("cant"));
          DecimalFormat formatoEuros = new DecimalFormat("0.00");
          if (request.getParameter("cambio").equals("ep")) {
            out.print(formatoEuros.format(c) + Math.round(c * 166.386) + " pesetas.");
          } else {
            out.print(Math.round(c) + formatoEuros.format(c / 166.386) + " euro/s.");
          }
        %>
      </h2>
    </div> 
    </body>
</html>
