package com.defaultmethod4;

class BikeService implements VehicleService {

    @Override
    public void serviceVehicle() {
        System.out.println("Bike servicing completed.");
    }

    @Override
    public void checkVehicleCondition() {
        System.out.println("Checking bike engine and brakes...");
    }
}

public class ServiceDriver {

    public static void main(String[] args) {

        BikeService bike = new BikeService();

        VehicleService.showServiceCenter();

        bike.checkVehicleCondition();

        bike.serviceVehicle();
    }
}