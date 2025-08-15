package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.paymentMenuModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class paymentMenuViewController {
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, Integer> earningcol;
    @javafx.fxml.FXML
    private TextField filterEarningField;
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, String> idcol;
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, Integer> insurancecol;
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, String> namecol;
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, String> rolecole;
    @javafx.fxml.FXML
    private TextField retireFundField;
    @javafx.fxml.FXML
    private TextField filterInsuranceField;
    @javafx.fxml.FXML
    private TableView<paymentMenuModel> paymentTableView;
    @javafx.fxml.FXML
    private ComboBox<String> filterusercombobox;
    @javafx.fxml.FXML
    private TableColumn<paymentMenuModel, Integer> retirefundcol;

    @javafx.fxml.FXML
    public void initialize() {
        idcol.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, String>("id"));
        namecol.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, String>("name"));
        rolecole.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, String>("role"));
        earningcol.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, Integer>("monthlyEarnings"));
        insurancecol.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, Integer>("healthInsurance"));
        retirefundcol.setCellValueFactory(new PropertyValueFactory<paymentMenuModel, Integer>("retireFund"));

        ArrayLists.userArrayList.clear();
        File folder = new File("data/users");
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            return;
        }

        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".bin")) {
                try (FileInputStream fis = new FileInputStream(f);
                     ObjectInputStream ois = new ObjectInputStream(fis)) {

                    while (true) {
                        try {
                            User user = (User) ois.readObject();
                            if (!user.getRole().equals("Member")) {
                                ArrayLists.userArrayList.add(user);
                            }
                        } catch (EOFException eof) {
                            break;
                        }
                    }

                } catch (IOException | ClassNotFoundException e) {
                    //
                }
            }
        }
        for (User user : ArrayLists.userArrayList) {
            filterusercombobox.getItems().add(user.getId() + " - " + user.getName() + " - " + user.getRole());
        }
    }


    @javafx.fxml.FXML
    public void requestButton(ActionEvent actionEvent) throws IOException{
        ArrayLists.paymentArrayList.clear();
        paymentTableView.getItems().clear();

        File file = new File("data/payment_requests.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                paymentMenuModel payment = (paymentMenuModel) ois.readObject();
                ArrayLists.paymentArrayList.add(payment);
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }

        paymentTableView.getItems().addAll(ArrayLists.paymentArrayList);
    }

    @javafx.fxml.FXML
    public void paymentButton(ActionEvent actionEvent) {
        String earning = filterEarningField.getText();
        String insurance = filterInsuranceField.getText();
        String pension = retireFundField.getText();
        String selectedUser = filterusercombobox.getValue();

        if (selectedUser == null || earning.isEmpty() || insurance.isEmpty() || pension.isEmpty()) {
            AlertHelper.showAlert("Error", "Please fill in all fields.", Alert.AlertType.ERROR);
            return;
        }

        File file = new File("data/approved_payments.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(selectedUser + "," + earning + "," + insurance + "," + pension);
            writer.newLine();
            System.out.println("Payment recorded successfully.");
        } catch (IOException e) {
            AlertHelper.showAlert("Error", "File did not load because of exception", Alert.AlertType.ERROR);
        }
    }
}