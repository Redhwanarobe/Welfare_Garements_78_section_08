package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private TextField loginPasswordTF;


    @javafx.fxml.FXML
    public void initialize() {
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

        if (flag) {
            if (id.length() == 4) {
//             login as event manager
            } else if (id.length() == 5) {
                // log in as fahim 1
            } else if (id.length() == 6) {
                // login fahim2
            } else if (id.length() == 7) {

            } else {

                erroralert.setTitle("User ID Error");
                erroralert.setContentText("User ID does not exist");
                erroralert.showAndWait();
            }
        }

    }
}
    //        if(id.length() == 3 ){
//            // log in as a member
//        }
//        else if(id.length()== 4){
//            // login as a president
//        }
//        else {
//            erroralert.setTitle("user id error");
//            erroralert.setTitle("user id do not exits");
//            erroralert.showAndWait();
//        }
//        /*if (flag) {
//            if (id.length() == 4) {
//                //login as an event manager
//
//                for (Eventmanager eventmanager : eventmanagerObservableList){
//                    if (eventmanager.login(id,password) != null){
//                        Parent root = null;
//                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/eventdashboard.fxml"));
//                        root = fxmlLoader.load();
//                        EventdashboardController eventdashboardController = fxmlLoader.getController();
//                        eventdashboardController.setter(eventmanager);
//                        Scene scene = new Scene(root);
//                        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
//                        stage.setScene(scene);
//                        stage.setTitle("Admin Dashboard");
//                        stage.show();
//                    }
//                }

