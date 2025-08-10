package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AttendanceController
{
    @javafx.fxml.FXML
    private TextField attendees;
    @javafx.fxml.FXML
    private TextField totalinvitedTF;
    @javafx.fxml.FXML
    private ComboBox<String> choseeventCB;

    @javafx.fxml.FXML
    public void initialize() {
        for (Events events : Event_details.getEventsObservableList()){
            choseeventCB.getItems().add(events.getTitle());
        }

    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
    }
}