/**
 * @author charlie
 */


package com.qa.Garage;

import java.util.ArrayList;
import com.qa.vehicle.*;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

/**
* addVehicle used to add a new vehicle object to the garage
* @param vehicle
*/
	public void addVehicle(Vehicle vehicle) {

		garage.add(vehicle);

	}
	
	
/**
 * removeVehicle used to remove a vehicle object from the garage
 * @param vehicle
 */
	public void removeVehicle(Vehicle vehicle) {

		garage.remove(vehicle);

	}

/**
 * clearGarage used to clear the garage of all vehicle objects
 */
	public void clearGarage() {

		garage.clear();

	}

/**
 * printVehicle used to print list of all vehicle objects in garage
 */
	public void printVehicle() {

		for (Vehicle i : garage) {
			System.out.println(i);
		}
	}
/**
 * Bill used to create a bill for a specific vehicle object based on its rate cost
 * @param vehicle
 * @return
 * returns string of statement of cost
 */
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

/**
 * fix used to print value of the cost of repairs of a vehicle. If vehicle is not present "no vehicle" response
 * @param vehicle
 * @return
 * String print of cost or alternate option if NULL
 */
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

	
/**
 * removeVehiclesByType removes all vehicle objects of the same type
 * @param className
 * @return
 * a reduction in the removed counter
 */
	public int removeVehiclesByType(String className) {
		int removed = 0;
		for (int i = 0; i < garage.size(); i++) {
			Vehicle v = garage.get(i);
			
			if (v.getClass().getSimpleName().equals(className)) {
				garage.remove(i);
				i--;
				removed +=1;
			}
		}return removed;
	}

}
