package com.akubuof.iphonecalculator.frontend.scenes;

import com.akubuof.iphonecalculator.AppHelper;
import com.akubuof.iphonecalculator.frontend.IsStyleable;
import javafx.scene.layout.GridPane;

import java.net.URL;

public class ICMainView extends GridPane implements IsStyleable {
    private final String fxmlPath = "frontend/fxml/scenes/main-view.fxml";
    public ICMainView() {
        AppHelper.loadFxml(fxmlPath, this);
        applyStyle();
    }

    @Override
    public void applyStyle() {
        String cssPath = "frontend/style/scenes/main-view.css";
        AppHelper.applyStyle(cssPath, this);
    }
}
