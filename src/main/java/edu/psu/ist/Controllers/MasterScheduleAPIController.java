package edu.psu.ist.Controllers;

import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Services.MasterScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master-schedule")
public class MasterScheduleAPIController {

    private final MasterScheduleService masterScheduleService;

    public MasterScheduleAPIController(MasterScheduleService masterScheduleService) {
        this.masterScheduleService = masterScheduleService;
    }

    // GET master schedule for a festival
    @GetMapping("/{festivalId}")
    public List<EventModel> getMasterSchedule(@PathVariable int festivalId) {
        return masterScheduleService.getMasterScheduleByFestivalId(festivalId);
    }
}