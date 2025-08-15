package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.text.BreakIterator;

public class MediateConflictController
{
    @javafx.fxml.FXML
    private TableView<MediateConflictClass> tableViewfxid;
    @javafx.fxml.FXML
    private TableColumn<MediateConflictClass,String> StatusCol;
    @javafx.fxml.FXML
    private TableColumn<MediateConflictClass,String> submittedOnCol;
    @javafx.fxml.FXML
    private TableColumn<MediateConflictClass,String> caseIdCol;
    @javafx.fxml.FXML
    private DatePicker datepickerButton;
    @javafx.fxml.FXML
    private TableColumn<MediateConflictClass,String> IssueCol;
    @javafx.fxml.FXML
    private TextField identryTextfield;
    @javafx.fxml.FXML
    private TableColumn<MediateConflictClass,String> EmployeeNameCol;
    @javafx.fxml.FXML
    private TextArea getTextArea;

    private ObservableList<MediateConflictClass>mediateConflictClasses;

    @javafx.fxml.FXML
    public void initialize() {
        caseIdCol.setCellValueFactory(new PropertyValueFactory<MediateConflictClass,String>("Caseid"));
        EmployeeNameCol.setCellValueFactory(new PropertyValueFactory<MediateConflictClass,String>("Name"));
        IssueCol.setCellValueFactory(new PropertyValueFactory<MediateConflictClass,String>("Summary"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<MediateConflictClass,String>("status"));
        submittedOnCol.setCellValueFactory(new PropertyValueFactory<MediateConflictClass,String>("dob"));


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
    public void addOutComeOA(ActionEvent actionEvent) {
        String
            if(getTextArea== null) {
                getTextArea.setText("Text field is Empty");
            }
    }

    @javafx.fxml.FXML
    public void conflictCaseOA(ActionEvent actionEvent) {
        mediateConflictClasses= FXCollections.observableArrayList(new MediateConflictClass("001","Fahim","Workplace dispue","pending","20-10-24"));


    }
}