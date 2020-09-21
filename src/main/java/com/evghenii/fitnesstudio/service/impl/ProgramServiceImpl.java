package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.repository.ProgramRepositoiry;
import com.evghenii.fitnesstudio.service.ProgramService;
import org.springframework.stereotype.Service;

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
    public void update(Program program) {

    }

    @Override
    public void deleteById(int id) {
        programRepositoiry.deleteById(id);
    }

    @Override
    public List<Program> findAll() {
        return programRepositoiry.findAll();
    }
}