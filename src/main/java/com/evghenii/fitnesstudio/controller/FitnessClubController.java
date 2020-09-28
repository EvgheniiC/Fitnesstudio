package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import com.evghenii.fitnesstudio.service.FitnessClubService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("fitnessclub")
public class FitnessClubController {

    private final FitnessClubService fitnessClubService;

    public FitnessClubController(FitnessClubService fitnessClubService) {
        this.fitnessClubService = fitnessClubService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody FitnessClub fitnessClub) {
        fitnessClubService.save(fitnessClub);
    }

    @DeleteMapping(value = "/fitnessclubs/{fitnessclubId}")
    public void deleteById(@PathVariable("fitnessclubId") int id) {
        fitnessClubService.deleteById(id);
    }

    @GetMapping(value = "/fitnessclubs/{fitnessclubId}")
    public FitnessClub findFitnessClubById(@PathVariable("fitnessclubId") int id) {
        return fitnessClubService.findById(id);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody @Valid FitnessClub fitnessClub) {
        fitnessClubService.update(fitnessClub);
    }

}
