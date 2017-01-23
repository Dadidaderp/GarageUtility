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
public class Vehicule {
    
    String immatriculation = null;
    String marque = null;
    String modele = null;
    
    public Vehicule(String immatriculation, String marque, String modele) {
        
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }
    
    public Vehicule() {
        
    }
    
    public String addVehicule(){
        
        String rqt = "INSERT INTO vehicule(immatriculation, marque, modele) VALUES ('"+this.immatriculation+"', '"+this.marque+"', '"+this.modele+"')";
        return rqt;
    }
    
     public String affVehicule() {
        
        String rqt = "SELECT * FROM public.vehicule";
        return rqt;
    }
}
