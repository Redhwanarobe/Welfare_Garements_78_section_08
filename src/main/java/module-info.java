module com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory to javafx.fxml;
<<<<<<< HEAD
    opens mainpkg.welfare_germents.Legal_Advior to javafx.fxml, javafx.base ;
    opens mainpkg.welfare_germents.Medical_Officer to javafx.fxml, javafx.base ;

=======
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator to javafx.fxml, javafx.base;
>>>>>>> c08dabc4d2eba95aaf0275d47778ace8ff008e44
    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;
}