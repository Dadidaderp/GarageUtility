/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageutility;

import garageutility.modele.DBconnect;

/**
 *
 * @author marclauze
 */
public class GarageUtility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBconnect db = new DBconnect();
        ClientView cv = new ClientView();
        cv.setVisible(true);
    }
    
}
