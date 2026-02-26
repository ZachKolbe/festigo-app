package edu.psu.ist.Controllers;
import edu.psu.ist.Models.MasterScheduleModel;

public class MasterScheduleAPIController {

    //MASTER SCHEDUL
    // get master schedule (all events) for a specific festival
    public MasterScheduleModel getMasterSchedule(int festivalId) {
        System.out.println("Getting master schedule for festival id: " + festivalId);
        return new MasterScheduleModel(festivalId); // return master schedule
    }

}
