package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import com.evghenii.fitnesstudio.repository.StatisticPersonRepository;
import com.evghenii.fitnesstudio.service.StatisticPersonService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StatisticPersonServiceImpl implements StatisticPersonService {

    private final StatisticPersonRepository statisticPersonRepository;

    public StatisticPersonServiceImpl(StatisticPersonRepository statisticPersonRepository) {
        this.statisticPersonRepository = statisticPersonRepository;
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
}
