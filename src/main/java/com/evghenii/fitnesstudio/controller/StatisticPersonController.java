package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import com.evghenii.fitnesstudio.service.StatisticPersonService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("statistic")
public class StatisticPersonController {

    private final StatisticPersonService statisticPersonService;

    public StatisticPersonController(StatisticPersonService statisticPersonService) {
        this.statisticPersonService = statisticPersonService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody StatisticPerson statisticPerson) {
        statisticPersonService.save(statisticPerson);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody @Valid StatisticPerson statisticPerson) {
        statisticPersonService.update(statisticPerson);
    }
}
