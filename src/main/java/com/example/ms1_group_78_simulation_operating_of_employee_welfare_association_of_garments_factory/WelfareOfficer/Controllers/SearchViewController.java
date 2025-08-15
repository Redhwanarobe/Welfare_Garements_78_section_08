package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class SearchViewController {
    @FXML
    private TableColumn<Employee, String> phnCol;
    @FXML
    private TableColumn<Employee, String> addressCol;
    @FXML
    private TableColumn<Employee, String> idCol;
    @FXML
    private TableColumn<Employee, String> nameCol;
    @FXML
    private TableView<Employee> tableViewSearch;
    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private TableColumn<Employee, String> genderCol;

    @FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Trans");

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        phnCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
    }

    @FXML
    public void searchButton(ActionEvent actionEvent) {
        String selectedGender = genderComboBox.getValue();
        tableViewSearch.getItems().clear();

        if (selectedGender == null || selectedGender.isEmpty()) {
            tableViewSearch.getItems().addAll(ArrayLists.employeeArrayList);
            return;
        }

        for (Employee user : ArrayLists.employeeArrayList) {
            if (user.getGender() != null && user.getGender().equalsIgnoreCase(selectedGender)) {
                tableViewSearch.getItems().add(user);
            }
        }
    }

    @FXML
    public void loadTable(ActionEvent actionEvent) throws IOException {
        ArrayLists.employeeArrayList.clear();
        tableViewSearch.getItems().clear();

        File file = new File("data/users/Member.bin");
        if (!file.exists()) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return;
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                Employee user = (Employee) ois.readObject();
                ArrayLists.employeeArrayList.add(user);
            }

        } catch (EOFException eof) {
            System.out.println("End of file reached");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        tableViewSearch.getItems().addAll(ArrayLists.employeeArrayList);
    }
}
