package Assignment1;

import java.util.Scanner;

public class Qn12 {
	/*
	 * Write a program to accept the roll, name, and nationality of the person
	 * and display those values in good format way.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter roll: ");
		int roll = sc.nextInt();
		sc.nextLine();   // Consume the leftover newline character
		System.out.println("Enter nationality: ");
		String nationality = sc.nextLine();

		System.out.println();
		System.out.println(********** RESULT ************);
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Nationality: " + nationality);
	}
}
