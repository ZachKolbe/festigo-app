package edu.psu.ist.Repositories;

import edu.psu.ist.Models.PersonalScheduleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalScheduleRepository
        extends JpaRepository<PersonalScheduleModel, Integer> {

    List<PersonalScheduleModel> findByUserId(Integer userId);
}
