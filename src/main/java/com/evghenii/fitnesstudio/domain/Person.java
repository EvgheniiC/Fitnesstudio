package com.evghenii.fitnesstudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Document
@Data
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

    @ManyToOne
    private Trainer trainer;

    @OneToOne
    private FitnessClub fitnessClub;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "person_program", joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "program_id"))
    private Set<Program> programSet = new HashSet<>();

    @Version
    private int version;

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE,
            CascadeType.MERGE})
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE,
            CascadeType.MERGE})
    private Set<Email> emails = new HashSet<>();

    @OneToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @JoinColumn(name = "address_fk_id")
    private Address address;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                height == person.height &&
                Double.compare(person.weightActual, weightActual) == 0 &&
                Double.compare(person.weightDesired, weightDesired) == 0 &&
                version == person.version &&
                Objects.equals(name, person.name) &&
                Objects.equals(firstDayOfTraining, person.firstDayOfTraining) &&
                Objects.equals(lastDayOfTraining, person.lastDayOfTraining) &&
                Objects.equals(trainer, person.trainer) &&
                Objects.equals(fitnessClub, person.fitnessClub) &&
                Objects.equals(programSet, person.programSet) &&
                Objects.equals(phones, person.phones) &&
                Objects.equals(emails, person.emails) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, height, weightActual, weightDesired, firstDayOfTraining, lastDayOfTraining, trainer, fitnessClub, programSet, version, phones, emails, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weightActual=" + weightActual +
                ", weightDesired=" + weightDesired +
                ", firstDayOfTraining=" + firstDayOfTraining +
                ", lastDayOfTraining=" + lastDayOfTraining +
                ", trainer=" + trainer +
                ", fitnessClub=" + fitnessClub +
                ", programSet=" + programSet +
                ", version=" + version +
                ", phones=" + phones +
                ", emails=" + emails +
                ", address=" + address +
                '}';
    }
}
