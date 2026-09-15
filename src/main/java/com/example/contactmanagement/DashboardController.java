package com.example.contactmanagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DashboardController {

    @FXML
    private TableView<Contact> recentContactsTable;

    @FXML
    private TableColumn<Contact, String> colName;
    @FXML
    private TableColumn<Contact, String> colPhone;
    @FXML
    private TableColumn<Contact, String> colEmail;
    @FXML
    private TableColumn<Contact, String> colCompany;

    @FXML
    public void initialize() {
        if (colName != null) colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        if (colPhone != null) colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        if (colEmail != null) colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        if (colCompany != null) colCompany.setCellValueFactory(new PropertyValueFactory<>("company"));

        ObservableList<Contact> demoData = FXCollections.observableArrayList(
            new Contact("Md. Rakib Hasan", "+880 1711-223344", "rakib.hasan@pathao.com", "Pathao"),
            new Contact("Sadia Afrin", "+880 1922-334455", "sadia.a@bkash.com", "bKash"),
            new Contact("Ziyadul Islam", "+880 1833-445566", "2024000010077@seu.edu.bd", "Southeast University"),
            new Contact("Farhan Ahmed", "+880 1544-556677", "farhan.ahmed@grameenphone.com", "Grameenphone"),
            new Contact("Nusrat Jahan", "+880 1655-667788", "nusrat.j@daraz.com.bd", "Daraz")
        );

        if (recentContactsTable != null) {
            recentContactsTable.setItems(demoData);
        }
    }
}
