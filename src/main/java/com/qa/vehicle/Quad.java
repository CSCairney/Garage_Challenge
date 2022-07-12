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
	 * get the offroad abilities of the vehicles 
	 * @return
	 */
	public boolean getOffroad() {
		return offroad;
	}

	/**
	 * sets the offroad abilities of the vehicles
	 * @param offroad
	 */
	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}

}
