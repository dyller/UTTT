/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.GUI;

import java.net.URL;
import java.util.ArrayList;
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
    private GridPane gridPane;
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
    @FXML
    private Label lblPlayer;
    @FXML
    private GridPane gridPane1;
    @FXML
    private Button btn11;
    @FXML
    private Button btn21;
    @FXML
    private Button btn31;
    @FXML
    private Button btn41;
    @FXML
    private Button btn51;
    @FXML
    private Button btn61;
    @FXML
    private Button btn71;
    @FXML
    private Button btn81;
    @FXML
    private Button btn91;
    @FXML
    private GridPane gridPane2;
    @FXML
    private Button btn12;
    @FXML
    private Button btn22;
    @FXML
    private Button btn32;
    @FXML
    private Button btn42;
    @FXML
    private Button btn52;
    @FXML
    private Button btn62;
    @FXML
    private Button btn72;
    @FXML
    private Button btn82;
    @FXML
    private Button btn92;
    @FXML
    private GridPane gridPane21;
    @FXML
    private Button btn121;
    @FXML
    private Button btn221;
    @FXML
    private Button btn321;
    @FXML
    private Button btn421;
    @FXML
    private Button btn521;
    @FXML
    private Button btn621;
    @FXML
    private Button btn721;
    @FXML
    private Button btn821;
    @FXML
    private Button btn921;
    @FXML
    private GridPane gridPane22;
    @FXML
    private Button btn122;
    @FXML
    private Button btn222;
    @FXML
    private Button btn322;
    @FXML
    private Button btn422;
    @FXML
    private Button btn522;
    @FXML
    private Button btn622;
    @FXML
    private Button btn722;
    @FXML
    private Button btn822;
    @FXML
    private Button btn922;
    @FXML
    private GridPane gridPane23;
    @FXML
    private Button btn123;
    @FXML
    private Button btn223;
    @FXML
    private Button btn323;
    @FXML
    private Button btn423;
    @FXML
    private Button btn523;
    @FXML
    private Button btn623;
    @FXML
    private Button btn723;
    @FXML
    private Button btn823;
    @FXML
    private Button btn923;
    @FXML
    private GridPane gridPane24;
    @FXML
    private Button btn124;
    @FXML
    private Button btn224;
    @FXML
    private Button btn324;
    @FXML
    private Button btn424;
    @FXML
    private Button btn524;
    @FXML
    private Button btn624;
    @FXML
    private Button btn724;
    @FXML
    private Button btn824;
    @FXML
    private Button btn924;
    @FXML
    private GridPane gridPane25;
    @FXML
    private Button btn125;
    @FXML
    private Button btn225;
    @FXML
    private Button btn325;
    @FXML
    private Button btn425;
    @FXML
    private Button btn525;
    @FXML
    private Button btn625;
    @FXML
    private Button btn725;
    @FXML
    private Button btn825;
    @FXML
    private Button btn925;
    @FXML
    private GridPane gridPane26;
    @FXML
    private Button btn126;
    @FXML
    private Button btn226;
    @FXML
    private Button btn326;
    @FXML
    private Button btn426;
    @FXML
    private Button btn526;
    @FXML
    private Button btn626;
    @FXML
    private Button btn726;
    @FXML
    private Button btn826;
    @FXML
    private Button btn926;
    private IField game;
    @FXML
    private GridPane gridpanewhole;
    Node node;
    int col;
    int row;
    String[][] board = new String[9][9];
    GameManager gm;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
        gamestate.setMoveNumber(0);
        gamestate.setRoundNumber(0);
        gm = new GameManager(gamestate);
    }
int countTurn=0;
    @FXML
    private void handleButtonAction(ActionEvent event) {

        Button btn = (Button) event.getSource();
        System.out.println();
        int player= gm.UpdateGame(countTurn);
        String xOrO = player == 0 ? "X" : "O";
        btn.setText(xOrO);
        getPosition(event);
        countTurn++;
        
    }

    void getPosition(Event event) {
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
    private void handleNewGame(ActionEvent event) {
        gm.clearBoard();
        for (Node m : gridpanewhole.getChildren()) {
            try {
                GridPane grid = (GridPane) m;
                for (Node n : grid.getChildren()) {

                    Button btn = (Button) n;
                    btn.setText("");

                }
            } catch (java.lang.ClassCastException j) {

            }
        }
    }

}
