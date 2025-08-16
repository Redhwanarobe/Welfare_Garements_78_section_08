package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.memberList;

public class SeeRegeterMemberController
{
    @javafx.fxml.FXML
    private TableColumn<SeeRegeterMemberClass,String> idCol;
    @javafx.fxml.FXML
    private TableColumn<SeeRegeterMemberClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<SeeRegeterMemberClass,String> deprtmentCol;
    @javafx.fxml.FXML
    private TableColumn<SeeRegeterMemberClass,String> contactNumberCol;
    @javafx.fxml.FXML
    private TableView<SeeRegeterMemberClass> TableViewfxid;
    @javafx.fxml.FXML
    private TableColumn<SeeRegeterMemberClass,String> AddressCol;


    ObservableList<SeeRegeterMemberClass>memberList;


    @javafx.fxml.FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        deprtmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        contactNumberCol.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        AddressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
    }

    @javafx.fxml.FXML
    public void showmemberButtonOA(ActionEvent actionEvent) {
        memberList.clear();
        memberList.add(new SeeRegeterMemberClass("001","Fahim","HR","01518689473","Chandpur"));
        memberList.add(new SeeRegeterMemberClass("002","Noman","Finance","01716441903","Dhaka"));

    }

    @javafx.fxml.FXML
    public void returnHomeOA(ActionEvent actionEvent) {System.out.println("Returning to dashboard");
    }

    @javafx.fxml.FXML
    public void regesterMemberOA(ActionEvent actionEvent) {
        System.out.println("Register member executed");
    }
}