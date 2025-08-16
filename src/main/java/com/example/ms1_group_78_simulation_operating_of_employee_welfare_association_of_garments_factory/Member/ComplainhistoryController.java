package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class ComplainhistoryController
{

    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String>  table_M_subject_M_col_2;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String> tMcol_1;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String> table_M_Date_Id_Mcol_3;
    @javafx.fxml.FXML
    private TableView<SubmitComplain>tablecomplain;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String> table_M_Statud_Id_M;

    @javafx.fxml.FXML
    public void initialize() {
        tMcol_1.setCellValueFactory(new PropertyValueFactory<>("id"));
        table_M_subject_M_col_2.setCellValueFactory(new PropertyValueFactory<>("name"));
        table_M_Date_Id_Mcol_3.setCellValueFactory(new PropertyValueFactory<>("description"));
        table_M_Statud_Id_M.setCellValueFactory(new PropertyValueFactory<>("subject"));

    }


    @javafx.fxml.FXML
    public void exportOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void comOA(ActionEvent actionEvent) throws IOException {
            ArrayLists.submitComplainArrayList.clear();
            tablecomplain.getItems().clear();
            File file = new File("data/submitCompain.bin");
            if (!file.exists()){
                return;
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                while(true){
                    SubmitComplain complain = (SubmitComplain) ois.readObject();
                    ArrayLists.submitComplainArrayList.add(complain);
                }
            } catch (EOFException eof){
                System.out.println("End of file");
            } catch (ClassNotFoundException cnf) {
                System.out.println("Class not found");
            }

            tablecomplain.getItems().addAll(ArrayLists.submitComplainArrayList);


        }
    }
