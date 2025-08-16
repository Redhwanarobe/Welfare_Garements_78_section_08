package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApproveMember_AidController
{
    @javafx.fxml.FXML
    private TableColumn <>p3col1;
    @javafx.fxml.FXML
    private TableColumn p3col2;
    @javafx.fxml.FXML
    private TableView <Financial_Aid>p3table;
    @javafx.fxml.FXML
    private TableColumn p3col3;
    @javafx.fxml.FXML
    private TableColumn p3col4;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @Deprecated
    public void p3denyOA(ActionEvent actionEvent) {
        p3col1.setCellValueFactory(new PropertyValueFactory<>("id"));
        p3col2.setCellValueFactory(new PropertyValueFactory<>("name"));
        p3col3.setCellValueFactory(new PropertyValueFactory<>("description"));
        p3col4.setCellValueFactory(new PropertyValueFactory<>("subject"));
    }

    @javafx.fxml.FXML
    public void p3acceptOA(ActionEvent actionEvent) {


    }
}