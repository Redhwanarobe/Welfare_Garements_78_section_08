package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import java.time.LocalDate;
import java.util.Objects;

public abstract class User {
    private String id,name,phoneNo,email,address,password;
    private LocalDate dob;

    public User(String name, String phoneNo, String email, String address, String password, LocalDate dob) {
        this.id = this.generateID();
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.dob = dob;
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
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                '}';
    }
    public abstract String generateID();
    public boolean login(String id, String password){
        if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())){
            return true;
        }
        return false;
    }
}
