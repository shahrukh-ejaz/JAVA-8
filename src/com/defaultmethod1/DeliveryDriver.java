package com.defaultmethod1;

class BikeDelivery implements DeliveryService {
	
	@Override
	public void deliverOrder() {
		System.out.println("Order delivered by Bike: ");
	}

}

public class DeliveryDriver{
	public static void main(String[] args) {
		
		BikeDelivery bike = new BikeDelivery();
		bike.deliverOrder();
		bike.trackOrder();
		
	}
}
