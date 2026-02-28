package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MasterScheduleAPIController {

    //GET
    public List<EventModel> getMasterSchedule(int festival_id) {
        if (festival_id < 0) {
//            throw new IllegalArgumentException("festival_id cannot be less than zero");
            System.out.println("FAIL MasterScheduleAPIController.getMasterSchedule called: " + " Gathering master schedule " + festival_id);
            return null;
        }
        List<EventModel> eventList = new ArrayList<>();
        // stubbed data
        eventList.add(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));
        eventList.add(new EventModel(2, "concert two", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));
        System.out.println("PASS - MasterScheduleAPIController.getMasterSchedule called: " + " Gathering master schedule " + festival_id);
        return eventList;
    }
}
