package com.akubuof.iphonecalculator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public class AppHelper {
    private AppHelper() {}

    public static URL getUrl(String path) {
        return AppHelper.class.getResource(path);
    }

    public static void applyStyle(String path, Parent target) {
        URL stylePath = AppHelper.getUrl(path);
        String style = stylePath.toExternalForm();
        target.getStylesheets().add(style);
    }

    public static <T> void loadFxml(String fxmlPath, T target) {
        FXMLLoader fxmlLoader = new FXMLLoader(AppHelper.getUrl(fxmlPath));
        fxmlLoader.setRoot(target);
        fxmlLoader.setController(target);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
