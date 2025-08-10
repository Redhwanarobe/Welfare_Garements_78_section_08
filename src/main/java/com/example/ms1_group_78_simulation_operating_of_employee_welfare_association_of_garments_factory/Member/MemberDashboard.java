package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import java.time.LocalDate;
import java.util.Random;

public class MemberDashboard extends User {
    private int status; // status == 2 pending; 1== accepted; 0 == rejected
    private  String emergencyContact;


    public MemberDashboard(String name, String phoneNo, String email, String address, String password, LocalDate dob, int status, String emergencyContact) {
        super(name, phoneNo, email, address, password, dob);
        this.setId(this.generateID());
        this.status = 2;
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String generateID() {
        String id = "";
        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000, 9999999)) ;
        return "";
    }

    @Override
    public User login(String id, String password) {
        return null;
    }

}
