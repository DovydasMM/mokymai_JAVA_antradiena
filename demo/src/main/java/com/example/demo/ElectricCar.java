package com.example.demo;

public class ElectricCar extends Car{
	
	
	private int batteryCharge;
	
	public ElectricCar(int weight, int cargoWeight, String manufacturer, int batteryCharge) {
		super(weight, cargoWeight, manufacturer);
		this.batteryCharge = batteryCharge;
		
	}

	
	public void chargeLevel() {
		System.out.println("Battery is charged at " + this.batteryCharge + "%");
	}
	
	public void chargeBattery() {
		this.batteryCharge =100;
	}
	
	
	
	public void sound() {
		System.out.println("*random electric car sounds*");
	}
	
	public void travel(String destination) {
		System.out.println("This Electric car is traveling to " + destination);
	}
}
