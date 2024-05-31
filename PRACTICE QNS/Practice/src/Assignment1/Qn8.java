package Assignment1;

import java.util.Scanner;

public class Qn8 {
	/*
	 * Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c, f;
		System.out.println("Choose between two options:: ");
		System.out.println("");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("");
		System.out.print("Enter option: ");
		int opt = sc.nextInt();
		System.out.println();

		switch (opt) {
			case 1:
				System.out.print("Enter temp in celsius:: ");
				c = sc.nextFloat();
				f = (float) 1.8 * c + 32;
				System.out.println("Result (in fahrenheit): " + f);
				break;

			case 2:
				System.out.print("Enter temp in fahrenheit:: ");
				f = sc.nextFloat();
				c = (f - 32) / (float) 1.8;
				System.out.println("Result (in celsius): " + c);
				break;

			default:
				System.out.println("Invalid option chosen!");
		}
	}
}
