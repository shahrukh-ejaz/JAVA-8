package com.defaultmethod3;

public interface PaymentService {
	
	void processPayment(double amount);
		
		static void checkServiceStatus() {
			System.out.println("Payment service is active");
		}
	}

