<<<<<<< HEAD
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager.Eventmanager;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor.legalAdvisor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
=======
package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

<<<<<<< HEAD
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
=======
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.MemberDashboard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
>>>>>>> bac2c5ac16efb75a17f17635f00b30975a9fd8eb
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;

<<<<<<< HEAD
import static jdk.internal.org.jline.utils.Colors.s;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
=======
public class LoginController {
    @FXML
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d
    private TextField loginUseridTF;
<<<<<<< HEAD
    @javafx.fxml.FXML
    private PasswordField loginPasswordTF;
=======
    @FXML
    private TextField loginPasswordTF;
>>>>>>> bac2c5ac16efb75a17f17635f00b30975a9fd8eb


<<<<<<< HEAD

    ObservableList<legalAdvisor> leglAdviorObservableList = FXCollections.observableArrayList();

    ObservableList<Eventmanager> eventmanagerObservableList = FXCollections.observableArrayList();
    @javafx.fxml.FXML



    public void initialize() {


        legalAdvisor legalAdvisor =new legalAdvisor("legal","01518689473","legal@gmail.com","Chandpur","1234",LocalDate.of(2000,7,16)) ;





    }
}




        Eventmanager eventmanager = new Eventmanager("Eventmanager","01855456","event@gmail.com","Basundhara","123456",LocalDate.of(1990,2,22));
        eventmanagerObservableList.add(eventmanager);



=======
    ObservableList<MemberDashboard> memberDashboardObservableList =FXCollections.observableArrayList();
    @FXML
    private AnchorPane anchorpane;


    @FXML
    public void initialize() {


    }

<<<<<<< HEAD


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
=======
    @FXML
    public void signupButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/CreateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Member Dashboard");
        stage.show();
    }
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d

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
<<<<<<< HEAD

            if (id.length() == 5) {
                    //login as a trainingcoordinator


                }
            }


                if (id.length() ==7) {
                // login as a legalAdvisor


                    for (legalAdvisor legalAdvisor : legalAdvisorObservableList){
                        if (legalAdvisor.login(id,password)){
                            Parent root = null;
                            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Legal_Advisor/assistCompansation.fxml"));
                            root = fxmlLoader.load();
                            Scene scene = new Scene(root);
                            Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                            stage.setScene(scene);
                            stage.setTitle("Admin Dashboard");
                            stage.show();
            }

                if(id.length() ==5) {
                // login as a Medical Officer

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
=======
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
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d

>>>>>>> bac2c5ac16efb75a17f17635f00b30975a9fd8eb
