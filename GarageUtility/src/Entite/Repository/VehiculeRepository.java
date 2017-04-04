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
    
    public String addVehicule(){
        
        Vehicule vh = new Vehicule();
        String rqt = "INSERT INTO vehicule(immatriculation, marque, modele, idclient) VALUES ('"+vh.getImmat()+"', '"+vh.getMarque()+"', '"+vh.getModele()+"', '"+vh.getIdClient()+"')";
        return rqt;
    }
    
     public String affVehicule() {
        
        String rqt = "SELECT * FROM public.vehicule";
        return rqt;
    }
}
