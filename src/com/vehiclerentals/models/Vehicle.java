package com.vehiclerentals.models; 

public abstract class Vehicle {
    private String regNumber;
    private String fuelType;
    private double perDayRent;
    private String rentalDate;

    public Vehicle(String regNumber, String fuelType, double perDayRent, String rentalDate) {
        this.regNumber = regNumber;
        this.fuelType = fuelType;
        this.perDayRent = perDayRent;
        this.rentalDate = rentalDate;
    }

    public String getRegnNumber() {
        return regNumber;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    protected String getFuelType() {
        return fuelType;
    }

    protected double getPerDayRent() {
        return perDayRent;
    }

    public abstract String getDetails();
}
