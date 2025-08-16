package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SubmitComplainController
{
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TextField namee;
    @javafx.fxml.FXML
    private TextField idd;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void choosefileOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitcomplainOA(ActionEvent actionEvent) throws IOException {
        String subject = subjectTF.getText();
        String description = descriptionTA.getText();
        String name = namee.getText();
        String id = idd.getText();
        SubmitComplain complain = new SubmitComplain(subject, description,name,id);


        File file = new File("data/submitCompain.bin");
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

        oos.writeObject(complain);
        oos.close();

        ArrayLists.submitComplainArrayList.add(complain);


    }

    }
