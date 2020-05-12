
package model;

import java.sql.ResultSet;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class CadastroDAO {
    // atributo statico pode ser usado em outras classes sem ser instanciado
    // objeto da classes Myqsl que permite acesso aos recurso da classe
    // DAO possui todos os metodos a serem executados
    private static MySQL mysql;
    // metodos statico pode acessar outras classes sem instanciar
    public static void insert(Cadastro cadastro){
        try{
            mysql = new MySQL("INSERT INTO cadastro (nome,telefone) VALUES (?,?)");
            // aces
            //sando o model cadastro e pegando o retorno de nome para setar no primeiro parâmetro da consulta
            mysql.getConsulta().setString(1, cadastro.getNome());
            mysql.getConsulta().setString(2, cadastro.getTelefone());
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    public static void delete(int id){
        try{
            mysql = new MySQL("DELETE FROM cadastro WHERE id = ?");
            
            mysql.getConsulta().setInt(1, id);
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    public static void update(int id, String nome, String telefone){
        try{
            mysql = new MySQL("UPDATE cadastro SET nome = ?, telefone = ? WHERE id = ?");
            
            mysql.getConsulta().setString(1, nome);
            mysql.getConsulta().setString(2, telefone);
            mysql.getConsulta().setInt(3, id);
            mysql.getConsulta().executeUpdate();
        }catch(Exception erro){
            System.out.println("erro de conexão" + " " + erro);
        }
    }
    public static String select(){
        try{
            mysql = new MySQL("SELECT * FROM cadastro");
            // manipulando retorno da consulta com a classe result set
            ResultSet cadastro = mysql.getConsulta().executeQuery();
            
            String relatorio = "ID\tNOME\tTELEFONE\n";
            while(cadastro.next()){
                relatorio += cadastro.getNString("ID") + "\t" +
                             cadastro.getNString("NOME") + "\t" +
                             cadastro.getNString("TELEFONE") + "\n";
            }
            return relatorio;
        }catch(Exception erro){
            return erro.getMessage();
        }
       
    }
}
