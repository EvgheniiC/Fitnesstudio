package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;

public interface StatisticPersonRepository extends MongoRepository<StatisticPerson, Integer> {

    StatisticPerson findByVisitByDate(LocalDate localDate);
}
