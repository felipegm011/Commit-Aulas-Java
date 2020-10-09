<%-- 
    Document   : CursoListar
    Created on : 28/06/2020, 18:41:36
    Author     : Felipe Gomes Mendes
--%>


<%@page import="dao.CursoDAO"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dao.MySQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            CursoDAO listar = new CursoDAO();
            
            String my = "SELECT * FROM CURSO";
            // manipulando retorno da consulta com a classe result set
            ResultSet cadastro = listar.mysql.getConsulta().executeQuery(my);
           
        %>
        
  <table class="table">
  <thead>
    <tr>
      <th scope="col">ID CURSO</th>
      <th scope="col">DESCRIÇAO CURSO</th>
      <th scope="col">QUANT_ TURMA</th>
    </tr>
  </thead>
  <tbody>
     <% while(cadastro.next()){
     %>
           <tr>
                <td><%=cadastro.getString("ID")%></td>
                <td><%=cadastro.getString("DESCRICAO")%></td>
                <td><%=cadastro.getString("QUANT_TURMA")%></td>
           </tr>
     <%
            }
     %>
    
  </tbody>
</table>
        
    </body>
</html>
