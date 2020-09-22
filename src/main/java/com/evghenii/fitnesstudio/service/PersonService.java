package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Person;

public interface PersonService extends CRUDService<Person> {

    Person findByName(String name);

    Person findById(int id);

    boolean existsByName(String name);

}
