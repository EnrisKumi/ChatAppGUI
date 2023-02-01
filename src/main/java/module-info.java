module com.example.parallelprogramminchatapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.parallelprogramminchatapp to javafx.fxml;
    exports com.example.parallelprogramminchatapp;
}