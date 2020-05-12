
package controller;

import model.Cadastro;
import model.CadastroDAO;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Controller {
    //  passando dados para o DAO e chamando metodos do DAO para execução de etodos
    public void adicionaCadastro(String nome,String telefone){
        // o objeto irá encapsular os dados vindo de cadastro
        Cadastro cadastro = new Cadastro(nome,telefone);
        // fazendo acesso staticos aparit da importação da classe DAO
        CadastroDAO.insert(cadastro);
    }
    public void atualizaCadastro(int id,String nome,String telefone){
        CadastroDAO.update(id, nome, telefone);
    }
    public void removeCadastro(int id){
        CadastroDAO.delete(id);
    }
    public void editarCadastro(int id){
        
    }
    public String selecionaCadastro(){
        return CadastroDAO.select();
    }
}
