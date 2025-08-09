package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.Eventmanager;
import javafx.beans.Observable;
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

public class LoginController
{
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private TextField loginPasswordTF;

    Alert alert;

    ObservableList<Eventmanager> eventmanagerObservableList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        Eventmanager eventmanager = new Eventmanager("Eventmanager","01855456","event@gmail.com","Basundhara","123456",LocalDate.of(1990,2,22));
        eventmanagerObservableList.add(eventmanager);
    }

    @javafx.fxml.FXML
    public void signupButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        String id, password;
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);

        id = loginUseridTF.getText();
        password = loginPasswordTF.getText();

        if(id.isBlank()){
            flag = false;
            erroralert.setTitle("User ID Error");
            erroralert.setContentText("User ID can not be blank.");
        }
        if(password.isBlank()){
            flag = false;
            erroralert.setTitle("Password Error");
            erroralert.setContentText("Password can not be blank.");
        }
        if (flag) {
            if (id.length() == 4) {
                //login as a eventmanager

                for (Eventmanager eventmanager : eventmanagerObservableList){
                    if (eventmanager.login(id,password)){
                        Parent root = null;
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/eventdashboard.fxml"));
                        root = fxmlLoader.load();
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                        stage.setScene(scene);
                        stage.setTitle("Admin Dashboard");
                        stage.show();
                    }
                }
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Event_manager/eventdashboard.fxml"));
//                Scene scene = new Scene(fxmlLoader.load());
//                Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//                stage.setTitle("Event manager");
//                stage.setScene(scene);
//                stage.show();
            }
            else if (id.length() == 5) {
                //login as a trainingcoordinator
            }
            else {
                erroralert.setTitle("User Error");
                erroralert.setContentText("User type does not exist.");
            }
        }
    }


    @javafx.fxml.FXML
    public void forgetpassworfButtonOA(ActionEvent actionEvent) {
    }
}