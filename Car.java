package garagechallenge;

// car subclass

public class Car extends Vehicle {

	// This points the car constructor to the constructor in vehicle
	public Car(String iD, String make, String model, String colour, int year) {
		super(iD, make, model, colour, year);
	}

}
