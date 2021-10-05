package com.example;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		odd(x, y);
		even(x, y);

	}

	public static void odd(int x, int y) {
		System.out.println("Odd numbers are");
		for (int i = x; i <= y; i++) {
			if (!((i % 2) == 0))
				System.out.println(i);
		}
	}

	public static void even(int x, int y) {
		System.out.println("even numbers are");
		for (int i = x; i <= y; i++) {
			if ((i % 2) == 0)
				System.out.println(i);
		}

	}

}
