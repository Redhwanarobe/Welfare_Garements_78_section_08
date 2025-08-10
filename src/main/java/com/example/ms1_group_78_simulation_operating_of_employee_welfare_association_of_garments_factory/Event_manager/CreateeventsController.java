package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreateeventsController
{
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextField eventtittleTF;
    @javafx.fxml.FXML
    private DatePicker eventdatepickerDP;
    @javafx.fxml.FXML
    private TextField eventtimeTF;


    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void createeventButtonOA(ActionEvent actionEvent) {
        String title,location,time;
        LocalDate date;

        title = eventtittleTF.getText();
        location = locationTF.getText();
        time = eventtimeTF.getText();
        date = eventdatepickerDP.getValue();

        if (title.isEmpty() || location.isEmpty() || time.isEmpty() || date == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill the fields");
            alert.showAndWait();
            return;
        }
        Events events = new Events(title,location,time,date);
        Event_details.addevents(events);
        eventtittleTF.clear();
        locationTF.clear();
        eventtimeTF.clear();
        eventdatepickerDP.setValue(null);
    }
}