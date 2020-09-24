package com.evghenii.fitnesstudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Document
@Data
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int id;

    private String name;

    private int age;

    private int height;

    private double weightActual;

    private double weightDesired;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate firstDayOfTraining;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate lastDayOfTraining;

    private Trainer trainer;

    private FitnessClub fitnessClub;

    private Set<Program> programSet = new HashSet<>();

    @Version
    private int version;

    private Set<Phone> phones = new HashSet<>();

    private Set<Email> emails = new HashSet<>();

    private Address address;

    public Person() {
    }
}
