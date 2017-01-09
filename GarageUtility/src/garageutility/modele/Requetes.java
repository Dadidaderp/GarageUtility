/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageutility.modele;

import Entite.Client;
import Entite.Piece;
import Entite.Vehicule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marclauze
 */

// Classe spécifique aux requetes avec la base.
public class Requetes {

    Connection conn = null;
    
    public Requetes() {
        
    }
    
    // Connection a la bdd
    public Connection DBconnect() {
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver postgreSQL : OK.");

      String url = "jdbc:postgresql://localhost:5432/GarageUtility";
      String user = "postgres";
      String passwd = "root";

      conn = DriverManager.getConnection(url, user, passwd);
      System.out.println("Connexion effective !");         
         
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
    
    // Ajout d'un Vehicule en base
    public Vehicule AddVehicule(String Immatriculation, String Marque, String Modele){
        
        // Instancier classe Vehicule
        Vehicule vh = new Vehicule(Immatriculation, Marque, Modele);
        try {
            DBconnect();
            Statement state = null;
            state = this.conn.createStatement();
            String query = vh.addVehicule();
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Ajout d'un Client en base
    public Client AddClient(String nom, String prenom, String adresse, String mail, String tel){
        
        //Instancier classe Client
        Client cl = new Client(nom, prenom, adresse, mail, tel);
        try {
            DBconnect();
            Statement state = null;
            state = conn.createStatement();
            String query = cl.addClient();
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Ajout d'une Piece en base
    public Piece AddPiece(String denom, String date){
        
        //Instancier classe Piece
        Piece pc = new Piece(denom, date);
        try {
            DBconnect();
            Statement state = null;
            state = conn.createStatement();
            String query = pc.addPiece();
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
