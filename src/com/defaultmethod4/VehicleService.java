package com.defaultmethod4;

public interface VehicleService {

    void serviceVehicle();

    default void checkVehicleCondition() {
        System.out.println("Checking vehicle condition...");
    }

    static void showServiceCenter() {
        System.out.println("Welcome to Royal Vehicle Service Center");
    }
}