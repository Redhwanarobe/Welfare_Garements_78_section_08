package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.Employee;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.AppendableObjectOutputStream;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility.ArrayLists;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models.FeedbackModel;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.*;
import java.util.ArrayList;

public class FeedBackViewController
{
    @javafx.fxml.FXML
    private TextArea answerField;
    @javafx.fxml.FXML
    private ComboBox<String> memberComboBox;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        File file = new File("data/users/Member.bin");
        if(!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                Employee user = (Employee) ois.readObject();
                ArrayLists.userArrayList.add(user);
            }
        } catch(EOFException | ClassNotFoundException eof){
            System.out.println("End of file and Class not found");
        }

        for (User user : ArrayLists.userArrayList){
            memberComboBox.getItems().add(user.getId() + " - " + user.getName());
        }

    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException{
        String feedback = answerField.getText();
        String id = memberComboBox.getValue();
        String name = memberComboBox.getValue();

        FeedbackModel feedbacks = new FeedbackModel(name, id, feedback);

        File file = new File("data/feedBack.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        if(file.exists()){
            fos = new FileOutputStream(file,true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else{
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(feedbacks);
        oos.close();
        ArrayLists.feedbackModelArrayList.add(feedbacks);


    }
}