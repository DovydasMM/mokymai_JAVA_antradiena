package com.example.demo;

public abstract class Vehicle implements Cargo, TechnicalDetails {
	
	public int vehicleWeight;
	public int cargoWeight;
	public int passengerCount;
	
	public Vehicle(int weight, int cargo) {
		this.vehicleWeight = weight;
		this.cargoWeight = cargo;
	}
	
	public void travel(String destination) {
		System.out.println("This vehicle is traveling to " + destination);
	};
	
	public abstract void sound();
	
}
