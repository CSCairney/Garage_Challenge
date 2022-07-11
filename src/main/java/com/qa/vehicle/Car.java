package com.qa.vehicle;

public class Car extends Vehicle {

	private Integer MPG;
	private String Colour;
	private Integer Windows;

	public Car() {
	}

	public Car(String Make, String Model, Integer Year, Integer Wheels, Integer MPG, String Colour, Integer Windows) {
		super(Make, Model, Year, Wheels);
		this.MPG = MPG;
		this.Colour = Colour;
		this.Windows = Windows;

	}

	public String toString() {
		return "Car Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Wheels=" + getWheels()
				+ ", Millage=" + getMPG() + ", Colour=" + getColour() + ", Windows=" + getWindows();
	}

	public Integer getMPG() {
		return MPG;
	}

	public void setMPG(Integer mPG) {
		MPG = mPG;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public Integer getWindows() {
		return Windows;
	}

	public void setWindows(Integer windows) {
		Windows = windows;
	}

}
