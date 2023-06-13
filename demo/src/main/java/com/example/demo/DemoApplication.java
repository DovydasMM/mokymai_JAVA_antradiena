package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ElectricCar teslaCar = new ElectricCar(1850, 100, "Tesla", 67);
		DieselCar dieselCar = new DieselCar(2500,20, "Volkswagen", 40);
		PetroleumCar petroCar = new PetroleumCar(2000, 7, "BMW", 3);
		
		
		/*
		teslaCar.chargeLevel();
		teslaCar.chargeBattery();
		teslaCar.currentWeight();
		teslaCar.getManufacturer();
		teslaCar.loadCargo(10);
		teslaCar.sound();
		*/
		
		TechnicalDetails.technicalInfo();
		Cargo.cargoInfo();
		
		
		
		superClassTester(teslaCar);
		
		Car[] carList = new Car[]{teslaCar, dieselCar, petroCar};

		for (int i = 0; i<carList.length; i++) {
			superClassTester(carList[i]);
		}
		
	}
	
	
	public static void superClassTester(Car car) {
		car.travel("Kaunas city");
	}
	
}
