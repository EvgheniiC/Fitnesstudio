package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.Trainer;
import com.evghenii.fitnesstudio.service.TrainerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("trainers")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Trainer trainer) {
        trainerService.save(trainer);
    }

    @DeleteMapping(value = "/trainer/{trainerId}")
    public void deleteById(@PathVariable("trainerId") int id) {
        trainerService.deleteById(id);
    }

    @GetMapping(value = "/trainer/{trainerId}")
    public Trainer findPersonById(@PathVariable("trainerId") int id) {
        return trainerService.findById(id);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody @Valid Trainer trainer) {
        trainerService.update(trainer);
    }

}
