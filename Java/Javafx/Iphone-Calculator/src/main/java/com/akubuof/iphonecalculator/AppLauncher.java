package com.akubuof.iphonecalculator;

import com.akubuof.iphonecalculator.frontend.scenes.ICMainView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("frontend/fxml/scenes/test-view.fxml"));
        Scene testScene = new Scene(fxmlLoader.load());
        Parent root = (Parent) new ICMainView();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
