package com.qa.vehicle;

public class Motorbike extends Vehicle {

	private Integer MPG;
	private String Colour;
	private Integer Windows;
	private boolean automatic;

	public Motorbike() {

	}

	public Motorbike(String Make, String Model, Integer Year, Integer Wheels, Integer MPG, String Colour,
			Integer Windows, boolean automatic) {
		super(Make, Model, Year, Wheels);
		this.MPG = MPG;
		this.Colour = Colour;
		this.Windows = Windows;
		this.automatic = automatic;

	}

	public String toString() {
		return "Motorbike Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Wheels="
				+ getWheels() + ", Millage=" + getMPG() + ", Colour=" + getColour() + ", Windows=" + getWindows()
				+ ", automatic=" + getAutomatic();
	}

	public Integer getMPG() {
		return MPG;
	}

	public void setMPG(Integer MPG) {
		this.MPG = MPG;
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

	public boolean getAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

}
