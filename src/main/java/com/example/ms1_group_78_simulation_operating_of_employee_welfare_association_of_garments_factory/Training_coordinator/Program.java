package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Training_coordinator;

import java.time.LocalDate;

public class Program {
    private String title,location,time,segmant,details;
    private LocalDate date;
    private Integer attendance;

    public Program(String title, String location, String time, String segmant, String details, LocalDate date) {
        this.title = title;
        this.location = location;
        this.time = time;
        this.segmant = segmant;
        this.details = details;
        this.date = date;
    }

    public Program(Integer attendance) {
        this.attendance = attendance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSegmant() {
        return segmant;
    }

    public void setSegmant(String segmant) {
        this.segmant = segmant;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Program{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", segmant='" + segmant + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                ", attendance=" + attendance +
                '}';
    }

}
