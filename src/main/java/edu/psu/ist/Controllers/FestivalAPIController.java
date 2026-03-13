package edu.psu.ist.Controllers;

import edu.psu.ist.Models.FestivalModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/festivals")
public class FestivalAPIController {

    // ---------------- CREATE ----------------

    @PostMapping
    public boolean postFestival(@RequestBody FestivalModel festival) {

        if (festival == null) {
            System.out.println("FAIL - FestivalAPIController.postFestival called: " + festival);
            return false;
        }

        System.out.println("PASS - FestivalAPIController.postFestival called: " + festival.toString());
        return true;
    }

    // ---------------- GET BY ID ----------------

    @GetMapping("/{id}")
    public FestivalModel getFestivalById(@PathVariable int id) {

        if (id <= 0) {
            System.out.println("FAIL - FestivalAPIController.getFestivalById called: " + id);
            return null;
        }

        FestivalModel festival = new FestivalModel(
                1,
                "Los Angeles",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                1
        );

        System.out.println("PASS - FestivalAPIController.getFestivalById called with id: "
                + id + " Festival returned: " + festival.toString());

        return festival;
    }

    // ---------------- GET ALL ----------------

    @GetMapping
    public List<FestivalModel> getAllFestivals() {

        List<FestivalModel> festivals = new ArrayList<>();

        festivals.add(new FestivalModel(
                1,
                "Los Angeles",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                1
        ));

        festivals.add(new FestivalModel(
                2,
                "Pittsburgh",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                1
        ));

        festivals.add(new FestivalModel(
                3,
                "New York",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                1
        ));

        System.out.println("PASS - FestivalAPIController.getAllFestivals called returns: " + festivals);

        return festivals;
    }

    // ---------------- UPDATE ----------------

    @PutMapping("/{id}")
    public boolean updateFestival(@PathVariable int id, @RequestBody FestivalModel festival) {

        if (id <= 0) {
            System.out.println("FAIL - FestivalAPIController.updateFestival called: " + id);
            return false;
        }

        System.out.println("PASS - Updated festival id: " + id);
        return true;
    }

    // ---------------- DELETE ----------------

    @DeleteMapping("/{id}")
    public boolean deleteFestival(@PathVariable int id) {

        if (id <= 0) {
            System.out.println("FAIL - FestivalAPIController.deleteFestival called: " + id);
            return false;
        }

        System.out.println("PASS - Deleted festival id: " + id);
        return true;
    }
}