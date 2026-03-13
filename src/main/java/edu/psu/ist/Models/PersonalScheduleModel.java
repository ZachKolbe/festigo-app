package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalScheduleModel {

    @JsonProperty("user_id")
    private int user_id;

    @JsonProperty("event_id")
    private int event_id;

    // Required for JSON deserialization
    public PersonalScheduleModel() {
    }

    public PersonalScheduleModel(int user_id, int event_id) {
        this.user_id = user_id;
        this.event_id = event_id;
    }

    // Getters and Setters

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    @Override
    public String toString() {
        return "PersonalScheduleModel{" +
                "user_id=" + user_id +
                ", event_id=" + event_id +
                '}';
    }
}