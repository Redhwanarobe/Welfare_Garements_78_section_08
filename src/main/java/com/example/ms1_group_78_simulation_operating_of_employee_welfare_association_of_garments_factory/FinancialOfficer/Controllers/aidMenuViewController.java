package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.aidMenuModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class aidMenuViewController
{
    @javafx.fxml.FXML
    private TableColumn<aidMenuModel, String> memberNameCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ComboBox<String> aidMemberComboBox;
    @javafx.fxml.FXML
    private TableColumn<aidMenuModel, String> memberIdCol;
    @javafx.fxml.FXML
    private TableColumn<aidMenuModel, Integer> approvedAmountCol;
    @javafx.fxml.FXML
    private TableView<aidMenuModel> aidTableView;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        memberIdCol.setCellValueFactory(new PropertyValueFactory<aidMenuModel, String>("id"));
        memberNameCol.setCellValueFactory(new PropertyValueFactory<aidMenuModel, String>("name"));
        approvedAmountCol.setCellValueFactory(new PropertyValueFactory<aidMenuModel, Integer>("amount"));

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
            aidMemberComboBox.getItems().add(user.getId() + " - " + user.getName());
        }
    }

    @javafx.fxml.FXML
    public void approvedButton(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) {
        String amount = amountTextField.getText();
        if (amount.isEmpty()){
            AlertHelper.showAlert("Error", "Please Fill in the amount!", Alert.AlertType.ERROR);
        }



    }
}