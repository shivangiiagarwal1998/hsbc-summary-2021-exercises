package com.day3.que1;

public class SelectVehicle {
	public static void main(String[] args) {
		System.out.println("KTM instance");
		Ktm ktm = new Ktm();
		Automobile.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		Automobile.printVehicle(rf);
		Alto at= new Alto();
		Automobile.printVehicle(at);
		Skoda sk= new Skoda();
		Automobile.printVehicle(sk);
		Bmw bmw= new Bmw();
		Automobile.printVehicle(bmw);
		
	}

}
