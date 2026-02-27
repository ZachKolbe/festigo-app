package edu.psu.ist.Models;

public class MasterScheduleModel {
    private int festival_id;

    public MasterScheduleModel(int festival_id) {
        this.festival_id = festival_id;
    }

    @Override
    public String toString() {
        return "MasterScheduleModel{" + "festival_id=" + festival_id + '}';
    }
}
