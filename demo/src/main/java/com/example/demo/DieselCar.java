package com.example.demo;

public class DieselCar extends Car{
	
	private int dieselLevel;
	
	public DieselCar(int weight, int cargoWeight, String manufacturer, int dieselLevel) {
		super(weight, cargoWeight, manufacturer);
		this.dieselLevel = dieselLevel;
		
	}
	
	
	public void fillTank() {
		this.dieselLevel = 100;
	}
	
	
	public void sound() {
		System.out.println("PASSAT B5 TURBO DIESEL SOUNDS");
	}
	
	public void travel(String destination) {
		System.out.println("This Diesel car is traveling to " + destination);
	}

}
