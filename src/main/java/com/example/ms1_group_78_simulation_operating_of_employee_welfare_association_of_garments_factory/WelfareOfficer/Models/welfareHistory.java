package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models;

public class welfareHistory {
    private String name, comStatus, visitStatus;

    public welfareHistory(String name, String comStatus, String visitStatus) {
        this.name = name;
        this.comStatus = comStatus;
        this.visitStatus = visitStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComStatus() {
        return comStatus;
    }

    public void setComStatus(String comStatus) {
        this.comStatus = comStatus;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    @Override
    public String toString() {
        return "welfareHistory{" +
                "name='" + name + '\'' +
                ", comStatus='" + comStatus + '\'' +
                ", visitStatus='" + visitStatus + '\'' +
                '}';
    }
}
