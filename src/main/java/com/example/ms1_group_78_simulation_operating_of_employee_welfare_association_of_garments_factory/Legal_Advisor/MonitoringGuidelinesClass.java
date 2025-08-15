package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

public class MonitoringGuidelinesClass {
    private String Id, Requirment, Description, Deadline, Assigned ;

    public MonitoringGuidelinesClass(String id, String requirment, String description, String deadline, String assigned) {
        Id = id;
        Requirment = requirment;
        Description = description;
        Deadline = deadline;
        Assigned = assigned;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRequirment() {
        return Requirment;
    }

    public void setRequirment(String requirment) {
        Requirment = requirment;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        Deadline = deadline;
    }

    public String getAssigned() {
        return Assigned;
    }

    public void setAssigned(String assigned) {
        Assigned = assigned;
    }

    @Override
    public String toString() {
        return "MonitoringGuidelinesClass{" +
                "Id='" + Id + '\'' +
                ", Requirment='" + Requirment + '\'' +
                ", Description='" + Description + '\'' +
                ", Deadline='" + Deadline + '\'' +
                ", Assigned='" + Assigned + '\'' +
                '}';
    }
}