package dao;

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
    
    private static MySQL mysql;
    
    public void insert(Curso curso){
               
        try{
            mysql = new MySQL("INSERT INTO curso (descricao,quant_turma) VALUES (?,?)");
            // aces
            //sando o model cadastro e pegando o retorno de nome para setar no primeiro parâmetro da consulta
            mysql.getConsulta().setString(1, curso.getDescricao());
            ////mysql.getConsulta().setString(2, curso.getDtinicio());
            //mysql.getConsulta().setString(3, curso.getDtfim());
            mysql.getConsulta().setInt(2, curso.getQuantidade());
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    
}
