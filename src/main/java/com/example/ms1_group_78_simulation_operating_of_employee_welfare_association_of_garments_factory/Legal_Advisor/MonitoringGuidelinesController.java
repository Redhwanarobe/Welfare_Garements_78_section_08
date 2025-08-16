package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MonitoringGuidelinesController
{
    @javafx.fxml.FXML
    private TableColumn<MonitoringGuidelinesClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<MonitoringGuidelinesClass,String> AsignedOfficerOA;
    @javafx.fxml.FXML
    private TableColumn<MonitoringGuidelinesClass,String> idCol;
    @javafx.fxml.FXML
    private TableColumn<MonitoringGuidelinesClass,String> deadlineCol;
    @javafx.fxml.FXML
    private TableColumn<MonitoringGuidelinesClass,String> decriptionCol;
    @javafx.fxml.FXML
    private TextArea reviewTextarea;

    ArrayList<MonitoringGuidelinesClass> monitoringGuidelinesClasses;


    @javafx.fxml.FXML
    public void initialize() {
        monitoringGuidelinesClasses =new ArrayList<>();
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("requirment"));
        decriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        deadlineCol.setCellValueFactory(new PropertyValueFactory<>("Deadline"));
        AsignedOfficerOA.setCellValueFactory(new PropertyValueFactory<>("Assigned"));

    }

    @javafx.fxml.FXML
    public void submitAndReviewOA(ActionEvent actionEvent) {
            if(reviewTextarea ==  null) ;
               reviewTextarea.setText("Sucessfull");

    }

    @javafx.fxml.FXML
    public void ReturnHomeButtonOA(ActionEvent actionEvent) {
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
    public void ReviwButtonOA(ActionEvent actionEvent) {
//          ArrayList(new MonitoringGuidelinesClass("Id","Requirement","Decription","Deadline","Assigned Officer"));
//
    }
}