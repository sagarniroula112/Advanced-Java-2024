package ControlStatements.selection;

import java.util.Scanner;

public class ClassPractice {
	public static void main(String[] args) {
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your post:: ");
		String post = sc.next().toUpperCase();
		
		switch(post) {
			case "MD":
				System.out.println("You are " + post);
				salary = 230000 * 1.2;
				System.out.println("Your salary is Rs. " + salary + ".");
				break;
				
			case "CEO":
				System.out.println("You are " + post);
				salary = 250000 * 1.2579;
				System.out.println("Your salary is Rs. " + salary + ".");
				break;
				
			case "MANAGER":
				System.out.println("You are " + post);
				salary = 176000 * 1.16;
				System.out.println("Your salary is Rs. " + salary + ".");
				break;
				
			case "HELPER":
				System.out.println("You are " + post);
				salary = 145900 * 1.09;
				System.out.println("Your salary is Rs. " + salary + ".");
				break;
		}
	}
}
