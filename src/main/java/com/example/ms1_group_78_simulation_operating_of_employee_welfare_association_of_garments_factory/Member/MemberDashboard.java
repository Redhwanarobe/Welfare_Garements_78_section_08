package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import java.time.LocalDate;
import java.util.Random;

public class MemberDashboard extends User {
    private int status; // status == 2 pending; 1== accepted; 0 == rejected
    private  String emergencyContact;


    public MemberDashboard(String name, String phoneNo, String email, String address, String password, LocalDate dob, int status, String emergencyContact) {
//        super(name, phoneNo, email, address, password, dob);
        this.setId(this.generateID());
        this.status = 2;
        this.emergencyContact = emergencyContact;
    }

    private String generateID() {
        return null;
    }

    public MemberDashboard(String memberDahsboard, String number, String mail, String uttara, String number1, LocalDate of) {
        super();
    }


    @Override
    public String toString() {
        return
                super.toString() + '\n'+
                        "EmergencyContact='" + emergencyContact + '\n' +
                        "Status=" + status

                ;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }




    @Override
    public User login(String id, String password) {
        return null;
    }
}