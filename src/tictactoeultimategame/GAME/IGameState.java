package tictactoeultimategame.GAME;

import tictactoeultimategame.FIELD.IField;

/**
 *
 * @author mjl
 */
public interface IGameState 
{

    IField getField();

    int getMoveNumber();
    void setMoveNumber(int moveNumber);

    int getRoundNumber();
    void setRoundNumber(int roundNumber);
    
}