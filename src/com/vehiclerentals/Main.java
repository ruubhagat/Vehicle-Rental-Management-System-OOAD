package com.vehiclerentals;

import com.vehiclerentals.models.*;
import com.vehiclerentals.system.*;


public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car car1 = new Car("KA01AB1234", "Petrol", 2000.0, "2025-01-15",
                "Automatic", "Sedan", 4);
        Car car2 = new Car("KA02CD5678", "Electric", 2500.0, "2025-01-10",
                "Automatic", "SUV", 6);
        Car car3 = new Car("MH01RB1100", "Diesel", 3000.0, "2025-01-11",
        "Manual", "Coupe", 5);
        Motorcycle bike1 = new Motorcycle("KA03EF9012", "Petrol", 1000.0, "2025-01-20",
                150, 140.5);

        String user1 = "Karan";
        rentalSystem.rentVehicle(user1, car1);
        rentalSystem.rentVehicle(user1, bike1);
        rentalSystem.rentVehicle(user1, car2);

        String user2 = "Rutuja";
        rentalSystem.rentVehicle(user2, bike1);
        rentalSystem.rentVehicle(user2, car1);
        rentalSystem.rentVehicle(user2, car3);

        rentalSystem.displayUserRentals(user1);
        rentalSystem.displayUserRentals(user2);
    }
}
