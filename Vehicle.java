package garagechallenge;

// here is the vehicle superclass with the instance variables
// these will define the attributes of the vehicles

public class Vehicle {

	private String iD;
	private String make;
	private String model;
	private String colour;
	private int year;

// this is the constructor that is called when an object (vehicle) is created

	public Vehicle(String iD, String make, String model, String colour, int year) {
		this.iD = iD;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;

	}

	public String printVehicle() {
		return "The details of Vehicle iD no." + iD + " are: " + "\n" + "Make: " + make + "\nModel: " + model
				+ "\nColour: " + colour + "\nYear: " + year;
	}

	// getters and setters accessing private variables

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;

	}

}