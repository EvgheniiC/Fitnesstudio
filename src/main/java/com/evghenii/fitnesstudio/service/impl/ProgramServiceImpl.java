package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.repository.ProgramRepositoiry;
import com.evghenii.fitnesstudio.service.ProgramService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepositoiry programRepositoiry;

    public ProgramServiceImpl(ProgramRepositoiry programRepositoiry) {
        this.programRepositoiry = programRepositoiry;
    }

    @Override
    public void save(Program program) {
        programRepositoiry.save(program);
    }

    @Override
    public void deleteById(int id) {
        programRepositoiry.deleteById(id);
    }

    @Override
    public List<Program> findAll() {
        return programRepositoiry.findAll();
    }

    @Override
    public Program findByName(String name) {
        return programRepositoiry.findByName(name);
    }

    @Override
    public Program findById(int id) {
        return programRepositoiry.findById(id);
    }

    @Override
    public boolean existsByName(String name) {
        return programRepositoiry.existsByName(name);
    }

    @Override
    public Program findByPrice(BigDecimal price) {
        return programRepositoiry.findByPrice(price);
    }
}
