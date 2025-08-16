package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models;

public class complaintModel {
    private String member, status;

    public complaintModel(String member, String status) {
        this.member = member;
        this.status = status;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "complaintModel{" +
                "member='" + member + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
