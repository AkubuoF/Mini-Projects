package com.akubuof.iphonecalculator.frontend.components;

import com.akubuof.iphonecalculator.AppHelper;
import com.akubuof.iphonecalculator.frontend.IsStyleable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ICOutputDisplay extends AnchorPane implements IsStyleable {
    @FXML
    private Label textLabel;

    public ICOutputDisplay() {
        String fxmlPath = "frontend/fxml/components/output-display-view.fxml";
        AppHelper.loadFxml(fxmlPath, this);
        applyStyle();
    }

    @Override
    public void applyStyle() {
        String stylePath = "frontend/style/components/output-display-view.css";
        AppHelper.applyStyle(stylePath, this);
    }
}
