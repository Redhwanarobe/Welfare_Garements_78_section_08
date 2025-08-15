package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

public class AssistCompansationClass {
    private String reportId;
    private String date;
    private String description;

    public AssistCompansationClass(String reportId, String date, String description) {
        this.reportId = reportId;
        this.date = date;
        this.description = description;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AssistCompansationClass{" +
                "reportId='" + reportId + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
