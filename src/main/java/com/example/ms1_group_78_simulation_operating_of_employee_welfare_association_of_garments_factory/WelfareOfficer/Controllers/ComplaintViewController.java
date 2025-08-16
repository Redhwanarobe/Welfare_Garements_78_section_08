package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models.complaintModel;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class ComplaintViewController
{
    @javafx.fxml.FXML
    private TableColumn<complaintModel, String> idCol;
    @javafx.fxml.FXML
    private TableColumn<complaintModel, String>  statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> memberComboBox;
    @javafx.fxml.FXML
    private TableView<complaintModel>  complainTableView;
    @javafx.fxml.FXML
    private DatePicker daP;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        ArrayLists.userArrayList.clear();
        idCol.setCellValueFactory(new PropertyValueFactory<>("member"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        File file = new File("data/users/Member.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                User user = (User) ois.readObject();
                ArrayLists.userArrayList.add(user);
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }
        for (User user : ArrayLists.userArrayList) {
            memberComboBox.getItems().add("ID: " + user.getId() + "\nName: "  + user.getName());

        }


        statusComboBox.getItems().addAll("Pending", "Completed");

    }


    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {
        complainTableView.getItems().clear();

        String selectedMember = memberComboBox.getValue();
        String selectedStatus = statusComboBox.getValue();

        if (selectedMember == null || selectedStatus == null) return;



        complaintModel complaint = new complaintModel(selectedMember,selectedStatus);
        complaint.setMember(selectedMember);
        complaint.setStatus(selectedStatus);

        complainTableView.getItems().add(complaint);
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        LocalDate selectedDate = daP.getValue();
        if (selectedDate == null) {
            AlertHelper.showAlert("Error", "DatePicker is empty", Alert.AlertType.ERROR);
        }

        else {
            AlertHelper.showAlert("Successful", "Appointement created on " + selectedDate.toString(), Alert.AlertType.INFORMATION);
        }
    }
}