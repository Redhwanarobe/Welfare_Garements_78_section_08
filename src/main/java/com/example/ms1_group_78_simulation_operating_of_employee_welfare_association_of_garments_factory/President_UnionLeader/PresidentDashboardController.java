package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PresidentDashboardController
{
    @javafx.fxml.FXML
    private VBox vbox;
    @javafx.fxml.FXML
    private AnchorPane anchorPane;
    @javafx.fxml.FXML
    private BorderPane boderPane;
    @javafx.fxml.FXML
    private TextField fullname;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void presidentupadateOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/updateProfile.fxml"));
        boderPane.setCenter(fxmlLoader.load());

    }

    @javafx.fxml.FXML
    public void presidentApproveAidOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/approveMember_Aid.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void presidentReviewOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/feedbackfrommember-view.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void presidentDownloadOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/exportFeedback.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void presidentSendAnnoucemntOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/announcements_to_Members..fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void presidentApprovebudgetOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/pendingBudget.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void President_see_meberProfileOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/memberProfiles-View.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void presidentReviewmemberComplainOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President_UnionLeader/reviewComplain-view.fxml"));
        boderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void sinoutbuttonOA(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
}