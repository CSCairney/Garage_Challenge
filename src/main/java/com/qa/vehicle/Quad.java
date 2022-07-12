package com.qa.vehicle;

public class Quad extends Vehicle {

	private Integer MPG;
	private String Colour;
	private Integer Windows;
	private boolean offroad;

	public Quad() {
	}

	public Quad(String Make, String Model, Integer Year, Integer Wheels, Integer MPG, String Colour, Integer Windows,
			boolean offroad) {
		super(Make, Model, Year, Wheels);
		this.MPG = MPG;
		this.Colour = Colour;
		this.Windows = Windows;
		this.offroad = offroad;

	}

	public String toString() {
		return "Quad Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Wheels=" + getWheels()
				+ ", Millage=" + getMPG() + ", Colour=" + getColour() + ", Windows=" + getWindows() + ", offroad="
				+ getOffroad();
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

	public boolean getOffroad() {
		return offroad;
	}

	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}

}
