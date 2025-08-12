package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.MemberDashboard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javax.xml.namespace.QName;
import java.lang.reflect.Member;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField loginUseridTF;
    @javafx.fxml.FXML
    private TextField loginPasswordTF;



    ObservableList <MemberDashboard> memberDashboardObservableList =FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        MemberDashboard memberDashboard = new MemberDashboard ();

    }

    @javafx.fxml.FXML
    public void signupButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {
        String id, password;
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);



        id = loginUseridTF.getText();
        password = loginPasswordTF.getText();

        if(id.isBlank()){
            flag =false;
            erroralert.setTitle("User Id error");
            erroralert.setContentText("User Id can not be blank");
            erroralert.showAndWait();
        }
        if (id.isBlank()){
            flag =false;
            erroralert.setTitle("password error");
            erroralert.setContentText("Password can not be blank");
            erroralert.showAndWait();
        }

        if(flag){
            if(id.length()== 10) {
                //login as a member
            }
            else if(id.length()== 11) {
                //login as a president
            }
            else {
                erroralert.setTitle("password error");
                erroralert.setContentText("Password can not be blank");

            }
        }



    }

    @javafx.fxml.FXML
    public void forgetpassworfButtonOA(ActionEvent actionEvent) {
    }
}