package com.qap.qap4design.tournament;

import com.qap.qap4design.validator.DateValidator;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;

@Entity
@Table
public class Tournament implements DateValidator {
    @Id
    @SequenceGenerator(
            name = "tournament_sequence",
            sequenceName = "tournament_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tournament_sequence"
    )

    private long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private double entryFee;
    private double cashPrizeAmount;

    public Tournament() {
    }

    public Tournament(Long id, String name, LocalDate startDate, LocalDate endDate, String location, Double entryFee, Double cashPrizeAmount) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        setEndDate(endDate);
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
    }

    public Tournament(String name,LocalDate startDate, LocalDate endDate, String location, Double entryFee, Double cashPrizeAmount) {
        this.name = name;
        this.startDate = startDate;
        setEndDate(endDate);
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getLocation() {
        return location;
    }

    public Double getEntryFee() {
        return entryFee;
    }

    public Double getCashPrizeAmount() {
        return cashPrizeAmount;
    }

    //Setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        int daysCheck  = startDateBeforeEndDateCheck(getStartDate(), endDate);
        if(daysCheck < 0){
            throw new InputMismatchException("Error! End Date cannot be before Start Date");
        }
        this.endDate = endDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEntryFee(Double entryFee) {
        this.entryFee = entryFee;
    }

    public void setCashPrizeAmount(Double cashPrizeAmount) {
        this.cashPrizeAmount = cashPrizeAmount;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", location='" + location + '\'' +
                ", entryFee=" + entryFee +
                ", cashPrizeAmount=" + cashPrizeAmount +
                '}';
    }

    @Override
    public int startDateBeforeEndDateCheck(LocalDate startDate, LocalDate endDate) {
        int days = Period.between(startDate, endDate).getDays();
        return days;
    }
}
