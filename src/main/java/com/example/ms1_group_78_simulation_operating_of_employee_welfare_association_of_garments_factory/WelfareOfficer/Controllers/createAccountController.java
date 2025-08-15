package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;

public class createAccountController {
    @javafx.fxml.FXML
    private TextField idField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private DatePicker dobField;
    @javafx.fxml.FXML
    private TextField addressField;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Trans");
        roleComboBox.getItems().addAll(
                "Member",
                "Union Leader",
                "Medical Officer",
                "Legal Advisor",
                "Financial Officer",
                "Welfare Officer",
                "Event Manager",
                "Training Co-ordinator"
        );
    }

    public boolean validate(String password, String id, String role) {
        if (password == null || id == null || role == null) {
            return false;
        }

        String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
        boolean validPassword = password.matches(passwordPattern);


        if (!id.matches("\\d+")) {
            return false;
        }

        boolean validId = switch (role) {
            case "Member" -> id.length() == 4;
            case "Union Leader" -> id.length() == 5;
            case "Medical Officer" -> id.length() == 6;
            case "Legal Advisor" -> id.length() == 7;
            case "Financial Officer" -> id.length() == 8;
            case "Welfare Officer" -> id.length() == 9;
            case "Event Manager" -> id.length() == 10;
            case "Training Co-ordinator" -> id.length() == 11;
            default -> id.length() >= 4;
        };

        return validPassword && validId;
    }

    @javafx.fxml.FXML
    public void createButton(ActionEvent actionEvent) throws IOException {
        if (nameField.getText().isEmpty()
                || idField.getText().isEmpty()
                || phoneField.getText().isEmpty()
                || addressField.getText().isEmpty()
                || passwordField.getText().isEmpty()
                || dobField.getValue() == null
                || genderComboBox.getValue() == null
                || roleComboBox.getValue() == null) {
            messageLabel.setText("Please fill in all the fields.");
            messageLabel.setStyle("-fx-text-fill: red");
            return;
        }

        String id = idField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue();
        String name = nameField.getText();
        String dob = dobField.getValue().toString();
        String address = addressField.getText();
        String phone = phoneField.getText();
        String gender = genderComboBox.getValue();

        if (!validate(password, id, role)) {
            messageLabel.setText("Invalid input: Password or ID does not meet requirements for role " + role);
            messageLabel.setStyle("-fx-text-fill: red");
            return;
        }

        User user = new Employee(name, id, phone, address, password, dob, gender, role);



        File dir = new File("data/users");
        dir.mkdirs();
        File filePath = new File(dir, role + ".txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write("ID: " + id + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("Role: " + role + "\n");
            writer.write("--------------------------------------------------\n");
            writer.close();
        } catch(IOException e){
            //
        }

        File file = new File("data/users/" + role + ".bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()){
            fos =  new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        }

        else{
            fos = new FileOutputStream(file, false);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(user);
        oos.close();

        ArrayLists.userArrayList.add(user);
        messageLabel.setText("Account created successfully!");
        messageLabel.setStyle("-fx-text-fill: green");

        idField.clear();
        nameField.clear();
        passwordField.clear();
        dobField.setValue(null);
        roleComboBox.getSelectionModel().clearSelection();
        genderComboBox.getSelectionModel().clearSelection();
        phoneField.clear();
        addressField.clear();
    }
}
