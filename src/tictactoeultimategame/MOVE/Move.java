/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.MOVE;

/**
 *
<<<<<<< HEAD
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
=======
 * @author mr.Andersen
 */
public class Move implements IMove 
{

    @Override
    public int getX() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> dc9b504f994dca730ca42cba3d5e2984494eb90b
    }
    
}
