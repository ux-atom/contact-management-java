module com.example.contactmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;

    opens com.example.contactmanagement to javafx.fxml;
    exports com.example.contactmanagement;
}
