package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

import com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.User;

import java.time.LocalDate;
import java.util.Random;

public class legalAdvisor extends User {
    private int status ; // status == 2 pending; 1 == accepted; 0 ==rejected

    public legalAdvisor(String name, String phoneNo, String email, String address, String password, LocalDate dob) {
        //super(name, phoneNo, email, address, password, dob);
        this.setId(this.generateID());
        this.status = 2;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "legalAdvisor{" +
                "status=" + status +
                '}';
    }

    public void setStatus(int status) {
        this.status = status;
    }

   // @Override
    public String  generateID() {
        String id = "";

        Random random = new Random();
        id = Integer.toString(random.nextInt(100000, 9999999));
        return id;

    }
    @Override
    public boolean login(String id, String password) {
        return  false;
    }
}