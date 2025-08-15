package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

import java.io.Serializable;

public class paymentMenuModel implements Serializable {
    private String id, name, role;
    private Integer monthlyEarnings, healthInsurance, retireFund;

    public paymentMenuModel(String id, String name, String role, Integer monthlyEarnings, Integer healthInsurance, Integer retireFund) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.monthlyEarnings = monthlyEarnings;
        this.healthInsurance = healthInsurance;
        this.retireFund = retireFund;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(Integer healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public Integer getMonthlyEarnings() {
        return monthlyEarnings;
    }

    public void setMonthlyEarnings(Integer monthlyEarnings) {
        this.monthlyEarnings = monthlyEarnings;
    }

    public Integer getRetireFund() {
        return retireFund;
    }

    public void setRetireFund(Integer retireFund) {
        this.retireFund = retireFund;
    }

    @Override
    public String toString() {
        return "paymentMenuModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", monthlyEarnings=" + monthlyEarnings +
                ", healthInsurance=" + healthInsurance +
                ", retireFund=" + retireFund +
                '}';
    }
}
