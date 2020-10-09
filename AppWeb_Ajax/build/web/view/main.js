/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global formulario */

// capturando informação do submit
formulario.addEventListener('submit', function(event){
 
    event.preventDefault();
 
 // criando objeto e capturando valor dos campos de input
    var dados = {};
    dados.nome = formulario.nome.value;
    dados.quant = formulario.quant.value;
     
    // convertendo os dado em texto em formato de json
    var dadosTexto = JSON.stringify(dados);
    //{ "login" : "kelvin" , "mensagem" : "Olá!" }
     
    // criando objeto da classe XMLHttpRequest para enviar as informação para um servidor 
    var xhr = new XMLHttpRequest();
    // metodo de envio de informação
    xhr.open('POST','http://localhost:8080/AppWeb/CursoServlet.Action',true);
    xhr.setRequestHeader("Content-Type", "application/json");
     
    //função para criar uma div na tela de cadastro com informações de cadastrado com sucesso
    xhr.onload = function(){
        var mensagem = document.querySelector("div.alert");
        mensagem.classList.remove("invisible");
        mensagem.textContent = xhr.responseText;
        formulario.reset();
    }
    
    // enviando dados encapsulados no objeto abaixo
    xhr.send(dadosTexto);
});

