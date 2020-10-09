package dao;

import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Gomes Mendes
 */
public class CursoDAO {
    
    public static MySQL mysql;
    
    public void insert(Curso curso){
        try{
            // criando consluta preparada a passando os valores por parametro
            mysql = new MySQL("INSERT INTO curso (descricao,quant_turma) VALUES (?,?)");
        
            //sando o model cadastro e pegando o retorno de nome para setar no primeiro parâmetro da consulta
            mysql.getConsulta().setString(1, curso.getDescricao());
            ////mysql.getConsulta().setString(2, curso.getDtinicio());
            //mysql.getConsulta().setString(3, curso.getDtfim());
            mysql.getConsulta().setInt(2, curso.getQuantidade());
            // metodo obrigatorio para execução do update
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }

    }
        
    public void delete(Deletar curso){
        try{
            // criando consluta preparada a passando os valores por parametro
            mysql = new MySQL("DELETE FROM curso WHERE descricao = ?");
            mysql.getConsulta().setString(1, curso.getNovadesc());
            // metodo obrigatorio para execução do update
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    
    public void alterar(Alterar curso){
        try{
            // criando consluta preparada a passando os valores por parametro
            mysql = new MySQL("UPDATE curso SET descricao = ?, quant_turma = ? WHERE descricao = ?");
            mysql.getConsulta().setString(1, curso.getDesc());
            mysql.getConsulta().setInt(2, curso.getQuant());
            mysql.getConsulta().setString(3, curso.getCondi());
            // metodo obrigatorio para execução do update
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    
    public void select(){
        try{
            mysql = new MySQL("SELECT * FROM cadastro");
            // manipulando retorno da consulta com a classe result set
            ResultSet cadastro = mysql.getConsulta().executeQuery();
            
            /*
            while(cadastro.next()){
                 cadastro.getNString("ID");
            }
            */
        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }
       
    }

    public static MySQL getMysql() {
        return mysql;
    }
    
}