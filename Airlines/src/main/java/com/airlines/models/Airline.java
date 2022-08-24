package com.airlines.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
@Data
@Document("Admin")
public class Airline  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long flightNumber;
    private String airlineName;
    private String fromPlace;
    private String toPlace;
    private LocalDateTime startDate;
    private LocalDateTime EndDate;
    private int businessSeats;
    private int economySeats;
    private double ticketPrice;
    private int rows;
    private String mealType;

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", flightNumber=" + flightNumber +
                ", airlineName='" + airlineName + '\'' +
                ", fromPlace='" + fromPlace + '\'' +
                ", toPlace='" + toPlace + '\'' +
                ", startDate=" + startDate +
                ", EndDate=" + EndDate +
                ", businessSeats=" + businessSeats +
                ", economySeats=" + economySeats +
                ", ticketPrice=" + ticketPrice +
                ", rows=" + rows +
                ", mealType='" + mealType + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        EndDate = endDate;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public Airline() {
    }

    public Airline(Long id, Long flightNumber, String airlineName, String fromPlace, String toPlace, LocalDateTime startDate, LocalDateTime endDate, int businessSeats, int economySeats, double ticketPrice, int rows, String mealType) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.startDate = startDate;
        EndDate = endDate;
        this.businessSeats = businessSeats;
        this.economySeats = economySeats;
        this.ticketPrice = ticketPrice;
        this.rows = rows;
        this.mealType = mealType;
    }


}
