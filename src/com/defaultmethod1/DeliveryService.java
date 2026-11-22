package com.defaultmethod1;

public interface DeliveryService {
	
	void deliverOrder();
	
	default void trackOrder() {
		System.out.println("order tracking is active");
	}

}
