module com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory to javafx.fxml;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator to javafx.fxml, javafx.base;
    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;
}