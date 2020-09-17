package com.evghenii.fitnesstudio.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Document
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    private int id;

    private String name;

    private BigDecimal price;

    private int numberOfVisitPerWeek;

    private double caloriesBurned;

    private FitnessClub fitnessClub;

    @Enumerated(EnumType.STRING)
    private KindOfProgram kindOfProgram;

    @Enumerated(EnumType.STRING)
    private ProgramType programType;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfVisitPerWeek() {
        return numberOfVisitPerWeek;
    }

    public void setNumberOfVisitPerWeek(int numberOfVisitPerWeek) {
        this.numberOfVisitPerWeek = numberOfVisitPerWeek;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public FitnessClub getFitnessClub() {
        return fitnessClub;
    }

    public void setFitnessClub(FitnessClub fitnessClub) {
        this.fitnessClub = fitnessClub;
    }

    public KindOfProgram getKindOfProgram() {
        return kindOfProgram;
    }

    public void setKindOfProgram(KindOfProgram kindOfProgram) {
        this.kindOfProgram = kindOfProgram;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Program() {
    }

    public Program(String name, BigDecimal price, int numberOfVisitPerWeek, double caloriesBurned, FitnessClub fitnessClub, KindOfProgram kindOfProgram, ProgramType programType, int version) {
        this.name = name;
        this.price = price;
        this.numberOfVisitPerWeek = numberOfVisitPerWeek;
        this.caloriesBurned = caloriesBurned;
        this.fitnessClub = fitnessClub;
        this.kindOfProgram = kindOfProgram;
        this.programType = programType;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return id == program.id &&
                numberOfVisitPerWeek == program.numberOfVisitPerWeek &&
                Double.compare(program.caloriesBurned, caloriesBurned) == 0 &&
                version == program.version &&
                Objects.equals(name, program.name) &&
                Objects.equals(price, program.price) &&
                Objects.equals(fitnessClub, program.fitnessClub) &&
                kindOfProgram == program.kindOfProgram &&
                programType == program.programType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, numberOfVisitPerWeek, caloriesBurned, fitnessClub, kindOfProgram, programType, version);
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", numberOfVisitPerWeek=" + numberOfVisitPerWeek +
                ", caloriesBurned=" + caloriesBurned +
                ", fitnessClub=" + fitnessClub +
                ", kindOfProgram=" + kindOfProgram +
                ", programType=" + programType +
                ", version=" + version +
                '}';
    }
}
