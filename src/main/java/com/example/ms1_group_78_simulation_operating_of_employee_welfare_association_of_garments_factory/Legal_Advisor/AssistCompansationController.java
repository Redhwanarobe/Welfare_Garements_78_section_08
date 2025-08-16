package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.Selector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jdk.javadoc.doclet.Reporter;

import java.awt.datatransfer.StringSelection;


public class AssistCompansationController
{
    @javafx.fxml.FXML
    private TableColumn<AssistCompansationClass,String> DescriptionCol;
    @javafx.fxml.FXML
    private TableColumn<AssistCompansationClass,String> DateCol;
    @javafx.fxml.FXML
    private TableColumn<AssistCompansationClass,String> reportIdCol;
    @javafx.fxml.FXML
    private TextArea showDetailsTextArea;
    @javafx.fxml.FXML
    private TableView<AssistCompansationClass> TableViewfxid;

    ObservableList<AssistCompansationClass>assistCompansationClass = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        reportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        DescriptionCol.setCellValueFactory(new PropertyValueFactory<>("descriptionCol"));

        TableViewfxid.setItems((ObservableList<AssistCompansationClass>) reportIdCol);


        //





    }

    @javafx.fxml.FXML
    public void checkReportOA(ActionEvent actionEvent) {
        assistCompansationClass.clear();
        assistCompansationClass.add(new AssistCompansationClass("001","2024-08-14","Worker injury by Machine"));
        assistCompansationClass.add(new AssistCompansationClass("002","2025-02-12","Slip and fall in warehouse"));
        assistCompansationClass.add(new AssistCompansationClass("003","2025-05-12","Slip and fall in warehouse"));


    }


    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        String feedback =showDetailsTextArea.getText();
        if (feedback.isEmpty()){
            showDetailsTextArea.setText("please Enter feedback before submitting");

            } else
                showDetailsTextArea.setText("feedback submitted successfully");
                    showDetailsTextArea.clear(); {
        }
    }

    @Deprecated
    public void ShowOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnHomeOA(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Legal_Advisor/LegalAdvisor_Dashbboard.fxml"));

                Scene scene = new Scene(fxmlLoader.load());
                Stage stage =new Stage();
                stage.setTitle("Hello!");
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                //
            }
    }
}