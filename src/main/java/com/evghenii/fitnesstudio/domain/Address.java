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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id &&
                hausNummer == address.hausNummer &&
                version == address.version &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(fitnessClub, address.fitnessClub) &&
                Objects.equals(person, address.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, street, hausNummer, fitnessClub, person, version);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", hausNummer=" + hausNummer +
                ", fitnessClub=" + fitnessClub +
                ", person=" + person +
                ", version=" + version +
                '}';
    }
}
