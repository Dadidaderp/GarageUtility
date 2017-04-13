/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite.Repository;

import Entite.Reparation;

/**
 *
 * @author marclauze
 */
public class ReparationRepository {
    
    public ReparationRepository() {
        
    }
    
    public String addReparation() {
        
        Reparation rep = new Reparation();
        String rqt = "INSERT INTO reparation(fk_vehicule, fk_piece, date) VALUES ('"+rep.getVehicule()+"', '"+rep.getPiece()+"', '"+rep.getDate()+"')";
        return rqt;
    }

    public String affReparation() {
        
        Reparation rep = new Reparation();
        String rqt = "SELECT * FROM public.reparation";
        return rqt;
    }
}
