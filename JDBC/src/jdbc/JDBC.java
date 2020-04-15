package jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // CHAMANDO CLASSE JDBC  e verificando se o drive eiste
            Class.forName("com.mysql.jdbc.Driver");
            
            // fazendo connexão atraves do drive managen   protocolode comunicaçao,url,nome do banco,usuário,senha
            Connection conexao;
            conexao = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/teste","root","");
            
            // criando o execultor de consulta
            Statement query = (Statement) conexao.createStatement();
            
            // execultando update ,delete,insert
            query.executeUpdate("INSERT INTO cadastro(NOME, TELEFONE) VALUES('Felipe Gomes','8399999999')");
           
            System.out.println("Cadastrado com sucesso");
        } catch (Exception ex) {
            System.out.println("Erro");
        }
    }
    
}
