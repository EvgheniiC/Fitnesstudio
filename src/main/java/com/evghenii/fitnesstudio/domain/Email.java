package com.evghenii.fitnesstudio.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Document
@Data
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private int id;

    @NotEmpty
    @NotNull(message = "Email cannot be null")
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fitnessclub_fk_id")
    private FitnessClub fitnessClub;

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_fk_id")
    private Person person;

    @Version
    private int version;

    public Email() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return id == email1.id &&
                version == email1.version &&
                Objects.equals(email, email1.email) &&
                Objects.equals(fitnessClub, email1.fitnessClub) &&
                Objects.equals(person, email1.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, fitnessClub, person, version);
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fitnessClub=" + fitnessClub +
                ", person=" + person +
                ", version=" + version +
                '}';
    }
}
