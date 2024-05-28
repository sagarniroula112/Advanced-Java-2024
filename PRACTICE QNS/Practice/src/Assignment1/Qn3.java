package Assignment1;

import java.util.Scanner;

public class Qn3 {
	/*
	 * Write a program to find sum and average of two numbers input by User (using Scanner 
			class).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		float avg = (float)(a+b)/2;
		
		System.out.println("-------- RESULTS --------");
		System.out.println("SUM: " + sum);
		System.out.println("AVG: " + avg);
	}
}
