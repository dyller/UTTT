/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.MOVE;

/**
 *
 * @author jacob
 */
public class Move implements IMove{
int X;
    int Y;
   
    
    public void setX(int x)
    {
    X=x;
    }
     public void setY(int y)
    {
    Y=y;
    } 
     @Override
    public int getX() {
    return X;
    }

    @Override
    public int getY() {
    return Y;
    }
    
}
