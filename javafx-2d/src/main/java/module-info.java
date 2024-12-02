module com.example.javafx2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx2d to javafx.fxml;
    exports com.example.javafx2d;
}