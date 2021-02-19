package garagechallenge;

import java.util.ArrayList;

public class Garage {

	// creates an ArrayList for the vehicles
	private ArrayList<Vehicle> vehicleList = new ArrayList<>();

	// iterates through vehicle list to find by iD
	public Vehicle findVehicleByiD(String iD) {
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.getiD() == iD) {
				return vehicle;
			}
		}
		System.out.println("Could not find vehicle with iD: " + iD);
		return null;

	}

	// adds vehicles to the list
	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}

	// removes vehicles from the list
	public void removeVehicle(Vehicle vehicle) {
		this.vehicleList.remove(vehicle);
	}

	// adding function to fix vehicle by type
	public void fixVehicle(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			System.out.println("Your bill is £100");
		}
		if (vehicle instanceof Motorbike) {
			System.out.println("Your bill is £50");
		}
		if (vehicle instanceof Bus) {
			System.out.println(Integer.MAX_VALUE);
		}

	}

}
