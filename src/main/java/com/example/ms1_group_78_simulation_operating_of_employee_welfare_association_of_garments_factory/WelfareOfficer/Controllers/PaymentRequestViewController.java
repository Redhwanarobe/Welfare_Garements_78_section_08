package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.paymentMenuModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.*;

public class PaymentRequestViewController {
    @FXML
    private TextField pensionField;
    @FXML
    private ComboBox<String> userComboBox;
    @FXML
    private TextField insuranceField;
    @FXML
    private TextField monthlyEarningField;

    @FXML
    public void initialize() throws IOException{
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
                            if (!user.getUserRole().equals("Member")) {
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
            userComboBox.getItems().add(user.getUserID() + " - " + user.getUserName() + " - " + user.getUserRole());
        }

    }

    @FXML
    public void requestPaymentButton(ActionEvent actionEvent) throws IOException{
        String monthlyEarnings = monthlyEarningField.getText();
        String healthInsurance = insuranceField.getText();
        String pension = pensionField.getText();
        String selectedUser = userComboBox.getValue();

        if (selectedUser == null || selectedUser.isEmpty() ||
                monthlyEarnings.isEmpty() || healthInsurance.isEmpty() || pension.isEmpty()) {
            AlertHelper.showAlert("Error", "Please fill in all fields and select a user.", Alert.AlertType.ERROR);
            return;
        }

        String[] parts = selectedUser.split(" - ");
        String id = parts[0];
        String name = parts[1];
        String role = parts[2];

        Integer monthlyEarningsInt = Integer.parseInt(monthlyEarnings);
        Integer healthInsuranceInt = Integer.parseInt(healthInsurance);
        Integer pensionInt = Integer.parseInt(pension);

        paymentMenuModel payment = new paymentMenuModel(id, name, role, monthlyEarningsInt, healthInsuranceInt, pensionInt);

        File paymentFile = new File ("data/payment_requests.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        if(paymentFile.exists()){
            fos =  new FileOutputStream(paymentFile, true);
            oos = new AppendableObjectOutputStream(fos);
        }

        else{
            fos = new FileOutputStream(paymentFile, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(payment);
        oos.close();

        ArrayLists.paymentArrayList.add(payment);

        AlertHelper.showAlert("Success", "Payment Request Send", Alert.AlertType.INFORMATION);

        monthlyEarningField.clear();
        insuranceField.clear();
        pensionField.clear();
    }
}