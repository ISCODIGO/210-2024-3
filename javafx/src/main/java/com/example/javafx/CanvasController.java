package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class CanvasController {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        canvas.setOnMouseClicked((event) -> {
            double x = event.getX();
            double y = event.getY();

            if (event.getButton() == MouseButton.PRIMARY) {
                drawCircle(x, y);
            } else if (event.getButton() == MouseButton.SECONDARY) {
                drawRectangle(x, y);
            }
        });
    }

    private void drawCircle(double x, double y) {
        gc.setFill(Color.RED);
        gc.fillOval(x - 25, y - 25, 50, 50);
    }

    private void drawRectangle(double x, double y) {
        gc.setFill(Color.BLUE);
        gc.fillRect(x - 25, y - 25, 50, 50);
    }
}
