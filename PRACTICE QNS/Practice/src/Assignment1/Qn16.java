package Assignment1;

import java.util.Scanner;

public class Qn16 {
	/*
	 * Write a program to find the given number is even or odd.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is an even number.");
		}else {
			System.out.println(num + " is an odd number.");
		}
	}
}
