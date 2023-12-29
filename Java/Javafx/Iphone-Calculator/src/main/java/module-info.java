module com.akubuof.iphonecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.akubuof.iphonecalculator to javafx.fxml;
    opens com.akubuof.iphonecalculator.frontend.components to javafx.fxml;
    opens com.akubuof.iphonecalculator.frontend.scenes to javafx.fxml;
    exports com.akubuof.iphonecalculator;
    exports com.akubuof.iphonecalculator.frontend;
    exports com.akubuof.iphonecalculator.frontend.components;
    exports com.akubuof.iphonecalculator.frontend.scenes;
    exports com.akubuof.iphonecalculator.backend;
}