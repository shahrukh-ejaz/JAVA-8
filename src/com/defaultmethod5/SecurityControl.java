package com.defaultmethod5;

public interface SecurityControl {
	default void turnOn() {
		System.out.println("Security system activated");
	}

}
