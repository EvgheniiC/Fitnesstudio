package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.Trainer;
import com.evghenii.fitnesstudio.service.TrainerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainer")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Trainer trainer) {
        trainerService.save(trainer);
    }

}
