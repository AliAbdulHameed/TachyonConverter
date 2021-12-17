module com.example.tachyonconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tachyonconverter to javafx.fxml;
    exports com.example.tachyonconverter;
}