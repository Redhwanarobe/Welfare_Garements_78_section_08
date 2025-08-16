package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import java.io.Serial;
import java.io.Serializable;


public class Employee extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    public Employee() {
        super(); // This will call the no-arg constructor of User
    }

    public Employee(String name, String id, String phone, String address, String password,
                    String dob, String gender, String role) {
        super(name, id, phone, address, password, dob, gender, role);
    }

    @Override
    public User login(String id, String password) {
        // Implement your login logic here (optional)
        return null;
    }
}
