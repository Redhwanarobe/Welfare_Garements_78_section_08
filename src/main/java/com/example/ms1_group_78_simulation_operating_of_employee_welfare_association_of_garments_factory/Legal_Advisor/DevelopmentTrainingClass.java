package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

public class DevelopmentTrainingClass {
    private String title,topic,objective;

    public DevelopmentTrainingClass(String title, String topic, String objective) {
        this.title = title;
        this.topic = topic;
        this.objective = objective;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return "DevelopmentTrainingClass{" +
                "title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", objective='" + objective + '\'' +
                '}';
    }
}
