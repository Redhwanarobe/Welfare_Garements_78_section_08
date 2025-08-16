package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ManagePhrmecyController
{
    @javafx.fxml.FXML
    private TableColumn<ManagePhrmecyClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<ManagePhrmecyClass,String> expiredDateCol;
    @javafx.fxml.FXML
    private TableColumn<ManagePhrmecyClass,String> stockdateCol;
    @javafx.fxml.FXML
    private TableColumn<ManagePhrmecyClass,String> totalMedicineCol;
    @javafx.fxml.FXML
    private ComboBox<String>ModuleComboBox;
    @javafx.fxml.FXML
    private TableView<ManagePhrmecyClass> TableView;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private TextField MedicinetextField;
    @javafx.fxml.FXML
    private DatePicker datepickerFxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void loadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnHomeOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {
    }
}