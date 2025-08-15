package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import java.io.*;

public class VisitViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private DatePicker dob;
    @javafx.fxml.FXML
    private TextArea notesField;
    @javafx.fxml.FXML
    private TextArea purposeField;
    @javafx.fxml.FXML
    private ComboBox<String> memberCOMBOBOX;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
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
            memberCOMBOBOX.getItems().add(user.getUserID() + " - " + user.getUserName());
        }

        typeComboBox.getItems().addAll("Home", "Work", "Hospital");
    }

    @javafx.fxml.FXML
    public void appointmentButton(ActionEvent actionEvent) {
        String note = notesField.getText();
        String purpose = purposeField.getText();

        if(note.isEmpty() || purpose.isEmpty()){
            AlertHelper.showAlert("Error", "Please fill purpose and notes", Alert.AlertType.ERROR);
        }
        else {
            AlertHelper.showAlert("Successfull", "Successfully Made appointment", Alert.AlertType.INFORMATION);
        }
    }
}