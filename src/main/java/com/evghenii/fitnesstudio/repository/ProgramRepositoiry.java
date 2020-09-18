package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Program;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgramRepositoiry extends MongoRepository<Program, Integer> {
}
