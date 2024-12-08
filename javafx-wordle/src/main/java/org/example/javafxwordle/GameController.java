package org.example.javafxwordle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    @FXML
    private GridPane tablero;

    public final int FILAS = 6;
    public final int COLUMNAS = 5;
    private TextField[][] celdas;
    private int aciertos = 0;  // cantidad de celdas verdes en la fila actual
    private int filaActual = 0;
    private int colActual = 0;
    private String palabra = "COFRE";
    private boolean continuarJuego = true;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        celdas = new TextField[FILAS][COLUMNAS];
        Font fuente = Font.font("System Bold", FontWeight.BOLD, 25);
        BorderStroke borderStroke = new BorderStroke(
                Color.GRAY,
                BorderStrokeStyle.SOLID,
                null,
                new BorderWidths(2)
        );
        Border border = new Border(borderStroke);
        
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                var celda = new TextField();
                celda.setText("");
                celda.setFont(fuente);
                celda.setAlignment(Pos.CENTER);
                celda.setBorder(border);
                celda.setDisable(true);
                celdas[i][j] = celda;  // guardar para manipular las celdas
                tablero.add(celda, j, i);
            }
        }

        actualizarFila(false);
    }

    private void actualizarFila(boolean deshabilitar) {
        for (int c = 0; c < COLUMNAS; c++) {
            celdas[filaActual][c].setDisable(deshabilitar);
        }
    }

    private void crearAlerta(Alert.AlertType tipo, String titulo, String encabezado, String contenido) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.show();
    }

    @FXML private void enterClick() {
        if (colActual < COLUMNAS - 1) {
            crearAlerta(Alert.AlertType.WARNING, "Advertencia", "No se puede ejecutar", "Faltan celdas dentro de la fila para llenarse");
            return;
        }

        if (!continuarJuego) {
            crearAlerta(Alert.AlertType.ERROR, "Error", "", "El juego ha terminado");
            return;
        }

        // colorear las celdas
        Color color;
        for (int c = 0; c < COLUMNAS; c++) {
            TextField celda = celdas[filaActual][c];
            String letra = palabra.substring(c, c + 1);  // la letra de la palabra secreta

            if (letra.equals(celda.getText())) {
                color = Color.GREENYELLOW;
                aciertos++;
            } else if (palabra.contains(celda.getText())) {
                color = Color.ORANGE;
            } else {
                color = Color.RED;
            }

            celda.setBackground(Background.fill(color));
        }

        actualizarFila(true);  // desactivar fila actual

        // saber el estado del juego (gana, pierde, continua)
        if (aciertos == COLUMNAS) {
            crearAlerta(Alert.AlertType.INFORMATION, "Felicidades!!", "Eres el ganador!!", "Has acertado todas las letras de la palabra");
            return;
        }

        filaActual++;

        if (filaActual == FILAS) {
            crearAlerta(Alert.AlertType.INFORMATION, "Perdiste", "Ha terminado", "No has podido descrifrar la palabra: " + palabra);
            return;
        }

        colActual = 0;
        aciertos = 0;
        actualizarFila(false);  // activar fila siguiente (nueva actual)

    }

    @FXML private void backClick() {
        if (colActual == 0) {
            System.out.println("No es posible usar back");
            return;
        }

        celdas[filaActual][--colActual].setText("");
    }

    @FXML private void keyClick(ActionEvent event) {
        if (colActual == COLUMNAS) {
            System.out.println("Fuera de rango [columnas]");
            return;
        }

        Button boton = (Button) event.getSource();
        celdas[filaActual][colActual].setText(boton.getText());
        colActual++;
    }
}