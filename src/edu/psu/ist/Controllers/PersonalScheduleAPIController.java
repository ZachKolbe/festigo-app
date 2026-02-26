package edu.psu.ist.Controllers;

public class PersonalScheduleAPIController {
        //GET Personal Schedule for a user
        public String getPersonalSchedule(String userId) {
            System.out.println("Getting personal schedule for user id: " + userId);
            return "Personal schedule for user: " + userId; // return personal schedule
        }

        //POST - Add event to user's personal schedule
        public boolean addEventToPersonalSchedule(String userId, int eventId, int festivalId) {
            System.out.println("Adding event ID: " + eventId + " to personal schedule for user: " + userId + " in festival: " + festivalId);
            return true; // success
        }
}
