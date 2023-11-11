/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;


import controller.Controller;
import java.util.List;
import model.Profesor;
//import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import model.Status;
import model.Zvanje;
import java.sql.PreparedStatement;
import java.sql.*;
import model.Predaje;
import model.Predmet;
/**
 *
 * @author Acer
 */
public class DbBroker {

    public List<Profesor> ucitajListuProfesoraIzBaze() {
        List<Profesor> lista = new ArrayList<>();
        try {
           
            String upit = "SELECT * FROM profesor";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){
                int id = rs.getInt("id");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                String zvanje = rs.getString("zvanje");
                Zvanje z = Zvanje.valueOf(zvanje);
                String status = rs.getString("status");
                Status stat = Status.valueOf(status);
                Profesor p = new Profesor(id, ime, prezime, z, stat);
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void azurirajProfesoraUBazi(String ime, String prezime, Status status, Zvanje zvanje,int id) {
        try {
            String upit = "UPDATE profesor SET ime=?, prezime=?,zvanje=?,status=? WHERE id=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1,ime);
            ps.setString(2,prezime);
            ps.setString(3,String.valueOf(zvanje));
            ps.setString(4,String.valueOf(status));
            ps.setInt(5,id);
            System.out.println(upit);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public List<Predmet> ucitajPredmeteIzBaze(){
           List<Predmet> predmeti = new ArrayList<>();
        try {
         
            
            String str = "SELECT * FROM predmet";
            Connection connection = Konekcija.getInstance().getConnection();
            Statement st = connection.createStatement();    
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                int id = rs.getInt("id");
                int espb = rs.getInt("espb");
                String naziv = rs.getString("naziv");
                Predmet p = new Predmet(id,naziv,espb);
                predmeti.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return predmeti;
    }

    public List<Predaje> vratiANgazovanjaIzBaze(List<Profesor> selektovaniProfesori) {
        List<Predaje> predavanja = new ArrayList<>();
        for(Profesor p: selektovaniProfesori){
            try {
                String upit = "SELECT *" +
                        "FROM predaje pr JOIN predmet pred ON pr.profesor = pred.id JOIN profesor prof ON pr.profesor = prof.id\n" +
                        "WHERE prof.id="+p.getId()+"ORDER BY prof.ime";
                Connection c = Konekcija.getInstance().getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(upit);
                while(rs.next()){
                   int idPredaje = rs.getInt("pr.id");
                   int idPredmet = rs.getInt("pr.predmet");
                   int idProfesor = rs.getInt("pr.profesor");
                   String naziv = rs.getString("pred.naziv");
                   int espb = rs.getInt("pred.espb");
                   String imeProf = rs.getString("prof.ime");
                   String prezimeProf = rs.getString("prof.prezime");
                   String profZvanje = rs.getString("prof.zvanje");
                   String profStatus = rs.getString("prof.status");
                   Predmet predmet = new Predmet(idPredmet,naziv,espb);
                   Zvanje z = Zvanje.valueOf(profZvanje);
                   Status sta = Status.valueOf(profStatus);
                   Profesor profesor = new Profesor(idProfesor, imeProf, prezimeProf, z,sta);
                   Predaje predaje = new Predaje(idPredaje,profesor,predmet);
                   predavanja.add(predaje);
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return predavanja;
    }
   
    
    
    
   
        
    

}
