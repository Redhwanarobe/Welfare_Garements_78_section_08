package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class budgetLimitViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> limitCategoryComboBox;
    @javafx.fxml.FXML
    private TextField limitAmountField;

    @javafx.fxml.FXML
    public void initialize() {
        limitCategoryComboBox.getItems().addAll("Member", "President", "Event Manager", "Training Co-Ordinator", "Medical Officer", "Legal Advisor", "Welfare Officer");
    }

    @javafx.fxml.FXML
    public void setLimitButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void RemoveLimitButton(ActionEvent actionEvent) {
    }
}