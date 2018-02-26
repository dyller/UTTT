/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.gui.controller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import sun.plugin2.os.windows.Windows;
import tictactoe.bll.GameBoard;
import tictactoe.bll.IGameModel;

/**
 *
 * @author Stegger
 */
public class TicTacViewController implements Initializable
{

    @FXML
    private Label lblPlayer;

    @FXML
    private Button btnNewGame;

    @FXML
    private GridPane gridPane;
    
    private static final String TXT_PLAYER = "Player: ";
    private IGameModel game;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
boolean winner1=false; 
 int winner =0;
int countTurn=0;
boolean DidSomething=false;
    @FXML
    private Button swithPlayStyle;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
      DidSomething=false;
        try
        {
           
            Integer row = GridPane.getRowIndex((Node) event.getSource());
            Integer col = GridPane.getColumnIndex((Node) event.getSource());
            int r = (row == null) ? 0 : row;
            int c = (col == null) ? 0 : col;
            int player = game.getNextPlayer(countTurn);
          if (game.isGameOver(winner1))
                {
                    System.out.println("end");
                    endGame();
                }
     else{
           // if (countTurn<9)
            //{
            if (game.play(c, r))
            {
                Button btn = (Button) event.getSource();
                System.out.println();
              if (swithPlayStyle.getText()=="singleplayer")
               {
                    
                   
                    if (btn.getText()!="X"&& btn.getText()!="O")
                    { 
                            
                        String xOrO = player == 0 ? "X" : "O";
                         btn.setText(xOrO);
                         setPlayer();
                        countTurn++;
                         if(countTurn>4)
                         {
                             FindWinner();
                         }
           
                    }
                   
                 }
                    if(swithPlayStyle.getText()=="multiplayer")
                    {
           
                            /*if (btn.getText()!="X"&& btn.getText()!="O")
                            { 
                            
                   
                                 btn.setText("X");
                                 setPlayer();
                                 countTurn++;
                                 DidSomething=true;
                                if(countTurn>4)
                                 {
                                     
                                FindWinner();
                                 }*/
                         if(countTurn<=4)
    {
     
    
                         if (!game.isGameOver(winner1))
                                {
                                  
                                 DidSomething=true;
                                AIX();
                                }
                        
                                 if (!game.isGameOver(winner1))
                                {
                                    System.out.println(countTurn);
                                AI();
                                }
                            // }
                     }
                   else if(countTurn>4)
                    {
                        if(countTurn%2==0)
                        {
                             DidSomething=true;
                             AIX();
                        aiai();
                    
                        }
                        else{
                                DidSomething=true;
                                AI();
                    aiai();
                    }
                 FindWinner();
                    }}
            // }
        
            } 
            else 
                clearBoard();
        }
        
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void handleNewGame(ActionEvent event)
    {
        game.newGame();
        setPlayer();
        clearBoard();
        winner1=false; 
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        game = new GameBoard();
        setPlayer();
        swithPlayStyle.setText("singleplayer");
    }

    private void setPlayer()
    {
        if(swithPlayStyle.getText()=="multiplayer")
        {
        lblPlayer.setText("VS AI ");
        }
        else{
        lblPlayer.setText(TXT_PLAYER + game.getNextPlayer(countTurn));}
       
    }

    private void displayWinner(int winner)
    {String message = "";
        if(swithPlayStyle.getText()=="multiplayer")
        {
          if(countTurn%2==1)
            {
                 lblPlayer.setText("You win");
            }
            else
            {
                lblPlayer.setText("AI win ");
            }
        }
        else
        {
        
            switch (winner)
            {
                case -1:
                     message = "It's a draw :-(";
                    break;
                 default:
                     message = "Player " + winner + " wins!!!";
                     break;
             }
      lblPlayer.setText(message);
        }
    }

    
    private void clearBoard()
    {
        for(Node n : gridPane.getChildren())
        {
            Button btn = (Button) n;
            btn.setText("");
            countTurn=0; 
           
        }
        
    }
    
    
    public void endGame()
    {
    game.newGame();
    setPlayer();
    clearBoard();
    winner1=false; 
    }
    
    
    public void WhoWin ()
    {
        System.out.println("x win");
        winner=countTurn%2;
        displayWinner(winner);
    }
    

    @FXML
    private void MultiOrSingle(ActionEvent event) {
        
        
       if(swithPlayStyle.getText()=="multiplayer")
       {
             swithPlayStyle.setText("singleplayer");
             setPlayer();
       }
       else if (swithPlayStyle.getText()=="singleplayer")
       {
            swithPlayStyle.setText("multiplayer");
            setPlayer();
       }
       clearBoard();
     }
    
    
    private void FindWinner()
    {
     
                        if(btn1.getText()==btn2.getText()&& btn1.getText()==btn3.getText())
                        {
                            if(btn1.getText()!="")
                            {
                        winner1=true;
                        WhoWin();
                            }
                        }
                        if(btn1.getText()==btn5.getText()&& btn1.getText()==btn9.getText())
                        {
                         if(btn1.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                        if(btn1.getText()==btn4.getText()&& btn1.getText()==btn7.getText())
                        {
                         if(btn1.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                        if(btn9.getText()==btn8.getText()&& btn9.getText()==btn7.getText())
                        {
                         if(btn9.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                          if(btn9.getText()==btn6.getText()&& btn9.getText()==btn3.getText())
                        {
                         if(btn9.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                          
                          if(btn5.getText()==btn3.getText()&& btn5.getText()==btn7.getText())
                        {
                        if(btn5.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                          
                          if(btn5.getText()==btn4.getText()&& btn5.getText()==btn6.getText())
                        {
                         if(btn5.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
                          
                          if(btn5.getText()==btn2.getText()&& btn5.getText()==btn8.getText())
                        {
                         if(btn5.getText()!="")
                            {
                        winner1=true;
                         WhoWin();
                            }
                        }
       
    }
    public void AI()
            
    {
       
     if(DidSomething)
     {        
           
            Random rn = new Random();
            int i = Math.abs(rn.nextInt()%9)+1 ;
            int randomNum = i;
          
            if(randomNum==1 )
            {
                    if(btn1.getText()!="X" && btn1.getText()!="O")
                    {
                     btn1.setText("O");
                      countTurn++;
                     }
                    else 
                    {
                        AI();
                    }
          }
           if(randomNum==2 )
           {
                    if(btn2.getText()!="X" && btn2.getText()!="O")
                    {
                  
                    btn2.setText("O");
                     countTurn++;
                    }
                    else 
                    {
                     AI();
                    }
          }
            if(randomNum==3 )
          {
                    if(btn3.getText()!="X" && btn3.getText()!="O")
                     {
                  
                        btn3.setText("O");
                         countTurn++;
                    }
                    else 
                    {
                  AI();
                    }
                     }
             if(randomNum==4 )
                {
                    if(btn4.getText()!="X" && btn4.getText()!="O")
                     {
                  
                     btn4.setText("O");
                      countTurn++;
                    }
                    else 
                    {
                    AI();
                    }
                }
              if(randomNum==5 )
                {
                    if(btn5.getText()!="X" && btn5.getText()!="O")
                    { 
                  
                    btn5.setText("O");
                     countTurn++;
                    }
                    else 
                    {
                     AI();
                    }
                }
               if(randomNum==6 )
                {
                    if(btn6.getText()!="X" && btn6.getText()!="O")
                    {
                  
                    btn6.setText("O");
                     countTurn++;
                     }
                       else 
                        {
                         AI();
                         }
                 }
                if(randomNum==7 )
                 {
                    if(btn7.getText()!="X" && btn7.getText()!="O")
                    {
                  
                    btn7.setText("O");
                     countTurn++;
                    }
                    else 
                    {
                        AI();
                    }
                }
                 if(randomNum==8 )
                {
                    if(btn8.getText()!="X" && btn8.getText()!="O")
                {
                  
                    btn8.setText("O");
                     countTurn++;
                }
                    else 
                {
                  AI();
                 }
                }
              if(randomNum==9 )
                {
                    if(btn9.getText()!="X" && btn9.getText()!="O")
                    {
                  
                    btn9.setText("O");
                     countTurn++;
                     }
                     else 
                    {
                      AI();
                      
                     }
                }
         
        
        }

    }
     public void AIX()
            
    {
       
     if(DidSomething)
     {        
           
            Random rn = new Random();
            int i = Math.abs(rn.nextInt()%9)+1 ;
            int randomNum = i;
          
            if(randomNum==1 )
            {
                    if(btn1.getText()!="X" && btn1.getText()!="O")
                    {
                     btn1.setText("X");
                      countTurn++;
                     }
                    else 
                    {
                        AIX();
                    }
          }
           if(randomNum==2 )
           {
                    if(btn2.getText()!="X" && btn2.getText()!="O")
                    {
                  
                    btn2.setText("X");
                     countTurn++;
                    }
                    else 
                    {
                     AIX();
                    }
          }
            if(randomNum==3 )
          {
                    if(btn3.getText()!="X" && btn3.getText()!="O")
                     {
                  
                        btn3.setText("X");
                         countTurn++;
                    }
                    else 
                    {
                  AIX();
                    }
                     }
             if(randomNum==4 )
                {
                    if(btn4.getText()!="X" && btn4.getText()!="O")
                     {
                  
                     btn4.setText("X");
                      countTurn++;
                    }
                    else 
                    {
                    AIX();
                    }
                }
              if(randomNum==5 )
                {
                    if(btn5.getText()!="X" && btn5.getText()!="O")
                    { 
                  
                    btn5.setText("X");
                     countTurn++;
                    }
                    else 
                    {
                     AIX();
                    }
                }
               if(randomNum==6 )
                {
                    if(btn6.getText()!="X" && btn6.getText()!="O")
                    {
                  
                    btn6.setText("X");
                     countTurn++;
                     }
                       else 
                        {
                         AIX();
                         }
                 }
                if(randomNum==7 )
                 {
                    if(btn7.getText()!="X" && btn7.getText()!="O")
                    {
                  
                    btn7.setText("X");
                     countTurn++;
                    }
                    else 
                    {
                        AIX();
                    }
                }
                 if(randomNum==8 )
                {
                    if(btn8.getText()!="X" && btn8.getText()!="O")
                {
                  
                    btn8.setText("X");
                     countTurn++;
                }
                    else 
                {
                  AIX();
                 }
                }
              if(randomNum==9 )
                {
                    if(btn9.getText()!="X" && btn9.getText()!="O")
                    {
                  
                    btn9.setText("X");
                     countTurn++;
                     }
                     else 
                    {
                      AIX();
                      
                     }
                }
        
        
        }
 
    
    }
    public void aiai()
    {
    if(countTurn%2==1)
    {
    Random rn = new Random();
            int i = Math.abs(rn.nextInt()%9)+1 ;
            int randomNum = i;
            System.out.println("hey"+randomNum);
          
            if(randomNum==1 )
            {
                    if(btn1.getText()=="X" )
                    {
                     btn1.setText("");
                    }
                    else 
                    {
                        aiai();
                    }
          }
           if(randomNum==2 )
           {
                    if(btn2.getText()=="X") 
                    {
                  
                    btn2.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
            if(randomNum==3 )
           {
                    if(btn3.getText()=="X") 
                    {
                  
                    btn3.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
            if(randomNum==4 )
           {
                    if(btn4.getText()=="X") 
                    {
                  
                    btn4.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
              if(randomNum==5 )
           {
                    if(btn5.getText()=="X") 
                    {
                  
                    btn5.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
               if(randomNum==6 )
           {
                    if(btn6.getText()=="X") 
                    {
                  
                    btn6.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
               if(randomNum==7 )
           {
                    if(btn7.getText()=="X") 
                    {
                  
                    btn7.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
                if(randomNum==8 )
           {
                    if(btn8.getText()=="X") 
                    {
                  
                    btn8.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
              if(randomNum==9 )
           {
                    if(btn9.getText()=="X") 
                    {
                  
                    btn9.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
    }
    else
    {
    Random rn = new Random();
            int i = Math.abs(rn.nextInt()%9)+1 ;
            int randomNum = i;
          System.out.println(randomNum);
            if(randomNum==1 )
            {
                    if(btn1.getText()=="O" )
                    {
                     btn1.setText("");
                    }
                    else 
                    {
                        aiai();
                    }
          }
           if(randomNum==2 )
           {
                    if(btn2.getText()=="O") 
                    {
                  
                    btn2.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
            if(randomNum==3 )
           {
                    if(btn3.getText()=="O") 
                    {
                  
                    btn3.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
            if(randomNum==4 )
           {
                    if(btn4.getText()=="O") 
                    {
                  
                    btn4.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
              if(randomNum==5 )
           {
                    if(btn5.getText()=="O") 
                    {
                  
                    btn5.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
               if(randomNum==6 )
           {
                    if(btn6.getText()=="O") 
                    {
                  
                    btn6.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
               if(randomNum==7 )
           {
                    if(btn7.getText()=="O") 
                    {
                  
                    btn7.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
                if(randomNum==8 )
           {
                    if(btn8.getText()=="O") 
                    {
                  
                    btn8.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
              if(randomNum==9 )
           {
                    if(btn9.getText()=="O") 
                    {
                  
                    btn9.setText("");
                     
                    }
                    else 
                    {
                     aiai();
                    }
          }
    }
    }

}
