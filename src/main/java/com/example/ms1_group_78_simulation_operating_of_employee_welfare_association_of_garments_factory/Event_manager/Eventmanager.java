package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import java.time.LocalDate;
import java.util.Objects;

public class Eventmanager extends User {
    public Eventmanager(String name, String phoneNo, String email, String address, String password, LocalDate dob) {
        super(name, phoneNo, email, address, password, dob);
    }

    @Override
    public String generateID() {
        return "1111";
    }

    public Eventmanager login(String id, String password) {
        {
            if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())) {
                return this;
            }
            return null;
        }
    }
}
