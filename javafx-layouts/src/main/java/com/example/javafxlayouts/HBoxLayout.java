package com.example.javafxlayouts;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class HBoxLayout {

    private HBox layout;

    public HBoxLayout(MainApp mainApp) {
        layout = new HBox(10); // Espaciado entre nodos
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Button toVBox = new Button("Go to VBox Layout");
        toVBox.setOnAction(e -> mainApp.showVBoxScene());

        Button toBorderPane = new Button("Go to BorderPane Layout");
        toBorderPane.setOnAction(e -> mainApp.showBorderPaneScene());

        Button toGridPane = new Button("Go to GridPane Layout");
        toGridPane.setOnAction(e -> mainApp.showGridPaneScene());

        Button toHBox = new Button("Stay on HBox Layout");

        layout.getChildren().addAll(toVBox, toBorderPane, toGridPane, toHBox);
    }

    public HBox getLayout() {
        return layout;
    }
}
