/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.FIELD;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import tictactoeultimategame.MOVE.IMove;
import tictactoeultimategame.MOVE.Move;

/**
 *
<<<<<<< HEAD
 * @author jacob
 */
public class Field implements IField{
 String[][] board = new String[9][9];
 String[][] microBoard = new String[3][3];

 List<IMove> moveList = new ArrayList<IMove>();

 
    @Override
    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]=null;
            }
        }
        for (int i = 0; i < microBoard.length; i++) {
            for (int j = 0; j < microBoard.length; j++) {
               microBoard[i][j]=null;
                
            }
            
        }
        
    }
 String[][] boardHolder = null;
    @Override
    public List<IMove> getAvailableMoves() {
       int row=0, col=0;
        moveList.clear();
        for (int i = 0; i < boardHolder.length; i++) {
           for (int j = 0; j < boardHolder.length; j++) {
                String[] strings = boardHolder[j];
                
            }
            
        }
int j=0,k=0;
        for (String[] strings : board) {

            for (String string : strings) {
                if (string == null) {
                     Move move = new Move();
 IMove imove = new Move();
                    move.setX(j);
                    move.setY(k);
                    imove=move;
                    moveList.add( imove);
                    boardHolder=board;
                }
                j++;
            }
            j = 0;

            k++;
        }
    return moveList;}

    @Override
    public String getPlayerId(int column, int row) {

    return board[column][row];
            }

    @Override
    public boolean isEmpty() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

    public Boolean isInActiveMicroboard(int x, int y) 
    { 
        if(microBoard[x/3][y/3]!=null||board[x][y]!=null)
        {
            return false;
        }
        return true;
            }

    @Override
    public String[][] getBoard() { 
//        board[1][5]="X";
//        board[5][1]="X";        
//        board[3][6]="X";
//        board[2][6]="o";
//        board[1][6]="o";
//        board[0][6]="X";
//        board[6][6]="X";
   return board;
    }
    

    @Override
    public String[][] getMacroboard() {

     return microBoard;}

   

    @Override
    public void setBoard(String[][] board) {
    this.board= board;
            }

    @Override
    public void setMacroboard(String[][] macroboard) {

    this.microBoard=macroboard;}

    @Override
    public void newGame() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
