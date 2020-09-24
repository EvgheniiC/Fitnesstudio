package com.evghenii.fitnesstudio.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Objects;

@Document
@Data
@AllArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String phoneNumber;

    @Version
    private int version;

    private FitnessClub fitnessClub;

    private Person person;
}
