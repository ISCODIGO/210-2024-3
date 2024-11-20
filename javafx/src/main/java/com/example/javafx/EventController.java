package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class EventController {

    @FXML
    private Button actionButton;

    @FXML
    private TextField textField;

    @FXML
    private Label label;

    @FXML
    private void handleActionEvent(ActionEvent event) {
        System.out.println("Button clicked!");
        label.setText("Action Event: Button clicked!");
    }

    @FXML
    private void handleKeyEvent(KeyEvent event) {
        System.out.println("Key pressed: " + event.getText());
        label.setText("Key Event: " + event.getText());
    }

    @FXML
    private void handleMouseEvent(MouseEvent event) {
        System.out.println("Mouse clicked at: " + event.getSceneX() + ", " + event.getSceneY());
        label.setText("Mouse Event: (" + event.getSceneX() + ", " + event.getSceneY() + ")");
    }
}
