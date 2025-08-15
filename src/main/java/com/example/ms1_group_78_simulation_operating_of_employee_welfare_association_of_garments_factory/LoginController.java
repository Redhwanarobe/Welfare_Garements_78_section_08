package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private PasswordField loginPasswordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }



       @javafx.fxml.FXML
        public void loginButtonOA(ActionEvent actionEvent) {
            String enteredId = loginUseridTF.getText();
            String enteredPassword = loginPasswordTF.getText();

            if (enteredId.isEmpty() || enteredPassword.isEmpty()) {
                AlertHelper.showAlert("Login Failed", "Please enter both ID and Password.", Alert.AlertType.ERROR);
                return;
            }

            for (User user : com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists.userArrayList) {
                if (user.getId().equals(enteredId) && user.getPassword().equals(enteredPassword)) {

                    // Login successful — now open dashboard based on ID length
                    String fxmlFile = switch (enteredId.length()) {
                        case 4 -> "/fxml/member_dashboard.fxml";
                        case 5 -> "/fxml/union_leader_dashboard.fxml";
                        case 6 -> "/fxml/medical_officer_dashboard.fxml";
                        case 7 -> "/fxml/legal_advisor_dashboard.fxml";
                        case 8 -> "/fxml/financial_officer_dashboard.fxml";
                        case 9 -> "/fxml/welfare_officer_dashboard.fxml";
                        case 10 -> "/fxml/event_manager_dashboard.fxml";
                        case 11 -> "/fxml/training_coordinator_dashboard.fxml";
                        default -> null;
                    };

                    if (fxmlFile == null) {
                        AlertHelper.showAlert("Login Failed", "Unrecognized ID length.", Alert.AlertType.ERROR);
                        return;
                    }

                    try {
                        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource(fxmlFile));
                        javafx.scene.Parent root = loader.load();
                        javafx.stage.Stage stage = (javafx.stage.Stage) loginUseridTF.getScene().getWindow();
                        stage.setScene(new javafx.scene.Scene(root));
                        stage.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                        AlertHelper.showAlert("Error", "Failed to load dashboard.", Alert.AlertType.ERROR);
                    }

                    return;
                }
            }

            AlertHelper.showAlert("Login Failed", "Invalid ID or Password.", Alert.AlertType.ERROR);
        }

    }


}