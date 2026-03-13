package edu.psu.ist.Services;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<EventModel> getAllEvents() {
        return repository.findAll();
    }

    public EventModel createEvent(EventModel event) {
        return repository.save(event);
    }

    public void deleteEvent(int id) {
        repository.deleteById(id);
    }

    public List<EventModel> getEventsByFestival(int festivalId) {
        return repository.findByFestivalId(festivalId);
    }
}
