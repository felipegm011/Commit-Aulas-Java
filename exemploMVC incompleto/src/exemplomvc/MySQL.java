package exemplomvc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thyago Maia
 */
public class MySQL {
    private Connection servidor;
    private PreparedStatement consulta;
    
    public MySQL(String sql) {
        try {
            servidor = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/aulajava","root","");
            consulta = servidor.prepareStatement(sql);
        }
        catch(Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }

    public Connection getServidor() {
        return servidor;
    }

    public void setServidor(Connection servidor) {
        this.servidor = servidor;
    }

    public PreparedStatement getConsulta() {
        return consulta;
    }

    public void setConsulta(PreparedStatement consulta) {
        this.consulta = consulta;
    }
    
    
}
