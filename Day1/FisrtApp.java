package com.example;

import java.util.Scanner;

public class FisrtApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char c = sc.next().charAt(0);
		checkAlphabet(c);

		sc.close();
	}

	public static void checkAlphabet(char c) {

		int ch = c;
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(c + " is an aplhabet");
		else
			System.out.println(c + " is not a aplhabet");
	}

}
