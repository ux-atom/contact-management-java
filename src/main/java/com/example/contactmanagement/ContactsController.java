package com.example.contactmanagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ContactsController {

    @FXML
    private TableView<Contact> contactsTable;

    @FXML
    private TableColumn<Contact, String> colName;
    @FXML
    private TableColumn<Contact, String> colPhone;
    @FXML
    private TableColumn<Contact, String> colEmail;
    @FXML
    private TableColumn<Contact, String> colGroup;

    @FXML
    public void initialize() {
        if (colName != null) colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        if (colPhone != null) colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        if (colEmail != null) colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        if (colGroup != null) colGroup.setCellValueFactory(new PropertyValueFactory<>("company")); // Reusing company as group for demo

        ObservableList<Contact> demoData = FXCollections.observableArrayList(
            new Contact("Md. Rakib Hasan", "+880 1711-223344", "rakib.hasan@pathao.com", "Office"),
            new Contact("Sadia Afrin", "+880 1922-334455", "sadia.a@bkash.com", "Friends"),
            new Contact("Ziyadul Islam", "+880 1833-445566", "2024000010077@seu.edu.bd", "Southeast University"),
            new Contact("Farhan Ahmed", "+880 1544-556677", "farhan.ahmed@grameenphone.com", "Family"),
            new Contact("Nusrat Jahan", "+880 1655-667788", "nusrat.j@daraz.com.bd", "Office"),
            new Contact("Tanvir Rahman", "+880 1799-123456", "tanvir.r@chaldal.com", "Friends"),
            new Contact("Mehzabin Chowdhury", "+880 1888-234567", "mehzabin.c@gmail.com", "Family")
        );

        if (contactsTable != null) {
            contactsTable.setItems(demoData);
        }
    }
}
