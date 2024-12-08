package org.example.javafxgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private GridPane tablero;

    private TextField[][] textos;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Funcion para iniciar la escena
        textos = new TextField[6][5];  // 30 TextFields
        System.out.println(Arrays.toString(textos));
        for (int i = 0; i < textos.length; i++) {
            for (int j = 0; j < textos[i].length; j++) {
                System.out.println(i + "," + j);
                textos[i][j] = new TextField();
                textos[i][j].setPrefWidth(150);
                textos[i][j].setPrefHeight(150);
                textos[i][j].setText("X");
                tablero.add(textos[i][j], i, j);
            }
        }
    }
}