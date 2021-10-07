package com.day3.que1;

public class Automobile {
	public static void printVehicle(Vehicle vehicle) {
		vehicle.wheels();
		System.out.println("Mileage: " + vehicle.getMileage());
		System.out.println("Price: " + vehicle.getPrice());
	}

}
