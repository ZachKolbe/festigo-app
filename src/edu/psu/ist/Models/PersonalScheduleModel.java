package edu.psu.ist.Models;

public class PersonalScheduleModel {
    private int user_id;
    private int event_id;

    public PersonalScheduleModel(int user_id, int event_id) {
        this.user_id = user_id;
        this.event_id = event_id;
    }

    @Override
    public String toString() {
        return "PersonalScheduleModel{" + "user_id=" + user_id + ", event_id=" + event_id + '}';
    }
}
