/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.FIELD;

import java.util.List;
<<<<<<< HEAD
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
=======
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
import tictactoeultimategame.MOVE.IMove;

/**
 *
<<<<<<< HEAD
 * @author jacob
 */
public class Field implements IField{
 String[][] board = new String[9][9];
 
    @Override
    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]=null;
            }
        }
        
    }

    @Override
    public List<IMove> getAvailableMoves() {
=======
 * @author mr.Andersen
 */
public class Field implements IField 
{

    @Override
    public void clearBoard() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IMove> getAvailableMoves() 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public String getPlayerId(int column, int row) {
=======
    public String getPlayerId(int column, int row) 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public boolean isEmpty() {
=======
    public boolean isEmpty() 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public boolean isFull() {
=======
    public boolean isFull() 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public Boolean isInActiveMicroboard(int x, int y) {
=======
    public Boolean isInActiveMicroboard(int x, int y) 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public String[][] getBoard() {
   return board;
    }
    

    @Override
    public String[][] getMacroboard() {
=======
    public String[][] getBoard() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] getMacroboard() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBoard(String[][] board) 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public void setBoard(String[][] board) {
    this.board= board;
            }

    @Override
    public void setMacroboard(String[][] macroboard) {
=======
    public void setMacroboard(String[][] macroboard) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newGame() 
    {
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
