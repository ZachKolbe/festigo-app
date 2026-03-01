package edu.psu.ist.Controllers;

import edu.psu.ist.Models.FestivalModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FestivalAPIController {

    //POST
    public boolean postFestival(FestivalModel festival) {
        if (festival == null) {
//            throw new IllegalArgumentException("festival is null");
            System.out.println("FAIL - FestivalAPIController.postFestival called: " + festival);
            return false;
        }
        System.out.println("PASS - FestivalAPIController.postFestival called: " + festival.toString());
        return true;
    }

    //GET
    public FestivalModel getFestivalById(int id) {
        if (id <= 0) {
//            throw new IllegalArgumentException("id cannot be less than zero");
            System.out.println("FAIL - FestivalAPIController.getFestivalById called: " + id);
            return null;
        }
        FestivalModel festival = new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1);
        System.out.println("PASS - FestivalAPIController.getFestivalById called with id: " + id + " Festival returned: " + festival.toString());
        return festival;
    }

    //GET
    public List<FestivalModel> getAllFestivals() {
        List<FestivalModel> festivals = new ArrayList<FestivalModel>();
        festivals.add(new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        festivals.add(new FestivalModel(2, "Pittsburgh", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        festivals.add(new FestivalModel(3, "New York", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1));
        System.out.println("PASS - FestivalAPIController.getAllFestivals called returns a list of festivals: " + festivals.toString());
        return festivals;
    }

    //PUT
    public boolean updateFestival(int id) {
        if (id <= 0) {
//            throw new IllegalArgumentException("id cannot be less than zero");
            System.out.println("FAIL - FestivalAPIController.updateFestival called: " + id);
            return false;
        }
        System.out.println("PASS - Updated festival id: " + id);
        return true;
    }

    //DELETE
    public boolean deleteFestival(int id) {
        if (id <= 0) {
//            throw new IllegalArgumentException("id cannot be less than zero");
            System.out.println("FAIL - FestivalAPIController.deleteFestival called: " + id);
            return false;
        }
        System.out.println("PASS - Deleted festival id: " + id);
        return true;
    }

}
