package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Models.PersonalScheduleModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personal-schedule")
public class PersonalScheduleAPIController {

    // GET personal schedule for a user
    @GetMapping("/{user_id}")
    public List<EventModel> getPersonalSchedule(@PathVariable String user_id) {

        if (user_id == null) {
            System.out.println("FAIL - PersonalScheduleAPIController.getPersonalSchedule called: Retrieving personal schedule for user " + user_id);
            return null;
        }

        List<EventModel> eventList = new ArrayList<>();

        // stubbed data
        eventList.add(new EventModel(
                1,
                "Concert",
                1,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                2,
                4
        ));

        eventList.add(new EventModel(
                2,
                "Concert Two",
                1,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                2,
                4
        ));

        System.out.println("PASS - PersonalScheduleAPIController.getPersonalSchedule called: Retrieving personal schedule for user " + user_id);

        return eventList;
    }

    // POST add event to personal schedule
    @PostMapping
    public boolean addToPersonalSchedule(@RequestBody PersonalScheduleModel personalSchedule) {

        if (personalSchedule == null) {
            System.out.println("FAIL - PersonalScheduleAPIController.addToPersonalSchedule called: " + personalSchedule);
            return false;
        }

        System.out.println("PASS - PersonalScheduleAPIController.addToPersonalSchedule called: " + personalSchedule.toString());
        return true;
    }
}