package com.akubuof.iphonecalculator.frontend.components;

import com.akubuof.iphonecalculator.AppHelper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextAlignment;


public abstract class ICButton extends AnchorPane {
    @FXML
    private Button button;

    public ICButton() {
        String fxmlPath = "frontend/fxml/components/button.fxml";
        AppHelper.loadFxml(fxmlPath, this);
    }

    public void setButtonAction(EventHandler<ActionEvent> action) {
        button.setOnAction(action);
    }

    public void applyStyle(String stylePath) {
        AppHelper.applyStyle(stylePath, this);
    }

    public void setSymbol(String symbol) {
        button.setText(symbol);
    }

    public void modifyStyle(String style) {
        button.setStyle(style);
    }
}
