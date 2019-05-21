<%-- 
    Document   : ejercicio17
    Created on : 21-may-2019, 16:42:55
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>i30 N</title>
    <link href="estilos17.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Configurador de i30N</h1>
    <form method="get" action="configurador.jsp">
        <h3>Color del coche</h3>
          <div> <select name="color">
        <option value="black">Phanton Black</option>
        <option value="grey">Micron Grey</option>
        <option value="blue" selected="selected">Perfomance Blue</option>
        <option value="red">Engine Red</option>
        <option value="white">Polar White</option>
      </select>
         </div>

      <br>
      <br>
      <h3>Interior</h3>
      <select name="Interior">
        <option value="tela" selected="selected">Tela negra</option>
        <option value="cuero">Tela y Cuero Negrol</option>
      </select>
      <br>
      <br>
      <input type="submit" value="Finalizar">
    </form>