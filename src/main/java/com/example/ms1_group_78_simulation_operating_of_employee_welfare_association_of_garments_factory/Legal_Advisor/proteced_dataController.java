package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class proteced_dataController
{
    @javafx.fxml.FXML
    private TextArea textAreafxid;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private Label messageLavel;

    @javafx.fxml.FXML
    public void initialize() {
        departmentComboBox.getItems().addAll("Legal Advisor","Medical Officer","Financial Officer","Training Cordinator","Event Manager","Union Leader","Wealfare Assosiation","Member");
    }

    @javafx.fxml.FXML
    public void returnHomeOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Legal_Advisor/LegalAdvisor_Dashbboard.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage =new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void submitReportOA(ActionEvent actionEvent) {
         if(textAreafxid == null) {
             messageLavel.setText("Text feild is Empty");
    }
}
    }