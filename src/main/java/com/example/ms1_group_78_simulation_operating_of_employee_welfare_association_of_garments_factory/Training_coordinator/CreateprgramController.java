package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CreateprgramController
{
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextField timeTF;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TextArea detailsTA;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField titleTF;

    @javafx.fxml.FXML
    public void initialize() {
        typeCB.getItems().setAll("Male","Female","Others");
    }

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {
        String title,location,time,segmant,details;
        LocalDate date;

        title = titleTF.getText();
        location = locationTF.getText();
        time = timeTF.getText();
        segmant = typeCB.getValue();
        details = detailsTA.getText();
        date = dateDP.getValue();

        if ( title.isBlank() || location.isBlank() || time.isBlank() || segmant.isBlank() || details.isBlank() || date == null)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill the fields");
            alert.showAndWait();
            return;
        }
        Program program = new Program( title,location,time,segmant,details,date);
        Programdetails.addprograms(program);
        titleTF.clear();
        locationTF.clear();
        timeTF.clear();
        typeCB.setValue(null);
        detailsTA.clear();
        dateDP.setValue(null);
    }
}