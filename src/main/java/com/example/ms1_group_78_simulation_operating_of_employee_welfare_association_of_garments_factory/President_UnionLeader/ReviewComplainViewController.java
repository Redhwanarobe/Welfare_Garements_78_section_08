package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.SubmitComplain;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class ReviewComplainViewController
{
    @javafx.fxml.FXML
    private TableColumn<SubmitComplain,String>p6col1;
    @javafx.fxml.FXML
    private TableView<SubmitComplain>table;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String> p6col2;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String>p6col3;
    @javafx.fxml.FXML
    private TableColumn <SubmitComplain,String>subject;


    @javafx.fxml.FXML
    public void initialize() {
        p6col1.setCellValueFactory(new PropertyValueFactory<>("id"));
        p6col2.setCellValueFactory(new PropertyValueFactory<>("name"));
        p6col3.setCellValueFactory(new PropertyValueFactory<>("description"));
        subject.setCellValueFactory(new PropertyValueFactory<>("subject"));


    }



    @javafx.fxml.FXML
    public void p6acceptOA(ActionEvent actionEvent) throws IOException {
        ArrayLists.submitComplainArrayList.clear();
        table.getItems().clear();
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

         table.getItems().addAll(ArrayLists.submitComplainArrayList);


    }


}
