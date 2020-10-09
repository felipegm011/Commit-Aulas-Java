<%-- 
    Document   : Listando
    Created on : 09/06/2020, 01:08:38
    Author     : Felipe Gomes Mendes
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="controller.Model.MySQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <table class="table">
  <thead>
    <tr>

      <th scope="col">Nome</th>
      <th scope="col">quantd</th>
      
    </tr>
  </thead>
  <tbody>
    
  <c:forEach itens="${lista}" var="relatorio">
    
      <tr>
          <td>${relatorio.descricao}</td>
          <td>${relatorio.quant_turma}</td>
      </tr>
  </c:forEach>   
  
  </tbody>
</table>
    </body>
</html>
