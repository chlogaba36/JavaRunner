module com.example.test_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.test_1 to javafx.fxml;
    exports com.example.test_1;
}