/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageutility.modele;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marclauze
 */

 // Classe pour la connection a la bdd.
public class DBconnect {
    
    public DBconnect() {
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver O.K.");

      String url = "jdbc:postgresql://localhost:5432/GarageUtility";
      String user = "postgres";
      String passwd = "root";

      Connection conn = DriverManager.getConnection(url, user, passwd);
      System.out.println("Connexion effective !");         
         
    } catch (Exception e) {
      e.printStackTrace();
    }      
  }
}
