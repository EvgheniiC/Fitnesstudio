package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Integer> {

    Person findByName(String name);

    Person findById(int id);

    boolean existsByName(String name);

}
