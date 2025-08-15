package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.FinancialOfficer.Models;

import java.io.Serializable;

public class AllocateFundModel implements Serializable {
    private static double totalFund = 100000.0;
    private static double totalSpent = 0.0;


    private String category;
    private int amount;

    public AllocateFundModel(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static double getTotalFund() {
        return totalFund;
    }

    public static double getTotalSpent() {
        return totalSpent;
    }


    public static boolean spendFund(double amount) {
        if (amount <= totalFund) {
            totalFund -= amount;
            totalSpent += amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AllocateFundModel{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
