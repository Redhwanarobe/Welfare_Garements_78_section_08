package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.Feedback_to_president;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.Feedbackdetais;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.Financial_Aid;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.SubmitComplain;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class ApproveMember_AidController
{
    @javafx.fxml.FXML
    private TableColumn <Financial_Aid, String>p3col1;
    @javafx.fxml.FXML
    private TableColumn <Financial_Aid, String> p3col2;
    @javafx.fxml.FXML
    private TableView <Financial_Aid>p3table;
    @javafx.fxml.FXML
    private TableColumn <Financial_Aid, String> p3col3;
    @javafx.fxml.FXML
    private TableColumn <Financial_Aid, String>p3col4;

    @javafx.fxml.FXML
    public void initialize() {
        p3col1.setCellValueFactory(new PropertyValueFactory<>("id"));
        p3col2.setCellValueFactory(new PropertyValueFactory<>("name"));
        p3col3.setCellValueFactory(new PropertyValueFactory<>("description"));
        p3col4.setCellValueFactory(new PropertyValueFactory<>("subject"));

    }



    @javafx.fxml.FXML
    public void p3acceptOA(ActionEvent actionEvent) throws IOException {
           AlertHelper.showAlert("Sucessfull", "Succesfully send.", Alert.AlertType.CONFIRMATION);


            ArrayLists.financial_aidArrayList.clear();
            p3table.getItems().clear();
            File file = new File("data/submitCompain.bin");
            if (!file.exists()){
                return;
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                while(true){
                    Financial_Aid aid = (Financial_Aid) ois.readObject();
                    ArrayLists.financial_aidArrayList.add(aid);
                }
            } catch (EOFException eof){
                System.out.println("End of file");
            } catch (ClassNotFoundException cnf) {
                System.out.println("Class not found");
            }

            p3table.getItems().addAll(ArrayLists.financial_aidArrayList);


        }



    }



