package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessClubRepository extends MongoRepository<FitnessClub, Integer> {

    FitnessClub findByName(String name);

    FitnessClub findById(int id);

    boolean existsByName(String name);

    void update(FitnessClub fitnessClub);

}
