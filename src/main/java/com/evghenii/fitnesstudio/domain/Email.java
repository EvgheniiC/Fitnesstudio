package com.evghenii.fitnesstudio.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Document
@Data
@AllArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private int id;

    @NotEmpty
    @NotNull(message = "Email cannot be null")
    private String email;

    private FitnessClub fitnessClub;

    private Person person;

    @Version
    private int version;

}
