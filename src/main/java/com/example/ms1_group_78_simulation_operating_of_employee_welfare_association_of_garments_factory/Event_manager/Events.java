package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Event_manager;

import java.time.LocalDate;

public class Events {
    String title,location,time;
    LocalDate date;
    Integer attendance;

    public Events(String title, String location, String time, LocalDate date) {
        this.title = title;
        this.location = location;
        this.time = time;
        this.date = date;
    }

    public Events(Integer attendance) {
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
        return "Events{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", date=" + date + '\''+
                "Attendance" + attendance+
                '}';
    }

}
