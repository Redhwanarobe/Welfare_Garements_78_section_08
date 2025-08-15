package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models.AllocateFundModel;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class dashboardViewController
{
    @javafx.fxml.FXML
    private Label fundsLabel;
    @javafx.fxml.FXML
    private Label spentLabel;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void requestMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/viewRequests.fxml"));
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
    public void budgetLimitMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/budgetLimitView.fxml"));
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
    public void paymentMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/paymentMenuView.fxml"));
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
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/transactionHistoryView.fxml"));
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
    public void adviceMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/adviceView.fxml"));
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
    public void allocateFundMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/allocateFundView.fxml"));
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
    public void aidMenu(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FinancialOfficer/aidMenuView.fxml"));
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
    public void totalFundButton(ActionEvent actionEvent) {
        fundsLabel.setText("  ৳" + String.format("%.2f ", AllocateFundModel.getTotalFund()));
    }

    @javafx.fxml.FXML
    public void breakdownButton(ActionEvent actionEvent) {
        spentLabel.setText("  ৳" + String.format("%.2f ", AllocateFundModel.getTotalSpent()));
    }

    private boolean isValidPositiveInteger(String str) {
        return str.matches("\\d+");
    }


}
