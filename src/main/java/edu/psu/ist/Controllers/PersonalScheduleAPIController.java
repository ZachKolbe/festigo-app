package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Models.PersonalScheduleModel;
import edu.psu.ist.Services.PersonalScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal-schedule")
public class PersonalScheduleAPIController {

    private final PersonalScheduleService personalScheduleService;

    public PersonalScheduleAPIController(PersonalScheduleService personalScheduleService) {
        this.personalScheduleService = personalScheduleService;
    }

    // GET personal schedule for a user
    @GetMapping("/{userId}")
    public List<EventModel> getPersonalSchedule(@PathVariable Integer userId) {
        return personalScheduleService.getPersonalSchedule(userId);
    }

    // POST add event to personal schedule
    @PostMapping
    public PersonalScheduleModel addToPersonalSchedule(
            @RequestBody PersonalScheduleModel personalSchedule) {

        return personalScheduleService.addToPersonalSchedule(personalSchedule);
    }
}