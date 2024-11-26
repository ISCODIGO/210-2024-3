package com.example.javafxlayouts;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class VBoxLayout {

    private VBox layout;

    public VBoxLayout(MainApp mainApp) {
        layout = new VBox(10); // Espaciado entre nodos
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Button toHBox = new Button("Go to HBox Layout");
        toHBox.setOnAction(e -> mainApp.showHBoxScene());

        Button toBorderPane = new Button("Go to BorderPane Layout");
        toBorderPane.setOnAction(e -> mainApp.showBorderPaneScene());

        Button toGridPane = new Button("Go to GridPane Layout");
        toGridPane.setOnAction(e -> mainApp.showGridPaneScene());

        Button toVBox = new Button("Stay on VBox Layout");

        layout.getChildren().addAll(toHBox, toBorderPane, toGridPane, toVBox);
    }

    public VBox getLayout() {
        return layout;
    }
}
