package edu.psu.ist.Controllers;
import edu.psu.ist.Models.FestivalModel;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class FestivalAPIController {
    public boolean addFesitval(String name, String location, String startDate, String endDate, int adminId) {
        System.out.println("Adding festival: " + name + " at location: " + location + " from " + startDate + " to " + endDate + " by admin id: " + adminId);
        return true; // success
    }
    public FestivalModel getFestival(int festivalId) {
        System.out.println("Getting festival with id: " + festivalId);
        return new FestivalModel(festivalId, "Sample Festival", "Sample Location", null, null, 1); // return sample festival
    }

    // Return all festivals (sample data)
    public List<FestivalModel> getAllFestivals() {
        System.out.println("Getting all festivals");
        List<FestivalModel> festivals = new ArrayList<>();
        // sample festivals
        festivals.add(new FestivalModel(1, "Sample Festival 1", "Sample Location 1", LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1));
        festivals.add(new FestivalModel(2, "Sample Festival 2", "Sample Location 2", LocalDateTime.now().plusMonths(1), LocalDateTime.now().plusMonths(1).plusDays(3), 2));
        return festivals;
    }

    public boolean updateFestival(int festivalId, String name, String location, String startDate, String endDate, int adminId) {
        System.out.println("Updating festival id: " + festivalId + " to name: " + name + " at location: " + location + " from " + startDate + " to " + endDate + " by admin id: " + adminId);
        return true; // success
    }
    public boolean deleteFestival(int festivalId) {
        System.out.println("Deleting festival with id: " + festivalId);
        return true; // success
    }

}
