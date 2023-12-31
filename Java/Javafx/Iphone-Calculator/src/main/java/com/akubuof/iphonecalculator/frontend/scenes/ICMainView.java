package com.akubuof.iphonecalculator.frontend.scenes;

import com.akubuof.iphonecalculator.AppHelper;
import com.akubuof.iphonecalculator.frontend.Configurable;
import com.akubuof.iphonecalculator.frontend.components.*;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ICMainView extends GridPane implements Configurable {
    private boolean isEvaluating;

    public ICMainView() {
        String fxmlPath = "frontend/fxml/scenes/main-view.fxml";
        AppHelper.loadFxml(fxmlPath, this);
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
        createNumberButtons();
    }

    private void createOutputDisplay() {
        int row = 0;
        int column = 0;
        int rowSpan = 2;
        int columnSpan = 4;
        ICOutputDisplay outputDisplay = new ICOutputDisplay();
        add(outputDisplay, row, column, columnSpan, rowSpan);
    }

    private void createNumberButtons() {
        String[] buttonSymbols = {
                "C", "+/-", "%", "" + ((char) 247),
                "7", "8", "9", "" + ((char) 215),
                "4", "5", "6", "_",
                "1", "2", "3", "+",
                "0", ",", "="
        };

        ICButton button;
        int currentSymbol = 0;
        for (int row = 2; row < 7; row ++) {
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    if (column < 3) {
                        button = new ICSpecialButton();
                    } else {
                        button = new ICOperatorButton();
                    }
                } else if(row < 6) {
                    if (column < 3) {
                        button = new ICNumberButton();
                    } else {
                        button = new ICOperatorButton();
                    }
                } else {
                    if (column == 1) {
                        button = null;
                    } else if (column == 3) {
                        button = new ICOperatorButton();
                    } else {
                        button = new ICNumberButton();
                    }
                }

                if (button != null) {
                    button.setSymbol(buttonSymbols[currentSymbol]);
                    button.setButtonAction(this::buttonClicked);
                    currentSymbol ++;
                    if (row == 6 && column == 0) {
                        button.modifyStyle("-fx-alignment: center-left;");
                        add(button, column, row, 2, 1);
                    } else {
                        add(button, column, row);
                    }
                }
            }
        }
    }

    private void buttonClicked(ActionEvent event) {
        Node n = (Node) event.getSource();
        Parent p = n.getParent();
        System.out.println(p.getClass() == ICNumberButton.class);
    }
}
