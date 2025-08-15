package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.MemberDashboard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class LoginController {
    @FXML
    private TextField loginUseridTF;
    @FXML
    private TextField loginPasswordTF;


    ObservableList<MemberDashboard> memberDashboardObservableList =FXCollections.observableArrayList();
    @FXML
    private AnchorPane anchorpane;


    @FXML
    public void initialize() {


    }

    @FXML
    public void signupButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/CreateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Member Dashboard");
        stage.show();
    }

    @FXML
    public void forgetpassworfButtonOA(ActionEvent actionEvent) {
        // TODO: Implement forgot-password logic
    }

    @FXML
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
            } else if (id.length() == 3) {
                // login fahim2
            }
            else if (id.length() == 6) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/memberDashboard-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Member Dashboard");
                stage.show();


        }
            else if (id.length() == 9){
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/presidentDashboard.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("PresientDashbord");
                stage.show();

            }
            else {

                erroralert.setTitle("User ID Error");
                erroralert.setContentText("User ID does not exist");
                erroralert.showAndWait();
            }
        }

    } }

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

