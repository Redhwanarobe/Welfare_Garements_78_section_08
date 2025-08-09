package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.event.ActionEvent;
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

    ArrayList<Events> events = new ArrayList<Events>();

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

        Events events1 = new Events(title,location,time,date);
        events.add(events1);
        System.out.println(events);
        events.clear();
    }
}