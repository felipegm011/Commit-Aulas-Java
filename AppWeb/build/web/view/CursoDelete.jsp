<%-- 
    Document   : CursoDelete
    Created on : 18/06/2020, 18:45:43
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD CADASTRO DE CURSO</title>
    </head>
    <body>
                <div id="cadastro">
    <fieldset>
        <legend>
            Informe o Curso que Deseja Deletar
        </legend>
        <!-- criando parametro na action do fomulario com type=nome do parametro será usado no servlet-->
    <form method="POST" action="../DeleteServlet.Action?type=alter">
         <div class="form-group">
            <label for="exampleInputEmail1">NOME CURSO</label>
            <input type="text" name="alterar" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <input type="submit" value="Deletar" class="btn btn-danger form-control"/><!-- classe de botão para boot strap-->
        </div>
    </fieldset>
        </div>
</form>>
    </body>
</html>
