package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class createAccountController
{
    @javafx.fxml.FXML
    private TextField idField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private ComboBox<String> genderCombbox;
    @javafx.fxml.FXML
    private DatePicker dobField;
    @javafx.fxml.FXML
    private TextField addressField;
    @javafx.fxml.FXML
    private TextField phoneField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createButton(ActionEvent actionEvent) {
    }
}