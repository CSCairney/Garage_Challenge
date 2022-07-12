package com.qa.Garage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.qa.vehicle.*;

public class GarageTest {

	Garage g = new Garage();
	Car a = new Car("toyota", "Micra", 2010, 4, 51, "White", 5, 1000);
	Motorbike b = new Motorbike("toyota", "Micra", 2010, 4, 51, "White", 5, false);
	Quad c = new Quad("toyota", "Micra", 2010, 4, 51, "White", 5, false);

	@Test
	public void testBill() {
		double baseRate = 100.00;
		double carRate = 5.50;

		g.addVehicle(a);
		g.addVehicle(b);
		g.removeVehicle(b);
		assertEquals("Hourly rental for a car: £" + baseRate * carRate, g.Bill(a));
	}

	@Test
	public void testBill2() {
		double baseRate = 100.00;
		double motorbikeRate = 2.50;

		g.addVehicle(a);
		assertEquals("Hourly rental for a Motorbike: £" + baseRate * motorbikeRate, g.Bill(b));
	}

	@Test
	public void testBill3() {
		double baseRate = 100.00;
		double quadRate = 7.50;

		g.addVehicle(a);
		assertEquals("Hourly rental for a quad: £" + baseRate * quadRate, g.Bill(c));
	}

	@Test
	public void testFix1() {
		double Labour = 55.00;
		double carRate = 1.5;

		assertEquals("Car fix: £" + Labour * carRate, g.fix(a));
	}

	@Test
	public void testFix2() {
		double Labour = 55.00;
		double motorbikeRate = 1.00;

		assertEquals("Motorbike fix: £" + Labour * motorbikeRate, g.fix(b));
	}

	@Test
	public void testFix3() {
		double Labour = 55.00;
		double QuadRate = 2.00;

		assertEquals("Quad fix: £" + Labour * QuadRate, g.fix(c));
	}
	
	}
