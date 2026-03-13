package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class FestivalModel {

    private int id;
    private String location;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime endDate;

    private int eventAdmin;

    // Required for JSON deserialization
    public FestivalModel() {
    }

    public FestivalModel(int id, String location, LocalDateTime startDate, LocalDateTime endDate, int eventAdmin) {
        this.id = id;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventAdmin = eventAdmin;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }


    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }


    public int getEventAdmin() {
        return eventAdmin;
    }

    public void setEventAdmin(int eventAdmin) {
        this.eventAdmin = eventAdmin;
    }

    @Override
    public String toString() {
        return "FestivalModel {" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", eventAdmin=" + eventAdmin +
                '}';
    }
}