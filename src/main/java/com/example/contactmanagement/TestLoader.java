package com.example.contactmanagement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.net.URL;

public class TestLoader extends Application {
    @Override
    public void start(Stage stage) {
        String[] files = {"DashboardView.fxml", "Contacts.fxml", "Favorites.fxml", "Groups.fxml", "RecentContacts.fxml", "Trash.fxml", "Settings.fxml", "About.fxml"};
        for (String f : files) {
            try {
                URL url = getClass().getResource("fxml/" + f);
                FXMLLoader loader = new FXMLLoader(url);
                loader.load();
                System.out.println("Loaded " + f + " successfully");
            } catch (Exception e) {
                System.out.println("Failed to load " + f);
                e.printStackTrace(System.out);
            }
        }
        System.exit(0);
    }
    public static void main(String[] args) { launch(args); }
}
