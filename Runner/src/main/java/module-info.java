module com.example.runner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.runner to javafx.fxml;
    exports com.example.runner;
}