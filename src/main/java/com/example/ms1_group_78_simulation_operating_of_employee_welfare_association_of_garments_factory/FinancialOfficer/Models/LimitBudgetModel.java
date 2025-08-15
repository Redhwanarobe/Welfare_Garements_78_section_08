package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

public class LimitBudgetModel {
    private String category;
    private Integer amount;

    public LimitBudgetModel(String category, Integer amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LimitBudgetModel{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }




}
