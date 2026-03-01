package edu.psu.ist.Models;

import java.time.LocalDateTime;

public class FestivalModel {
    private int id;
    private String location;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int eventAdmin;

    public FestivalModel(int id, String location, LocalDateTime startDate, LocalDateTime endDate, int eventAdmin) {
        this.id = id;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventAdmin = eventAdmin;
    }

    @Override
    public String toString() {
        return "FestivalModel {" +"id=" + id + ", location=" + location + ", startDate=" + startDate + ", " +
                "endDate=" + endDate + ", eventAdmin=" + eventAdmin + "}";
    }
}
