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
	public void setMPG(Integer MPG) {
		this.MPG = MPG;
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
	 * get the status of the vehicles gearbox
	 * @return true for automatic or false for manual
	 */
	public boolean getAutomatic() {
		return automatic;
	}

	/**
	 * sets the value of gear box settings
	 * @param automatic
	 */
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

}
