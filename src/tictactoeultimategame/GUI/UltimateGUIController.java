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


   
public class UltimateGUIController implements Initializable {
 Move move = new Move();
    GameState gamestate = new GameState();
    private Label label;
    @FXML
    private Button btnNewGame;
    @FXML
    private Label lblPlayer;
    @FXML
    private GridPane gridPane1;

    private IField game;
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
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {

        Button btn = (Button) event.getSource();
        System.out.println();
        int player= gm.UpdateGame(countTurn);
        String xOrO = player == 0 ? "X" : "O";
        btn.setText(xOrO);
        getPosition(event);
        countTurn++;
        
        
        
        
    }

    void getPosition(Event event) 
    {
        node = (Node) event.getSource();
        Integer rowMicro = GridPane.getRowIndex(node);
        Integer colMicro = GridPane.getColumnIndex(node);
        
        int rMicro = (rowMicro == null) ? 0 : rowMicro;
        int cMicro = (colMicro == null) ? 0 : colMicro;
        
        Integer rowsOuter = GridPane.getRowIndex(node.getParent());
        Integer colsOuter = GridPane.getColumnIndex(node.getParent());
        
        int rsOuter = (rowsOuter == null) ? 0 : rowsOuter;
        int csOuter = (colsOuter == null) ? 0 : colsOuter;
        
        row = rsOuter * 3 + rMicro;
        col = csOuter * 3 + cMicro;
        move.setX(row);
        move.setY(col);
        gm.UpdateBoard(move);
        board[row][col] = "x";
        
        
        
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
