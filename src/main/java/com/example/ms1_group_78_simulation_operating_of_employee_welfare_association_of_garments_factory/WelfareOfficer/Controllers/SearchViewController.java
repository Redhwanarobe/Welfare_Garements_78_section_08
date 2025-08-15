package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;


public class SearchViewController
{
    @javafx.fxml.FXML
    private TableColumn<User, String> phnCol;
    @javafx.fxml.FXML
    private TableColumn<User, String> addressCol;
    @javafx.fxml.FXML
    private TableColumn<User, String> idCol;
    @javafx.fxml.FXML
    private TableColumn<User, String> nameCol;
    @javafx.fxml.FXML
    private TableView<User> tableViewSearch;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;
    @javafx.fxml.FXML
    private TableColumn<User, String> genderCol;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Trans");
        idCol.setCellValueFactory(new PropertyValueFactory<User, String>("userID"));
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("userName"));
        genderCol.setCellValueFactory(new PropertyValueFactory<User, String>("gender"));
        addressCol.setCellValueFactory(new PropertyValueFactory<User, String>("address"));
        phnCol.setCellValueFactory(new PropertyValueFactory<User, String>("phnNumber"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String selectedGender = genderComboBox.getValue();
        if (selectedGender == null || selectedGender.isEmpty()) {
            tableViewSearch.getItems().clear();
            tableViewSearch.getItems().addAll(ArrayLists.userArrayList);
            return;
        }

        tableViewSearch.getItems().clear();
        for (User user : ArrayLists.userArrayList) {
            if (user.getGender().equalsIgnoreCase(selectedGender)) {
                tableViewSearch.getItems().add(user);
            }
        }
    }

    @javafx.fxml.FXML
    public void loadTable(ActionEvent actionEvent) throws IOException {
        ArrayLists.userArrayList.clear();
        tableViewSearch.getItems().clear();
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


        tableViewSearch.getItems().addAll(ArrayLists.userArrayList);

    }
}
