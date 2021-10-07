package com.day3.que2;

public class Sphere implements Shape{

	@Override
	public void area(int r) {
		double a= 4*3.14*r*r;
		System.out.println("Sphere area is : "+a);
	}

}
