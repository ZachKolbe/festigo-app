package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class EventModel {

    private int id;
    private String title;
    private int event_type;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime start_time;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime end_time;

    private int organizer_id;
    private int festival_id;

    // Required for JSON deserialization
    public EventModel() {
    }

    public EventModel(int id, String title, int event_type,
                      LocalDateTime start_time, LocalDateTime end_time,
                      int organizer_id, int festival_id) {
        this.id = id;
        this.title = title;
        this.event_type = event_type;
        this.start_time = start_time;
        this.end_time = end_time;
        this.organizer_id = organizer_id;
        this.festival_id = festival_id;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getEvent_type() {
        return event_type;
    }

    public void setEvent_type(int event_type) {
        this.event_type = event_type;
    }


    public LocalDateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }


    public LocalDateTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }


    public int getOrganizer_id() {
        return organizer_id;
    }

    public void setOrganizer_id(int organizer_id) {
        this.organizer_id = organizer_id;
    }


    public int getFestival_id() {
        return festival_id;
    }

    public void setFestival_id(int festival_id) {
        this.festival_id = festival_id;
    }

    @Override
    public String toString() {
        return "EventModel {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", event_type=" + event_type +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", organizer_id=" + organizer_id +
                ", festival_id=" + festival_id +
                '}';
    }
}