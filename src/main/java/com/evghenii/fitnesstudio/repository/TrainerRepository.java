package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainerRepository extends MongoRepository<Trainer, Integer> {

    Trainer findByName(String name);

    Trainer findById(int id);

    boolean existsByName(String name);
}
