package com.evghenii.fitnesstudio.controller;

import com.evghenii.fitnesstudio.domain.StatisticPerson;
import com.evghenii.fitnesstudio.service.StatisticPersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
