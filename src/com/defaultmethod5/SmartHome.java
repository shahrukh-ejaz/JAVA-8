package com.defaultmethod5;

public class SmartHome implements LightControl, SecurityControl{
	
	@Override
	public void turnON() {
		LightControl.super.turnON();
		SecurityControl.super.turnOn();
		
		System.out.println("Smart home system is ready");
	}

}
