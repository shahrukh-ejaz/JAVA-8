package com.defaultmethod5;

public interface LightControl {
	default void turnON() {
		System.out.println("Lights turned on.");
	}

}
