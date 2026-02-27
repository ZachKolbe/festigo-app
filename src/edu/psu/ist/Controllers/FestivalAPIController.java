package edu.psu.ist.Controllers;

import edu.psu.ist.Models.FestivalModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FestivalAPIController {

    //POST
    public boolean postFestival(FestivalModel festival) {
        System.out.println(festival.toString());
        return true;
    }

    //GET
    public FestivalModel getFestivalById(int id) {
        FestivalModel festival = new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1);
        System.out.println("FestivalAPIController.getFestivalById called with id: " + id + " Festival returned: " + festival.toString());
        return festival;
    }

    //GET
    public List<FestivalModel> getAllFestivals() {
        List<FestivalModel> festivals = new ArrayList<FestivalModel>();
        festivals.add(new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        festivals.add(new FestivalModel(2, "Pittsburgh", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        festivals.add(new FestivalModel(3, "New York", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        System.out.println("FestivalAPIController.getAllFestivals called returns a list of festivals: " + festivals.toString());
        return festivals;
    }

    //PUT
    public boolean updateFestival(int id) {
        System.out.println("Updated festival id: " + id);
        return true;
    }

    //DELETE
    public boolean deleteFestival(int id) {
        System.out.println("Deleted festival id: " + id);
        return true;
    }

}
