package edu.psu.ist.Models;

import java.time.LocalDateTime;
import java.util.Date;

public class EventModel {
    private int id;
    private String title;
    private int event_type;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private int organzier_id;
    private int festival_id;

    public EventModel(int id, String title, int event_type, LocalDateTime start_time, LocalDateTime end_time, int organzier_id, int festival_id) {
        this.id = id;
        this.title = title;
        this.event_type = event_type;
        this.start_time = start_time;
        this.end_time = end_time;
        this.organzier_id = organzier_id;
        this.festival_id = festival_id;
    }

    @Override
    public String toString() {
        return "EventModel {\n" + "id=" + id + ", title=" + title + ", event_type=" + event_type +
                ", start_time=" + start_time + ", end_time=" + end_time + ", organzier_id=" + organzier_id +
                ", festival_id=" + festival_id + "}";
    }
    
}
