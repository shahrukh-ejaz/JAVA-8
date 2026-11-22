package com.defaultmethod2;

class BikeService implements VehicleService {

    @Override
    public void startService() {
        System.out.println("Bike service started.");
    }

    @Override
    public void checkVehicle() {
        System.out.println("Checking bike engine, brakes and tyres.");
    }
}

public class ServiceDriver {

    public static void main(String[] args) {

        BikeService bike = new BikeService();

        bike.startService();
        bike.checkVehicle();
    }
}