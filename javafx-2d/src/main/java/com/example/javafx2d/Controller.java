package com.example.javafx2d;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
    }

    // Método para dibujar un rectángulo
    @FXML
    private void dibujarRectangulo() {
        gc.setFill(Color.BLUE);
        gc.fillRect(50, 50, 150, 100);
    }

    // Método para dibujar una elipse
    @FXML
    private void dibujarElipse() {
        gc.setFill(Color.RED);
        gc.fillOval(200, 50, 150, 100);
    }

    // Método para dibujar una línea
    @FXML
    private void dibujarLinea() {
        gc.setStroke(Color.YELLOWGREEN);
        gc.setLineWidth(3);
        gc.strokeLine(50, 200, 400, 200);
    }

    // Método para dibujar un polígono
    @FXML
    private void dibujarPoligono() {
        gc.setFill(Color.PURPLE);
        gc.fillPolygon(new double[]{250, 300, 350, 300}, new double[]{250, 150, 250, 350}, 4);
    }

    // Método para dibujar texto
    @FXML
    private void dibujarTexto() {
        gc.setFill(Color.BLACK);
        gc.fillText("Hola JavaFX", 200, 400);
    }

    // Método para borrar todo
    @FXML
    private void borrarTodo() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
