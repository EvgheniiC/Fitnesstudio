package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.FitnessClub;

public interface FitnessClubService extends CRUDService<FitnessClub> {

    FitnessClub findByName(String name);

    FitnessClub findById(int id);

    boolean existsByName(String name);

}
