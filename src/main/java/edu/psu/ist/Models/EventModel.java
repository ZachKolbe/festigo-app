package edu.psu.ist.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event")
public class EventModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(name = "event_type")
    private int eventType;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "start_time")
    private LocalDateTime startTime;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "organizer_id")
    private int organizerId;

    @Column(name = "festival_id")
    private int festivalId;

    // Required for JPA + JSON
    public EventModel() {
    }

    public EventModel(int id, String title, int eventType,
                      LocalDateTime startTime, LocalDateTime endTime,
                      int organizerId, int festivalId) {
        this.id = id;
        this.title = title;
        this.eventType = eventType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.organizerId = organizerId;
        this.festivalId = festivalId;
    }

    // Getters and Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getEventType() { return eventType; }
    public void setEventType(int eventType) { this.eventType = eventType; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public int getOrganizerId() { return organizerId; }
    public void setOrganizerId(int organizerId) { this.organizerId = organizerId; }

    public int getFestivalId() { return festivalId; }
    public void setFestivalId(int festivalId) { this.festivalId = festivalId; }

    @Override
    public String toString() {
        return "EventModel {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventType=" + eventType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", organizerId=" + organizerId +
                ", festivalId=" + festivalId +
                '}';
    }
}