package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface StatisticPersonRepository extends MongoRepository<StatisticPerson, Integer> {

    StatisticPerson findByVisitByDate(LocalDate localDate);

    void update(StatisticPerson statisticPerson);
}
