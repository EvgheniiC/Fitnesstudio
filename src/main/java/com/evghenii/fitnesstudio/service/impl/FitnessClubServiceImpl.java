package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import com.evghenii.fitnesstudio.repository.FitnessClubRepository;
import com.evghenii.fitnesstudio.service.FitnessClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessClubServiceImpl implements FitnessClubService {

    private final FitnessClubRepository fitnessClubRepository;

    public FitnessClubServiceImpl(FitnessClubRepository fitnessClubRepository) {
        this.fitnessClubRepository = fitnessClubRepository;
    }

    @Override
    public void save(FitnessClub fitnessClub) {
        fitnessClubRepository.save(fitnessClub);
    }

    @Override
    public void update(FitnessClub fitnessClub) {

    }

    @Override
    public void deleteById(int id) {
        fitnessClubRepository.deleteById(id);
    }

    @Override
    public List<FitnessClub> findAll() {
        return fitnessClubRepository.findAll();
    }
}
