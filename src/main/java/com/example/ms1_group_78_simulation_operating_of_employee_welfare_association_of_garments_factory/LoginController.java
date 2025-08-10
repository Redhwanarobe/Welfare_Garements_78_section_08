//package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;
//
//import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.EventdashboardController;
//import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.Eventmanager;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.time.LocalDate;
//
//public class LoginController
//{
//    @javafx.fxml.FXML
//    private TextField loginUseridTF;
//    @javafx.fxml.FXML
//    private TextField loginPasswordTF;
//
//
//
//    ObservableList<Eventmanager> eventmanagerObservableList = FXCollections.observableArrayList();
//    @javafx.fxml.FXML
//    public void initialize() {
//        Eventmanager eventmanager = new Eventmanager("Event manager","01254451","event@gmail.com","bashundhara","1111",LocalDate.of(1990,4,4));
//        eventmanagerObservableList.add(eventmanager);
//    }
//
//    @javafx.fxml.FXML
//    public void signupButtonOA(ActionEvent actionEvent) {
//    }
//
//    @javafx.fxml.FXML
//    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
//        String id, password;
//        boolean flag = true;
//
//        Alert erroralert = new Alert(Alert.AlertType.ERROR);
//
//        id = loginUseridTF.getText();
//        password = loginPasswordTF.getText();
//
//        if(id.isBlank()){
//            flag = false;
//            erroralert.setTitle("user id errod");
//            erroralert.setTitle("User id can not be blank");
//            erroralert.showAndWait();
//
//
//
//        }
//        if(password.isBlank()){
//            flag =false;
//            erroralert.setTitle("password id error");
//            erroralert.setTitle("password can not be blank");
//            erroralert.showAndWait();
//        }
//        if (flag){
//            if(id.length() == 3 ){
//                // log in as a member
//            }
//            else if(id.length()== 4){
//                // login as a president
//            }
//            if(id.length() == 5 ){
//                // log in as fahim 1
//            }
//            else if(id.length()== 6){
//                // login fahim2
//            }
//            if(id.length() == 7 ){
//                // log in as ornob1
//            }
//            else if(id.length()== 8){
//                // login as a ornob2
//            }
//            if(id.length() == 9 ){
//                // log in as tuhin 1
//            }
//            else if(id.length()== 10){
//                // login as a tuhin 2
//            }
//            else {
//                erroralert.setTitle("user id error");
//                erroralert.setTitle("user id do not exits");
//                erroralert.showAndWait();
//            }
//
//        }
//
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
//
//    }
//
//
//    @javafx.fxml.FXML
//    public void forgetpassworfButtonOA(ActionEvent actionEvent) {
//    }
//}