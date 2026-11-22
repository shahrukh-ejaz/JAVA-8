package com.defaultmethod3;

 class UPIPayment implements  PaymentService {
	 
	 @Override
	 public void processPayment(double amount) {
		 System.out.println("UPI Payment processed: Rs. "+ amount);
	 }

}
 public class PaymentDriver{
	 public static void main(String[] args) {
		 
		 UPIPayment upi = new UPIPayment();
		 
		 upi.processPayment(2500);
		 PaymentService.checkServiceStatus();
	 }
 }
