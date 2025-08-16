package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

import java.time.LocalDate;

public class RaiseAwarenessClass {
    private String merterialComboBox;
    private LocalDate SessionDate;

    public RaiseAwarenessClass(String merterialComboBox, LocalDate sessionDate) {
        this.merterialComboBox = merterialComboBox;
        SessionDate = sessionDate;
    }

    public String getMerterialComboBox() {
        return merterialComboBox;
    }

    public void setMerterialComboBox(String merterialComboBox) {
        this.merterialComboBox = merterialComboBox;
    }

    public LocalDate getSessionDate() {
        return SessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        SessionDate = sessionDate;
    }

    @Override
    public String toString() {
        return "RaiseAwarenessClass{" +
                "merterialComboBox='" + merterialComboBox + '\'' +
                ", SessionDate=" + SessionDate +
                '}';
    }
}
