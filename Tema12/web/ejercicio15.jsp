<%-- 
    Document   : ejercicio15
    Created on : 16-may-2019, 16:51:23
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilos15.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>100 Números Aleatorios</title>
    </head>
    <body>
        
        <h1>Aplicación que genera 100 numeros aleatorios del 1 al 200</h1>
        <br>
        <br>
        <h3>
          <%
            
            int n;
            
            for (int i = 1; i < 100; i++) {
                  
                 n = (int) (Math.random() * 200) + 1;    
                
                
                    if(esPrimo(n)){
                       out.print("<span class=\"negro\">" + n + "</span> ");
                    } else {
                       out.print(n+ " ");
                    }
                }
           
             
            
            %>
            
            <%!
                
                 public static Boolean esPrimo(int n) {
                        if (n < 2) {
                          return false;
                        } else {
                          for (long i = n / 2; i >= 2; i--) {
                            if (n % i == 0) {
                              return false;
                            }
                          }
                        }
                        return true;
                  }
                
                
                %>
                 
        </h3>
    </body>
</html>
