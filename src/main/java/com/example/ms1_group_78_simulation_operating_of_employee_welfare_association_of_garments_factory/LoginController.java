package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.EventdashboardController;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.Eventmanager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class LoginController {
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private TextField loginPasswordTF;

    ObservableList<Eventmanager> eventmanagerObservableList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        Eventmanager eventmanager = new Eventmanager(
                "Event manager", "01254451", "event@gmail.com", "bashundhara", "1111",
                LocalDate.of(1990, 4, 4)
        );
        eventmanagerObservableList.add(eventmanager);
    }

    @javafx.fxml.FXML
    public void signupButtonOA(ActionEvent actionEvent) {
        // TODO: Implement sign-up logic
    }

    @javafx.fxml.FXML
    public void forgetpassworfButtonOA(ActionEvent actionEvent) {
        // TODO: Implement forgot-password logic
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        String id = loginUseridTF.getText();
        String password = loginPasswordTF.getText();
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);

        if (id.isBlank()) {
            flag = false;
            erroralert.setTitle("User ID Error");
            erroralert.setContentText("User ID cannot be blank");
            erroralert.showAndWait();
        }
        if (password.isBlank()) {
            flag = false;
            erroralert.setTitle("Password Error");
            erroralert.setContentText("Password cannot be blank");
            erroralert.showAndWait();
        }

        if (!flag) return;

        switch (id.length()) {
            case 3:
                // Log in as a member
                break;

            case 4:
                // Login as an event manager
                for (Eventmanager eventmanager : eventmanagerObservableList) {
                    if (eventmanager.login(id, password) != null) {
                        FXMLLoader fxmlLoader = new FXMLLoader(
                                HelloApplication.class.getResource("Event_manager/eventdashboard.fxml")
                        );
                        Parent root = fxmlLoader.load();
                        EventdashboardController controller = fxmlLoader.getController();
                        controller.setter(eventmanager);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setScene(new Scene(root));
                        stage.setTitle("Event Manager Dashboard");
                        stage.show();
                        return;
                    }
                }
                break;

            case 5:
                // Log in as Fahim 1
                break;

            case 6:
                // Log in as Fahim 2
                break;

            case 7:
                // Log in as Ornob 1
                break;

            case 8:
                // Log in as Ornob 2
                break;

            case 9:
                // Log in as Tuhin 1
                break;

            case 10:
                // Log in as Tuhin 2
                break;

            default:
                erroralert.setTitle("User ID Error");
                erroralert.setContentText("User ID does not exist");
                erroralert.showAndWait();
        }
    }
}
