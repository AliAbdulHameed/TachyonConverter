module com.example.tachyonconverter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.tachyonconverter to javafx.fxml;
    exports com.example.tachyonconverter;
}