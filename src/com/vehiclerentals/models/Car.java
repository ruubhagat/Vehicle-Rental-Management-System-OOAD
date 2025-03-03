package com.vehiclerentals.models;

public class Car extends Vehicle {
    private String transmissionType;
    private String carType;
    private int seats;

    public Car(String regNumber, String fuelType, double perDayRent, String rentalDate,
               String transmissionType, String carType, int seats) {
        super(regNumber, fuelType, perDayRent, rentalDate);
        this.transmissionType = transmissionType;
        this.carType = carType;
        this.seats = seats;
    }

    @Override
    public String getDetails() {
        return String.format("Car - Reg: %s, Fuel: %s, Rent: %.2f, Date: %s, Transmission: %s, Type: %s, Seats: %d",
                getRegnNumber(), getFuelType(), getPerDayRent(), getRentalDate(),
                transmissionType, carType, seats);
    }
}

