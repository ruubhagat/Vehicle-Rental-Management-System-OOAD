package com.vehiclerentals.system;

import com.vehiclerentals.models.*;
import java.util.*;

public class RentalSystem {
    private Map<String, List<Vehicle>> userRentals;

    public RentalSystem() {
        userRentals = new HashMap<>();
    }

    public void rentVehicle(String userId, Vehicle vehicle) {
        userRentals.computeIfAbsent(userId, k -> new ArrayList<>()).add(vehicle);
    }

    public void displayUserRentals(String userId) {
        List<Vehicle> rentals = userRentals.get(userId);
        if (rentals != null && !rentals.isEmpty()) {
            rentals.sort((v1, v2) -> v1.getRentalDate().compareTo(v2.getRentalDate()));
            System.out.println("Rentals for user: " + userId);
            for (Vehicle v : rentals) {
                System.out.println(v.getDetails());
            }
        } else {
            System.out.println("No rentals found for user: " + userId);
        }
    }
}
