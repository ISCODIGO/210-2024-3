module com.example.javafxdialogs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdialogs to javafx.fxml;
    exports com.example.javafxdialogs;
}