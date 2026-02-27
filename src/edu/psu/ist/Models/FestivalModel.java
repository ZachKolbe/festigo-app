package edu.psu.ist.Models;

import java.time.LocalDateTime;

public class FestivalModel {
    private int id;
    private String name;
    private String location;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private int admin_id;

    public FestivalModel(int id, String name, String location, LocalDateTime start_date, LocalDateTime end_date, int admin_id) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
        this.admin_id = admin_id;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    @Override
    public String toString() {
        return "FestivalModel {\n" +
                "id=" + id + ", name=" + name + ", location=" + location + ", start_date=" + start_date +
                ", end_date=" + end_date + ", admin_id=" + admin_id + "}";
    }

}
