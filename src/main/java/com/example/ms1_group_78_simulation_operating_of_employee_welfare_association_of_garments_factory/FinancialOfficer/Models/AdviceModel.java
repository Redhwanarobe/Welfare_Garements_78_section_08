package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

import java.io.Serializable;

public class AdviceModel implements Serializable {
    private String member, advice;

    public AdviceModel(String member, String advice) {
        this.member = member;
        this.advice = advice;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "AdviceModel{" +
                "member='" + member + '\'' +
                ", advice='" + advice + '\'' +
                '}';
    }
}
