package com.qap.qap4design.tournament;

import java.time.LocalDate;


public class Tournament {

    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private Double entryFee;
    private Double cashPrizeAmount;

    public Tournament() {
    }

    public Tournament(Long id, LocalDate startDate, LocalDate endDate, String location, Double entryFee, Double cashPrizeAmount) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
    }

    public Tournament(LocalDate startDate, LocalDate endDate, String location, Double entryFee, Double cashPrizeAmount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
    }

    // Getters


    public Long getId() {
        return id;
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

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
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
}
