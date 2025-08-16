package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;


import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;
    private String phone;
    private String address;
    private String password;
    private String dob;
    private String gender;
    private String role;

    public User() {
    }
    public User(String name, String id, String phone, String address, String password,
                String dob, String gender, String role) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.role = role;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Abstract method to be implemented by subclasses
    public abstract User login(String id, String password);
}
