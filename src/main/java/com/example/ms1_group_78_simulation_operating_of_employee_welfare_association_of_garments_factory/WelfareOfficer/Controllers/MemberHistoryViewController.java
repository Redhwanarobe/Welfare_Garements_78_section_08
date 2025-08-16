package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models.welfareHistory;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class MemberHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<welfareHistory, String> IDCol;
    @javafx.fxml.FXML
    private TableView<welfareHistory> histOrytableView;
    @javafx.fxml.FXML
    private TableColumn<welfareHistory, String> ComStatusCol;
    @javafx.fxml.FXML
    private ComboBox<String> visitStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> comstatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> memberComboBox;
    @javafx.fxml.FXML
    private TableColumn<welfareHistory, String> vStatusCol;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        ArrayLists.userArrayList.clear();
        histOrytableView.getItems().clear();
        IDCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        ComStatusCol.setCellValueFactory(new PropertyValueFactory<>("comStatus"));
        vStatusCol.setCellValueFactory(new PropertyValueFactory<>("visitStatus"));
        visitStatusComboBox.getItems().addAll("Given", "Not Given");
        comstatusComboBox.getItems().addAll("Completed", "Pending");

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
            memberComboBox.getItems().add(user.getId() + " - " + user.getName());
        }
    }

    @javafx.fxml.FXML
    public void statusButton(ActionEvent actionEvent) {
        String selectedMember = memberComboBox.getValue();
        String selectedVisitStatus = visitStatusComboBox.getValue();
        String selectedComStatus = comstatusComboBox.getValue();
        if (selectedMember == null || selectedMember.isEmpty()) return;
        welfareHistory historyEntry = new welfareHistory(selectedMember, selectedComStatus, selectedVisitStatus);
        histOrytableView.getItems().add(historyEntry);
    }

}