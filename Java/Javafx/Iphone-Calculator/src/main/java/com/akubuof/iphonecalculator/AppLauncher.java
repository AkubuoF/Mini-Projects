package com.akubuof.iphonecalculator;

import com.akubuof.iphonecalculator.frontend.scenes.ICMainView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = (Parent) new ICMainView();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
