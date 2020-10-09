<%-- 
    Document   : cadastro
    Created on : 08/06/2020, 22:17:51
    Author     : Felipe Gomes Mendes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/main.css" />
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="cadastro">
    <fieldset>
        <legend>
            Cadastro Aluno
        </legend>
        <!-- enviando pararota do controller-->
    <form action="index.htm" method="POST" >
         <div class="form-group">
            <label for="exampleInputEmail1">DESCRIÇÃO CURSO</label>
            <input type="text" name="nome" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
            
        <div class="form-group">
            <label for="exampleInputEmail1">QUANTIDADE ALUNOS</label>
            <input type="text" name="quant" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <input type="submit" value="Cadastrar" class="btn btn-success form-control"/><!-- classe de botão para boot strap-->
        </div>
    </fieldset>
        </div>
</form>>
        
    </body>
</html>
