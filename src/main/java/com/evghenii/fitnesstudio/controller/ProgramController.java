package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.domain.Program;
import com.evghenii.fitnesstudio.service.ProgramService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("program")
public class ProgramController {

    private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Program program) {
        programService.save(program);
    }

    @DeleteMapping(value = "/programs/{programId}")
    public void deleteById(@PathVariable("programId") int id) {
        programService.deleteById(id);
    }

    @GetMapping(value = "/programs/{programId}")
    public Program findProgramById(@PathVariable("programId") int id) {
        return programService.findById(id);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody @Valid Program program) {
        programService.update(program);
    }

}
