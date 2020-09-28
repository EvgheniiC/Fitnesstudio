package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.repository.ProgramRepositoiry;
import com.evghenii.fitnesstudio.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepositoiry programRepositoiry;

    private final MongoOperations mongoOperations;

    public ProgramServiceImpl(ProgramRepositoiry programRepositoiry, MongoOperations mongoOperations) {
        this.programRepositoiry = programRepositoiry;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void save(Program program) {
        programRepositoiry.save(program);
    }

    @Override
    public void deleteById(int id) {
        programRepositoiry.deleteById(id);
    }

    @Override
    public List<Program> findAll() {
        return programRepositoiry.findAll();
    }

    @Override
    public Program findByName(String name) {
        return programRepositoiry.findByName(name);
    }

    @Override
    public Program findById(int id) {
        return programRepositoiry.findById(id);
    }

    @Override
    public boolean existsByName(String name) {
        return programRepositoiry.existsByName(name);
    }

    @Override
    public Program findByPrice(BigDecimal price) {
        return programRepositoiry.findByPrice(price);
    }

    @Override
    public void update(Program program) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(program.getId()));
        Update update = new Update();
        update.set("name", program.getName());
        update.set("price", program.getPrice());
        update.set("numberOfVisitPerWeek", program.getNumberOfVisitPerWeek());
        update.set("caloriesBurned", program.getCaloriesBurned());
        mongoOperations.findAndModify(query, update, Program.class);
    }
}
