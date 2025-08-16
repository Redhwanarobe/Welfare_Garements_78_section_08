package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member.SubmitComplain;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.imageio.IIOException;
import java.io.*;

public class MemberProfilesController
{
    @javafx.fxml.FXML
    private TableView <Employee>tablepresident_01;
    @javafx.fxml.FXML
    private TextField entermember_idTF;
    @javafx.fxml.FXML
    private TableColumn <String, Employee>p_1tablecol1;
    @javafx.fxml.FXML
    private TableColumn <String, Employee>p_1tablecol2;

    @javafx.fxml.FXML
    public void initialize() {


        p_1tablecol1.setCellValueFactory(new PropertyValueFactory<>("name"));
        p_1tablecol2.setCellValueFactory(new PropertyValueFactory<>("id"));



    }

    @javafx.fxml.FXML
    public void p_01_searchOA(ActionEvent actionEvent) throws IOException {
        ArrayLists.employeeArrayList.clear();
        tablepresident_01.getItems().clear();
        File file = new File("data/users/Member.bin");
        if (!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                Employee user = (Employee) ois.readObject();
                ArrayLists.employeeArrayList.add(user);
            }
        } catch (EOFException eof){
            System.out.println("End of file");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }

        tablepresident_01.getItems().addAll(ArrayLists.employeeArrayList);

    }
}