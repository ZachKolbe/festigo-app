package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventAPIController {

    // ---------------- ADMIN ----------------

    @GetMapping
    public List<EventModel> getEvents() {

        List<EventModel> events = new ArrayList<>();

        events.add(new EventModel(
                1,
                "Career Fair",
                1,
                LocalDateTime.of(2026, 4, 2, 10, 0),
                LocalDateTime.of(2026, 4, 2, 15, 0),
                101,
                10
        ));

        events.add(new EventModel(
                2,
                "Hackathon",
                2,
                LocalDateTime.of(2026, 4, 10, 18, 0),
                LocalDateTime.of(2026, 4, 11, 6, 0),
                102,
                11
        ));

        System.out.println("PASS - EventAPIController.getEvents called");

        return events;
    }

    // CREATE event
    @PostMapping
    public boolean addEvent(@RequestBody EventModel event) {

        if (event == null) {
            System.out.println("FAIL - EventAPIController.addEvent called: " + event);
            return false;
        }

        System.out.println("PASS - EventAPIController.addEvent called: " + event.toString());
        return true;
    }

    // UPDATE event
    @PutMapping
    public boolean updateEvent(@RequestBody EventModel event) {

        if (event == null) {
            System.out.println("FAIL - EventAPIController.updateEvent called: " + event);
            return false;
        }

        System.out.println("PASS - EventAPIController.updateEvent called: " + event.toString());
        return true;
    }

    // DELETE event
    @DeleteMapping("/{eventId}")
    public boolean deleteEvent(@PathVariable int eventId) {

        if (eventId < 0) {
            System.out.println("FAIL - EventAPIController.deleteEvent called: " + eventId);
            return false;
        }

        System.out.println("PASS - Deleted event id: " + eventId);
        return true;
    }

    // ---------------- USERS ----------------

    // Add event to user calendar
    @PostMapping("/calendar/{userId}")
    public boolean addToCalendar(@RequestBody EventModel event, @PathVariable String userId) {

        if (event == null || userId == null) {
            System.out.println("FAIL - EventAPIController.addToCalendar called: " + event);
            return false;
        }

        System.out.println("PASS - EventAPIController.addToCalendar called: "
                + event.toString() + " added to user calendar: " + userId);

        return true;
    }

    // Remove event from user calendar
    @DeleteMapping("/calendar/{userId}/{eventId}")
    public boolean removeFromCalendar(@PathVariable String userId,
                                      @PathVariable int eventId) {

        if (userId == null || eventId < 0) {
            System.out.println("FAIL - EventAPIController.removeFromCalendar called: " + userId);
            return false;
        }

        System.out.println("PASS - removed from user calendar: "
                + userId + " Event: " + eventId);

        return true;
    }
}