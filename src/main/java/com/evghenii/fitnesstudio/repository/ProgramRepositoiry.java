package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Program;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

public interface ProgramRepositoiry extends MongoRepository<Program, Integer> {

    Program findByName(String name);

    Program findById(int id);

    boolean existsByName(String name);

    Program findByPrice(BigDecimal price);
}
