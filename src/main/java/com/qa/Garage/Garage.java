package com.qa.Garage;

import java.util.ArrayList;
import com.qa.vehicle.*;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {

		garage.add(vehicle);

	}

	public void removeVehicle(Vehicle vehicle) {

		garage.remove(vehicle);

	}

	public void clearGarage() {

		garage.clear();

	}

	public void printVehicle() {

		for (Vehicle i : garage) {
			System.out.println(i);
		}
	}

	public String Bill(Vehicle vehicle) {
		double baseRate = 100.00;
		double carRate = 5.50;
		double motorbikeRate = 2.50;
		double quadRate = 7.50;

		if (vehicle.getClass().getSimpleName().equals("Car")) {
			return ("Hourly rental for a car: £" + baseRate * carRate);
		} else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			return ("Hourly rental for a Motorbike: £" + baseRate * motorbikeRate);
		} else if (vehicle.getClass().getSimpleName().equals("Quad")) {
			return ("Hourly rental for a quad: £" + baseRate * quadRate);
		} else {
			return ("No vehicles");
		}
	}

	public String fix(Vehicle vehicle) {
		double Labour = 55.00;
		double carRate = 1.5;
		double motorbikeRate = 1.00;
		double QuadRate = 2.00;

		if (vehicle.getClass().getSimpleName().equals("Car")) {
			return ("Car fix: £" + Labour * carRate);
		} else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			return ("Motorbike fix: £" + Labour * motorbikeRate);
		} else if (vehicle.getClass().getSimpleName().equals("Quad")) {
			return ("Quad fix: £" + Labour * QuadRate);
		} else {
			return ("No vehicles");
		}
	}

	public void removeByTypeSingular(Vehicle vehicle) {
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			garage.remove(vehicle);
		} else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			garage.remove(vehicle);
		} else if (vehicle.getClass().getSimpleName().equals("Quad")) {
			garage.remove(vehicle);
		} else {
			System.out.println("vehicle not present in garage");
		}
	}
	
	public void removeVehiclesByType(String className) {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle v = garage.get(i);
			
			if (v.getClass().getSimpleName() == className) {
				garage.remove(i);
			}
		}
	}

}
