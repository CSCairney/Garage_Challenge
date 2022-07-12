package com.qa.vehicle;

public class Car extends Vehicle {

	private Integer MPG;
	private String Colour;
	private Integer Windows;
	private Integer EngineSize;

	public Car() {
	}

	public Car(String Make, String Model, Integer Year, Integer Wheels, Integer MPG, String Colour, Integer Windows,
			Integer EngineSize) {
		super(Make, Model, Year, Wheels);
		this.MPG = MPG;
		this.Colour = Colour;
		this.Windows = Windows;
		this.EngineSize = EngineSize;

	}

	public String toString() {
		return "Car Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Wheels=" + getWheels()
				+ ", Millage=" + getMPG() + ", Colour=" + getColour() + ", Windows=" + getWindows() + ", Engine size="
				+ getEngineSize();
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

	public Integer getEngineSize() {
		return EngineSize;
	}

	public void setEngineSize(Integer engineSize) {
		EngineSize = engineSize;
	}

}
