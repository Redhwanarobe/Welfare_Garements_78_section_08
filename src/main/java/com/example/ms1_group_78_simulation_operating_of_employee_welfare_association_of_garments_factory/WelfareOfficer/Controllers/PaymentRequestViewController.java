package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.paymentMenuModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.*;

public class PaymentRequestViewController {

    @javafx.fxml.FXML
    private TextField pensionField;
    @javafx.fxml.FXML
    private TextField insuranceField;
    @javafx.fxml.FXML
    private TextField monthlyEarningField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox1;
    @javafx.fxml.FXML
    private ComboBox<String> userComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox1.getItems().addAll(
                "Union Leader",
                "Medical Officer",
                "Legal Advisor",
                "Event Manager",
                "Training Co-ordinator"
        );

        userComboBox.getItems().clear();
    }

    @javafx.fxml.FXML
    private void roleSelectButton(ActionEvent actionEvent) {
        String selectedRole = roleComboBox1.getValue();
        if (selectedRole == null || selectedRole.isEmpty()) return;

        ArrayLists.userArrayList.clear();
        userComboBox.getItems().clear();

        File file = new File("data/users/" + selectedRole + ".bin");
        if (!file.exists()) {
            System.out.println("No file found for role: " + selectedRole);
            return;
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                try {
                    User user = (User) ois.readObject();
                    ArrayLists.userArrayList.add(user);
                } catch (EOFException eof) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }

        for (User user : ArrayLists.userArrayList) {
            userComboBox.getItems().add(user.getId() + " - " + user.getName());
        }
    }

    @javafx.fxml.FXML
    public void requestPaymentButton(ActionEvent actionEvent) throws IOException {
        String selectedUser = userComboBox.getValue();
        String selectedRole = roleComboBox1.getValue();
        String monthlyEarnings = monthlyEarningField.getText();
        String healthInsurance = insuranceField.getText();
        String pension = pensionField.getText();

        if (selectedUser == null || selectedRole == null || monthlyEarnings.isEmpty() ||
                healthInsurance.isEmpty() || pension.isEmpty()) {
            AlertHelper.showAlert("Error", "Please fill in all fields and select a user.", javafx.scene.control.Alert.AlertType.ERROR);
            return;
        }

        String[] parts = selectedUser.split(" - ");
        String id = parts[0];
        String name = parts[1];
        String role = selectedRole;

        Integer monthlyEarningsInt = Integer.parseInt(monthlyEarnings);
        Integer healthInsuranceInt = Integer.parseInt(healthInsurance);
        Integer pensionInt = Integer.parseInt(pension);

        paymentMenuModel payment = new paymentMenuModel(id, name, role, monthlyEarningsInt, healthInsuranceInt, pensionInt);

        File paymentFile = new File("data/payment_requests.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        if (paymentFile.exists()) {
            fos = new FileOutputStream(paymentFile, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(paymentFile, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(payment);
        oos.close();

        ArrayLists.paymentArrayList.add(payment);

        AlertHelper.showAlert("Success", "Payment Request Sent", javafx.scene.control.Alert.AlertType.INFORMATION);

        monthlyEarningField.clear();
        insuranceField.clear();
        pensionField.clear();
    }
}
