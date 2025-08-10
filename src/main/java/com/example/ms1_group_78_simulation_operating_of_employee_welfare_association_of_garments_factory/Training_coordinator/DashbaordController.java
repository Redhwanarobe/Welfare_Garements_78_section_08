package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class DashbaordController
{
    @javafx.fxml.FXML
    private VBox vbox;
    @javafx.fxml.FXML
    private AnchorPane anchorphane;
    @javafx.fxml.FXML
    private BorderPane borderphane;
    @javafx.fxml.FXML
    private TextArea dashboardTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void attendanceButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/Attendance.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void budgetButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/Budgetallocation.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void upmaterialsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/Materials.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void assignguestsperakerOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/Assignguestspeaker.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void createprogrammsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/createprgram.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void programmsinfoButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/programs.fxml"));
        borderphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void givrfeedbackButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void assigntrainerButtomOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signoutButtonOA(ActionEvent actionEvent) {
    }
}