package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StetisticPersonRepository extends MongoRepository<StatisticPerson, Integer> {
}
