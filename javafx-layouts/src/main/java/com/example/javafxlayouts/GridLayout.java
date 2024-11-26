package com.example.javafxlayouts;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GridLayout {

    private GridPane layout;

    public GridLayout(MainApp mainApp) {
        layout = new GridPane();
        layout.setHgap(10); // Espaciado horizontal
        layout.setVgap(10); // Espaciado vertical
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Button toVBox = new Button("Go to VBox Layout");
        toVBox.setOnAction(e -> mainApp.showVBoxScene());

        Button toHBox = new Button("Go to HBox Layout");
        toHBox.setOnAction(e -> mainApp.showHBoxScene());

        Button toBorderPane = new Button("Go to BorderPane Layout");
        toBorderPane.setOnAction(e -> mainApp.showBorderPaneScene());

        Button toGridPane = new Button("Stay on GridPane Layout");

        layout.add(toVBox, 0, 0);
        layout.add(toHBox, 1, 0);
        layout.add(toBorderPane, 0, 1);
        layout.add(toGridPane, 1, 1);
    }

    public GridPane getLayout() {
        return layout;
    }
}

