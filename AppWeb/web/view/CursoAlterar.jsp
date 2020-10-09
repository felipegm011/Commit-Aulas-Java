<%-- 
    Document   : CursoAlterar
    Created on : 18/06/2020, 20:11:14
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
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="cadastro">
    <fieldset>
        <legend>
            Informe o Curso que Deseja Alterar
        </legend>
        <!-- criando parametro na action do fomulario com type=nome do parametro será usado no servlet-->
    <form method="POST" action="../AlterarServlet.Action?type=update">
         <div class="form-group">
            <label for="exampleInputEmail1">CURSO A SER ALTERADO</label>
            <input type="text" name="condi" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">NOVO CURSO</label>
            <input type="text" name="novadesc" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <label for="exampleInputEmail1">NOVA QUANTDADE</label>
            <input type="text" name="novaquant" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
         </div>
        <div class="form-group">
            <input type="submit" value="Alterar" class="btn btn-warning form-control"/><!-- classe de botão para boot strap-->
        </div>
    </fieldset>
        </div>
</form>>
    </body>
        
    </body>
</html>
