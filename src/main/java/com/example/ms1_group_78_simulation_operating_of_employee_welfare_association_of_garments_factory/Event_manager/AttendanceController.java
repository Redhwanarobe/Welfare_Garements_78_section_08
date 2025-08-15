package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AttendanceController
{
    @javafx.fxml.FXML
    private ComboBox<String> choseeventCB;
    @javafx.fxml.FXML
    private TextField attendeesTF;

    @javafx.fxml.FXML
    public void initialize() {
        for (Events events : Event_details.getEventsObservableList()){
            choseeventCB.getItems().add(events.getTitle());
        }

    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        String selectevent = choseeventCB.getValue();
        String attendance = attendeesTF.getText();

        if (selectevent == null || attendance.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Give the informations.");
            return;
        }
        int attendace_count = Integer.parseInt(attendance);
        for (Events e : Event_details.getEventsObservableList()) {
            if (e.getTitle().equals(selectevent)) {
                e.setAttendance(attendace_count);
                break;
            }
        }
        choseeventCB.setValue(null);
        attendeesTF.clear();
    }
}