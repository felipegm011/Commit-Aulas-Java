package controller.Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Gomes
 */
public class MySQL {
    private Connection servidor;
    private PreparedStatement consulta;
    
    
    public MySQL(String sql) {
        try {
            try {
                // especificando drive a ser usado
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            // usando o metodo getconection da classe drivemaneger para passar url de conexão
            servidor = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/appjsp","root","");
            consulta = servidor.prepareStatement(sql);
        }
        catch(SQLException erro) {
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
