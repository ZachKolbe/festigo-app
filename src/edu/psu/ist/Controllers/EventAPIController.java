package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;

public class EventAPIController {

    // Admin
    //POST
    public boolean addEvent(EventModel event) {
        if (event == null) {
//            throw new IllegalArgumentException("Event cannot be null");
            System.out.println("FAIL - EventAPIController.addEvent called: " + event);
            return false;

        }
        System.out.println("PASS - EventAPIController.addEvent called: " + event.toString());
        return true; // success
    }
    //PUT
    public boolean updateEvent(EventModel event) {
        if (event == null) {
//            throw new IllegalArgumentException("Event cannot be null");
            System.out.println("FAIL - EventAPIController.updateEvent called: " + event);
            return false;
        }
        System.out.println("PASS - EventAPIController.updateEvent called: " + event.toString());
        return true;
    }

    //DELETE
    public boolean deleteEvent(int  eventId) {
        if (eventId < 0) {
//            throw new IllegalArgumentException("Event id cannot be less than zero");
            System.out.println("FAIL - EventAPIController.deleteEvent called: " + eventId);
            return false;
        }
        System.out.println("PASS - Deleted event id: " + eventId);
        return true;
    }

    //Users
    //POST
    public boolean addToCalendar(EventModel event, String userId) {
        if (event == null || userId == null) {
//            throw new IllegalArgumentException("Event or ID cannot be null");
            System.out.println("FAIL - EventAPIController.addToCalendar called: " + event);
            return false;
        }
        System.out.println("PASS - EventAPIController.addToCalendar called: " + event.toString() + " added to user calendar: " + userId);
        return true;
    }

    // DELETE
    public boolean removeFromCalendar(String userId, int eventId) {
        if (userId == null || eventId < 0) {
//            throw new IllegalArgumentException("User id cannot be null and event id cannot be less than zero");
            System.out.println("FAIL - EventAPIController.removeFromCalendar called: " + userId);
            return false;
        }
        System.out.println("PASS - removed from user calendar: " + userId + " Event: " + eventId);
        return true;
    }
}
