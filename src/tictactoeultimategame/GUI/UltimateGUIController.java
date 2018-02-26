/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeultimategame.GUI;

import java.net.URL;
import static java.nio.file.Files.move;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import tictactoeultimategame.FIELD.IField;
import tictactoeultimategame.GAME.GameManager;
import tictactoeultimategame.MOVE.IMove;
import tictactoeultimategame.MOVE.Move;

/**
 *
 * @author mr.Andersen
 */
public class UltimateGUIController implements Initializable 
{

    IField field;
    GameManager gm;
    Move move;
    
    private Label label;
    @FXML
    private Button btnNewGame;
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
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void handleNewGame(ActionEvent event) 
    {
//        field.clearBoard();
//        field.newGame();
        clearBoard();
    }
    
    private void clearBoard()
    {
        
    }

    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        
        
        Button btn = (Button) event.getSource();
       
        Integer row = gridPane.getRowIndex((Node) event.getSource());
        Integer col = gridPane.getColumnIndex((Node) event.getSource());
        

        int r = (row == null) ? 0 : row;
        int c = (col == null) ? 0 : col;
        c++;
        r++;
        btn.setText("X");
        
        System.out.println(r + "\t" + c);
    }
    
}
