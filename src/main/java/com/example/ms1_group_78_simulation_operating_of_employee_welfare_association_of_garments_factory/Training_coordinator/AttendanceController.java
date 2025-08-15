package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AttendanceController
{
    @javafx.fxml.FXML
    private TextField attendeesTA;
    @javafx.fxml.FXML
    private ComboBox<String> selectCB;

    @javafx.fxml.FXML
    public void initialize() {
        for (Program program : Programdetails.getProgramObservableList()){
            selectCB.getItems().add(program.getTitle());
        }
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
        String selectprogram = selectCB.getValue();
        String attendance = attendeesTA.getText();

        if (selectprogram == null || attendance.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Give the informations correctly.");
            return;
        }
        int attendance_count = Integer.parseInt(attendance);
        for (Program p : Programdetails.getProgramObservableList()){
            if (p.getTitle().equals(selectprogram)){
                p.setAttendance(attendance_count);
                break;
            }

        }

    }
}