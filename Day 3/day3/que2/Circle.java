package com.day3.que2;

public class Circle implements Shape {

	@Override
	public void area(int r) {
		double a= 3.14*r*r;
		System.out.println(" Circle area is : "+a);
	}
}
