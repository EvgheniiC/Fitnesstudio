package com.evghenii.fitnesstudio.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Objects;

@Document
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private int id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Version
    private int version;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fitnessclub_fk_id")
    private FitnessClub fitnessClub;

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_fk_id")
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public FitnessClub getFitnessClub() {
        return fitnessClub;
    }

    public void setFitnessClub(FitnessClub fitnessClub) {
        this.fitnessClub = fitnessClub;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Phone() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id &&
                version == phone.version &&
                Objects.equals(phoneNumber, phone.phoneNumber) &&
                Objects.equals(fitnessClub, phone.fitnessClub) &&
                Objects.equals(person, phone.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, version, fitnessClub, person);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", version=" + version +
                ", fitnessClub=" + fitnessClub +
                ", person=" + person +
                '}';
    }
}
