package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private PasswordField loginPasswordTF;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox.getItems().addAll(
                "Member",
                "Union Leader",
                "Medical Officer",
                "Legal Advisor",
                "Financial Officer",
                "Welfare Officer",
                "Event Manager",
                "Training Co-ordinator"
        );

        Employee dummyWelfare = new Employee();
        dummyWelfare.setId("admin");
        dummyWelfare.setPassword("admin");
        ArrayLists.userArrayList.add(dummyWelfare);
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        String enteredId = loginUseridTF.getText();
        String enteredPassword = loginPasswordTF.getText();
        String selectedRole = roleComboBox.getValue();

        if (enteredId.isEmpty() || enteredPassword.isEmpty()) {
            AlertHelper.showAlert("Login Failed", "Please enter both UserID and Password.", Alert.AlertType.ERROR);
            return;
        }

        File file = new File("data/users/" + selectedRole + ".bin");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                while (true) {
                    Employee user = (Employee) ois.readObject();
                    ArrayLists.userArrayList.add(user);
                }
            } catch (EOFException eof) {
                System.out.println("End of file reached");
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }

        boolean found = false;
        for (User user : ArrayLists.userArrayList) {
            if (user.getId().equals(enteredId) && user.getPassword().equals(enteredPassword)) {
                found = true;

                String fxmlPath;
                switch (selectedRole) {
                    case "Member":
                      fxmlPath = "Member/memberDashboard-view.fxml";
                      break;
                    case "Union Leader":
                      fxmlPath = "President_UnionLeader/presidentDashboard.fxml";
                      break;
                    case "Financial Officer":
                        fxmlPath = "FinancialOfficer/dashboardView.fxml";
                        break;
                    case "Welfare Officer":
                        fxmlPath = "WelfareOfficer/dashboardViewWellfareOfficer.fxml";
                        break;
//                    case "Medical Officer":
//                        fxmlPath = "Mdical_Officer/";
//                        break;
                    case "Legal Advisor":
                        fxmlPath = "Legal_Advisor/LegalAdvisor_Dashbboard.fxml";
                        break;

                    case "Event Manager":
                        fxmlPath = "Event_manager/eventdashboard.fxml";
                        break;

                    case "Training Co-ordinator":
                        fxmlPath = "Training_coordinator/Dashbaord.fxml";
                        break;

                    default:
                        AlertHelper.showAlert("Login Failed", "No dashboard available for this role.", Alert.AlertType.ERROR);
                        return;
                }

                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
                    Parent root = loader.load();
                    Stage stage = (Stage) loginUseridTF.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException ex) {
                    System.out.println("FXML did not load");
                }

                break;
            }
        }

        if (!found) {
            AlertHelper.showAlert("Login Failed", "Invalid ID or Password!", Alert.AlertType.ERROR);
        }
    }
}
