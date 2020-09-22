package com.evghenii.fitnesstudio.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.Objects;

@Document
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int id;

    private String city;

    private String street;

    private int hausNummer;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private FitnessClub fitnessClub;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    @Positive
    private Person person;

    @Version
    private int version;

    public Address() {
    }

}
