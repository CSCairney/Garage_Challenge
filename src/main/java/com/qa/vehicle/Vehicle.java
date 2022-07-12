package com.qa.vehicle;

public abstract class Vehicle {

	private String Make;
	private String Model;
	private Integer Year;
	private Integer Wheels;

	public Vehicle() {
	}

	public Vehicle(String Make, String Model, Integer Year, Integer Wheels) {
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
		this.Wheels = Wheels;
	}

	@Override
	public String toString() {
		return "Vehicle [Make=" + Make + ", Model=" + Model + ", Year=" + Year + ", Wheels=" + Wheels + "]";
	}

	/**
	 * gets the make of the vehicles
	 * @return make of vehicle
	 */
	public String getMake() {
		return Make;
	}

	/**
	 * sets the make of the vehicle
	 * @param make
	 */
	public void setMake(String make) {
		Make = make;
	}

	/**
	 * gets the model of the vehicle
	 * @return the value of the model
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * Sets the model of the vehicle
	 * @param model
	 */
	public void setModel(String model) {
		Model = model;
	}

	/**
	 * gets the year of the vehicle manufacture
	 * @return value of year
	 */
	public Integer getYear() {
		return Year;
	}

	/**
	 * sets the year of manufacture
	 * @param year
	 */
	public void setYear(Integer year) {
		Year = year;
	}

	/**
	 * gets the values of wheels present on vehicle
	 * @return value of wheels
	 */
	public Integer getWheels() {
		return Wheels;
	}

	/**
	 * sets the number of wheels present on vehicle
	 * @param wheels
	 */
	public void setWheels(Integer wheels) {
		Wheels = wheels;
	}

}
