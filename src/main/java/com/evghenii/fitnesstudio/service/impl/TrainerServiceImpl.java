package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.StatisticPerson;
import com.evghenii.fitnesstudio.domain.Trainer;
import com.evghenii.fitnesstudio.repository.TrainerRepository;
import com.evghenii.fitnesstudio.service.TrainerService;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private final TrainerRepository trainerRepository;

    private final MongoOperations mongoOperations;

    public TrainerServiceImpl(TrainerRepository trainerRepository, MongoOperations mongoOperations) {
        this.trainerRepository = trainerRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void save(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    @Override
    public void deleteById(int id) {
        trainerRepository.deleteById(id);
    }

    @Override
    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer findByName(String name) {
        return trainerRepository.findByName(name);
    }

    @Override
    public Trainer findById(int id) {
        return trainerRepository.findById(id);
    }

    @Override
    public boolean existsByName(String name) {
        return trainerRepository.existsByName(name);
    }

    @Override
    public void update(Trainer trainer) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(trainer.getId()));
        Update update = new Update();
        update.set("name", trainer.getName());
        update.set("age", trainer.getAge());
        update.set("numberOfProgram", trainer.getNumberOfProgram());
        mongoOperations.findAndModify(query, update, Trainer.class);
    }
}
