package edu.psu.ist.Models;

import java.util.ArrayList;
import java.util.List;

public class PersonalScheduleModel {
    private int userId;
    private int festivalId;
    private List<EventModel> userScheduledEvents;

    public PersonalScheduleModel(int userId, int festivalId) {
        this.userId = userId;
        this.festivalId = festivalId;
        this.userScheduledEvents = new ArrayList<>();
    }

    public PersonalScheduleModel(int userId, int festivalId, List<EventModel> userScheduledEvents) {
        this.userId = userId;
        this.festivalId = festivalId;
        this.userScheduledEvents = userScheduledEvents;
    }

    //only for the purpose of adding events to the user's personal schedule, not for adding events to the master schedule (which is done through the FestivalAPIController)
    public void addEventToSchedule(EventModel event) {
        this.userScheduledEvents.add(event);
    }

    public void removeEventFromSchedule(int eventId) {
        this.userScheduledEvents.removeIf(event -> event.getId() == eventId);
    }

    public List<EventModel> getUserScheduledEvents() {
        return this.userScheduledEvents;
    }

    public int getUserId() {
        return this.userId;
    }

    public int getFestivalId() {
        return this.festivalId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonalScheduleModel {\n");
        sb.append("userId=").append(userId).append(",\n");
        sb.append("festivalId=").append(festivalId).append(",\n");
        sb.append("userScheduledEvents=[\n");

        if (userScheduledEvents.isEmpty()) {
            sb.append("  (no events added to schedule)\n");
        } else {
            for (int i = 0; i < userScheduledEvents.size(); i++) {
                sb.append("  ").append(userScheduledEvents.get(i).toString());
                if (i < userScheduledEvents.size() - 1) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
        }

        sb.append("]\n}");
        return sb.toString();
    }
}
