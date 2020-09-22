package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Trainer;

public interface TrainerService extends CRUDService<Trainer> {

    Trainer findByName(String name);

    Trainer findById(int id);

    boolean existsByName(String name);

}
