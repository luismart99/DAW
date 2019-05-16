<%-- 
    Document   : media
    Created on : 09-may-2019, 18:25:48
    Author     : Luis
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nota media</title>
    </head>
    <body>
        <%
        double nota1 =  Double.valueOf(request.getParameter("nota1"));
        double nota2 =  Double.valueOf(request.getParameter("nota2"));
        double nota3 =  Double.valueOf(request.getParameter("nota3"));
       
        double media = (nota1+nota2+nota3)/3;
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        out.println("La media es " + dosDecimales.format(media));
        
       %>
    </body>
</html>
