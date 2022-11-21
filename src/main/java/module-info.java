module com.example.assignment2gc200489832 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    opens com.example.assignment2gc200489832 to javafx.fxml;
    exports com.example.assignment2gc200489832;
}