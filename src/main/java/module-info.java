module com.example.sound {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sound to javafx.fxml;
    exports com.example.sound;
}