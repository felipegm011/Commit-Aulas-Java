/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class CadastroDao {
    
    private static MySQL mysql;
    
    public void insert(CadastroModel cadastro){
        try{
            // criando consluta preparada a passando os valores por parametro
            mysql = new MySQL("INSERT INTO curso (descricao,quant_turma) VALUES (?,?)");
        
            //sando o model cadastro e pegando o retorno de nome para setar no primeiro parâmetro da consulta
            mysql.getConsulta().setString(1, cadastro.getNome());
            ////mysql.getConsulta().setString(2, curso.getDtinicio());
            //mysql.getConsulta().setString(3, curso.getDtfim());
            mysql.getConsulta().setInt(2, cadastro.getQuant());
            // metodo obrigatorio para execução do update
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    
    
    public List<CadastroModel> Listando() throws SQLException{
        List<CadastroModel> lista = new ArrayList();
     
            mysql = new MySQL("SELECT * FROM CURSO");
            // manipulando retorno da consulta com a classe result set
            ResultSet cadastro = mysql.getConsulta().executeQuery();
            
            
            while(cadastro.next()){
                CadastroModel cad = new CadastroModel();
                cad.setNome(cadastro.getString("DESCRICAO"));
                cad.setQuant(cadastro.getInt("QUANT_TURMA"));
                
                lista.add(cad);
            }
            return lista;
    }
   
    
}
