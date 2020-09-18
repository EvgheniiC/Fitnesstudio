package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainerRepository extends MongoRepository<Trainer, Integer> {
}
