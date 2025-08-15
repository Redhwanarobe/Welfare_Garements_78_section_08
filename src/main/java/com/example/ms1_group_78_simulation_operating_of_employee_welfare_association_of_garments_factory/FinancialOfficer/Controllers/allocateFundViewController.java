package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.*;

public class allocateFundViewController {

    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;

    @javafx.fxml.FXML
    private TextField allocateTextField;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll(
                "President",
                "Event Manager",
                "Training Co-ordinator",
                "Welfare Officer",
                "Medical Officer",
                "Legal Officer"
        );
    }

    @javafx.fxml.FXML
    public void allocateSendButton(ActionEvent event) throws IOException {
        String category = categoryComboBox.getValue();
        String amountStr = allocateTextField.getText().trim();

        if (category == null || category.isEmpty()) {
            AlertHelper.showAlert("Error", "Please select a user to send money.", Alert.AlertType.ERROR) ;
            return;
        }

        if (amountStr.isEmpty()) {
            AlertHelper.showAlert("Error", "Please enter an amount.", Alert.AlertType.ERROR);
            return;
        }


        int amount = Integer.parseInt(amountStr);

        if (amount <= 0) {
            AlertHelper.showAlert("Error", "Amount must be greater than zero.", Alert.AlertType.ERROR);
            return;
        }

        if (!AllocateFundModel.spendFund(amount)) {
            AlertHelper.showAlert("Error", "Insufficient funds.", Alert.AlertType.ERROR);
            return;
        }

        AllocateFundModel allocation = new AllocateFundModel(category, amount);

        File file = new File("data/fund_allocations.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        if (file.exists()){
            fos = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else{
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(allocation);
        oos.close();


        ArrayLists.fundArrayList.add(allocation);
        AlertHelper.showAlert("Error", "Successfully sent", Alert.AlertType.INFORMATION);

        allocateTextField.clear();
        categoryComboBox.getSelectionModel().clearSelection();
    }


}

