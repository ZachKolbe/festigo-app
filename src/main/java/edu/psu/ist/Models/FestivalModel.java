package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "festival")
public class FestivalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String location;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "event_admin")
    private int eventAdmin;

    @Column(name = "festival_name")
    private String festivalName;

    // Required for JPA + JSON
    public FestivalModel() {
    }

    public FestivalModel(int id, String location, String festivalName,
                         LocalDateTime startDate,
                         LocalDateTime endDate,
                         int eventAdmin) {
        this.id = id;
        this.location = location;
        this.festivalName = festivalName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventAdmin = eventAdmin;
    }

    // Getters and Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getFestivalName() { return festivalName; }
    public void setFestivalName(String festivalName) { this.festivalName = festivalName; }

    public LocalDateTime getStartDate() { return startDate; }
    public void setStartDate(LocalDateTime startDate) { this.startDate = startDate; }

    public LocalDateTime getEndDate() { return endDate; }
    public void setEndDate(LocalDateTime endDate) { this.endDate = endDate; }

    public int getEventAdmin() { return eventAdmin; }
    public void setEventAdmin(int eventAdmin) { this.eventAdmin = eventAdmin; }

    @Override
    public String toString() {
        return "FestivalModel {" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", festivalName='" + festivalName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", eventAdmin=" + eventAdmin +
                '}';
    }
}