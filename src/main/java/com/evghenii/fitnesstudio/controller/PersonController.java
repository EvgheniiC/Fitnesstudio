package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping(value = "/persons/{personId}")
    public void deleteById(@PathVariable("personId") int id) {
        personService.deleteById(id);
    }

    @GetMapping(value = "/persons/{personId}")
    public Person findPersonById(@PathVariable("personId") int id) {
        return personService.findById(id);
    }

    @GetMapping(value = "/persons/{city}")
    public List<Person> findPersonByCity(@PathVariable("city") String city) {
        return personService.findByCity(city);
    }

}
