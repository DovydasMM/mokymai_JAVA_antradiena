package com.example.demo;

public interface Cargo {
	
	void loadCargo(int cargoWeight);
	void unloadCargo(int cargoWeight);
	
	
	static void cargoInfo() {
		System.out.println("Object can load and unload cargo");
	}
	
	default void weightConversion() {
		System.out.println("1 kg is 2.2 pounds");
	}

}
