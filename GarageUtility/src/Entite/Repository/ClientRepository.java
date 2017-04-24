/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite.Repository;

import Entite.Client;

/**
 *
 * @author marclauze
 */
public class ClientRepository {
    
    public ClientRepository() {
        
    }
    
    public String addClient(String nom, String prenom, String adresse, String telephone, String mail) {

        String rqt = "INSERT INTO client(nom, prenom, adresse, telephone, mail) VALUES ('"+nom+"', '"+prenom+"', '"+adresse+"', '"+telephone+"', '"+mail+"')";
        return rqt;
    }
    
    public String affClient() {
        
        String rqt = "SELECT * FROM public.client";
        return rqt;
    }
}
