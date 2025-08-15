package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import java.io.Serializable;


public class User implements Serializable {
    private String userName, userID, phnNumber, address, password, gender, userRole, dob;


    public User(String userName, String userID, String phnNumber, String address, String password, String gender, String userRole, String dob) {
        this.userName = userName;
        this.userID = userID;
        this.phnNumber = phnNumber;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.userRole = userRole;
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userID='" + userID + '\'' +
                ", phnNumber='" + phnNumber + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", userRole='" + userRole + '\'' +
                ", dob=" + dob +
                '}';
    }
}
