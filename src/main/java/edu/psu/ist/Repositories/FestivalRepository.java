package edu.psu.ist.Repositories;

import edu.psu.ist.Models.FestivalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivalRepository extends JpaRepository<FestivalModel, Integer> {
}
