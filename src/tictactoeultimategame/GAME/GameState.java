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
<<<<<<< HEAD
 * @author jacob
 */
public class GameState implements IGameState{
    int moveNumber;
    int roundNumber;
    Field field= new Field();
    @Override
    public IField getField() {
    return field;
  
      }

    @Override
    public int getMoveNumber() {

     return moveNumber;
    }

    @Override
    public void setMoveNumber(int moveNumber) {
        this.moveNumber=moveNumber;
    }

    @Override
    public int getRoundNumber() {

    return roundNumber;}

    public void setRoundNumber(int roundNumber) {
this.roundNumber=roundNumber;
    }
    
}
