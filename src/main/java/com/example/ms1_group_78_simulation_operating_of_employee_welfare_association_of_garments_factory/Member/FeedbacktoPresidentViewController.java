package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator.Program;
import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator.Programdetails;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class FeedbacktoPresidentViewController
    {

        @javafx.fxml.FXML
        private TextField memberTF;
        @javafx.fxml.FXML
        private TextField subject_MTF;

        @javafx.fxml.FXML
        private TextArea memberTA;
        @javafx.fxml.FXML
        private DatePicker date_M_PIcker;
        @javafx.fxml.FXML
        private ComboBox<String> typeCb;


        @javafx.fxml.FXML
        public void initialize() {
            ComboBox<Object> typeCB;
            typeCb.getItems().setAll("Male","Female","Others");
        }


        @javafx.fxml.FXML
        public void creatFeedbackOA(ActionEvent actionEvent) {
            String name,title,feedback,segment;
            LocalDate date;
            name =  memberTF.getText();
            title = subject_MTF.getText();
            feedback = memberTA.getText();
            date = date_M_PIcker.getValue();
            segment   = typeCb.getValue();
            if ( name.isBlank() || title.isBlank() || feedback.isBlank() || segment.isBlank()  || date == null){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Fill the fields");
                alert.showAndWait();
                return;
            }
            Feedback_to_president feedbackToPresident = new Feedback_to_president (name,title,feedback,segment,date);
            Feedbackdetais.addfeedbacks(feedbackToPresident);
            memberTF.clear();
            subject_MTF.clear();
            memberTA.clear();
            date_M_PIcker.setValue(null);
            typeCb.setValue(null);




        }

}