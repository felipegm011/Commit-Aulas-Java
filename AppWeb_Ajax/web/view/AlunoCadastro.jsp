<%-- 
    Document   : Cadastro
    Created on : 24/05/2020, 03:53:29
    Author     : Felipe Gomes Mendes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="main.css" />
    </head>
    <body>
        
        <div id="cadastro">
    <fieldset>
        <legend>
            Cadastro Aluno
            </legend>
            <form method="POST" action="teste.jsp">
         <div class="form-group">
            <label for="exampleInputEmail1">NOME</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">CPF</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required >
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">RG</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">E-MAIL</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">SITE</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">ENDEREÇO</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">CEP</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">NUEMRO DO CURSO</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <input type="submit" value="Cadastrar" class="btn btn-success form-control"/><!-- classe de botão para boot strap-->
        </div>
            
    </fieldset>
        </div>
</form>
    </body>
</html>
