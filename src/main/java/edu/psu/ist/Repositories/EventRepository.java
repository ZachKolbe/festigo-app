package edu.psu.ist.Repositories;

import edu.psu.ist.Models.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EventModel, Integer> {
    // Custom query example
    List<EventModel> findByFestivalId(int festivalId);
}
