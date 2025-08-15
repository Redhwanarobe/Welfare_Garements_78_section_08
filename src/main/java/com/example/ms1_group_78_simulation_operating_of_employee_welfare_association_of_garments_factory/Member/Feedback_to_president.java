package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

import java.time.LocalDate;

public class Feedback_to_president {
    private String name,title,feedback,segment;
    private LocalDate date;

    public Feedback_to_president(String name, String title, String feedback, String segment, LocalDate date) {
        this.name = name;
        this.title = title;
        this.feedback = feedback;
        this.segment = segment;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Feedback_to_president{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", feedback='" + feedback + '\'' +
                ", segment='" + segment + '\'' +
                ", date=" + date +
                '}';
    }
}
