package com.evghenii.fitnesstudio.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Document
@Data
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainer_id")
    private int id;

    private String name;

    private int age;

    private int numberOfProgram;

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE,
            CascadeType.MERGE})
    private Set<Person> personSet = new HashSet<>();

    @Version
    private int version;

    public Trainer() {
    }

    public Trainer(String name, int age, int numberOfProgram, Set<Person> personSet, int version) {
        this.name = name;
        this.age = age;
        this.numberOfProgram = numberOfProgram;
        this.personSet = personSet;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return id == trainer.id &&
                age == trainer.age &&
                numberOfProgram == trainer.numberOfProgram &&
                version == trainer.version &&
                Objects.equals(name, trainer.name) &&
                Objects.equals(personSet, trainer.personSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, numberOfProgram, personSet, version);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberOfProgram=" + numberOfProgram +
                ", personSet=" + personSet +
                ", version=" + version +
                '}';
    }
}
