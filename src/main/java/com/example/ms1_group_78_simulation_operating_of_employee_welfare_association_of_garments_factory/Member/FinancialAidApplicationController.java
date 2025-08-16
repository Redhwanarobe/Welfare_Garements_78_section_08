package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AlertHelper;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;

public class FinancialAidApplicationController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void OAsubmit(ActionEvent actionEvent) throws IOException {
        String name = nameTF.getText();
        String requestid = idTF.getText();
        String amount = amountTF.getText();
        String reason = textArea.getText();
        Financial_Aid aid = new Financial_Aid(name,requestid,amount,reason);

        AlertHelper.showAlert("Sucessfull", "Succesfully Aid application.", Alert.AlertType.CONFIRMATION);


        File file = new File("data/aidapplication.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()){
            fos =  new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        }

        else{
            fos = new FileOutputStream(file, false);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(aid);
        oos.close();

        ArrayLists.financial_aidArrayList.add(aid);


    }
    }
