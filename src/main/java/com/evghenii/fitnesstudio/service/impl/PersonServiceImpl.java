package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.Phone;
import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.repository.PersonRepository;
import com.evghenii.fitnesstudio.service.PersonService;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    private final MongoOperations mongoOperations;

    public PersonServiceImpl(PersonRepository personRepository, MongoOperations mongoOperations) {
        this.personRepository = personRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void save(Person person) {
        //   person.getEmails().forEach(e -> e.setPerson(person));
      /*  person.getPhones().forEach(e -> e.setPerson(person));
         person.getAddress().setPerson(person);*/
        personRepository.save(person);
    }

    @Override
    public void deleteById(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public Person findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public boolean existsByName(String name) {
        return personRepository.existsByName(name);
    }

    @Override
    public void deleteAllByProgramSet(Set<Program> programSet) {
        personRepository.deleteAllByProgramSet(programSet);
    }

    @Override
    public void deleteByPhones(Set<Phone> phones) {
        personRepository.deleteByPhones(phones);
    }

    @Override
    public void deleteByAddress(Address address) {
        personRepository.deleteByAddress(address);
    }

    @Override
    public List<Person> findByCity(String city) {
        return personRepository.findByCity(city);
    }

    @Override
    public void update(Person person) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(person.getId()));
        Update update = new Update();
        update.set("name", person.getName());
        update.set("height", person.getHeight());
        update.set("weightActual", person.getWeightActual());
        update.set("weightDesired", person.getWeightDesired());
        mongoOperations.findAndModify(query, update, Person.class);
    }
}
