module org.example.javafxwordle {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxwordle to javafx.fxml;
    exports org.example.javafxwordle;
}