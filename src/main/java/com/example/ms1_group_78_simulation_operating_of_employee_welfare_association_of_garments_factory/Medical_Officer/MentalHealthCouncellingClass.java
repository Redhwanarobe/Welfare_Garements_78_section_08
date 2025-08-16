package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import javax.swing.*;

public class MentalHealthCouncellingClass {

    private String id,name, caseNO,review;

    public MentalHealthCouncellingClass(String id, String name, String caseNO, String review) {
        this.id = id;
        this.name = name;
        this.caseNO = caseNO;
        this.review = review;
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

    public String getCaseNO() {
        return caseNO;
    }

    public void setCaseNO(String caseNO) {
        this.caseNO = caseNO;
    }

    @Override
    public String toString() {
        return "MentalHealthCouncellingClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", caseNO='" + caseNO + '\'' +
                ", review='" + review + '\'' +
                '}';
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}