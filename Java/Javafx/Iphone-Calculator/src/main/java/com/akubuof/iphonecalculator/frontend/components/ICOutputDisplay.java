package com.akubuof.iphonecalculator.frontend.components;

import com.akubuof.iphonecalculator.AppHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ICOutputDisplay extends AnchorPane {
    @FXML
    private Label textLabel;

    public ICOutputDisplay() {
        String fxmlPath = "frontend/fxml/components/output-display.fxml";
        AppHelper.loadFxml(fxmlPath, this);
        String stylePath = "frontend/style/components/output-display.css";
        AppHelper.applyStyle(stylePath, this);
    }

}
