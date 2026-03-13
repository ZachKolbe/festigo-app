package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Repositories.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventAPIController {

    private final EventRepository eventRepository;

    // Constructor Injection (Best Practice)
    public EventAPIController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // ---------------- GET ALL EVENTS ----------------
    @GetMapping
    public List<EventModel> getEvents() {
        return eventRepository.findAll();
    }

    // ---------------- CREATE EVENT ----------------
    @PostMapping
    public EventModel addEvent(@RequestBody EventModel event) {
        return eventRepository.save(event);
    }

    // ---------------- UPDATE EVENT ----------------
    @PutMapping("/{eventId}")
    public EventModel updateEvent(@PathVariable int eventId,
                                  @RequestBody EventModel updatedEvent) {

        Optional<EventModel> existingEvent = eventRepository.findById(eventId);

        if (existingEvent.isPresent()) {
            EventModel event = existingEvent.get();

            event.setTitle(updatedEvent.getTitle());
            event.setEventType(updatedEvent.getEventType());
            event.setStartTime(updatedEvent.getStartTime());
            event.setEndTime(updatedEvent.getEndTime());
            event.setOrganizerId(updatedEvent.getOrganizerId());
            event.setFestivalId(updatedEvent.getFestivalId());

            return eventRepository.save(event);
        }

        return null;
    }

    // ---------------- DELETE EVENT ----------------
    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable int eventId) {
        eventRepository.deleteById(eventId);
    }
}