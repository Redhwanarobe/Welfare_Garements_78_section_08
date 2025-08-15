package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MemberDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane anchorpane;
    @javafx.fxml.FXML
    private VBox vbox;
    @javafx.fxml.FXML
    private BorderPane borderPane;
    @javafx.fxml.FXML
    private TextArea memberText;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void msuggestionOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/feedbacktoPresident-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }


    @javafx.fxml.FXML
    public void msubmitcomplainOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/submit-viewcomplain.fxml"));
        borderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void msignOutOA(ActionEvent actionEvent) throws IOException {

            Parent root = null;
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
            root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Login");
            stage.show();


    }

    @javafx.fxml.FXML
    public void mupdateprofileOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/update_viewProfile.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }

    @javafx.fxml.FXML
    public void mfinancialadviceOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/financialAdvice-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());


    }

    @javafx.fxml.FXML
    public void mexportdoc(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/complainhistory-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void mwelfareOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/welfareAnoucement-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }

    @javafx.fxml.FXML
    public void mpresidentannoucementOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/presidentAnouncement-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());
    }




    @javafx.fxml.FXML
    public void mFinancialAidOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/financialAidApplication-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }
}




