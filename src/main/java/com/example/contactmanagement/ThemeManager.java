package com.example.contactmanagement;

import javafx.scene.Scene;

public class ThemeManager {
    private static Scene mainScene;
    private static String darkThemeUrl = ThemeManager.class.getResource("css/dark-theme.css").toExternalForm();

    public static void setScene(Scene scene) {
        mainScene = scene;
    }

    public static void setDarkTheme(boolean isDark) {
        if (mainScene == null) return;
        if (isDark) {
            if (!mainScene.getStylesheets().contains(darkThemeUrl)) {
                mainScene.getStylesheets().add(darkThemeUrl);
            }
        } else {
            mainScene.getStylesheets().remove(darkThemeUrl);
        }
    }
}
