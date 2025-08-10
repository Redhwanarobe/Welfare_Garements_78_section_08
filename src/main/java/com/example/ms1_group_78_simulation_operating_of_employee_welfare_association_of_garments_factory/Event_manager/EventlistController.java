package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class EventlistController
{
    @javafx.fxml.FXML
    private TableColumn<Events, String> timeTC;
    @javafx.fxml.FXML
    private TableColumn<Events, String> eventtitleTC;
    @javafx.fxml.FXML
    private TableColumn<Events, String> locationTC;
    @javafx.fxml.FXML
    private TableView<Events> EventlisttableView;
    @javafx.fxml.FXML
    private TableColumn<Events, LocalDate> dateTC;

    Events events;

    ObservableList<Events> eventsObservableList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        eventtitleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        EventlisttableView.setItems(Event_details.getEventsObservableList());
    }
}