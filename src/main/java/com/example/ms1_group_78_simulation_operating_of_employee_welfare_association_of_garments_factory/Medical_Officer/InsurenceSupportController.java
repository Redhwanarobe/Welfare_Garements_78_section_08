package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class InsurenceSupportController
{
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> MedicalReportCol;
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> idCol;
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> AgeCol;
    @javafx.fxml.FXML
    private ComboBox<String> insurenceTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> phoneNumberCol;
    @javafx.fxml.FXML
    private TableColumn<InsurenceSupportClass,String> genderCol;
    @javafx.fxml.FXML
    private TableView<InsurenceSupportClass> TableView;
    @javafx.fxml.FXML
    private TextArea RemarkTextArea;
    ArrayList<InsurenceSupportClass>InsurenceSupportClassList=new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("idNo"));
        genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        AgeCol.setCellValueFactory(new PropertyValueFactory<>("Age"));
        MedicalReportCol.setCellValueFactory(new PropertyValueFactory<>("report"));


        insurenceTypeComboBox.setItems(FXCollections.observableArrayList("Life Insurence","Health Insurance","Accedent Insurance"));



        ArrayList<InsurenceSupportClass>InsurenceSupportClassList=new ArrayList<>();
        InsurenceSupportClassList.add(new InsurenceSupportClass("fahim","id01","Male","01716441903","ex","20"));
        InsurenceSupportClassList.add(new InsurenceSupportClass("noman","id02","Male","01716441904","goodd","20"));


        ObservableList<InsurenceSupportClass>data=FXCollections.observableArrayList(InsurenceSupportClassList);
        TableView.setItems(data);





    }


    @javafx.fxml.FXML
    public void SubmitButtonOA(ActionEvent actionEvent) {
        try {
            String name= nameCol.getText();
            String id= idCol.getText();
            String gender= genderCol.getText();
            String phone=phoneNumberCol.getText();
            String remark=MedicalReportCol.getText();
            String age=AgeCol.getText();
            String insurenceType=insurenceTypeComboBox.getValue();
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void helthClaimButtonOA(ActionEvent actionEvent) {
    }
}