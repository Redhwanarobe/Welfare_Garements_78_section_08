module com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory to javafx.fxml;
    opens mainpkg.welfare_germents.Legal_Advior to javafx.fxml, javafx.base ;
    opens mainpkg.welfare_germents.Medical_Officer to javafx.fxml, javafx.base ;

    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;
}