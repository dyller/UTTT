/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;

import java.util.Arrays;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Stegger
 */
public class GameBoard implements IGameModel
{

    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * 
     * @return int Id of the next player.
     */
    
    public int getNextPlayer(int countTurn)
    {
        //TODO Implement this method
        
        return countTurn%2;
        
       
    }

    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is succesfull the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver == true
     * this method will always return false.
     */
    public boolean play(int col, int row)
    {
        //TODO Implement this method
        return true;
    }

    public boolean isGameOver(boolean winner)
    {
        //TODO Implement this method
        return winner;
    }

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    public int getWinner(int winner)
    {
        //TODO Implement this method
        return -1;
    }

    /**
     * Resets the game to a new game state.
     */
    public void newGame()
    {
        //TODO Implement this method
    }

    
    

}
/*

  public void triangle2(int x, int y,GraphicsContext context,int sides) {
     
      double[] xPoints ={0,0,0,0,0,0,0,0,0,0} ;
      double[] yPoints ={0,0,0,0,0,0,0,0,0,0};
       double angle = (sides-2)*Math.PI/sides;
        System.out.println(angle);
        for (int i = 0; i < sides; i++) {
            if(i!=0){
               
               widthd=widthd+(Math.cos(angle*i)*x);
                System.out.println((Math.cos(angle*i)));
                 System.out.println((Math.sin(angle*i)));
             hightd=hightd+(Math.sin(angle*i)*y);
               
            }
            
             
              
            xPoints[i]=widthd;
            yPoints[i]=hightd;
               
             System.out.println(xPoints[i]);
               System.out.println(yPoints[i]); 
          
            }
        System.out.println(Arrays.toString(xPoints)+""+Arrays.toString(yPoints));
         context.beginPath();
            context.strokePolygon(xPoints, yPoints, sides);
     /* context.beginPath();
      context.strokePolygon(xPoints, yPoints, 3);*/
  
 }
    double widthd=100;
    double hightd=100;*/
