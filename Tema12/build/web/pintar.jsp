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
        <link href="estilos9.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%
      int altura = Integer.parseInt(request.getParameter("altura"));
      
      int planta = 1;
      int longitud = 1;
      int espacios = altura - 1;
      
      while(planta <= altura){
          
          for (int i = 1; i < espacios; i++) {
                   out.print(" ");
                  
              }
          
          for (int j = 0; j < longitud; j++) {
                  out.print("<img src=\"b.png\">");
                  
              }
          
          out.println("</br>");
         
          planta++;
          espacios--;
          longitud += 2;
          
      }
      

     %>
    </body>
</html>
