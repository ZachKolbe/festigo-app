package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Models.PersonalScheduleModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PersonalScheduleAPIController {

    //GET
    public List<EventModel> getPersonalSchedule(String user_id) {
        List<EventModel> eventList = new ArrayList<>();
        // stubbed data
        eventList.add(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));
        eventList.add(new EventModel(2, "concert two", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));
        System.out.println("PersonalScheduleAPIController.getPersonalSchedule called: " + " Retrieving personal schedule for user " + user_id);
        return eventList;
    }

    //POST
    public boolean addToPersonalSchedule(PersonalScheduleModel personalSchedule) {
        System.out.println( "PersonalScheduleAPIController.getPersonalSchedule called: " + personalSchedule.toString());
        return true;
    }
}
