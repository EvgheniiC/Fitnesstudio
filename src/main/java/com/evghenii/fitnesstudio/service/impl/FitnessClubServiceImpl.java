package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import com.evghenii.fitnesstudio.repository.FitnessClubRepository;
import com.evghenii.fitnesstudio.service.FitnessClubService;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessClubServiceImpl implements FitnessClubService {

    private final FitnessClubRepository fitnessClubRepository;

    private final MongoOperations mongoOperations;

    public FitnessClubServiceImpl(FitnessClubRepository fitnessClubRepository, MongoOperations mongoOperations) {
        this.fitnessClubRepository = fitnessClubRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void save(FitnessClub fitnessClub) {
        fitnessClubRepository.save(fitnessClub);
    }


    @Override
    public void deleteById(int id) {
        fitnessClubRepository.deleteById(id);
    }

    @Override
    public List<FitnessClub> findAll() {
        return fitnessClubRepository.findAll();
    }

    @Override
    public FitnessClub findByName(String name) {
        return fitnessClubRepository.findByName(name);
    }

    @Override
    public FitnessClub findById(int id) {
        return fitnessClubRepository.findById(id);
    }

    @Override
    public boolean existsByName(String name) {
        return fitnessClubRepository.existsByName(name);
    }

    @Override
    public void update(FitnessClub fitnessClub) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(fitnessClub.getId()));
        Update update = new Update();
        update.set("name", fitnessClub.getName());
        mongoOperations.findAndModify(query, update, FitnessClub.class);
    }
}
