package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DevelopmentTrainingController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TextField objectiveTextField;
    @javafx.fxml.FXML
    private TextField topicTextField;
    @javafx.fxml.FXML
    private AnchorPane successfullLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void returnOA(ActionEvent actionEvent) {
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
    public void SubmitOA(ActionEvent actionEvent) {
        String title = titleTextField.getText().trim();
        String topic = topicTextField.getText().trim();
        String objective = objectiveTextField.getText().trim();

        if (title.isEmpty()) ;
        if (topic.isEmpty()) ;
        if (title.isEmpty()) ;



        showAlert(Alert.AlertType.INFORMATION, "Success", "Modiule Create successfully");
        titleTextField.clear();
        topicTextField.clear();
        objectiveTextField.clear();


        }
        private void showAlert(Alert.AlertType alertType,String title,String message){
        Alert alert =new
                Alert(alertType);
        alert.setAlertType(Alert.AlertType.valueOf(title));
        alert.setContentText(null);
        alert.setContentText(message);
        alert.showAndWait();


    }

    @javafx.fxml.FXML
    public void createOA(ActionEvent actionEvent) {
        String Title,Topic,Objective;

        Title = titleTextField.getText();
        Topic = topicTextField.getText();
        Objective =objectiveTextField.getText();


    }
}