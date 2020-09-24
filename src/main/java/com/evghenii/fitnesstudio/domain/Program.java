package com.evghenii.fitnesstudio.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Document
@Data
@AllArgsConstructor
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private BigDecimal price;

    private int numberOfVisitPerWeek;

    private double caloriesBurned;

    private FitnessClub fitnessClub;

    @Enumerated(EnumType.STRING)
    private KindOfProgram kindOfProgram;

    @Enumerated(EnumType.STRING)
    private ProgramType programType;

    @Version
    private int version;

}
