<%-- 
    Document   : conversoreurospesetas
    Created on : 14-may-2019, 16:25:27
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
        
        double euros = Double.valueOf(request.getParameter("euros"));
       
        out.println(Math.round(euros * 166.386));
        out.print(" pesetas");
        
        %>
    </body>
</html>
