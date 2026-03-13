package edu.psu.ist.Services;

import edu.psu.ist.Models.FestivalModel;
import edu.psu.ist.Repositories.FestivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestivalService {

    private final FestivalRepository festivalRepository;

    public FestivalService(FestivalRepository festivalRepository) {
        this.festivalRepository = festivalRepository;
    }

    // Get all festivals
    public List<FestivalModel> getAllFestivals() {
        return festivalRepository.findAll();
    }

    // Get festival by ID
    public Optional<FestivalModel> getFestivalById(int id) {
        return festivalRepository.findById(id);
    }

    // Create festival
    public FestivalModel createFestival(FestivalModel festival) {
        return festivalRepository.save(festival);
    }

    // Update festival
    public FestivalModel updateFestival(int id, FestivalModel updatedFestival) {
        return festivalRepository.findById(id)
                .map(festival -> {
                    festival.setId(updatedFestival.getId());
                    festival.setLocation(updatedFestival.getLocation());
                    festival.setStartDate(updatedFestival.getStartDate());
                    festival.setEndDate(updatedFestival.getEndDate());
                    festival.setEventAdmin(updatedFestival.getEventAdmin());
                    return festivalRepository.save(festival);
                })
                .orElse(null);
    }

    // Delete festival
    public void deleteFestival(int id) {
        festivalRepository.deleteById(id);
    }
}
