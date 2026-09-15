package com.example.contactmanagement;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.io.ByteArrayInputStream;

public class TestStyleClass extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String fxml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                      "<?import javafx.scene.control.Button?>\n" +
                      "<Button xmlns=\"http://javafx.com/javafx/17\" xmlns:fx=\"http://javafx.com/fxml/1\" styleClass=\"a b\" />";
        Button b = new FXMLLoader().load(new ByteArrayInputStream(fxml.getBytes()));
        System.out.println("Size for 'a b': " + b.getStyleClass().size());
        for(String s: b.getStyleClass()) System.out.println("'" + s + "'");
        
        String fxml2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                      "<?import javafx.scene.control.Button?>\n" +
                      "<Button xmlns=\"http://javafx.com/javafx/17\" xmlns:fx=\"http://javafx.com/fxml/1\" styleClass=\"a, b\" />";
        Button b2 = new FXMLLoader().load(new ByteArrayInputStream(fxml2.getBytes()));
        System.out.println("Size for 'a, b': " + b2.getStyleClass().size());
        for(String s: b2.getStyleClass()) System.out.println("'" + s + "'");
        System.exit(0);
    }
    public static void main(String[] args) { launch(args); }
}
