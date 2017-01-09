/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageutility.modele;

/**
 *
 * @author marclauze
 */

// Classe spécifique aux requetes avec la base.
public abstract class Requetes {
    
    public Requetes() {
        
    }
    
    // Ajoute un véhicule en base.
    public static String addVehicule(String immat, String marque, String modele) {
        String rqt = "INSERT INTO Vehicule(immat, marque, modele) VALUES ('"+immat+"', '"+marque+"', '"+modele+"')";
        System.out.println(rqt);
        
        return rqt;
    }
    
    // Ajoute une Piece en base.
    public static String addPiece(String denom, int date) {
        
        String rqt = "INSERT INTO Piece(denom, date) VALUES('"+denom+"', '"+date+"')";
        System.out.println(rqt);
        
        return rqt;
    }
    
    // Ajoute un Client en base.
    public static String addClient(String nom, String prenom, String adresse, String mail, String tel) {
        
        String rqt = "INSERT INTO Client(Nom, Prenom, Adresse, Mail, Telephone) VALUES('"+nom+"', '"+prenom+"', '"+adresse+"', '"+mail+"', '"+tel+"',)";
        System.out.println(rqt);
        return rqt;
    }
}
