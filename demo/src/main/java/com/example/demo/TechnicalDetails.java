package com.example.demo;

public interface TechnicalDetails {
	
			public void currentWeight();
			public void passengerCount();
			public static void technicalInfo() {
				System.out.println("Technical details about weight and passenger count.");
			}
	
			default void speedConversion() {
				System.out.println("1 mile per hour is 1.6 kilometers per hour.");
			}
}
