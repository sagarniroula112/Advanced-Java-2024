package Assignment1;

import java.util.Scanner;

public class Qn13 {
	/*
	 * Write a program to print the number entered by user only if the number entered is 
		negative.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:: ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Number entered was: " + num);
		}else {
			System.out.println("It was a positive number.");
		}
	}
}
