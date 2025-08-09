package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class EventdashboardController
{
    @javafx.fxml.FXML
    private TextArea eventmanagerInfoTA;
    @javafx.fxml.FXML
    private AnchorPane ancorphane;
    @javafx.fxml.FXML
    private VBox vbox;
    @javafx.fxml.FXML
    private BorderPane bordarphane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventlistButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Eventlist.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void createeventButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Createevents.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void promoteeventButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Promoteevent.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void budgetallocationButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Budgetallocation.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void assignguardButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Assignsecurityguards.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void assigncomanagerButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Assigncomanager.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void attendenceButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Attendance.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void sendreminderButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event_manager/Sendreminder.fxml"));
        bordarphane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void signoutButtonOa(ActionEvent actionEvent) {
    }
}