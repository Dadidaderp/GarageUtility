/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author marclauze
 */
public class Reparation {
    
    private int vehicule; // immatriculation du véhicule
    private int piece;  // id de la pièce
    private String date; // date de la réparation
    
    public Reparation(int immatVehicule, int idPiece, String date) {
        
        this.vehicule = immatVehicule;
        this.piece = idPiece;
        this.date = date;
    }
    
     public Reparation() {
        
    }
    
    public int getVehicule() {
        return this.vehicule;
    }
    
    public int getPiece() {
        return this.piece;
    }
    
    public String getDate() {
        return this.date;
    }
}
