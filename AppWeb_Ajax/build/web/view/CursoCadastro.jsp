<%-- 
    Document   : CursoCadastro
    Created on : 24/05/2020, 21:39:35
    Author     : Felipe Gomes Mendes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css" />
        <title>JSP Page</title>
    </head>
    <body
        
        <div id="cadastro">
    <fieldset>
        <legend>
            Cadastro Aluno
        </legend>
    <div class="alert alert-success text-center invisible"></div>
    <!-- criando parametro na action do fomulario com type=nome do parametro será usado no servlet-->
    <form name="formulario" method="POST" action="#">
         <div class="form-group">
            <label for="exampleInputEmail1">DESCRIÇÃO CURSO</label>
            <input type="text" class="form-control" id="nome" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
            
        <div class="form-group">
            <label for="exampleInputEmail1">QUANTIDADE ALUNOS</label>
            <input type="text" class="form-control" id="quant" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
           
            <button type="submit" class="btn btn-success">Enviar</button>
        
    </fieldset>
        </div>
</form>>
    <script src="main.js"></script>
    </body>
</html>
