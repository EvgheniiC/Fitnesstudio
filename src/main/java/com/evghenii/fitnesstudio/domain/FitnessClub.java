package com.evghenii.fitnesstudio.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Document
@Data
public class FitnessClub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fitnessclub_id")
    private int id;

    private String name;

    private boolean isRoundTheClockWork;

    @OneToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @JoinColumn(name = "address_fk_id")
    private Address address;

    @OneToMany(mappedBy = "fitnessclub", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE,
            CascadeType.MERGE})
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "fitnessclub", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE,
            CascadeType.MERGE})
    private Set<Email> emails = new HashSet<>();

    private Program program;

    @Enumerated(EnumType.STRING)
    private Gum gum;

    @Version
    private int version;

    public FitnessClub() {
    }

    public FitnessClub(String name, boolean isRoundTheClockWork, Address address, Set<Phone> phones, Set<Email> emails, Program program, Gum gum) {
        this.name = name;
        this.isRoundTheClockWork = isRoundTheClockWork;
        this.address = address;
        this.phones = phones;
        this.emails = emails;
        this.program = program;
        this.gum = gum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FitnessClub that = (FitnessClub) o;
        return id == that.id &&
                isRoundTheClockWork == that.isRoundTheClockWork &&
                version == that.version &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phones, that.phones) &&
                Objects.equals(emails, that.emails) &&
                Objects.equals(program, that.program) &&
                gum == that.gum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isRoundTheClockWork, address, phones, emails, program, gum, version);
    }

    @Override
    public String toString() {
        return "FitnessClub{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isRoundTheClockWork=" + isRoundTheClockWork +
                ", address=" + address +
                ", phones=" + phones +
                ", emails=" + emails +
                ", program=" + program +
                ", gum=" + gum +
                ", version=" + version +
                '}';
    }
}
