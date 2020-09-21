package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.repository.PersonRepository;
import com.evghenii.fitnesstudio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void save(Person person) {
        person.getEmails().forEach(e -> e.setPerson(person));
        person.getPhones().forEach(e -> e.setPerson(person));
        person.getAddress().setPerson(person);
        personRepository.save(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Person> findAll() {
        return null;
    }
}
