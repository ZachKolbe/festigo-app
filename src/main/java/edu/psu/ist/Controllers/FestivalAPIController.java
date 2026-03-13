package edu.psu.ist.Controllers;

import edu.psu.ist.Models.FestivalModel;
import edu.psu.ist.Repositories.FestivalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/festivals")
public class FestivalAPIController {

    private final FestivalRepository festivalRepository;

    public FestivalAPIController(FestivalRepository festivalRepository) {
        this.festivalRepository = festivalRepository;
    }

    // ---------------- CREATE ----------------
    @PostMapping
    public FestivalModel createFestival(@RequestBody FestivalModel festival) {
        return festivalRepository.save(festival);
    }

    // ---------------- GET BY ID ----------------
    @GetMapping("/{id}")
    public FestivalModel getFestivalById(@PathVariable int id) {

        Optional<FestivalModel> festival = festivalRepository.findById(id);

        return festival.orElse(null);
    }

    // ---------------- GET ALL ----------------
    @GetMapping
    public List<FestivalModel> getAllFestivals() {
        return festivalRepository.findAll();
    }

    // ---------------- UPDATE ----------------
    @PutMapping("/{id}")
    public FestivalModel updateFestival(@PathVariable int id, @RequestBody FestivalModel updatedFestival) {

        Optional<FestivalModel> existing = festivalRepository.findById(id);

        if (existing.isPresent()) {
            FestivalModel festival = existing.get();

            festival.setLocation(updatedFestival.getLocation());
            festival.setFestivalName(updatedFestival.getFestivalName());
            festival.setStartDate(updatedFestival.getStartDate());
            festival.setEndDate(updatedFestival.getEndDate());
            festival.setEventAdmin(updatedFestival.getEventAdmin());

            return festivalRepository.save(festival);
        }

        return null;
    }

    // ---------------- DELETE ----------------
    @DeleteMapping("/{id}")
    public void deleteFestival(@PathVariable int id) {
        festivalRepository.deleteById(id);
    }
}