/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite.Repository;

import Entite.Vehicule;

/**
 *
 * @author marclauze
 */
public class VehiculeRepository {
    
    public VehiculeRepository() {
        
    }
    
    public String addVehicule(String immat, String marque, String modele){

        String rqt = "INSERT INTO vehicule(immatriculation, marque, modele) VALUES ('"+immat+"', '"+marque+"', '"+modele+"')";
        return rqt;
    }
    
     public String affVehicule() {
        
        String rqt = "SELECT * FROM public.vehicule";
        return rqt;
    }
}
