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
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css" />
        <title>CRUD CADASTRO DE CURSO</title>
    </head>
    <body
        
        <div id="cadastro">
    <fieldset>
        <legend>
            Cadastro Aluno
        </legend>
        <!-- criando parametro na action do fomulario com type=nome do parametro será usado no servlet-->
    <form method="POST" action="../CursoServlet.Action?type=save">
         <div class="form-group">
            <label for="exampleInputEmail1">NOME CURSO</label>
            <input type="text" name="descricao" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">QUANTIDADE DE VAGAS</label>
            <input type="text" name="quant" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <input type="submit" value="Cadastrar" class="btn btn-success form-control"/><!-- classe de botão para boot strap-->
        </div>
        
        <div class="form-group">
        <a href="CursoAlterar.jsp">
            <input type="button" value="Alterar" class="btn btn-warning form-control"/>
        </a>
        </div>
        
        <div class="form-group">
        <a href="CursoDelete.jsp">
            <input type="button" value="Deletar" class="btn btn-danger form-control"/>
        </a>
        </div>
        <div class="form-group">
        <a href="CursoListar.jsp">
            <input type="button" value="Listar" class="btn btn-primary form-control"/>
        </a>
        </div>
    </fieldset>
        </div>
</form>
    </body>
</html>
