package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MonitorAgrreementsController
{

    @javafx.fxml.FXML
    private TextArea commentTextArea;
    @javafx.fxml.FXML
    private TableColumn<MonitorAgreementsClass,String> complienceTextCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorAgreementsClass,String> laborTextCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorAgreementsClass,String> tradeTextCol;
    @javafx.fxml.FXML
    private TableView<MonitorAgreementsClass> TableView;


    @javafx.fxml.FXML
    public void initialize() {
        laborTextCol.setCellValueFactory(new PropertyValueFactory<MonitorAgreementsClass,String>("labor"));
        tradeTextCol.setCellValueFactory(new PropertyValueFactory<MonitorAgreementsClass,String>("trade"));
        complienceTextCol.setCellValueFactory(new PropertyValueFactory<MonitorAgreementsClass,String>("compliance"));
    }
    public void contractButtonOA(ActionEvent actionEvent) {
        ;


    }

    @javafx.fxml.FXML
    public void returnhomeOA(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void addCommentsOA(ActionEvent actionEvent) {
        if(commentTextArea == null); {
            commentTextArea.setText("advisor can suggest edit and legal change");

        }


    }
}