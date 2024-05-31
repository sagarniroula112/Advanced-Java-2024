package Assignment1;

import java.util.Scanner;

public class Qn9 {
	/*
	 * Write a program that converts pounds into kg. The program prompts the user to enter 
number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float pounds, kg;
		System.out.print("Enter number of pounds:: ");
		pounds = sc.nextFloat();
		
		kg = pounds * (float)0.454;
		System.out.println();
		System.out.println("Result (in kg): " + kg);
	}
}
