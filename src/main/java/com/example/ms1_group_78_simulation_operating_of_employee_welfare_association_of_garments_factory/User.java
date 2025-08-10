package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import java.time.LocalDate;
import java.util.Objects;

public abstract class  User {
    private String id,name,phoneNo,email,address,password;
    private LocalDate dob ,doj;

    public User(String name, String phoneNo, String email, String address, String password, LocalDate dob) {

        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.dob = dob;
        this.doj= LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return
                "Id= " + id + '\n' +
                "Name= " + name + '\n' +
                "PhoneNo= " + phoneNo + '\n' +
                "Email= " + email + '\n' +
                "Address= " + address + '\n' +
                "Password= " + password + '\n' +
                "Date of birth= " + dob ;
    }
    public abstract String generateID();
    public abstract User login(String id, String password);
}
