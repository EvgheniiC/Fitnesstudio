package com.evghenii.fitnesstudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Document
public class StatisticPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statisticperson_id")
    private int id;

    private double actualWeight;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate visitByDate;

    private int countOfVisits;

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_fk_id")
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public LocalDate getVisitByDate() {
        return visitByDate;
    }

    public void setVisitByDate(LocalDate visitByDate) {
        this.visitByDate = visitByDate;
    }

    public int getCountOfVisits() {
        return countOfVisits;
    }

    public void setCountOfVisits(int countOfVisits) {
        this.countOfVisits = countOfVisits;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public StatisticPerson() {
    }

    public StatisticPerson(double actualWeight, LocalDate visitByDate, int countOfVisits, Person person) {
        this.actualWeight = actualWeight;
        this.visitByDate = visitByDate;
        this.countOfVisits = countOfVisits;
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticPerson that = (StatisticPerson) o;
        return id == that.id &&
                Double.compare(that.actualWeight, actualWeight) == 0 &&
                countOfVisits == that.countOfVisits &&
                Objects.equals(visitByDate, that.visitByDate) &&
                Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actualWeight, visitByDate, countOfVisits, person);
    }

    @Override
    public String toString() {
        return "StatisticPerson{" +
                "id=" + id +
                ", actualWeight=" + actualWeight +
                ", visitByDate=" + visitByDate +
                ", countOfVisits=" + countOfVisits +
                ", person=" + person +
                '}';
    }
}
