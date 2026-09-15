package com.example.contactmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fxml/MainLayout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        ThemeManager.setScene(scene);
        stage.setTitle("Contact Management System");
        stage.setScene(scene);
        stage.show();
    }
}
