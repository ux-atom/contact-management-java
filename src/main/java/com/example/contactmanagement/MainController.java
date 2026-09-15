package com.example.contactmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML private StackPane contentArea;
    @FXML private Button btnDashboard;
    @FXML private Button btnContacts;
    @FXML private Button btnFavorites;
    @FXML private Button btnGroups;
    @FXML private Button btnRecent;
    @FXML private Button btnTrash;
    @FXML private Button btnSettings;
    @FXML private Button btnAbout;

    @FXML
    public void initialize() {
        showDashboard();
    }

    private void loadPage(String fxmlFile, Button activeBtn) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/" + fxmlFile));
            Parent root = loader.load();
            contentArea.getChildren().setAll(root);
            
            // Reset all button styles
            btnDashboard.getStyleClass().remove("sidebar-btn-active");
            btnContacts.getStyleClass().remove("sidebar-btn-active");
            btnFavorites.getStyleClass().remove("sidebar-btn-active");
            btnGroups.getStyleClass().remove("sidebar-btn-active");
            btnRecent.getStyleClass().remove("sidebar-btn-active");
            btnTrash.getStyleClass().remove("sidebar-btn-active");
            btnSettings.getStyleClass().remove("sidebar-btn-active");
            btnAbout.getStyleClass().remove("sidebar-btn-active");
            
            // Set active button style
            if (activeBtn != null && !activeBtn.getStyleClass().contains("sidebar-btn-active")) {
                activeBtn.getStyleClass().add("sidebar-btn-active");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void showDashboard() {
        loadPage("DashboardView.fxml", btnDashboard);
    }

    @FXML
    public void showContacts() {
        loadPage("Contacts.fxml", btnContacts);
    }

    @FXML
    public void showFavorites() {
        loadPage("Favorites.fxml", btnFavorites);
    }

    @FXML
    public void showGroups() {
        loadPage("Groups.fxml", btnGroups);
    }

    @FXML
    public void showRecent() {
        loadPage("RecentContacts.fxml", btnRecent);
    }

    @FXML
    public void showTrash() {
        loadPage("Trash.fxml", btnTrash);
    }

    @FXML
    public void showSettings() {
        loadPage("Settings.fxml", btnSettings);
    }

    @FXML
    public void showAbout() {
        loadPage("About.fxml", btnAbout);
    }
}
