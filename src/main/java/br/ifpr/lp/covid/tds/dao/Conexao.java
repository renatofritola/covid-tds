package br.ifpr.lp.covid.tds.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

   private static Conexao anInstance = null;

    public static Conexao getInstance() {
        if (anInstance == null) {
            anInstance = new Conexao();
        }
        return anInstance;
    }

    private Conexao() {
    }

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/covid", "postgres", "postgres");
            Statement stmt = conn.createStatement();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return conn;
    }

    public static Conexao getAnInstance() {
        return anInstance;
    }

    public static void setAnInstance(Conexao anInstance) {
        Conexao.anInstance = anInstance;
    }

}
