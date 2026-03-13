package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/master-schedule")
public class MasterScheduleAPIController {

    // GET master schedule for a festival
    @GetMapping("/{festival_id}")
    public List<EventModel> getMasterSchedule(@PathVariable int festival_id) {

        if (festival_id < 0) {
            System.out.println("FAIL - MasterScheduleAPIController.getMasterSchedule called: Gathering master schedule " + festival_id);
            return null;
        }

        List<EventModel> eventList = new ArrayList<>();

        // Stubbed data
        eventList.add(new EventModel(
                1,
                "Concert",
                1,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                2,
                festival_id
        ));

        eventList.add(new EventModel(
                2,
                "Concert Two",
                1,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                2,
                festival_id
        ));

        System.out.println("PASS - MasterScheduleAPIController.getMasterSchedule called: Gathering master schedule " + festival_id);

        return eventList;
    }
}