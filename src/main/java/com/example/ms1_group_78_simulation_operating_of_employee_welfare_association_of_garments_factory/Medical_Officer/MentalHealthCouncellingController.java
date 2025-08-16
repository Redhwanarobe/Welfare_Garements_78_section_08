package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MentalHealthCouncellingController
{
    @javafx.fxml.FXML
    private TableColumn<MentalHealthCouncellingClass,String> caseNoCol;
    @javafx.fxml.FXML
    private TableColumn<MentalHealthCouncellingClass,String> IdCol;
    @javafx.fxml.FXML
    private TableColumn<MentalHealthCouncellingClass,String> nameCol;
    @javafx.fxml.FXML
    private TableView<MentalHealthCouncellingClass> tableView;
    @javafx.fxml.FXML
    private TableColumn<MentalHealthCouncellingClass,String> reviewsCol;

    ObservableList<MentalHealthCouncellingClass> mentalHealthCouncellingClass = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        IdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        caseNoCol.setCellValueFactory(new PropertyValueFactory<>("caseNo"));
        reviewsCol.setCellValueFactory(new PropertyValueFactory<>("reviews"));

    }


    @javafx.fxml.FXML
    public void closeSessionButtonOA(ActionEvent actionEvent) {
        showAlert("Close Session","follow update");
    }

    @javafx.fxml.FXML
    public void enterSessionButtonOA(ActionEvent actionEvent) {





    }
    public void showAlert(String title,String message){
        Alert alert=new
                Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void startCouncellingButtonOA(ActionEvent actionEvent) {
        mentalHealthCouncellingClass.clear();
        mentalHealthCouncellingClass.addAll(new MentalHealthCouncellingClass("001","Fahim","100","Need Stress Councelling"));
        mentalHealthCouncellingClass.addAll(new MentalHealthCouncellingClass("002","Nazmul","200","Depression Sympoms"));
        showAlert("Councelling Session","successfully");

    }
}