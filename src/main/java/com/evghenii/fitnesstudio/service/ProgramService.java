package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Program;

import java.math.BigDecimal;

public interface ProgramService extends CRUDService<Program> {

    Program findByName(String name);

    Program findById(int id);

    boolean existsByName(String name);

    Program findByPrice(BigDecimal price);

}
