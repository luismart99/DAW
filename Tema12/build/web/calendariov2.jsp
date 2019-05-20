<%-- 
    Document   : calendariov2
    Created on : 17-may-2019, 12:51:39
    Author     : Luis
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendario</title>
    </head>
    <body>
         <%
      int mes = Integer.parseInt(request.getParameter("mes"));
      int anio = Integer.parseInt(request.getParameter("anio"));
      String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      Calendar miCalendario = Calendar.getInstance();
      miCalendario.set(anio, mes - 1, 1); // los meses van de 0 a 11
      int diasTotales = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);
      int dia1 = miCalendario.get(Calendar.DAY_OF_WEEK);
      if (dia1 == 1) {
        dia1 = 7; // el domingo es día 1
      } else {
        dia1--;
      }
      int columna = 1;
    %>

    <h1><% out.print(nombreMes[mes - 1] + " " + anio);%></h1>

    <table>
      <tr><th>Lunes</th><th>Martes</th><th>Miércoles</th><th>Jueves</th><th>Viernes</th><th>Sábado</th><th>Domingo</th></tr>
      <tr>
      <%
      for (int i = 1; i < diasTotales + dia1; i++) {
        if (i >= dia1) {
          out.print("<td>" + (i - dia1 + 1) + "</td>");
        } else {
          out.print("<td> </td>"); // pinta los huecos que corresponden a los días del mes pasado
        }
        columna++;
        if (columna == 8) { // termina la fila actual
          out.println("</tr><tr>");
          columna = 1;
        }
      }
      %>
      </td></tr>
    </table>
    </body>
</html>
