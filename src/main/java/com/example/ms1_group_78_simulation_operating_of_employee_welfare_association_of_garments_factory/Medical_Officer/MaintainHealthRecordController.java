package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MaintainHealthRecordController
{
    @javafx.fxml.FXML
    private Label filenameLabel;
    @javafx.fxml.FXML
    private TableColumn<MaintainHealthRecordClass,String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<MaintainHealthRecordClass,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<MaintainHealthRecordClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<MaintainHealthRecordClass,String> employeeIdCol;
    @javafx.fxml.FXML
    private TextField IdTextField;

    ObservableList<Employee>employeeList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    private TableView tableViewFxid;

    @javafx.fxml.FXML
    public void initialize() {
        employeeIdCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("Department"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));

        employeeList.add(new Employee("0001","fahim","Hr","Healthy"));
        employeeList.add(new Employee("0002","noman","Finance","Under Treatment"));
        employeeList.add(new Employee("0003","fahim","Production","Healthy"));

        tableViewFxid.setItems(employeeList);







    }

    @javafx.fxml.FXML
    public void searchButtonOA(ActionEvent actionEvent) {
        String


          if(SearchIdField.isCache()) {
        tableViewFxid.setItems(employeeList);
        return;
          }
          ObservableList<Employee>filteredList =FXCollections.observableArrayList();
          for (Employee employee : employeeList)
              if (employee.ge)

        }

    }

    @javafx.fxml.FXML
    public void returnHomeButtonOA(ActionEvent actionEvent) {


    }

@javafx.fxml.FXML
private Label filenameLabel;
@javafx.fxml.FXML
private TableView tableViewFxid;
@javafx.fxml.FXML
private TableColumn departmentCol;
@javafx.fxml.FXML
private TableColumn statusCol;
@javafx.fxml.FXML
private TableColumn nameCol;
@javafx.fxml.FXML
private TableColumn employeeIdCol;

@javafx.fxml.FXML
public void searchButtonOA(ActionEvent actionEvent) {
}

@javafx.fxml.FXML
private TextField SearchIdField;


