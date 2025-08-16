package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;

public class viewRequestsController
{

    @javafx.fxml.FXML
    private Label FundLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException {
        File file = new File("data/fund_allocations.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        if (!file.exists()) {
            FundLabel.setText("No allocations yet.");
            return;
        }

        String statusMessage = "Category Fund Status:\n";

        try {
            while (true) {
                AllocateFundModel allocation = (AllocateFundModel) ois.readObject();
                double remaining = AllocateFundModel.getTotalFund();
                String categoryStatus;
                int amount = allocation.getAmount();
                if (amount > 5000) {
                    categoryStatus = "Healthy";
                    FundLabel.setStyle("-fx-text-fill: green");
                } else if (amount >= 2000) {
                    categoryStatus = "Moderate";
                    FundLabel.setStyle("-fx-text-fill: orange");

                } else {
                    categoryStatus = "Low";
                    FundLabel.setStyle("-fx-text-fill: red");

                }

                statusMessage += allocation.getCategory() + ": " + categoryStatus + "\n";

            }
        } catch (EOFException e) {
            System.out.println("throw new RuntimeException");
        } catch(ClassNotFoundException c){
            System.out.println("class not found");
        }

        FundLabel.setText(statusMessage);
    }

}