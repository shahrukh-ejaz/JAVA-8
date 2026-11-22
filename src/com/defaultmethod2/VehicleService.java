package com.defaultmethod2;

public interface VehicleService {
	void startService();
	default void checkVehicle() {
		System.out.println("Performing general vehicle inspection");
	}

}
