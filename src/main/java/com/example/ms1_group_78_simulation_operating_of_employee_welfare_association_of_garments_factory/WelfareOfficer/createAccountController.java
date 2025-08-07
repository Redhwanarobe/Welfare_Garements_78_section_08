package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class createAccountController
{
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
        roleComboBox.getItems().addAll("Member", "Union Leader", "Medical Officer", "Legal Advisor", "Financial Officer", "Welfare Officer", "Event Manager", "Training Co-ordinator");

    }

    public boolean validatePassword(String password){
       if (password == null){
           return false;
       }

       String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
       return password.matches(pattern);
    }


    @javafx.fxml.FXML
    public void createButton(ActionEvent actionEvent) {
          if (nameField.getText().isEmpty() || idField.getText().isEmpty() || phoneField.getText().isEmpty() || addressField.getText().isEmpty() || passwordField.getText().isEmpty()
          || dobField.getValue() == null || genderComboBox.getValue() == null || roleComboBox.getValue() == null) {
              messageLabel.setText("Please fill in all the fields.");
              messageLabel.setStyle("-fx-text-fill: red");
              return;
          }

          if (idField.getText().length() < 6) {
              messageLabel.setText("User ID should be at least 6 characters.");
              messageLabel.setStyle("-fx-text-fill: red");
              return;
          }

          if (!validatePassword(passwordField.getText())) {
             messageLabel.setText("Password must be 8+ characters and include uppercase, lowercase, digit.");
             messageLabel.setStyle("-fx-text-fill: red");
             return;
          }

         messageLabel.setText("Account created successfully!");
         messageLabel.setStyle("-fx-text-fill: green");
    }
}