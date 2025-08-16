package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Medical_Officer;

public class MaintainHealthRecordClass {
    private String EmployeeId,Name,Department,Staus;

    public MaintainHealthRecordClass(String employeeId, String name, String department, String staus) {
        EmployeeId = employeeId;
        Name = name;
        Department = department;
        Staus = staus;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getStaus() {
        return Staus;
    }

    public void setStaus(String staus) {
        Staus = staus;
    }

    @Override
    public String toString() {
        return "MaintainHealthRecordClass{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", Staus='" + Staus + '\'' +
                '}';
    }
}
