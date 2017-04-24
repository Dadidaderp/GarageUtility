/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageutility.modele;

import Entite.Client;
import Entite.Piece;
import Entite.Repository.ClientRepository;
import Entite.Repository.PieceRepository;
import Entite.Repository.VehiculeRepository;
import Entite.Vehicule;

import java.sql.*;

/**
 *
 * @author marclauze
 */

// Classe spécifique aux requetes avec la base
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
        VehiculeRepository vhr = new VehiculeRepository();
        try {
            DBconnect();
            Statement state = null;
            state = this.conn.createStatement();
            String query = vhr.addVehicule(Immatriculation, Marque, Modele);
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
                return null;
            }
        }

    // Ajout d'un Client en base
    public Client AddClient(String nom, String prenom, String adresse, String mail, String tel){

        //Instancier classe Client
        Client cl = new Client(nom, prenom, adresse, mail, tel);
        ClientRepository clr = new ClientRepository();
        try {
            DBconnect();
            Statement state = null;
            state = conn.createStatement();
            String query = clr.addClient(nom, prenom, adresse, mail, tel);
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
                return null;
            }
        }

    // Ajout d'une Piece en base
    public Piece AddPiece(String denom, String date){

        //Instancier classe Piece
        Piece pc = new Piece(denom, date);
        PieceRepository pcr = new PieceRepository();
        try {
            DBconnect();
            Statement state = null;
            state = conn.createStatement();
            String query = pcr.addPiece(denom, date);
            state.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
                return null;
            }
        }

    // Méthode qui permet l'affichage de la table Client
 public ResultSet AffClient() {
     
    ResultSet rslt; // On stock la requete ici
    try
    {
        Client clt = new Client();
        ClientRepository clr = new ClientRepository();
        DBconnect();
        Statement stm = conn.createStatement();
        // On exécute la requete SQL
        rslt = stm.executeQuery(clr.affClient());
    }catch(SQLException e)   
    {
       System.out.println(e.getMessage());
       return null;
    }
    finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
    }
    return rslt;
 }
 
 // Méthode qui permet l'affichage de la table Piece
 public ResultSet AffPieces() {
     
    ResultSet rslt; // On stock la requete ici
    try
    {
        Piece pc = new Piece();
        PieceRepository pcr = new PieceRepository();
        DBconnect();
        Statement stm = conn.createStatement();
        // On exécute la requete SQL
        rslt = stm.executeQuery(pcr.affPieces());
    }catch(SQLException e)   
    {
       System.out.println(e.getMessage());
       return null;
    }
    finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
    }
    return rslt;
 }
 
 // Méthode qui permet l'affichage de la table Vehicule
 public ResultSet AffVehicule() {
     
    ResultSet rslt; // On stock la requete ici
    try
    {
        Vehicule pc = new Vehicule();
        VehiculeRepository vhr = new VehiculeRepository();
        DBconnect();
        Statement stm = conn.createStatement();
        // On exécute la requete SQL
        rslt = stm.executeQuery(vhr.affVehicule());
    }catch(SQLException e)   
    {
       System.out.println(e.getMessage());
       return null;
    }
    finally {
            if ( conn != null )
                try {
                    // Fermeture de la connexion
                    conn.close();
                } catch ( SQLException ignore ) {

                }
    }
    return rslt;
 }
}
