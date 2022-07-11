package com.qa.vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class QuadTest {

	Quad testMe = new Quad("toyota", "Micra", 2010, 4, 51, "White", 5);

	@Test
	public void testToString() {
		assertEquals(("Quad Make=" + testMe.getMake() + ", Model=" + testMe.getModel() + ", Year=" + testMe.getYear()
				+ ", Wheels=" + testMe.getWheels() + ", Millage=" + testMe.getMPG() + ", Colour=" + testMe.getColour()
				+ ", Windows=" + testMe.getWindows()), testMe.toString());
	}

	@Test
	public void testGetColour() {
		assertEquals("White", testMe.getColour());

	}

	@Test
	public void testGetMake() {
		assertEquals("toyota", testMe.getMake());
	}

	@Test
	public void testGetModel() {
		assertEquals("Micra", testMe.getModel());
	}

	@Test
	public void testGetYear() {
		assertEquals(2010, testMe.getYear());
	}

	@Test
	public void testGetWheels() {
		assertEquals(4, testMe.getWheels());
	}

	@Test
	public void testGetMPG() {
		assertEquals(51, testMe.getMPG());
	}

	@Test
	public void testGetWindows() {
		assertEquals(5, testMe.getWindows());
	}

	@Test
	public void testSetColour() {
		testMe.setColour("red");
		assertEquals("red", testMe.getColour());

	}

	@Test
	public void testSetMake() {
		testMe.setMake("Bingo");
		assertEquals("Bingo", testMe.getMake());
	}

	@Test
	public void testSetModel() {
		testMe.setModel("Dog");
		assertEquals("Dog", testMe.getModel());
	}

	@Test
	public void testSetYear() {
		testMe.setYear(2012);
		assertEquals(2012, testMe.getYear());
	}

	@Test
	public void testSetWheels() {
		testMe.setWheels(19);
		assertEquals(19, testMe.getWheels());
	}

	@Test
	public void testSetMPG() {
		testMe.setMPG(90);
		assertEquals(90, testMe.getMPG());
	}

	@Test
	public void testSetWindows() {
		testMe.setWindows(15);
		assertEquals(15, testMe.getWindows());
	}

}
