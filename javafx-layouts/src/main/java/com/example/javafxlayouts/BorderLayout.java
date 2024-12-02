package com.example.javafxlayouts;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class BorderLayout {

    private BorderPane layout;

    public BorderLayout(MainApp mainApp) {
        layout = new BorderPane();
        layout.setStyle("-fx-padding: 20;");

        Button toVBox = new Button("Go to VBox Layout");
        toVBox.setOnAction(e -> mainApp.showVBoxScene());

        Button toHBox = new Button("Go to HBox Layout");
        toHBox.setOnAction(e -> mainApp.showHBoxScene());

        Button toGridPane = new Button("Go to GridPane Layout");
        toGridPane.setOnAction(e -> mainApp.showGridPaneScene());

        Button toBorderPane = new Button("Stay on BorderPane Layout");

        layout.setTop(toVBox);
        layout.setLeft(toHBox);
        layout.setRight(toGridPane);
        layout.setBottom(toBorderPane);
    }

    public BorderPane getLayout() {
        return layout;
    }
}

