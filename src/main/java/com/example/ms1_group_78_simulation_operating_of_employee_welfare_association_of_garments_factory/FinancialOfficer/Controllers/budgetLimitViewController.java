package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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
        limitCategoryComboBox.getItems().addAll("President", "Event Manager", "Training Co-Ordinator", "Medical Officer", "Legal Advisor", "Welfare Officer");
    }

    @javafx.fxml.FXML
    public void setLimitButton(ActionEvent actionEvent) {
        String selectedRole = limitCategoryComboBox.getValue();
        String limitAmountText = limitAmountField.getText();

        if (selectedRole == null || selectedRole.isEmpty()) {
            AlertHelper.showAlert("Error", "Please select a category.", Alert.AlertType.ERROR);
            return;
        }

        if (limitAmountText == null || limitAmountText.isEmpty()) {
            AlertHelper.showAlert("Error", "Please enter a limit amount.", Alert.AlertType.ERROR);
            return;
        }

        AlertHelper.showAlert("Successful", "Budget Limit set successfully for " + selectedRole, Alert.AlertType.INFORMATION);

    }

    @javafx.fxml.FXML
    public void RemoveLimitButton(ActionEvent actionEvent) {
        String selectedRole = limitCategoryComboBox.getValue();

        if (selectedRole == null || selectedRole.isEmpty()) {
            AlertHelper.showAlert("Error", "Please select a category.", Alert.AlertType.ERROR);
            return;
        }

        AlertHelper.showAlert("Success", "Limit removed for " + selectedRole, Alert.AlertType.INFORMATION);
    }
}