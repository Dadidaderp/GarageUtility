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
    
    public String getImmat() {
        return this.immatriculation;
    }
    
    public String getMarque() {
        return this.marque;
    }
    
    public String getModele() {
        return this.modele;
    }

}
