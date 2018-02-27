/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.GAME;

import tictactoeultimategame.FIELD.Field;
import tictactoeultimategame.FIELD.IField;

/**
 *
 * @author jacob
 */
public class GameState implements IGameState{
  
    Field field= new Field();
    @Override
    public IField getField() {
    return field;
      }

    @Override
    public int getMoveNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMoveNumber(int moveNumber) {
    }

    @Override
    public int getRoundNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRoundNumber(int roundNumber) {
    }
    
}
