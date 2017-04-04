/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite.Repository;

import Entite.Piece;

/**
 *
 * @author marclauze
 */
public class PieceRepository {
    
    public PieceRepository() {
        
    }
    
    public String addPiece(){
        
        Piece pl = new Piece();
        String rqt = "INSERT INTO piece(denomination, datepose) VALUES ('"+pl.getDenom()+"', '"+pl.getDate()+"')";
        return rqt;
    }
    
    public String affPieces() {
        
        String rqt = "SELECT * FROM public.piece";
        return rqt;
    }
}
