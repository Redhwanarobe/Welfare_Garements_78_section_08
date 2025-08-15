package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.Feedbackdetais;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator.Programdetails;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExportFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn p_02_tablecol_01;
    @javafx.fxml.FXML
    private TableColumn p_02_tablecol3;
    @javafx.fxml.FXML
    private TableView tablep;
    @javafx.fxml.FXML
    private TableColumn p_02tablecol4;
    @javafx.fxml.FXML
    private TableColumn p_02tablecol_2;
    @javafx.fxml.FXML
    private TableColumn gender;

    @javafx.fxml.FXML
    public void initialize() {
        p_02_tablecol_01.setCellValueFactory( new PropertyValueFactory<>("memberTF"));
        p_02tablecol_2.setCellValueFactory(new PropertyValueFactory<>("subject_MTF"));
        p_02_tablecol3.setCellValueFactory(new PropertyValueFactory<>("memberTA"));
        p_02tablecol4.setCellValueFactory(new PropertyValueFactory<>("date_M_PIcker"));
        gender.setCellValueFactory(new PropertyValueFactory<>("typeCb"));


        tablep.setItems(Feedbackdetais.getFeedback_to_presidentObservableList());



    }

    @javafx.fxml.FXML
    public void p_02downloadOA(ActionEvent actionEvent) {

    }
}