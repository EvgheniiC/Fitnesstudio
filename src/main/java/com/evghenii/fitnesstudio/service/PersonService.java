package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.Phone;
import com.evghenii.fitnesstudio.domain.Program;

import java.util.Set;

public interface PersonService extends CRUDService<Person> {

    Person findByName(String name);

    Person findById(int id);

    boolean existsByName(String name);

    void deleteAllByProgramSet(Set<Program> programSet);

    void deleteByPhones(Set<Phone> phones);

    void deleteByAddress(Address address);

}
