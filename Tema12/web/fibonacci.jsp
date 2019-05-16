<%-- 
    Document   : fibonacci
    Created on : 16-may-2019, 16:47:59
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
                 int f1= 0;
                 int f2= 1;
                 int aux;
                int n = Integer.parseInt(request.getParameter("n"));
        
	switch(n) {
	  case 1:
	  out.print("0");
	  break;
			
                case 2:
	  out.print("0 1");
	  break;
			
                default:
	 out.print("0 1");
                
	   while (n>2) {
		aux = f1;
		f1 = f2;
		f2 = aux + f2;
		out.print(" " + f2);
		n--;
                             }				 
	     }

            %>
    </body>
</html>
