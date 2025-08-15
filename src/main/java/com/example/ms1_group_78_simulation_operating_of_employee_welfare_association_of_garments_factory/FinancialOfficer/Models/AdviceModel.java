package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

import java.io.Serializable;

public class AdviceModel implements Serializable {
    private String name, id, advice;

    public AdviceModel(String name, String id, String advice) {
        this.name = name;
        this.id = id;
        this.advice = advice;
    }

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

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Override
    public String toString() {
        return "AdviceModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", advice='" + advice + '\'' +
                '}';
    }
}
