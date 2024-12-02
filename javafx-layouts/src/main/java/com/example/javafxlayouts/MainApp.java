package com.example.javafxlayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showVBoxScene();
    }

    public void showVBoxScene() {
        VBoxLayout layout = new VBoxLayout(this);
        primaryStage.setScene(new Scene(layout.getLayout(), 400, 300));
        primaryStage.setTitle("VBox Layout");
        primaryStage.show();
    }

    public void showHBoxScene() {
        HBoxLayout layout = new HBoxLayout(this);
        primaryStage.setScene(new Scene(layout.getLayout(), 400, 300));
        primaryStage.setTitle("HBox Layout");
        primaryStage.show();
    }

    public void showBorderPaneScene() {
        BorderLayout layout = new BorderLayout(this);
        primaryStage.setScene(new Scene(layout.getLayout(), 400, 300));
        primaryStage.setTitle("BorderPane Layout");
        primaryStage.show();
    }

    public void showGridPaneScene() {
        GridLayout layout = new GridLayout(this);
        primaryStage.setScene(new Scene(layout.getLayout(), 400, 300));
        primaryStage.setTitle("GridPane Layout");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
