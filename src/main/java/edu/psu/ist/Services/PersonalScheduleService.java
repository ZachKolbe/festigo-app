package edu.psu.ist.Services;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Models.PersonalScheduleModel;
import edu.psu.ist.Repositories.EventRepository;
import edu.psu.ist.Repositories.PersonalScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonalScheduleService {

    private final PersonalScheduleRepository personalScheduleRepository;
    private final EventRepository eventRepository;

    public PersonalScheduleService(PersonalScheduleRepository personalScheduleRepository,
                                   EventRepository eventRepository) {
        this.personalScheduleRepository = personalScheduleRepository;
        this.eventRepository = eventRepository;
    }

    // Get personal schedule (events for a user)
    public List<EventModel> getPersonalSchedule(Integer userId) {

        return personalScheduleRepository.findByUserId(userId)
                .stream()
                .map(schedule -> eventRepository.findById(schedule.getEventId())
                        .orElse(null))
                .filter(event -> event != null)
                .collect(Collectors.toList());
    }

    // Add event to personal schedule
    public PersonalScheduleModel addToPersonalSchedule(PersonalScheduleModel personalSchedule) {
        return personalScheduleRepository.save(personalSchedule);
    }
}
