package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;

public class EventAPIController {

    // Admin
    //POST
    public boolean addEvent(EventModel event) {
        System.out.println(event.toString());
        return true; // success
    }
    //PUT
    public boolean updateEvent(EventModel event) {
        System.out.println(event.toString());
        return true;
    }

    //DELETE
    public boolean deleteEvent(int  eventId) {
        System.out.println("Deleted event id: " + eventId);
        return true;
    }

    //Users
    //POST
    public boolean addToCalendar(EventModel event, String userId) {
        System.out.println(event.toString() + " added to user calendar: " + userId);
        return true;
    }

    // DELETE
    public boolean removeFromCalendar(String userId, int eventId) {
        System.out.println(" removed from user calendar: " + userId + " Event: " + eventId);
        return true;
    }
}
