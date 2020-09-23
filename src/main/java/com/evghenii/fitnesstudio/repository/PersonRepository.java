package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.Phone;
import com.evghenii.fitnesstudio.domain.Program;
import jdk.packager.internal.legacy.ModuleManager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer> {

    Person findByName(String name);

    Person findById(int id);

    boolean existsByName(String name);

    void deleteAllByProgramSet(Set<Program> programSet);

    void deleteByPhones(Set<Phone> phones);

    void deleteByAddress(Address address);

}
