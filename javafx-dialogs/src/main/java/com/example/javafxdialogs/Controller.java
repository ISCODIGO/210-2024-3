package com.example.javafxdialogs;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Controller {
    private Model model;

    public Controller() {
        this.model = new Model();
    }

    @FXML
    private void handleShowAlertButton(ActionEvent event) {
        // Create and show an alert dialog
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Ejemplo de header");
        alert.setContentText(model.getMessage());
        alert.showAndWait();
    }

    @FXML
    private void handleShowTextInputDialog(ActionEvent event) {
        // Create and show a text input dialog
        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Text Input Dialog");
        textInputDialog.setHeaderText("Ingrese un nombre");
        textInputDialog.setContentText("Nombre:");

        Optional<String> result = textInputDialog.showAndWait();
        result.ifPresent(name -> {
            System.out.println("El nombre es: " + name);
        });
    }

    @FXML
    private void handleShowChoiceDialog(ActionEvent event) {
        // Create and show a choice dialog
        List<String> choices = Arrays.asList("Option 1", "Option 2", "Option 3");
        ChoiceDialog<String> choiceDialog = new ChoiceDialog<>("Option 1", choices);
        choiceDialog.setTitle("Choice Dialog");
        choiceDialog.setHeaderText("Selecciona una opcion");
        choiceDialog.setContentText("Opcion:");

        Optional<String> result = choiceDialog.showAndWait();
        result.ifPresent(option -> System.out.printf("Opcion seleccionada: %s%n", option));
    }
}