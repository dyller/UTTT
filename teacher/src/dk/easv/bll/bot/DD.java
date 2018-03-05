/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.easv.bll.bot;

import dk.easv.bll.field.IField;
import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;
import dk.easv.bll.move.Move;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jacob
 */
public class DD implements IBot{

    private int[][] preferredMoves = {
            {1, 1}, //Center
            {0, 0}, {0, 2}, {2, 0},  //Corners ordered across
            {0, 1}, {2, 1}, {1, 0}, {1, 2}}; //Outer Middles ordered across
    @Override
    public IMove doMove(IGameState state) {
        
        String xOrO = state.getMoveNumber()%2 == 0 ? "0" : "1";
        System.out.println(xOrO);
          String [][] board=state.getField().getBoard();
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print(string+"\t");
            }
            System.out.println("");
        }
        
         for (IMove strings : state.getField().getAvailableMoves()) {
        int col=strings.getX();
        int row=strings.getY();
       
       if( (board[row][col/3*3+0]== xOrO
               &&board[row][col/3*3+1]==xOrO
               &&board[row][col/3*3+2]==xOrO)
               
               || 
               (board[row/3*3+0][col]== xOrO
               &&board[row/3*3+1][col]==xOrO
               &&board[row/3*3+2][col]==xOrO)
               
               ||
               (board[row/3*3+1][col/3*3+1]== xOrO&&(
               board[row/3*3+0][col/3*3+0]== xOrO&&
               board[row/3*3+2][col/3*3+2]== xOrO
               
               
               ||
               board[row/3*3+0][col/3*3+2]== xOrO&&
               board[row/3*3+2][col/3*3+0]== xOrO)
               ))
       {
       return new Move(row,col);
       }
           }
        
     for (int[] move : preferredMoves)
        {
            
            if(state.getField().getMacroboard()[move[0]][move[1]].equals(IField.AVAILABLE_FIELD))
            {
                //find move to play
                
                for (int[] selectedMove : preferredMoves)
                {
                    int x = move[0]*3 + selectedMove[0];
                    int y = move[1]*3 + selectedMove[1];
                    if(state.getField().getBoard()[x][y].equals(IField.EMPTY_FIELD))
                    {
                        return new Move(x,y);
                    }
                }
            }
        }
       

        //NOTE: Something failed, just take the first available move I guess!
        return state.getField().getAvailableMoves().get(0);
    }
    @Override
    public String getBotName() {
    return "dd";
    }
    
}
