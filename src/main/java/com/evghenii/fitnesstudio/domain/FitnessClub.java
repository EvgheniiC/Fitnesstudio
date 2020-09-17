package com.evghenii.fitnesstudio.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Document
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoundTheClockWork() {
        return isRoundTheClockWork;
    }

    public void setRoundTheClockWork(boolean roundTheClockWork) {
        isRoundTheClockWork = roundTheClockWork;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Gum getGum() {
        return gum;
    }

    public void setGum(Gum gum) {
        this.gum = gum;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

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
