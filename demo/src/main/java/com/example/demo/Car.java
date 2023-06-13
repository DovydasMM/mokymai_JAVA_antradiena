package com.example.demo;

public class Car extends Vehicle{
	
	public String manufacturer;
	public Car(int weight, int cargoWeight, String manufacturer) {
		super(weight, cargoWeight);
		this.manufacturer = manufacturer;	
	}
	
	public void getManufacturer() {
		System.out.println("This car was produced by: " + this.manufacturer);
	}
	
	
	public void loadCargo(int cargoWeight) {
		this.cargoWeight += cargoWeight;
		System.out.println(cargoWeight + "kg of cargo was loaded to this car");
	}
	
	public void unloadCargo(int cargoWeight) {
		this.cargoWeight -= cargoWeight;
		System.out.println(cargoWeight + "kg of cargo was unloaded from this car");
	}
	
	
	public void travel(String destination) {
		System.out.println("This CAR is traveling to " + destination);
	}
	
	
	public void currentWeight() {
		System.out.println("This car weights " + this.vehicleWeight + "kg");
	}
	
	public void passengerCount() {
		System.out.println("This car carries " + this.passengerCount + " passengers");
	}
	
	public void sound() {
		System.out.println("WROOM WROOM");
	}
}
