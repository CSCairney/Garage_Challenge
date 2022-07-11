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

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	public Integer getWheels() {
		return Wheels;
	}

	public void setWheels(Integer wheels) {
		Wheels = wheels;
	}

}
