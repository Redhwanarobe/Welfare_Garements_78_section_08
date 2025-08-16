package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.*;

public class adviceViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> memberComboBox;
    @javafx.fxml.FXML
    private TextArea adviceTextfield;

    @javafx.fxml.FXML
    public void initialize() throws IOException{
        ArrayLists.userArrayList.clear();
        File file = new File("data/users/Member.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                User user = (User) ois.readObject();
                if (user.getRole().equalsIgnoreCase("Member")) {
                    ArrayLists.userArrayList.add(user);
                }
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }
        for (User user : ArrayLists.userArrayList) {
            memberComboBox.getItems().add(user.getId() + " - " + user.getName());
        }
    }

    @javafx.fxml.FXML
    public void adviceButton(ActionEvent actionEvent) {
        String selectedMember = memberComboBox.getValue();
        String advice = adviceTextfield.getText();

        if (selectedMember == null || selectedMember.isEmpty()) {
            AlertHelper.showAlert("Warning", "Please select a member.", Alert.AlertType.WARNING);
            return;
        }
        if (advice == null || advice.trim().isEmpty()) {
            AlertHelper.showAlert("Warning", "Please enter advice.", Alert.AlertType.WARNING);
            return;
        }

        String memberId = selectedMember.split(" - ")[0].trim();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/advices/advice_" + memberId + ".txt", true));
            writer.write(advice + "\n--------------------\n");
            writer.close();
        }

        catch (IOException e) {
            AlertHelper.showAlert("Error", "Failed to save advice.", Alert.AlertType.ERROR);
            return;
        }

        memberComboBox.getSelectionModel().clearSelection();
        adviceTextfield.clear();

        AlertHelper.showAlert("Successful", "Successfully Sent advice to the selected member", Alert.AlertType.INFORMATION);
    }
}