package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.Locale;

public class ProgramsController
{
    @javafx.fxml.FXML
    private TableColumn<Program, String> timeTC;
    @javafx.fxml.FXML
    private TableColumn<Program, String> locationTC;
    @javafx.fxml.FXML
    private TableColumn attendanceTC;
    @javafx.fxml.FXML
    private TableColumn<Program, String> titleTC;
    @javafx.fxml.FXML
    private TableView<Program> tableview;
    @javafx.fxml.FXML
    private TableColumn<Program, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<Program, String> segmantTC;
    @javafx.fxml.FXML
    private TableColumn<Program, String> descriptionTC;

    @javafx.fxml.FXML
    public void initialize() {
        titleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("details"));
        segmantTC.setCellValueFactory(new PropertyValueFactory<>("segmant"));
        attendanceTC.setCellValueFactory(new PropertyValueFactory<>("attendance"));

        tableview.setItems(Programdetails.getProgramObservableList());
    }}