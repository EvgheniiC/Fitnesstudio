package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.domain.StatisticPerson;
import com.evghenii.fitnesstudio.repository.StatisticPersonRepository;
import com.evghenii.fitnesstudio.service.StatisticPersonService;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StatisticPersonServiceImpl implements StatisticPersonService {

    private final StatisticPersonRepository statisticPersonRepository;

    private final MongoOperations mongoOperations;

    public StatisticPersonServiceImpl(StatisticPersonRepository statisticPersonRepository, MongoOperations mongoOperations) {
        this.statisticPersonRepository = statisticPersonRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void save(StatisticPerson statisticPerson) {
        statisticPersonRepository.save(statisticPerson);
    }

    @Override
    public void deleteById(int id) {
        statisticPersonRepository.deleteById(id);
    }

    @Override
    public List<StatisticPerson> findAll() {
        return statisticPersonRepository.findAll();
    }

    @Override
    public StatisticPerson findByVisitByDate(LocalDate localDate) {
        return statisticPersonRepository.findByVisitByDate(localDate);
    }

    @Override
    public void update(StatisticPerson statisticPerson) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(statisticPerson.getId()));
        Update update = new Update();
        update.set("actualWeight", statisticPerson.getActualWeight());
        update.set("countOfVisits", statisticPerson.getCountOfVisits());
        mongoOperations.findAndModify(query, update, StatisticPerson.class);
    }
}
