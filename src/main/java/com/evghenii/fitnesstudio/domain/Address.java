package com.evghenii.fitnesstudio.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.Objects;

@Document
@Data
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;

    private String street;

    private int hausNummer;

    private FitnessClub fitnessClub;

    private Person person;

    @Version
    private int version;

}
