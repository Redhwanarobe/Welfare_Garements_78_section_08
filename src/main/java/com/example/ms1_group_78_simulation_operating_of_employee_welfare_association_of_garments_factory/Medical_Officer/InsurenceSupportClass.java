package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

public class InsurenceSupportClass {
    private String name, idNo, gender, phoneNumber, report,age;

    public InsurenceSupportClass(String name, String idNo, String gender, String phoneNumber, String report, String age) {
        this.name = name;
        this.idNo = idNo;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.report = report;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "InsurenceSupportClass{" +
                "name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", report='" + report + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}