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
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public String getAdresse() {
        return this.adresse;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public String getTel() {
        return this.tel;
    }
}
