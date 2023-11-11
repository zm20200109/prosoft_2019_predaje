/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class Konekcija {
    //treba mi jedna instanca konekcije u bazi podataka, singleton pattern
    
    private static Konekcija instance;
   private Connection connection; 
    
    private Konekcija() {
        try {
            String url = "jdbc:mysql://localhost:3306/ps_sql_2";
            connection = DriverManager.getConnection(url,"root","");
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public static Konekcija getInstance(){
        if (instance == null)
            instance = new Konekcija();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    
}
