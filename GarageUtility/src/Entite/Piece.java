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
public class Piece {
    
    String denomination = null;
    int datePose = 0;
    
    public Piece(String denomination, int datePose) {
        
        this.denomination = denomination;
        this.datePose = datePose;
    }
    
    public String addPiece(){
        
        String rqt = "INSERT INTO piece(denomination, datePose) VALUES ('"+this.denomination+"', '"+this.datePose+"')";
        return rqt;
    }
}
