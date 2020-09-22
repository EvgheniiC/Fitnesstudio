package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FitnessClubRepository extends MongoRepository<FitnessClub, Integer> {

    FitnessClub findByName(String name);

    FitnessClub findById(int id);

    boolean existsByName(String name);

}
