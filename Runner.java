package garagechallenge;

public class Runner {

	public static void main(String[] args) {

		// creates new vehicles
		Car car1 = new Car("A123", "Audi", "A3", "Silver", 2013);

		Car car2 = new Car("A574", "BMW", "3Series", "Black", 2017);

		Motorbike bike1 = new Motorbike("M999", "BMW", "Roadster", "Yellow", 1957);

		Bus bus1 = new Bus("B777", "Bigboy", "Wagon", "Purple", 1907);

		// adds vehicle to vehicleList array in Garage
		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(bike1);
		garage.addVehicle(bus1);

		// print vehicle (found is equal to result of findVehicleByiD in garage,
		// then prints the printVehicle function in class Vehicle.)
		Vehicle found = garage.findVehicleByiD("B777");
		System.out.println(found.printVehicle());

		// need method to print vehicle bill from garage fixVehicle
	}

}
