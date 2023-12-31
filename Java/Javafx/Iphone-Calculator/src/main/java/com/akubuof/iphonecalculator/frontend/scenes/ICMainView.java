package com.akubuof.iphonecalculator.frontend.scenes;

import com.akubuof.iphonecalculator.AppHelper;
import com.akubuof.iphonecalculator.frontend.Configurable;
import com.akubuof.iphonecalculator.frontend.IsStyleable;
import com.akubuof.iphonecalculator.frontend.components.ICOutputDisplay;
import javafx.scene.layout.GridPane;

public class ICMainView extends GridPane implements IsStyleable, Configurable {
    public ICMainView() {
        String fxmlPath = "frontend/fxml/scenes/main-view.fxml";
        AppHelper.loadFxml(fxmlPath, this);
        applyStyle();
    }

    @Override
    public void applyStyle() {
        String cssPath = "frontend/style/scenes/main-view.css";
        AppHelper.applyStyle(cssPath, this);
        setConfigurations();
    }

    @Override
    public void setConfigurations() {
        createComponents();
    }

    private void createComponents() {
        createOutputDisplay();
    }

    private void createOutputDisplay() {
        int row = 0;
        int column = 0;
        int rowSpan = 2;
        int columnSpan = 4;
        ICOutputDisplay outputDisplay = new ICOutputDisplay();
        add(outputDisplay, row, column, columnSpan, rowSpan);
    }
}
