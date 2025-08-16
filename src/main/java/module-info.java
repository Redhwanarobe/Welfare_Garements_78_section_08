module com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.javadoc;
    requires java.xml;


    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory to javafx.fxml;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor to javafx.fxml, javafx.base ;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer to javafx.fxml, javafx.base ;

    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member to javafx.fxml, javafx.base ;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.President_UnionLeader to javafx.fxml, javafx.base ;



    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator to javafx.fxml, javafx.base;


    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer to javafx.fxml,  javafx.graphics, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Controllers to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility to javafx.base, javafx.fxml, javafx.graphics;

    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer to javafx.fxml, javafx.graphics, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models to javafx.fxml, javafx.base;
    opens com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Controllers to javafx.fxml, javafx.base;



    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;
    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer;
    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;
    exports com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Utility;

}