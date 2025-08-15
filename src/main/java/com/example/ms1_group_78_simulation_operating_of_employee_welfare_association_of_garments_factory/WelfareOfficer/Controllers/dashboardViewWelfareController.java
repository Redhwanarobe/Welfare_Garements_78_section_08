package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class dashboardViewWelfareController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/searchView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void statusMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/visitStatusView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }

    }


    @javafx.fxml.FXML
    public void requestMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/paymentRequestView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void surveyMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/feedBackView .fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void historyMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/memberHistoryView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void visitMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/visitView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void createProfileMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/CreateAccount.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void grievanceMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelfareOfficer/ComplaintView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Request Menu");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }
}