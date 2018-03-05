/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.GUI;

import java.net.URL;

import java.util.ArrayList;

import static java.nio.file.Files.move;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.RowConstraints;
import tictactoeultimategame.FIELD.Field;
import tictactoeultimategame.FIELD.IField;
import tictactoeultimategame.GAME.GameManager;
import tictactoeultimategame.GAME.GameState;

import tictactoeultimategame.FIELD.IField;
import tictactoeultimategame.GAME.GameManager;
import tictactoeultimategame.MOVE.IMove;
import tictactoeultimategame.MOVE.Move;

/**
 *
 * @author mr.Andersen
 */
<<<<<<< HEAD
public class UltimateGUIController implements Initializable {

=======


   
public class UltimateGUIController implements Initializable 
{
>>>>>>> d34361e8d8bd4678e642289b9086b6c798289dcc
    Move move = new Move();
    GameState gamestate = new GameState();
    private Label label;
    @FXML
    private Button btnNewGame;
    @FXML
    private Label lblPlayer;
    @FXML
    private GridPane gridPane1;

    private IField game = new Field();
    @FXML
    private GridPane gridpanewhole;
    Node node;
    int col;
    int row;
    int countTurn=0;
    String[][] board = new String[9][9];
    GameManager gm;
    @FXML
    private GridPane gridPane2;
    @FXML
    private GridPane gridPane3;
    @FXML
    private GridPane gridPane4;
    @FXML
    private GridPane gridPane5;
    @FXML
    private GridPane gridPane6;
    @FXML
    private GridPane gridPane7;
    @FXML
    private GridPane gridPane8;
    @FXML
    private GridPane gridPane9;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
        gamestate.setMoveNumber(0);
        gamestate.setRoundNumber(0);
        gm = new GameManager(gamestate);
        
        gm.clearBoard();
        for (Node m : gridpanewhole.getChildren()) 
        {
            try 
            {
                GridPane grid = (GridPane) m;
                for (Node n : grid.getChildren()) 
                {
                    Button btn = (Button) n;
                    btn.setText("  ");
                }
            } 
            
            catch (java.lang.ClassCastException j) 
            {

            }
        }
        
        
    }
<<<<<<< HEAD

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
=======
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {

        Button btn = (Button) event.getSource();
        System.out.println();
        int player= gm.UpdateGame(countTurn);
        String xOrO = player == 0 ? "X" : "O";
        btn.setText(xOrO);
>>>>>>> d34361e8d8bd4678e642289b9086b6c798289dcc
        getPosition(event);
        
        for (IMove imive : gamestate.getField().getAvailableMoves()) {
            
            if(imive.getX()==move.getY()&&imive.getY()==move.getX())
       {
           System.out.println("okay");
        newAction(event);
        setupMap();
       }
        }
       
        
        if (btn.isHover()) 
        {
            btn.setStyle("-fx-background-color: red" +
                            "#090a0d,\n" +
                            "linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
                            "linear-gradient(#20262b, #191d22),\n" +
                            "radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
                            "-fx-background-radius: 5,4,3,5;\n" +
                            "-fx-background-insets: 0,1,2,0;\n" +
                            "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                            "-fx-font-family: \"Arial\";\n" +
                            "-fx-text-fill: linear-gradient(grey, #d0d0d0);\n" +
                            "-fx-font-size: 24px;\n" +
                            "-fx-padding: 10 20 10 20;");
            System.out.println("23"
                    + "22");
        }
        
        
    }
<<<<<<< HEAD
    
    
    void getPosition(Event event)
    {
     node = (Node) event.getSource();
=======

    void getPosition(Event event) 
    {
        node = (Node) event.getSource();
        Integer rowMicro = GridPane.getRowIndex(node);
        Integer colMicro = GridPane.getColumnIndex(node);
        
        int rMicro = (rowMicro == null) ? 0 : rowMicro;
        int cMicro = (colMicro == null) ? 0 : colMicro;
        
>>>>>>> d34361e8d8bd4678e642289b9086b6c798289dcc
        Integer rowsOuter = GridPane.getRowIndex(node.getParent());
        Integer colsOuter = GridPane.getColumnIndex(node.getParent());
        
        int rsOuter = (rowsOuter == null) ? 0 : rowsOuter;
        int csOuter = (colsOuter == null) ? 0 : colsOuter;
<<<<<<< HEAD
          Integer rowMicro = GridPane.getRowIndex(node);
        Integer colMicro = GridPane.getColumnIndex(node);
        int rMicro = (rowMicro == null) ? 0 : rowMicro;
        int cMicro = (colMicro == null) ? 0 : colMicro;
=======
        
>>>>>>> d34361e8d8bd4678e642289b9086b6c798289dcc
        row = rsOuter * 3 + rMicro;
        col = csOuter * 3 + cMicro;
        move.setX(row);
        move.setY(col);
<<<<<<< HEAD
=======
        gm.UpdateBoard(move);
        board[row][col] = "x";
        
        
        
        
>>>>>>> d34361e8d8bd4678e642289b9086b6c798289dcc
    }
    void newAction(Event event)
    {
        
        String[][] boards = gamestate.getField().getBoard();
        String xorO = gamestate.getMoveNumber()%2 == 0 ? "X" : "O";
       gamestate.setMoveNumber(gamestate.getMoveNumber()+1);
       
        boards[row][col]=xorO;
        gamestate.getField().setBoard(boards);
    
    }

    void setupMap() {
        int k = 0, j = 0;

        String[][] board = gamestate.getField().getBoard();
        for (String[] strings : board) {

            for (String string : strings) {
                String color = string == "X" ? "X" : "O";
                if (string != null) {
                    GridPane grid = (GridPane) gridpanewhole.getChildren().get((k/ 3)*3 + j / 3);
                    Button btn = (Button) grid.getChildren().get((k % 3)*3 + j % 3);
                  
                    btn.setText(color);
                }
                j++;
            }
            j = 0;

            k++;
        }
    }

    @FXML
    private void handleNewGame(ActionEvent event) 
    {
        gm.clearBoard();
        for (Node m : gridpanewhole.getChildren()) 
        {
            try 
            {
                GridPane grid = (GridPane) m;
                for (Node n : grid.getChildren()) 
                {
                    Button btn = (Button) n;
                    btn.setText("");
                }
            } 
            
            catch (java.lang.ClassCastException j) 
            {

            }
        }
    }

}
 /*for (String[] strings : game.getBoard()) {
            for (String string : strings) {
                System.out.print(string+"\t");
            }
            System.out.println("");
        }

*/