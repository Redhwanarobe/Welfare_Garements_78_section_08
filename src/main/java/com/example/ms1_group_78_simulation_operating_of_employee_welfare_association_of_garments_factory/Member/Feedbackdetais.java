package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator.Program;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Feedbackdetais {
    private static final ObservableList< Feedback_to_president> feedback_to_PresidentObservableList = FXCollections.observableArrayList();

    public static ObservableList<Feedback_to_president> getFeedback_to_presidentObservableList () {
        return feedback_to_PresidentObservableList ;
    }
    public static void addfeedbacks (Feedback_to_president feedback_to_president){
        feedback_to_PresidentObservableList.add(feedback_to_president);
    }

}
