package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Event_details {
    private static final ObservableList<Events> eventsObservableList = FXCollections.observableArrayList();
    public static ObservableList<Events> getEventsObservableList(){
        return eventsObservableList;
    }
    public static void addevents(Events events){
        eventsObservableList.add(events);
    }
}
