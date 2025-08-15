package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

public class MediateConflictClass {
    private String Caseid,Name,Summary,status,dob;

    public MediateConflictClass(String caseid, String name, String summary, String status, String dob) {
        Caseid = caseid;
        Name = name;
        Summary = summary;
        this.status = status;
        this.dob = dob;
    }

    public String getCaseid() {
        return Caseid;
    }

    public void setCaseid(String caseid) {
        Caseid = caseid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "MediateConflictClass{" +
                "Caseid='" + Caseid + '\'' +
                ", Name='" + Name + '\'' +
                ", Summary='" + Summary + '\'' +
                ", status='" + status + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
