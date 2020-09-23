package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Trainer;
import com.evghenii.fitnesstudio.repository.TrainerRepository;
import com.evghenii.fitnesstudio.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
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
}
