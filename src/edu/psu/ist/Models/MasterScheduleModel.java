package edu.psu.ist.Models;

import java.util.ArrayList;
import java.util.List;

public class MasterScheduleModel {

    private int festivalId;
    private List<EventModel> events;

    public MasterScheduleModel(int festivalId) {
        this.festivalId = festivalId;
        this.events = new ArrayList<>();
    }

    public MasterScheduleModel(int festivalId, List<EventModel> events) {
        this.festivalId = festivalId;
        this.events = events;
    }

    //this is not adding event to the database, just adding to the master schedule model (ArrayList) for the festival
    public void addEvent(EventModel event) {
        if (event.getFestivalId() == this.festivalId) {
            this.events.add(event);
        }
    }

    public List<EventModel> getEvents() {
        return this.events;
    }

    public int getFestivalId() {
        return this.festivalId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MasterScheduleModel {\n");
        sb.append("festivalId=").append(festivalId).append(",\n");
        sb.append("events=[\n");

        for (int i = 0; i < events.size(); i++) {
            sb.append("  ").append(events.get(i).toString());
            if (i < events.size() - 1) {
                sb.append(",\n");
            } else {
                sb.append("\n");
            }
        }

        sb.append("]\n}");
        return sb.toString();
    }
}
