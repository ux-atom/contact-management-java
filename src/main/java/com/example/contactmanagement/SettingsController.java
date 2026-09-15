package com.example.contactmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class SettingsController {

    @FXML private RadioButton lightThemeRadio;
    @FXML private RadioButton darkThemeRadio;
    @FXML private RadioButton systemThemeRadio;

    @FXML
    public void initialize() {
        ToggleGroup themeGroup = new ToggleGroup();
        lightThemeRadio.setToggleGroup(themeGroup);
        darkThemeRadio.setToggleGroup(themeGroup);
        systemThemeRadio.setToggleGroup(themeGroup);

        lightThemeRadio.setOnAction(e -> ThemeManager.setDarkTheme(false));
        darkThemeRadio.setOnAction(e -> ThemeManager.setDarkTheme(true));
        // System theme will just default to light for now
        systemThemeRadio.setOnAction(e -> ThemeManager.setDarkTheme(false));
    }
}
