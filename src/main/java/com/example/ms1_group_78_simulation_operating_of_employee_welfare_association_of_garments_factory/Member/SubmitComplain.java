package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import java.io.Serializable;

public class SubmitComplain implements Serializable {
    private String subject, description, name, id;

    public SubmitComplain(String subject, String description, String name, String id) {
        this.subject = subject;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "SubmitComplain{" +
                "subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
