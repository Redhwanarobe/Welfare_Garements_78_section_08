package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;


public class transactionHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<AllocateFundModel, Integer> amountCol;
    @javafx.fxml.FXML
    private TableColumn<AllocateFundModel, String> categoryCol;
    @javafx.fxml.FXML
    private TextField filterAmount;
    @javafx.fxml.FXML
    private TableView<AllocateFundModel> historyTableView;

    @javafx.fxml.FXML
    public void initialize() {
        categoryCol.setCellValueFactory(new PropertyValueFactory<AllocateFundModel, String>("category"));
        amountCol.setCellValueFactory(new PropertyValueFactory<AllocateFundModel, Integer>("amount"));
    }

    @FXML
    public void historyButton(ActionEvent actionEvent) throws IOException{
        ArrayLists.fundArrayList.clear();
        historyTableView.getItems().clear();
        File file = new File("data/fund_allocations.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                AllocateFundModel allocation = (AllocateFundModel) ois.readObject();
                ArrayLists.fundArrayList.add(allocation);
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }

        historyTableView.getItems().addAll(ArrayLists.fundArrayList);


    }


    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {
        String filterText = filterAmount.getText().trim();

        if (filterText.isEmpty()) {
            historyTableView.getItems().setAll(ArrayLists.fundArrayList);
            return;
        }

        int filterValue = Integer.parseInt(filterText);
        ArrayList<AllocateFundModel> filteredList = new ArrayList<>();
        for (AllocateFundModel a : ArrayLists.fundArrayList) {
            if (a.getAmount() == filterValue) {
                filteredList.add(a);
            }
        }

        historyTableView.getItems().setAll(filteredList);
        filterAmount.clear();

    }
}