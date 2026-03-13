package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MasterScheduleModel {

    @JsonProperty("festival_id")
    private int festival_id;

    // Required for JSON deserialization
    public MasterScheduleModel() {
    }

    public MasterScheduleModel(int festival_id) {
        this.festival_id = festival_id;
    }

    public int getFestival_id() {
        return festival_id;
    }

    public void setFestival_id(int festival_id) {
        this.festival_id = festival_id;
    }

    @Override
    public String toString() {
        return "MasterScheduleModel{" +
                "festival_id=" + festival_id +
                '}';
    }
}