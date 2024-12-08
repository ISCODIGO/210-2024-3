module org.example.javafxgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxgame to javafx.fxml;
    exports org.example.javafxgame;
}