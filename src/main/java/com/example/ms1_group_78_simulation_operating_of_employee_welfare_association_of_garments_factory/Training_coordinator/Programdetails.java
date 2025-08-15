package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Programdetails {
    private static final ObservableList<Program> programObservableList = FXCollections.observableArrayList();
    public static ObservableList<Program> getProgramObservableList(){
        return programObservableList;
    }
    public static void addprograms(Program program){
        programObservableList.add(program);
    }

}
