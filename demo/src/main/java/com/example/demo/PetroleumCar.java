package com.example.demo;

public class PetroleumCar extends Car{

	
private int petroleumLevel;
	
	public PetroleumCar(int weight, int cargoWeight, String manufacturer, int dieselLevel) {
		super(weight, cargoWeight, manufacturer);
		this.petroleumLevel = dieselLevel;
		
	}
	
	
	public void fillTank() {
		this.petroleumLevel = 100;
	}
	
	
	public void sound() {
		System.out.println("VROOM VROOM");
	}
	
	public void travel(String destination) {
		System.out.println("This Petroleum car is traveling to " + destination);
	}
	
}
