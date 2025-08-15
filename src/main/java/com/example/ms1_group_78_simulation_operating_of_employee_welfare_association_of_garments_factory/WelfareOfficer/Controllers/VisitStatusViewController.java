package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models.statusModel;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class VisitStatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<statusModel,String> idCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBOX;
    @javafx.fxml.FXML
    private TableColumn<statusModel,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> memberComboBOX;
    @javafx.fxml.FXML
    private TableColumn<statusModel,String> visitCol;
    @javafx.fxml.FXML
    private TableView<statusModel> statusTableView;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        statusComboBOX.getItems().addAll("Visited", "Not Visited", "Scheduled");
        idCol.setCellValueFactory(new PropertyValueFactory<statusModel, String>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<statusModel, String>("name"));
        visitCol.setCellValueFactory(new PropertyValueFactory<statusModel, String>("status"));

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
            memberComboBOX.getItems().add(user.getId() + " - " + user.getName());
        }

    }

    @javafx.fxml.FXML
    public void updateStatus (ActionEvent actionEvent) throws IOException{
        String selectedMember = memberComboBOX.getValue();
        String selectedStatus = statusComboBOX.getValue();

        if (selectedMember == null || selectedStatus == null) {
            AlertHelper.showAlert("Error", "Please select a member and a status.", javafx.scene.control.Alert.AlertType.ERROR);
            return;
        }


        String[] parts = selectedMember.split(" - ");
        String id = parts[0];
        String name = parts[1];

        statusModel visitStatus = new statusModel(id, name, selectedStatus);
        File file = new File("data/visitStatus.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        if (file.exists()){
            fos = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else{
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(visitStatus);
        oos.close();
        ArrayLists.statusArrayList.add(visitStatus);
        memberComboBOX.getSelectionModel().clearSelection();
        statusComboBOX.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void visitStatus(ActionEvent actionEvent) throws IOException{
        ArrayLists.statusArrayList.clear();
        statusTableView.getItems().clear();
        File file = new File("data/visitStatus.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                statusModel visitStatus = (statusModel) ois.readObject();
                ArrayLists.statusArrayList.add(visitStatus);
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }

        statusTableView.getItems().addAll(ArrayLists.statusArrayList);
    }
}