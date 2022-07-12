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

/**
 * Gets the vehicles MPG
 * @return the value of the MPG
 */
	public Integer getMPG() {
		return MPG;
	}

/**
 * Set the new value of the MPG
 * @param mPG
 */
	public void setMPG(Integer mPG) {
		MPG = mPG;
	}

/**
 * Gets the colour of the vehicle
 * @return the String value of colour
 */
	public String getColour() {
		return Colour;
	}

/**
 * Sets the new value of the Colour	
 * @param colour
 */
	public void setColour(String colour) {
		Colour = colour;
	}

/**
 * Gets the number of windows
 * @return value of the number of Windows
 */
	public Integer getWindows() {
		return Windows;
	}
	
/**
 * Sets the new windows value
 * @param windows
 */
	public void setWindows(Integer windows) {
		Windows = windows;
	}

/**
 * Gets the vehicle engine size
 * @return the value of the engine size
 */
	public Integer getEngineSize() {
		return EngineSize;
	}

/**
 * Sets the engine size for the vehicle
 * @param engineSize
 */
	public void setEngineSize(Integer engineSize) {
		EngineSize = engineSize;
	}

}
