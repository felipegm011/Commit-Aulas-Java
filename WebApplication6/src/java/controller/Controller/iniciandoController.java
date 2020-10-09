/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Controller;

import controller.Model.CadastroDao;
import controller.Model.CadastroModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Felipe Gomes Mendes
 */
// ANNOTATION INFORMA QUE ESSA CLASSE É UM CONTROLLER
@Controller
public class iniciandoController {
    
    // mapeando requisições atraves de rota indicada no cotroller com a annotation RequestMapping dados vindo do formulario
    
    
    //public String iniciandoController(Model model, @RequestParam("name do formulario"), atribuindo ao Straing nome)
    
    // recebendo dados via parametro, Model retornar um objeto para retornar dados no index
    // o Spring associa todos os dados vindos com formulario e atribui aos atributos da classe cadastro
    @RequestMapping("/index")
    public String iniciandoController(Model model, CadastroModel cadastro){
        // QUANDO O METODO FOR EXECUTADO O SISTEMA IRA PROCUMRAR DENTRO DO JSP O AQUIVO COM NO INDICADO PARA EXIBIR 
        
        CadastroDao dao = new CadastroDao();
        
        try {
            dao.insert(cadastro);
            // retornando na tela do index informações 
            model.addAttribute("nome", cadastro.getNome());
        } catch (Exception e) {
        }
        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(){
        // QUANDO O METODO FOR EXECUTADO O SISTEMA IRA PROCUMRAR DENTRO DO JSP O AQUIVO COM NO INDICADO PARA EXIBIR
        return "cadastro";
    }
    
    @RequestMapping("/lista")
    public String listagem(Model model ){
        CadastroDao dao = new CadastroDao();
        
        try {
            model.addAttribute("lista",dao.Listando());
        } catch (Exception e) {
        }
        
        
        return "Listando";
    }
}
