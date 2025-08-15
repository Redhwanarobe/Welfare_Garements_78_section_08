package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.WelfareOfficer.Models;

import java.io.Serializable;

public class FeedbackModel implements Serializable {
    private String name, id, feedback;

    public FeedbackModel(String name, String id, String feedback) {
        this.name = name;
        this.id = id;
        this.feedback = feedback;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "FeedbackModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
