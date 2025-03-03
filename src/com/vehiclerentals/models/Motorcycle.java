package com.vehiclerentals.models;

public class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private double weight;

    public Motorcycle(String regNumber, String fuelType, double perDayRent, String rentalDate,
                     int engineDisplacement, double weight) {
        super(regNumber, fuelType, perDayRent, rentalDate);
        this.engineDisplacement = engineDisplacement;
        this.weight = weight;
    }

    @Override
    public String getDetails() {
        return String.format("Motorcycle - Reg: %s, Fuel: %s, Rent: %.2f, Date: %s, Engine: %dcc, Weight: %.2fkg",
                getRegnNumber(), getFuelType(), getPerDayRent(), getRentalDate(),
                engineDisplacement, weight);
    }
}
