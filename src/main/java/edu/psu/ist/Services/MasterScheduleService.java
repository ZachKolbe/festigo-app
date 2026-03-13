package edu.psu.ist.Services;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterScheduleService {

    private final EventRepository eventRepository;

    public MasterScheduleService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventModel> getMasterScheduleByFestivalId(int festivalId) {

        if (festivalId < 0) {
            throw new IllegalArgumentException("Festival ID must be positive.");
        }

        return eventRepository.findByFestivalId(festivalId);
    }
}
