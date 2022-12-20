module com.calculator_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator_demo to javafx.fxml;
    exports com.calculator_demo;
}