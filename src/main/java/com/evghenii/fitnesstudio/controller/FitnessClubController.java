package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.FitnessClub;
import com.evghenii.fitnesstudio.service.FitnessClubService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
