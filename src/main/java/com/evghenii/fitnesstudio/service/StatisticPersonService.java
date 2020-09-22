package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.StatisticPerson;

import java.time.LocalDate;

public interface StatisticPersonService extends CRUDService<StatisticPerson> {
    StatisticPerson findByVisitByDate(LocalDate localDate);
}
