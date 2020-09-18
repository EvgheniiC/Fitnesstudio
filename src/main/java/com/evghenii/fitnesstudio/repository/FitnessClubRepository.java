package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FitnessClubRepository extends MongoRepository<FitnessClub, Integer> {
}
