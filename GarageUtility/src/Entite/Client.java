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
public class Client {
    
    String nom = null;
    String prenom = null;
    String adresse = null;
    String mail = null;
    String tel = null;
   
    public Client() {
        
    }
    
    public Client(String nom, String prenom, String adresse, String mail, String tel) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.tel = tel;
    }
    
    public String addClient() {
        
        String rqt = "INSERT INTO client(nom, prenom, adresse, telephone, mail) VALUES ('"+this.nom+"', '"+this.prenom+"', '"+this.adresse+"', '"+this.tel+"', '"+this.mail+"')";
        return rqt;
    }
    
    public String affClient() {
        
        String rqt = "SELECT * FROM public.client";
        return rqt;
    }
}
