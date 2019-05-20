<%-- 
    Document   : conversorpesetaseuros
    Created on : 14-may-2019, 16:33:28
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
        <%
        double pesetas = Double.valueOf(request.getParameter("pesetas"));
        
        out.println(Math.round(pesetas / 166.386));
        out.print(" euro/s");
        
        %>
    </body>
</html>
